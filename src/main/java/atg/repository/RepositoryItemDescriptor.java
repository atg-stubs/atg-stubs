package atg.repository;

import atg.beans.DynamicBeanInfo;
import io.github.atg.stubs.NotImplementedException;

public interface RepositoryItemDescriptor extends DynamicBeanInfo {

    /**
     * @return the repository this item descriptor is defined for
     */
    Repository getRepository();

    /**
     * @return the name of this item descriptor
     */
    String getItemDescriptorName();




}
