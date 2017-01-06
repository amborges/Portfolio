/*
 * An XML document type.
 * Localname: config
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xml.xmlbeans.x2004.x02.xbean.config.impl;
/**
 * A document containing one config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config) element.
 *
 * This is a complex type.
 */
public class ConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument
{
    
    public ConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIG$0 = 
        new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "config");
    
    
    /**
     * Gets the "config" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config getConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "config" element
     */
    public void setConfig(org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config config)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config)get_store().add_element_user(CONFIG$0);
            }
            target.set(config);
        }
    }
    
    /**
     * Appends and returns a new empty "config" element
     */
    public org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config addNewConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config target = null;
            target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config)get_store().add_element_user(CONFIG$0);
            return target;
        }
    }
    /**
     * An XML config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class ConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument.Config
    {
        
        public ConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMESPACE$0 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "namespace");
        private static final javax.xml.namespace.QName QNAME$2 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "qname");
        private static final javax.xml.namespace.QName EXTENSION$4 = 
            new javax.xml.namespace.QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "extension");
        
        
        /**
         * Gets array of all "namespace" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[] getNamespaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMESPACE$0, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[] result = new org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "namespace" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig getNamespaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig)get_store().find_element_user(NAMESPACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "namespace" element
         */
        public int sizeOfNamespaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMESPACE$0);
            }
        }
        
        /**
         * Sets array of all "namespace" element
         */
        public void setNamespaceArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig[] namespaceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(namespaceArray, NAMESPACE$0);
            }
        }
        
        /**
         * Sets ith "namespace" element
         */
        public void setNamespaceArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig namespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig)get_store().find_element_user(NAMESPACE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(namespace);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "namespace" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig insertNewNamespace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig)get_store().insert_element_user(NAMESPACE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "namespace" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig addNewNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Nsconfig)get_store().add_element_user(NAMESPACE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "namespace" element
         */
        public void removeNamespace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMESPACE$0, i);
            }
        }
        
        /**
         * Gets array of all "qname" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[] getQnameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(QNAME$2, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[] result = new org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "qname" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig getQnameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig)get_store().find_element_user(QNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "qname" element
         */
        public int sizeOfQnameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QNAME$2);
            }
        }
        
        /**
         * Sets array of all "qname" element
         */
        public void setQnameArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig[] qnameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qnameArray, QNAME$2);
            }
        }
        
        /**
         * Sets ith "qname" element
         */
        public void setQnameArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig qname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig)get_store().find_element_user(QNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(qname);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qname" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig insertNewQname(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig)get_store().insert_element_user(QNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qname" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig addNewQname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Qnameconfig)get_store().add_element_user(QNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "qname" element
         */
        public void removeQname(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QNAME$2, i);
            }
        }
        
        /**
         * Gets array of all "extension" elements
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[] getExtensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENSION$4, targetList);
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[] result = new org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extension" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig getExtensionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig)get_store().find_element_user(EXTENSION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extension" element
         */
        public int sizeOfExtensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENSION$4);
            }
        }
        
        /**
         * Sets array of all "extension" element
         */
        public void setExtensionArray(org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig[] extensionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extensionArray, EXTENSION$4);
            }
        }
        
        /**
         * Sets ith "extension" element
         */
        public void setExtensionArray(int i, org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig)get_store().find_element_user(EXTENSION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extension);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig insertNewExtension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig)get_store().insert_element_user(EXTENSION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        public org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig addNewExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig target = null;
                target = (org.apache.xml.xmlbeans.x2004.x02.xbean.config.Extensionconfig)get_store().add_element_user(EXTENSION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "extension" element
         */
        public void removeExtension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENSION$4, i);
            }
        }
    }
}
