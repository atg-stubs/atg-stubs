package atg.repository;

import atg.core.exception.ContainerException;

public interface Repository extends RepositoryViewContainer {

    /**
     * @return the names of the item descriptors (the item types) in this repo
     */
    String[] getItemDescriptorNames();


    /**
     * @param descriptorName the name of the repo item descriptor
     * @return the repo item descriptor with the given name
     * @throws ContainerException.RepositoryException probably when the name doesn't match a descriptor
     */
    RepositoryItemDescriptor getItemDescriptor(String descriptorName) throws ContainerException.RepositoryException;
}
