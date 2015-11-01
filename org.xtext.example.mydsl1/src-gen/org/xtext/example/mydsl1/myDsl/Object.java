/**
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Object#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject
{
  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getObject_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getPairs();

} // Object
