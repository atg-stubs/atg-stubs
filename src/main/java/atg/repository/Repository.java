package atg.repository;

public interface Repository extends RepositoryViewContainer {

    /**
     * @return the names of the item descriptors (the item types) in this repo
     */
    String[] getItemDescriptorNames();
}
