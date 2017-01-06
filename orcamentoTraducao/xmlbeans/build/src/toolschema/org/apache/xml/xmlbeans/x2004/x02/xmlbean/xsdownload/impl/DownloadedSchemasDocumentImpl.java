/*
 * An XML document type.
 * Localname: downloaded-schemas
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.impl;
/**
 * A document containing one downloaded-schemas(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload) element.
 *
 * This is a complex type.
 */
public class DownloadedSchemasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument
{
    
    public DownloadedSchemasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOWNLOADEDSCHEMAS$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "downloaded-schemas");
    
    
    /**
     * Gets the "downloaded-schemas" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas getDownloadedSchemas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().find_element_user(DOWNLOADEDSCHEMAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "downloaded-schemas" element
     */
    public void setDownloadedSchemas(org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas downloadedSchemas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().find_element_user(DOWNLOADEDSCHEMAS$0, 0);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().add_element_user(DOWNLOADEDSCHEMAS$0);
            }
            target.set(downloadedSchemas);
        }
    }
    
    /**
     * Appends and returns a new empty "downloaded-schemas" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas addNewDownloadedSchemas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().add_element_user(DOWNLOADEDSCHEMAS$0);
            return target;
        }
    }
    /**
     * An XML downloaded-schemas(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload).
     *
     * This is a complex type.
     */
    public static class DownloadedSchemasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemasDocument.DownloadedSchemas
    {
        
        public DownloadedSchemasImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTRY$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "entry");
        private static final javax.xml.namespace.QName DEFAULTDIRECTORY$2 = 
            new javax.xml.namespace.QName("", "defaultDirectory");
        
        
        /**
         * Gets array of all "entry" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[] getEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTRY$0, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[] result = new org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entry" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry getEntryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry)get_store().find_element_user(ENTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entry" element
         */
        public int sizeOfEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTRY$0);
            }
        }
        
        /**
         * Sets array of all "entry" element
         */
        public void setEntryArray(org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry[] entryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(entryArray, ENTRY$0);
            }
        }
        
        /**
         * Sets ith "entry" element
         */
        public void setEntryArray(int i, org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry entry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry)get_store().find_element_user(ENTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(entry);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entry" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry insertNewEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry)get_store().insert_element_user(ENTRY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entry" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry addNewEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry)get_store().add_element_user(ENTRY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "entry" element
         */
        public void removeEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTRY$0, i);
            }
        }
        
        /**
         * Gets the "defaultDirectory" attribute
         */
        public java.lang.String getDefaultDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDIRECTORY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "defaultDirectory" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetDefaultDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(DEFAULTDIRECTORY$2);
                return target;
            }
        }
        
        /**
         * True if has "defaultDirectory" attribute
         */
        public boolean isSetDefaultDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTDIRECTORY$2) != null;
            }
        }
        
        /**
         * Sets the "defaultDirectory" attribute
         */
        public void setDefaultDirectory(java.lang.String defaultDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDIRECTORY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTDIRECTORY$2);
                }
                target.setStringValue(defaultDirectory);
            }
        }
        
        /**
         * Sets (as xml) the "defaultDirectory" attribute
         */
        public void xsetDefaultDirectory(org.apache.xmlbeans.XmlToken defaultDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(DEFAULTDIRECTORY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(DEFAULTDIRECTORY$2);
                }
                target.set(defaultDirectory);
            }
        }
        
        /**
         * Unsets the "defaultDirectory" attribute
         */
        public void unsetDefaultDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTDIRECTORY$2);
            }
        }
    }
}
