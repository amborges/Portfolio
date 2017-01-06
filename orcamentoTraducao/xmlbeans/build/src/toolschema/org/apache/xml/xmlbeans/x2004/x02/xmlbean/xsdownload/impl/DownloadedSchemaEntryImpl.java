/*
 * XML Type:  downloaded-schema-entry
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.impl;
/**
 * An XML downloaded-schema-entry(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload).
 *
 * This is a complex type.
 */
public class DownloadedSchemaEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.xsdownload.DownloadedSchemaEntry
{
    
    public DownloadedSchemaEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILENAME$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "filename");
    private static final javax.xml.namespace.QName SHA1$2 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "sha1");
    private static final javax.xml.namespace.QName SCHEMALOCATION$4 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "schemaLocation");
    private static final javax.xml.namespace.QName NAMESPACE$6 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xmlbean/xsdownload", "namespace");
    
    
    /**
     * Gets the "filename" element
     */
    public java.lang.String getFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filename" element
     */
    public org.apache.xmlbeans.XmlToken xgetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(FILENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "filename" element
     */
    public void setFilename(java.lang.String filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$0);
            }
            target.setStringValue(filename);
        }
    }
    
    /**
     * Sets (as xml) the "filename" element
     */
    public void xsetFilename(org.apache.xmlbeans.XmlToken filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(FILENAME$0);
            }
            target.set(filename);
        }
    }
    
    /**
     * Gets the "sha1" element
     */
    public java.lang.String getSha1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHA1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sha1" element
     */
    public org.apache.xmlbeans.XmlToken xgetSha1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(SHA1$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sha1" element
     */
    public void setSha1(java.lang.String sha1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHA1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHA1$2);
            }
            target.setStringValue(sha1);
        }
    }
    
    /**
     * Sets (as xml) the "sha1" element
     */
    public void xsetSha1(org.apache.xmlbeans.XmlToken sha1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(SHA1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(SHA1$2);
            }
            target.set(sha1);
        }
    }
    
    /**
     * Gets array of all "schemaLocation" elements
     */
    public java.lang.String[] getSchemaLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMALOCATION$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "schemaLocation" element
     */
    public java.lang.String getSchemaLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALOCATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "schemaLocation" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetSchemaLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMALOCATION$4, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "schemaLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSchemaLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SCHEMALOCATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlAnyURI)target;
        }
    }
    
    /**
     * Returns number of "schemaLocation" element
     */
    public int sizeOfSchemaLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMALOCATION$4);
        }
    }
    
    /**
     * Sets array of all "schemaLocation" element
     */
    public void setSchemaLocationArray(java.lang.String[] schemaLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaLocationArray, SCHEMALOCATION$4);
        }
    }
    
    /**
     * Sets ith "schemaLocation" element
     */
    public void setSchemaLocationArray(int i, java.lang.String schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALOCATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(schemaLocation);
        }
    }
    
    /**
     * Sets (as xml) array of all "schemaLocation" element
     */
    public void xsetSchemaLocationArray(org.apache.xmlbeans.XmlAnyURI[]schemaLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaLocationArray, SCHEMALOCATION$4);
        }
    }
    
    /**
     * Sets (as xml) ith "schemaLocation" element
     */
    public void xsetSchemaLocationArray(int i, org.apache.xmlbeans.XmlAnyURI schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SCHEMALOCATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schemaLocation);
        }
    }
    
    /**
     * Inserts the value as the ith "schemaLocation" element
     */
    public void insertSchemaLocation(int i, java.lang.String schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCHEMALOCATION$4, i);
            target.setStringValue(schemaLocation);
        }
    }
    
    /**
     * Appends the value as the last "schemaLocation" element
     */
    public void addSchemaLocation(java.lang.String schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMALOCATION$4);
            target.setStringValue(schemaLocation);
        }
    }
    
    /**
     * Removes the ith "schemaLocation" element
     */
    public void removeSchemaLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMALOCATION$4, i);
        }
    }
    
    /**
     * Gets the "namespace" element
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESPACE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NAMESPACE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "namespace" element
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESPACE$6) != 0;
        }
    }
    
    /**
     * Sets the "namespace" element
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESPACE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMESPACE$6);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" element
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NAMESPACE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(NAMESPACE$6);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" element
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESPACE$6, 0);
        }
    }
}
