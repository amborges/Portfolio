/*
 * XML Type:  file-desc
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.impl;
/**
 * An XML file-desc(@http://xml.apache.org/xmlbeans/2004/02/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public class FileDescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc
{
    
    public FileDescImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TSDIR$0 = 
        new javax.xml.namespace.QName("", "tsDir");
    private static final javax.xml.namespace.QName FOLDER$2 = 
        new javax.xml.namespace.QName("", "folder");
    private static final javax.xml.namespace.QName FILENAME$4 = 
        new javax.xml.namespace.QName("", "fileName");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("", "role");
    private static final javax.xml.namespace.QName VALIDITY$8 = 
        new javax.xml.namespace.QName("", "validity");
    
    
    /**
     * Gets the "tsDir" attribute
     */
    public java.lang.String getTsDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TSDIR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tsDir" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetTsDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(TSDIR$0);
            return target;
        }
    }
    
    /**
     * True if has "tsDir" attribute
     */
    public boolean isSetTsDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TSDIR$0) != null;
        }
    }
    
    /**
     * Sets the "tsDir" attribute
     */
    public void setTsDir(java.lang.String tsDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TSDIR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TSDIR$0);
            }
            target.setStringValue(tsDir);
        }
    }
    
    /**
     * Sets (as xml) the "tsDir" attribute
     */
    public void xsetTsDir(org.apache.xmlbeans.XmlToken tsDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(TSDIR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(TSDIR$0);
            }
            target.set(tsDir);
        }
    }
    
    /**
     * Unsets the "tsDir" attribute
     */
    public void unsetTsDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TSDIR$0);
        }
    }
    
    /**
     * Gets the "folder" attribute
     */
    public java.lang.String getFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLDER$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "folder" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FOLDER$2);
            return target;
        }
    }
    
    /**
     * True if has "folder" attribute
     */
    public boolean isSetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOLDER$2) != null;
        }
    }
    
    /**
     * Sets the "folder" attribute
     */
    public void setFolder(java.lang.String folder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOLDER$2);
            }
            target.setStringValue(folder);
        }
    }
    
    /**
     * Sets (as xml) the "folder" attribute
     */
    public void xsetFolder(org.apache.xmlbeans.XmlToken folder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FOLDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(FOLDER$2);
            }
            target.set(folder);
        }
    }
    
    /**
     * Unsets the "folder" attribute
     */
    public void unsetFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOLDER$2);
        }
    }
    
    /**
     * Gets the "fileName" attribute
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileName" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FILENAME$4);
            return target;
        }
    }
    
    /**
     * True if has "fileName" attribute
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILENAME$4) != null;
        }
    }
    
    /**
     * Sets the "fileName" attribute
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$4);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "fileName" attribute
     */
    public void xsetFileName(org.apache.xmlbeans.XmlToken fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FILENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(FILENAME$4);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "fileName" attribute
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILENAME$4);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role.Enum getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                return null;
            }
            return (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role)get_store().find_attribute_user(ROLE$6);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$6) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    public void setRole(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role.Enum role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$6);
            }
            target.setEnumValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role)get_store().add_attribute_user(ROLE$6);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$6);
        }
    }
    
    /**
     * Gets the "validity" attribute
     */
    public boolean getValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDITY$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "validity" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALIDITY$8);
            return target;
        }
    }
    
    /**
     * True if has "validity" attribute
     */
    public boolean isSetValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDITY$8) != null;
        }
    }
    
    /**
     * Sets the "validity" attribute
     */
    public void setValidity(boolean validity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDITY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDITY$8);
            }
            target.setBooleanValue(validity);
        }
    }
    
    /**
     * Sets (as xml) the "validity" attribute
     */
    public void xsetValidity(org.apache.xmlbeans.XmlBoolean validity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALIDITY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VALIDITY$8);
            }
            target.set(validity);
        }
    }
    
    /**
     * Unsets the "validity" attribute
     */
    public void unsetValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDITY$8);
        }
    }
    /**
     * An XML role(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlToken.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xml.xmlbeans.x2004.x02.xmlbean.ltgfmt.FileDesc.Role
    {
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
