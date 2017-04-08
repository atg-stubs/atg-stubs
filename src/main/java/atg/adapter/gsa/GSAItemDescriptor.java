package atg.adapter.gsa;

import atg.repository.ItemDescriptorImpl;
import atg.repository.RepositoryItemDescriptorContainer;
import atg.repository.content.ContentPropertyItemDescriptor;
import io.github.atg.stubs.NotImplementedException;

import java.io.Serializable;

public class GSAItemDescriptor
    extends ItemDescriptorImpl
    implements Serializable,
        Constants,
        RepositoryItemDescriptorContainer,
        Comparable<Object>,
        ContentPropertyItemDescriptor {

    public int compareTo(Object o) {
        throw new NotImplementedException("compareTo", this.getClass());
    }

    /**
     * @return true if this property can be queried, false if it can not
     */
    public boolean isQueryable(){
        throw new NotImplementedException("isQueryable", this.getClass());
    }

    /**
     * @return true if this property is derived, false if it is not
     */
    public boolean isDerived(){
        throw new NotImplementedException("isDerived", this.getClass());
    }
}
