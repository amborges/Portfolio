/*
 * XML Type:  extensionconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config.impl;
/**
 * An XML extensionconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public class ExtensionconfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig
{
    
    public ExtensionconfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "interface");
    private static final javax.xml.namespace.QName PREPOSTSET$2 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "prePostSet");
    private static final javax.xml.namespace.QName FOR$4 = 
        new javax.xml.namespace.QName("", "for");
    
    
    /**
     * Gets array of all "interface" elements
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[] getInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERFACE$0, targetList);
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[] result = new org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interface" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface getInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interface" element
     */
    public int sizeOfInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACE$0);
        }
    }
    
    /**
     * Sets array of all "interface" element
     */
    public void setInterfaceArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface[] xinterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xinterfaceArray, INTERFACE$0);
        }
    }
    
    /**
     * Sets ith "interface" element
     */
    public void setInterfaceArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface)get_store().find_element_user(INTERFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface insertNewInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface)get_store().insert_element_user(INTERFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "interface" element
     */
    public void removeInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACE$0, i);
        }
    }
    
    /**
     * Gets the "prePostSet" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet getPrePostSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet)get_store().find_element_user(PREPOSTSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prePostSet" element
     */
    public boolean isSetPrePostSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREPOSTSET$2) != 0;
        }
    }
    
    /**
     * Sets the "prePostSet" element
     */
    public void setPrePostSet(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet prePostSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet)get_store().find_element_user(PREPOSTSET$2, 0);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet)get_store().add_element_user(PREPOSTSET$2);
            }
            target.set(prePostSet);
        }
    }
    
    /**
     * Appends and returns a new empty "prePostSet" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet addNewPrePostSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet)get_store().add_element_user(PREPOSTSET$2);
            return target;
        }
    }
    
    /**
     * Unsets the "prePostSet" element
     */
    public void unsetPrePostSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREPOSTSET$2, 0);
        }
    }
    
    /**
     * Gets the "for" attribute
     */
    public java.lang.Object getFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "for" attribute
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList xgetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList)get_store().find_attribute_user(FOR$4);
            return target;
        }
    }
    
    /**
     * True if has "for" attribute
     */
    public boolean isSetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOR$4) != null;
        }
    }
    
    /**
     * Sets the "for" attribute
     */
    public void setFor(java.lang.Object xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOR$4);
            }
            target.setObjectValue(xfor);
        }
    }
    
    /**
     * Sets (as xml) the "for" attribute
     */
    public void xsetFor(org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.JavaNameList)get_store().add_attribute_user(FOR$4);
            }
            target.set(xfor);
        }
    }
    
    /**
     * Unsets the "for" attribute
     */
    public void unsetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOR$4);
        }
    }
    /**
     * An XML interface(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class InterfaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.Interface
    {
        
        public InterfaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATICHANDLER$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "staticHandler");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "staticHandler" element
         */
        public java.lang.String getStaticHandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "staticHandler" element
         */
        public org.apache.xmlbeans.XmlString xgetStaticHandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICHANDLER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "staticHandler" element
         */
        public void setStaticHandler(java.lang.String staticHandler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATICHANDLER$0);
                }
                target.setStringValue(staticHandler);
            }
        }
        
        /**
         * Sets (as xml) the "staticHandler" element
         */
        public void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATICHANDLER$0);
                }
                target.set(staticHandler);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
                get_store().remove_attribute(NAME$2);
            }
        }
    }
    /**
     * An XML prePostSet(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class PrePostSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig.PrePostSet
    {
        
        public PrePostSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATICHANDLER$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "staticHandler");
        
        
        /**
         * Gets the "staticHandler" element
         */
        public java.lang.String getStaticHandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "staticHandler" element
         */
        public org.apache.xmlbeans.XmlString xgetStaticHandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICHANDLER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "staticHandler" element
         */
        public void setStaticHandler(java.lang.String staticHandler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATICHANDLER$0);
                }
                target.setStringValue(staticHandler);
            }
        }
        
        /**
         * Sets (as xml) the "staticHandler" element
         */
        public void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATICHANDLER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATICHANDLER$0);
                }
                target.set(staticHandler);
            }
        }
    }
}
