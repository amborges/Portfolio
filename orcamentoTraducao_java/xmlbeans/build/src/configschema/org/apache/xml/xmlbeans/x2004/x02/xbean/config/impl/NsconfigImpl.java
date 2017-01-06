/*
 * XML Type:  nsconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config.impl;
/**
 * An XML nsconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public class NsconfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig
{
    
    public NsconfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGE$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "package");
    private static final javax.xml.namespace.QName PREFIX$2 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "prefix");
    private static final javax.xml.namespace.QName SUFFIX$4 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "suffix");
    private static final javax.xml.namespace.QName URI$6 = 
        new javax.xml.namespace.QName("", "uri");
    private static final javax.xml.namespace.QName URIPREFIX$8 = 
        new javax.xml.namespace.QName("", "uriprefix");
    
    
    /**
     * Gets the "package" element
     */
    public java.lang.String getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "package" element
     */
    public org.apache.xmlbeans.XmlString xgetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "package" element
     */
    public boolean isSetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "package" element
     */
    public void setPackage(java.lang.String xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGE$0);
            }
            target.setStringValue(xpackage);
        }
    }
    
    /**
     * Sets (as xml) the "package" element
     */
    public void xsetPackage(org.apache.xmlbeans.XmlString xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGE$0);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Unsets the "package" element
     */
    public void unsetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGE$0, 0);
        }
    }
    
    /**
     * Gets the "prefix" element
     */
    public java.lang.String getPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prefix" element
     */
    public org.apache.xmlbeans.XmlString xgetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "prefix" element
     */
    public boolean isSetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$2) != 0;
        }
    }
    
    /**
     * Sets the "prefix" element
     */
    public void setPrefix(java.lang.String prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$2);
            }
            target.setStringValue(prefix);
        }
    }
    
    /**
     * Sets (as xml) the "prefix" element
     */
    public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREFIX$2);
            }
            target.set(prefix);
        }
    }
    
    /**
     * Unsets the "prefix" element
     */
    public void unsetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$2, 0);
        }
    }
    
    /**
     * Gets the "suffix" element
     */
    public java.lang.String getSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suffix" element
     */
    public org.apache.xmlbeans.XmlString xgetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "suffix" element
     */
    public boolean isSetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$4) != 0;
        }
    }
    
    /**
     * Sets the "suffix" element
     */
    public void setSuffix(java.lang.String suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIX$4);
            }
            target.setStringValue(suffix);
        }
    }
    
    /**
     * Sets (as xml) the "suffix" element
     */
    public void xsetSuffix(org.apache.xmlbeans.XmlString suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUFFIX$4);
            }
            target.set(suffix);
        }
    }
    
    /**
     * Unsets the "suffix" element
     */
    public void unsetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$4, 0);
        }
    }
    
    /**
     * Gets the "uri" attribute
     */
    public java.lang.Object getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList)get_store().find_attribute_user(URI$6);
            return target;
        }
    }
    
    /**
     * True if has "uri" attribute
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$6) != null;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(java.lang.Object uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$6);
            }
            target.setObjectValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespaceList)get_store().add_attribute_user(URI$6);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" attribute
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$6);
        }
    }
    
    /**
     * Gets the "uriprefix" attribute
     */
    public java.util.List getUriprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URIPREFIX$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "uriprefix" attribute
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList xgetUriprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList)get_store().find_attribute_user(URIPREFIX$8);
            return target;
        }
    }
    
    /**
     * True if has "uriprefix" attribute
     */
    public boolean isSetUriprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URIPREFIX$8) != null;
        }
    }
    
    /**
     * Sets the "uriprefix" attribute
     */
    public void setUriprefix(java.util.List uriprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URIPREFIX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URIPREFIX$8);
            }
            target.setListValue(uriprefix);
        }
    }
    
    /**
     * Sets (as xml) the "uriprefix" attribute
     */
    public void xsetUriprefix(org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList uriprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList)get_store().find_attribute_user(URIPREFIX$8);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.NamespacePrefixList)get_store().add_attribute_user(URIPREFIX$8);
            }
            target.set(uriprefix);
        }
    }
    
    /**
     * Unsets the "uriprefix" attribute
     */
    public void unsetUriprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URIPREFIX$8);
        }
    }
}
