/*
 * XML Type:  qnameconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config.impl;
/**
 * An XML qnameconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public class QnameconfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig
{
    
    public QnameconfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName JAVANAME$2 = 
        new javax.xml.namespace.QName("", "javaname");
    
    
    /**
     * Gets the "name" attribute
     */
    public javax.xml.namespace.QName getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setQNameValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlQName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "javaname" attribute
     */
    public java.lang.String getJavaname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVANAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "javaname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJavaname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JAVANAME$2);
            return target;
        }
    }
    
    /**
     * True if has "javaname" attribute
     */
    public boolean isSetJavaname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JAVANAME$2) != null;
        }
    }
    
    /**
     * Sets the "javaname" attribute
     */
    public void setJavaname(java.lang.String javaname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVANAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVANAME$2);
            }
            target.setStringValue(javaname);
        }
    }
    
    /**
     * Sets (as xml) the "javaname" attribute
     */
    public void xsetJavaname(org.apache.xmlbeans.XmlString javaname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JAVANAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JAVANAME$2);
            }
            target.set(javaname);
        }
    }
    
    /**
     * Unsets the "javaname" attribute
     */
    public void unsetJavaname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JAVANAME$2);
        }
    }
}
