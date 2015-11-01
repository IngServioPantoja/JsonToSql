/**
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getArrayValue_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // ArrayValue
