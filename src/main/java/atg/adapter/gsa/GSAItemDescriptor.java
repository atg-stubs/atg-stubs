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
        throw new NotImplementedException("compareTo", GSAItemDescriptor.class);
    }
}
