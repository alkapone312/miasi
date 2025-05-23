/**
 */
package apiEntity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apiEntity.Entity#getOperation <em>Operation</em>}</li>
 *   <li>{@link apiEntity.Entity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link apiEntity.Entity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see apiEntity.ApiEntityPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link apiEntity.Operation}.
	 * It is bidirectional and its opposite is '{@link apiEntity.Operation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see apiEntity.ApiEntityPackage#getEntity_Operation()
	 * @see apiEntity.Operation#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link apiEntity.Attribute}.
	 * It is bidirectional and its opposite is '{@link apiEntity.Attribute#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see apiEntity.ApiEntityPackage#getEntity_Attribute()
	 * @see apiEntity.Attribute#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see apiEntity.ApiEntityPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apiEntity.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Entity
