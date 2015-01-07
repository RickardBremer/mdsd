/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.DatabaseInterface;
import model.ModelPackage;
import model.Promotion;
import model.PromotionExpert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Promotion Expert</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.PromotionExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PromotionExpertImpl extends MinimalEObjectImpl.Container implements
PromotionExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PromotionExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROMOTION_EXPERT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROMOTION_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROMOTION_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Promotion getPromotion(String promotionCode) {
		EList<String> list = database.query("Select * from tblPromotions where Code = " + promotionCode + ";");
		if (list != null) {
			String[] promoCode = list.get(0).split(";", -1);
			Promotion promot = new PromotionImpl();
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(Long.parseLong(promoCode[4]));
			Date vaildFrom = cal.getTime();
			cal.setTimeInMillis(Long.parseLong(promoCode[5]));
			Date vaildTo = cal.getTime();
			cal.setTimeInMillis(Long.parseLong(promoCode[6]));
			Date expire = cal.getTime();
			promot.Promotion(promoCode[0], promoCode[1], Integer.parseInt(promoCode[2]), vaildFrom, vaildTo, promoCode[3], expire);
			return promot;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Promotion> getAllPromotions() {
		EList<Promotion> newProInfo = new BasicEList<Promotion>();
		EList<String> promotionInfo = database.query("Select * from tblPromotion;");//get all the information from database
		for(String pr : promotionInfo) {
			String[] promoCode = pr.split(";", -1);
			Promotion p = new PromotionImpl();
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(Long.parseLong(promoCode[4]));
			Date vaildFrom = cal.getTime();
			cal.setTimeInMillis(Long.parseLong(promoCode[5]));
			Date vaildTo = cal.getTime();
			cal.setTimeInMillis(Long.parseLong(promoCode[6]));
			Date expire = cal.getTime();
			p.Promotion(promoCode[0], promoCode[1], Integer.parseInt(promoCode[2]), vaildFrom, vaildTo, promoCode[3], expire);

			newProInfo.add(p);
		}
		return newProInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public boolean removePromotion(String promotionCode) {
		return database.send("DELETE FROM tblPromotions WHERE code=" + promotionCode);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public boolean updatePromotion(Promotion promotion) {
		SimpleDateFormat std = new SimpleDateFormat("#MM/DD/YYYY#");
		return database.send("Update tblPromotion SET Code = "
				+ promotion.getCode() + "," + "Description = "
				+ promotion.getDescription() + "," + "Percentage = "
				+ promotion.getPercentage() + "," + "validFrom = "
				+ std.format(promotion.getValidFrom()) + "," + "validTo = "
				+ std.format(promotion.getValidTo()) + ";" + "roomType = "
				+ promotion.getRoomType() + ";" + "expirationDate = "
				+ std.format(promotion.getExpirationDate()) + ";");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public void PromotionExpert(DatabaseInterface database) {
		this.database = database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Promotion addPromotion(Promotion promotion) {
		boolean result = database.send("INSERT INTO tblPromotions VALUES('"
				+ promotion.getCode() +"', '"
				+ promotion.getDescription() + "', "
				+ promotion.getPercentage() + ", '"
				+ promotion.getRoomType() + "', "
				+ promotion.getValidFrom().getTime() + ", "
				+ promotion.getValidTo().getTime() + ", "
				+ promotion.getExpirationDate().getTime());
		if (result) {
			return promotion;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			if (resolve) return getDatabase();
			return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			setDatabase((DatabaseInterface)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.PROMOTION_EXPERT__DATABASE:
			setDatabase((DatabaseInterface)null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case ModelPackage.PROMOTION_EXPERT___GET_PROMOTION__STRING:
			return getPromotion((String)arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___GET_ALL_PROMOTIONS:
			return getAllPromotions();
		case ModelPackage.PROMOTION_EXPERT___REMOVE_PROMOTION__STRING:
			return removePromotion((String)arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___UPDATE_PROMOTION__PROMOTION:
			return updatePromotion((Promotion)arguments.get(0));
		case ModelPackage.PROMOTION_EXPERT___PROMOTION_EXPERT__DATABASEINTERFACE:
			PromotionExpert((DatabaseInterface)arguments.get(0));
			return null;
		case ModelPackage.PROMOTION_EXPERT___ADD_PROMOTION__PROMOTION:
			return addPromotion((Promotion)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PromotionExpertImpl
