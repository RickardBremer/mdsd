/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import model.MSAccessDB;
import model.ModelPackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MS Access DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MSAccessDBImpl extends MinimalEObjectImpl.Container implements MSAccessDB {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSAccessDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MS_ACCESS_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> query(String query) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Connection conn = null;
		Statement s = null;
		String url = "jdbc:ucanaccess://Database/HotelBooking.accdb";
		EList<String> results = new BasicEList<String>();
		String result = "";
		try{
			conn = DriverManager.getConnection(url);
			s = conn.createStatement();
			
			ResultSet rs = s.executeQuery(query);
			ResultSetMetaData metadata = rs.getMetaData();
			int numberOfColumns = metadata.getColumnCount();
			while(rs.next()){
				result = "";
				int i = 1;
				
				while(i <= numberOfColumns){
					
					if (rs.getObject(i) != null){
						result.concat(rs.getObject(i).toString());
					}
					if (i < numberOfColumns){
						result.concat(";");
					}
					i++;
				}
				results.add(result);
			}
			
			s.close();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
			try{
				s.close();
				conn.close();
			}
			catch (Exception exception){
				exception.printStackTrace();
			}
			return null;
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean send(String query) {
		String receiptString = "insert into";
		String targetID = null;
		String targetTable = null;
		boolean dbResult = false;
		Connection conn = null;
		Statement s = null;
		String url = "jdbc:ucanaccess://Database/HotelBooking.accdb";
		boolean receiptResult;
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try{
			conn = DriverManager.getConnection(url);
			s = conn.createStatement();
			//Send query to database
			dbResult = s.execute(query);
			//Check if the new record is a booking or resident staying
			if ((!dbResult) && query.toLowerCase().contains(receiptString) && 
					(query.toLowerCase().contains("tblbookings") || query.toLowerCase().contains("tblstays"))){
				//Get ID from last record
				if (query.toLowerCase().contains("tblbookings")){
					targetTable = "tblBookings";
					targetID  = "BookingID";
				}
				else if(query.toLowerCase().contains("tblstays")){
					targetTable = "tblStays";
					targetID = "StayID";
				}
				//Create new receipt record
				receiptResult = (!send("INSERT INTO [tblReceipts] (ReceiptDescription) VALUES ('')"));
				//Continue if the receipt was successfully created
				if (!receiptResult){
					//Get receipt id for last record
					EList<String> recordList = query("SELECT TOP 1 * FROM [" + targetTable + "] ORDER BY [" + targetID + "] DESC");
					if(recordList.size() > 0){
						String[] lastRecord = recordList.get(0).split(";");
						String recordReceipt = lastRecord[lastRecord.length-1];
						//Check if receipt id is empty
						if (recordReceipt == ""){
							//Get latest receipt
							EList<String> receiptList = query("SELECT LAST (ReceiptID) FROM tblReceipts");
							String[] receipt = receiptList.get(0).split(";");
							//Link receipt to new record
							dbResult = (!send("UPDATE " + targetTable + " SET ReceiptID=" 
									+ receipt[0] + " WHERE " + targetID + "=(SELECT MAX(" + targetID + ") FROM " + targetTable + ")"));
						}
					}
				}
			}
			s.close();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
			try{
				s.close();
				conn.close();
			}
			catch(Exception connectionException){
				connectionException.printStackTrace();
			}
			dbResult = true;
		}
		return (!dbResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean openConnection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeConnection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.MS_ACCESS_DB___QUERY__STRING:
				return query((String)arguments.get(0));
			case ModelPackage.MS_ACCESS_DB___SEND__STRING:
				return send((String)arguments.get(0));
			case ModelPackage.MS_ACCESS_DB___OPEN_CONNECTION:
				return openConnection();
			case ModelPackage.MS_ACCESS_DB___CLOSE_CONNECTION:
				closeConnection();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MSAccessDBImpl
