/**
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl1/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.DocumentImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__OBJECTS = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.ObjectImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__PAIRS = 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.PairImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.ValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.StringValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.NumberValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.DecimalValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getDecimalValue()
   * @generated
   */
  int DECIMAL_VALUE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.ValueObjectImpl <em>Value Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.ValueObjectImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getValueObject()
   * @generated
   */
  int VALUE_OBJECT = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.ArrayValueImpl <em>Array Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.ArrayValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getArrayValue()
   * @generated
   */
  int ARRAY_VALUE = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.BooleanValueImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.Document#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Document#getObjects()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Objects();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.Object#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Object#getPairs()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Pairs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.Pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Pair#getName()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EReference getPair_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.NumberValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.NumberValue#getValue()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.DecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.DecimalValue
   * @generated
   */
  EClass getDecimalValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.DecimalValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.DecimalValue#getValue()
   * @see #getDecimalValue()
   * @generated
   */
  EAttribute getDecimalValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.ValueObject <em>Value Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Object</em>'.
   * @see org.xtext.example.mydsl1.myDsl.ValueObject
   * @generated
   */
  EClass getValueObject();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.ValueObject#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.ValueObject#getValue()
   * @see #getValueObject()
   * @generated
   */
  EReference getValueObject_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.ArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.ArrayValue
   * @generated
   */
  EClass getArrayValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.ArrayValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.xtext.example.mydsl1.myDsl.ArrayValue#getValues()
   * @see #getArrayValue()
   * @generated
   */
  EReference getArrayValue_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl1.myDsl.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.DocumentImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__OBJECTS = eINSTANCE.getDocument_Objects();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.ObjectImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__PAIRS = eINSTANCE.getObject_Pairs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.PairImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__NAME = eINSTANCE.getPair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.ValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.StringValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.NumberValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.DecimalValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getDecimalValue()
     * @generated
     */
    EClass DECIMAL_VALUE = eINSTANCE.getDecimalValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_VALUE__VALUE = eINSTANCE.getDecimalValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.ValueObjectImpl <em>Value Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.ValueObjectImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getValueObject()
     * @generated
     */
    EClass VALUE_OBJECT = eINSTANCE.getValueObject();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_OBJECT__VALUE = eINSTANCE.getValueObject_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.ArrayValueImpl <em>Array Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.ArrayValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getArrayValue()
     * @generated
     */
    EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.BooleanValueImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

  }

} //MyDslPackage
