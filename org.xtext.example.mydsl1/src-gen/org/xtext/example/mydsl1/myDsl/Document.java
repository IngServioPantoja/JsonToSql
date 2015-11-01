/**
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Document#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getDocument_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.mydsl1.myDsl.Object> getObjects();

} // Document
