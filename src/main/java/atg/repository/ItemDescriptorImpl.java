package atg.repository;

import atg.beans.DynamicBeanDescriptor;
import atg.beans.DynamicBeanInfo;
import atg.beans.DynamicPropertyDescriptor;
import io.github.atg.stubs.NotImplementedException;

public class ItemDescriptorImpl implements RepositoryItemDescriptor {

    public DynamicBeanDescriptor getBeanDescriptor() {
        throw new NotImplementedException("getBeanDescriptor", this.getClass());
    }

    public DynamicPropertyDescriptor[] getPropertyDescriptors() {
        throw new NotImplementedException("getPropertyDescriptors", this.getClass());
    }

    public boolean hasProperty(String propertyName) {
        throw new NotImplementedException("hasProperty", this.getClass());
    }

    public String[] getPropertyNames() {
        throw new NotImplementedException("getPropertyNames", this.getClass());
    }

    public DynamicPropertyDescriptor getPropertyDescriptor(String descriptorName) {
        throw new NotImplementedException("getPropertyDescriptor", this.getClass());
    }

    public boolean isInstance(Object that) {
        throw new NotImplementedException("isInstance", this.getClass());
    }

    public boolean areInstances(DynamicBeanInfo that) {
        throw new NotImplementedException("areInstances", this.getClass());
    }

    public Repository getRepository() {
        throw new NotImplementedException("getRepository", this.getClass());
    }

    public String getItemDescriptorName() {
        throw new NotImplementedException("getItemDescriptorName", this.getClass());
    }
}
