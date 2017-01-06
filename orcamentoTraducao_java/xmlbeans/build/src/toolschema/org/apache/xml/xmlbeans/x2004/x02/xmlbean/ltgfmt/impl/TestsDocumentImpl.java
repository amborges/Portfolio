/*
 * An XML document type.
 * Localname: tests
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.impl;
/**
 * A document containing one tests(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt) element.
 *
 * This is a complex type.
 */
public class TestsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument
{
    
    public TestsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTS$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt", "tests");
    
    
    /**
     * Gets the "tests" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests getTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests)get_store().find_element_user(TESTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tests" element
     */
    public void setTests(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests tests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests)get_store().find_element_user(TESTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests)get_store().add_element_user(TESTS$0);
            }
            target.set(tests);
        }
    }
    
    /**
     * Appends and returns a new empty "tests" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests addNewTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests)get_store().add_element_user(TESTS$0);
            return target;
        }
    }
    /**
     * An XML tests(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public static class TestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestsDocument.Tests
    {
        
        public TestsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEST$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt", "test");
        
        
        /**
         * Gets array of all "test" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[] getTestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEST$0, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[] result = new org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "test" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase getTestArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase)get_store().find_element_user(TEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "test" element
         */
        public int sizeOfTestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEST$0);
            }
        }
        
        /**
         * Sets array of all "test" element
         */
        public void setTestArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase[] testArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testArray, TEST$0);
            }
        }
        
        /**
         * Sets ith "test" element
         */
        public void setTestArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase test)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase)get_store().find_element_user(TEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(test);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "test" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase insertNewTest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase)get_store().insert_element_user(TEST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "test" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase addNewTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase)get_store().add_element_user(TEST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "test" element
         */
        public void removeTest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEST$0, i);
            }
        }
    }
}
