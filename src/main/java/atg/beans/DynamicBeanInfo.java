package atg.beans;

import java.io.Serializable;

public interface DynamicBeanInfo extends Serializable {

    DynamicBeanDescriptor getBeanDescriptor();

    DynamicPropertyDescriptor[] getPropertyDescriptors();

    boolean hasProperty(String propertyName);

    String[] getPropertyNames();

    DynamicPropertyDescriptor getPropertyDescriptor(String descriptorName);

    boolean isInstance(Object that);

    boolean areInstances(DynamicBeanInfo that);
}
