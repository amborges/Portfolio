/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.internal.xmlbeans.wsdlsubst.impl;
/**
 * A document containing one definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst) element.
 *
 * This is a complex type.
 */
public class DefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument
{
    
    public DefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONS$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "definitions");
    
    
    /**
     * Gets the "definitions" element
     */
    public org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions getDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions target = null;
            target = (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitions" element
     */
    public void setDefinitions(org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions definitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions target = null;
            target = (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions)get_store().add_element_user(DEFINITIONS$0);
            }
            target.set(definitions);
        }
    }
    
    /**
     * Appends and returns a new empty "definitions" element
     */
    public org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions addNewDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions target = null;
            target = (org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions)get_store().add_element_user(DEFINITIONS$0);
            return target;
        }
    }
    /**
     * An XML definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
     *
     * This is a complex type.
     */
    public static class DefinitionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.internal.xmlbeans.wsdlsubst.DefinitionsDocument.Definitions
    {
        
        public DefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IMPORT$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "import");
        private static final javax.xml.namespace.QName TYPES$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "types");
        private static final javax.xml.namespace.QName MESSAGE$4 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "message");
        private static final javax.xml.namespace.QName BINDING$6 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "binding");
        private static final javax.xml.namespace.QName PORTTYPE$8 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "portType");
        private static final javax.xml.namespace.QName SERVICE$10 = 
            new javax.xml.namespace.QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "service");
        
        
        /**
         * Gets array of all "import" elements
         */
        public org.apache.internal.xmlbeans.wsdlsubst.TImport[] getImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPORT$0, targetList);
                org.apache.internal.xmlbeans.wsdlsubst.TImport[] result = new org.apache.internal.xmlbeans.wsdlsubst.TImport[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "import" element
         */
        public org.apache.internal.xmlbeans.wsdlsubst.TImport getImportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.internal.xmlbeans.wsdlsubst.TImport target = null;
                target = (org.apache.internal.xmlbeans.wsdlsubst.TImport)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPORT$0);
            }
        }
        
        /**
         * Sets array of all "import" element
         */
        public void setImportArray(org.apache.internal.xmlbeans.wsdlsubst.TImport[] ximportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ximportArray, IMPORT$0);
            }
        }
        
        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, org.apache.internal.xmlbeans.wsdlsubst.TImport ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.internal.xmlbeans.wsdlsubst.TImport target = null;
                target = (org.apache.internal.xmlbeans.wsdlsubst.TImport)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ximport);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.apache.internal.xmlbeans.wsdlsubst.TImport insertNewImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.internal.xmlbeans.wsdlsubst.TImport target = null;
                target = (org.apache.internal.xmlbeans.wsdlsubst.TImport)get_store().insert_element_user(IMPORT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.apache.internal.xmlbeans.wsdlsubst.TImport addNewImport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.internal.xmlbeans.wsdlsubst.TImport target = null;
                target = (org.apache.internal.xmlbeans.wsdlsubst.TImport)get_store().add_element_user(IMPORT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPORT$0, i);
            }
        }
        
        /**
         * Gets array of all "types" elements
         */
        public org.apache.xmlbeans.XmlObject[] getTypesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPES$2, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "types" element
         */
        public org.apache.xmlbeans.XmlObject getTypesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TYPES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "types" element
         */
        public int sizeOfTypesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPES$2);
            }
        }
        
        /**
         * Sets array of all "types" element
         */
        public void setTypesArray(org.apache.xmlbeans.XmlObject[] typesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typesArray, TYPES$2);
            }
        }
        
        /**
         * Sets ith "types" element
         */
        public void setTypesArray(int i, org.apache.xmlbeans.XmlObject types)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TYPES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(types);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "types" element
         */
        public org.apache.xmlbeans.XmlObject insertNewTypes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(TYPES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "types" element
         */
        public org.apache.xmlbeans.XmlObject addNewTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TYPES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "types" element
         */
        public void removeTypes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPES$2, i);
            }
        }
        
        /**
         * Gets array of all "message" elements
         */
        public org.apache.xmlbeans.XmlObject[] getMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MESSAGE$4, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "message" element
         */
        public org.apache.xmlbeans.XmlObject getMessageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MESSAGE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "message" element
         */
        public int sizeOfMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$4);
            }
        }
        
        /**
         * Sets array of all "message" element
         */
        public void setMessageArray(org.apache.xmlbeans.XmlObject[] messageArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(messageArray, MESSAGE$4);
            }
        }
        
        /**
         * Sets ith "message" element
         */
        public void setMessageArray(int i, org.apache.xmlbeans.XmlObject message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MESSAGE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(message);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "message" element
         */
        public org.apache.xmlbeans.XmlObject insertNewMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(MESSAGE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "message" element
         */
        public org.apache.xmlbeans.XmlObject addNewMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(MESSAGE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "message" element
         */
        public void removeMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$4, i);
            }
        }
        
        /**
         * Gets array of all "binding" elements
         */
        public org.apache.xmlbeans.XmlObject[] getBindingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BINDING$6, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "binding" element
         */
        public org.apache.xmlbeans.XmlObject getBindingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BINDING$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "binding" element
         */
        public int sizeOfBindingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BINDING$6);
            }
        }
        
        /**
         * Sets array of all "binding" element
         */
        public void setBindingArray(org.apache.xmlbeans.XmlObject[] bindingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bindingArray, BINDING$6);
            }
        }
        
        /**
         * Sets ith "binding" element
         */
        public void setBindingArray(int i, org.apache.xmlbeans.XmlObject binding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BINDING$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(binding);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "binding" element
         */
        public org.apache.xmlbeans.XmlObject insertNewBinding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(BINDING$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "binding" element
         */
        public org.apache.xmlbeans.XmlObject addNewBinding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(BINDING$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "binding" element
         */
        public void removeBinding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BINDING$6, i);
            }
        }
        
        /**
         * Gets array of all "portType" elements
         */
        public org.apache.xmlbeans.XmlObject[] getPortTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PORTTYPE$8, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "portType" element
         */
        public org.apache.xmlbeans.XmlObject getPortTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PORTTYPE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "portType" element
         */
        public int sizeOfPortTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PORTTYPE$8);
            }
        }
        
        /**
         * Sets array of all "portType" element
         */
        public void setPortTypeArray(org.apache.xmlbeans.XmlObject[] portTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(portTypeArray, PORTTYPE$8);
            }
        }
        
        /**
         * Sets ith "portType" element
         */
        public void setPortTypeArray(int i, org.apache.xmlbeans.XmlObject portType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PORTTYPE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(portType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "portType" element
         */
        public org.apache.xmlbeans.XmlObject insertNewPortType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PORTTYPE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "portType" element
         */
        public org.apache.xmlbeans.XmlObject addNewPortType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PORTTYPE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "portType" element
         */
        public void removePortType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PORTTYPE$8, i);
            }
        }
        
        /**
         * Gets array of all "service" elements
         */
        public org.apache.xmlbeans.XmlObject[] getServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICE$10, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service" element
         */
        public org.apache.xmlbeans.XmlObject getServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SERVICE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service" element
         */
        public int sizeOfServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICE$10);
            }
        }
        
        /**
         * Sets array of all "service" element
         */
        public void setServiceArray(org.apache.xmlbeans.XmlObject[] serviceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(serviceArray, SERVICE$10);
            }
        }
        
        /**
         * Sets ith "service" element
         */
        public void setServiceArray(int i, org.apache.xmlbeans.XmlObject service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SERVICE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(service);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        public org.apache.xmlbeans.XmlObject insertNewService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(SERVICE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        public org.apache.xmlbeans.XmlObject addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SERVICE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "service" element
         */
        public void removeService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICE$10, i);
            }
        }
    }
}
