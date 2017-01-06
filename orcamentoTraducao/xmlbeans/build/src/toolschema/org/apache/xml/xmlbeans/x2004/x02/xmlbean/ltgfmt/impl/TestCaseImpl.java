/*
 * XML Type:  test-case
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.impl;
/**
 * An XML test-case(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public class TestCaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase
{
    
    public TestCaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt", "description");
    private static final javax.xml.namespace.QName FILES$2 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt", "files");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ORIGIN$6 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName MODIFIED$8 = 
        new javax.xml.namespace.QName("", "modified");
    
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "files" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files getFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files)get_store().find_element_user(FILES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "files" element
     */
    public void setFiles(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files files)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files)get_store().find_element_user(FILES$2, 0);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files)get_store().add_element_user(FILES$2);
            }
            target.set(files);
        }
    }
    
    /**
     * Appends and returns a new empty "files" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files addNewFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files)get_store().add_element_user(FILES$2);
            return target;
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "origin" attribute
     */
    public java.lang.String getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(ORIGIN$6);
            return target;
        }
    }
    
    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGIN$6) != null;
        }
    }
    
    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(java.lang.String origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$6);
            }
            target.setStringValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlToken origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(ORIGIN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(ORIGIN$6);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGIN$6);
        }
    }
    
    /**
     * Gets the "modified" attribute
     */
    public boolean getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MODIFIED$8);
            return target;
        }
    }
    
    /**
     * True if has "modified" attribute
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MODIFIED$8) != null;
        }
    }
    
    /**
     * Sets the "modified" attribute
     */
    public void setModified(boolean modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODIFIED$8);
            }
            target.setBooleanValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" attribute
     */
    public void xsetModified(org.apache.xmlbeans.XmlBoolean modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MODIFIED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MODIFIED$8);
            }
            target.set(modified);
        }
    }
    
    /**
     * Unsets the "modified" attribute
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MODIFIED$8);
        }
    }
    /**
     * An XML files(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public static class FilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.TestCase.Files
    {
        
        public FilesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILE$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt", "file");
        
        
        /**
         * Gets array of all "file" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[] getFileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILE$0, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[] result = new org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "file" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc getFileArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc)get_store().find_element_user(FILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "file" element
         */
        public int sizeOfFileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILE$0);
            }
        }
        
        /**
         * Sets array of all "file" element
         */
        public void setFileArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc[] fileArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fileArray, FILE$0);
            }
        }
        
        /**
         * Sets ith "file" element
         */
        public void setFileArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc)get_store().find_element_user(FILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(file);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "file" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc insertNewFile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc)get_store().insert_element_user(FILE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "file" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc addNewFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc)get_store().add_element_user(FILE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "file" element
         */
        public void removeFile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILE$0, i);
            }
        }
    }
}
