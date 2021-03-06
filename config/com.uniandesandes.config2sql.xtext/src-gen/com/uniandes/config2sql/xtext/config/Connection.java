/**
 */
package com.uniandes.config2sql.xtext.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Connection#getUrl <em>Url</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Connection#getUsername <em>Username</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Connection#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConnection_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Connection#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' attribute.
   * @see #setUsername(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConnection_Username()
   * @model
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Connection#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConnection_Password()
   * @model
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Connection#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

} // Connection
