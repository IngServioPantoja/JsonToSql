/**
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ValueObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(org.xtext.example.mydsl1.myDsl.Object)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getValueObject_Value()
   * @model containment="true"
   * @generated
   */
  org.xtext.example.mydsl1.myDsl.Object getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ValueObject#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(org.xtext.example.mydsl1.myDsl.Object value);

} // ValueObject
