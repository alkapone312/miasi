/**
 */
package apiEntity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apiEntity.Attribute#getEntity <em>Entity</em>}</li>
 *   <li>{@link apiEntity.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link apiEntity.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see apiEntity.ApiEntityPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link apiEntity.Entity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see apiEntity.ApiEntityPackage#getAttribute_Entity()
	 * @see apiEntity.Entity#getAttribute
	 * @model opposite="attribute" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link apiEntity.Attribute#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see apiEntity.ApiEntityPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apiEntity.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link apiEntity.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see apiEntity.AttributeType
	 * @see #setType(AttributeType)
	 * @see apiEntity.ApiEntityPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link apiEntity.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see apiEntity.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);
} // Attribute
