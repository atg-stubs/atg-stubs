package atg.repository;

import java.io.Serializable;

public abstract class RepositoryItemImpl
    implements MutableRepositoryItem,
    RepositoryChangedItem,
    Serializable,
    Comparable {


    public interface LinkGenerator {

    }
}
