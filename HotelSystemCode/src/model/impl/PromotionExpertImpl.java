/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import model.DatabaseInterface;
import model.ModelPackage;
import model.Promotion;
import model.PromotionExpert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Promotion Expert</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.PromotionExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PromotionExpertImpl extends MinimalEObjectImpl.Container implements
		PromotionExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PromotionExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROMOTION_EXPERT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject) database;
			database = (DatabaseInterface) eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.PROMOTION_EXPERT__DATABASE,
							oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROMOTION_EXPERT__DATABASE, oldDatabase,
					database));
	}

	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated NOT
	// */
	//
	// public Promotion getPromotion(int ID) {
	//
	// EList<String[]> list =
	// database.query("Select * from tblPromotions where Code = " +
	// promotionCode + ";").get(0);
	// + String PromoCode = list[1];
	// + if (list == null){
	// + return null;
	// + }
	// + else if (PromoCode.equals(promotionCode)){
	// Promotion promot = new PromotionImpl();
	// SimpleDateFormat STD = new SimpleDateFormat("yyyy-MM-dd ");
	// promot.Promotion(Integer.parseInt(list[0]),list[1],list[2],Integer.parseInt(list[3]),STD.parse(list[4]),STD.parse(list[5]),STD.parse(list[6]))
	//
	//
	// return promot;
	// }
	// else return null;
	// // TODO: implement this method
	// // Ensure that you remove @generated or mark it @generated NOT
	// throw new UnsupportedOperationException();
	//
	//
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Promotion getPromotion(String promotionCode) {
		
		EList<String> list = database.query("Select * from tblPromotions where Code = " + promotionCode + ";");
				String[] PromoCode = list.split(";");
				if (Promocode[0].equals("")){
					return null;		
				}
				else if (PromoCode[0].equals(promotionCode))
				{
				
					Promotion promot = new PromotionImpl();
					SimpleDateFormat STD = new SimpleDateFormat("yyyy-MM-dd ");
					promot.Promotion(Promocode[0],Promocode[1],Integer.parseInt(Promocode[2]),
							         STD.parse(Promocode[3]),STD.parse(Promocode[4]),Promocode[5],STD.parse(Promocode[6]));
					
					return promot;
				}
				else {return null}
	
		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Promotion> getAllPromotions() {
		 EList<String> PromotionInfo = database.query("Select * from tblPromotion;");//get all the information from database
				SimpleDateFormat STD = new SimpleDateFormat("yyyy-MM-dd ");
				for(String[] pr : PromotionInfo) {
				Promotion promoAll = new PromotionExpertImpl();
				
				promoAll.Promotion(pr[0],pr[1],Integer.parseInt(pr[2]),
				         STD.parse(pr[3]),STD.pr(list[4]),pr[5],STD.parse(pr[6]));
				
				newProInfo.add(p);
			}
				return promoAll;
				
		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public boolean removePromotion(String promotionCode) {
		
		EList<String> list = database.query("Select * from tblPromotions where Code = " + promotionCode + ";");//get infomation
		String[] PromoCode = list.split(";"); //split data
		String rmDataSyntax = "Delete from tblPromotions where PromotionID = ";
				if (PromoCode[0].equals("")){ 					//check the code exists.
					return false;		
				}
				else if (PromoCode[0].equals(promotionCode)){
					try {
						database.executeQuery(rmDataSyntax + pcode + ";"); //remove the promo infomation
					} catch (Exception e) {
						return false;
					}
					return true;
				}
				else {
					return false
							};
		
		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public boolean updatePromotion(Promotion promotion) {
		try {
			database.executeQuery("Update tblPromotion SET Code = "
					+ promotion.getCode() + "," + "Description = "
					+ promotion.getDescription() + "," + "Percentage = "
					+ promotion.getPercentage() + "," + "validFrom = "
					+ promotion.getvalidFrom() + "," + "validTo = "
					+ promotion.getvalidTo() + ";" + "roomType = "
					+ promotion.getRoomType() + ";" + "expirationDate = "
					+ promotion.getExpirationDate() + ";");
		} catch (Exception e) {

			return false;
		}
		return true;

		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public void PromotionExpert(DatabaseInterface database) {
		this.database = database;
		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Promotion addPromotion(Promotion promotion) {
		
		EList<String> list = database.query("Select * from tblPromotions where Code = " + promotion.getCode() + ";");
		//check if the information has already existed.
		
		if (list == null && list.isEmpty()){      //if it doesn't exist do the add.                                
			Promotion promots = new promotionImpl();
		 try {
				database.executeQuery("INSERT INTO tblPromotio (Code,Description,Percentage,RoomType,ValidFrom,ValidTo,ExpirationDate) Values"
						+ "('promotion.getCode()','promotion.getDescription()','promotion.getPercentage()','promotion.getValidFrom()',"
						+ "'promotion.getValidto()', 'promotion.getRoomType()', 'promotion.getExpirationDate()')");
									
								} catch (Exception e) {
									
									return null;
								}
		 
		 //add promotion successful return pormots;
		 
			promots.Promotion(promotion.getCode(),
							  promotion.getDescription(), 
							  promotion.getPercentage(), 
							  promotion.getValidFrom(), 
							  promotion.getValidto(), 
							  promotion.getRoomType(), 
							  promotion.getExpirationDate())	 
									
							  return promots;				  
		}
		
		
		//if it does exit return the exist promotion infor and wont do the add.
		else if (list != null && !list.isEmpty()) 
		{
			String[] PromoCode = list.split(";"); //split data
			Promotion promotf = new PromotionImpl();
			SimpleDateFormat STD = new SimpleDateFormat("yyyy-MM-dd ");
			promotf.Promotion(Promocode[0],Promocode[1],Integer.parseInt(Promocode[2]),
					         STD.parse(Promocode[3]),STD.parse(Promocode[4]),Promocode[5],STD.parse(Promocode[6]));
		
			return promotf;
		}
		else {
			
			return null;
			}

		
		
		
		// TODO: implement this method DONE
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			if (resolve)
				return getDatabase();
			return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			setDatabase((DatabaseInterface) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			setDatabase((DatabaseInterface) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case ModelPackage.PROMOTION_EXPERT___GET_PROMOTION__INT:
			return getPromotion((Integer) arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___GET_PROMOTION__STRING:
			return getPromotion((String) arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___GET_ALL_PROMOTIONS:
			return getAllPromotions();
		case ModelPackage.PROMOTION_EXPERT___REMOVE_PROMOTION__INT:
			return removePromotion((Integer) arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___UPDATE_PROMOTION__PROMOTION:
			return updatePromotion((Promotion) arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___PROMOTION_EXPERT__DATABASEINTERFACE:
			PromotionExpert((DatabaseInterface) arguments.get(0));
			return null;
		case ModelPackage.PROMOTION_EXPERT___ADD_PROMOTION__PROMOTION:
			return addPromotion((Promotion) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PromotionExpertImpl
