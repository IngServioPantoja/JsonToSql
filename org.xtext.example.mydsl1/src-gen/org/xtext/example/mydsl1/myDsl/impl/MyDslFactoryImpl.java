/**
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.myDsl.ArrayValue;
import org.xtext.example.mydsl1.myDsl.BooleanValue;
import org.xtext.example.mydsl1.myDsl.DecimalValue;
import org.xtext.example.mydsl1.myDsl.Document;
import org.xtext.example.mydsl1.myDsl.MyDslFactory;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.NumberValue;
import org.xtext.example.mydsl1.myDsl.Pair;
import org.xtext.example.mydsl1.myDsl.StringValue;
import org.xtext.example.mydsl1.myDsl.Value;
import org.xtext.example.mydsl1.myDsl.ValueObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DOCUMENT: return createDocument();
      case MyDslPackage.OBJECT: return createObject();
      case MyDslPackage.PAIR: return createPair();
      case MyDslPackage.VALUE: return createValue();
      case MyDslPackage.STRING_VALUE: return createStringValue();
      case MyDslPackage.NUMBER_VALUE: return createNumberValue();
      case MyDslPackage.DECIMAL_VALUE: return createDecimalValue();
      case MyDslPackage.VALUE_OBJECT: return createValueObject();
      case MyDslPackage.ARRAY_VALUE: return createArrayValue();
      case MyDslPackage.BOOLEAN_VALUE: return createBooleanValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl1.myDsl.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue createNumberValue()
  {
    NumberValueImpl numberValue = new NumberValueImpl();
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalValue createDecimalValue()
  {
    DecimalValueImpl decimalValue = new DecimalValueImpl();
    return decimalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueObject createValueObject()
  {
    ValueObjectImpl valueObject = new ValueObjectImpl();
    return valueObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayValue createArrayValue()
  {
    ArrayValueImpl arrayValue = new ArrayValueImpl();
    return arrayValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
