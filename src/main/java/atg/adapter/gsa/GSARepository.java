package atg.adapter.gsa;

import atg.adapter.gsa.event.GSAEventListener;
import atg.repository.*;
import atg.repository.content.ContentRepository;
import atg.service.jdbc.DataSourceShutdownListener;
import atg.service.jdbc.SwitchingDataSourceEventListener;
import atg.service.lockmanager.LockOwnershipListener;

public class GSARepository
    extends RepositoryImpl
    implements MutableRepository,
        ContentRepository,
        MutableCompositeKeyRepository,
        Constants,
        GSAEventListener,
        LockOwnershipListener,
        SwitchingDataSourceEventListener,
        DataSourceShutdownListener,
        LoadBatchRepository {


    //From Repository interface
    public String[] getItemDescriptorNames() {
        return new String[0];
    }


    //From Repository interface
    public RepositoryItemDescriptor getItemDescriptor(String descriptorName) throws RepositoryException {
        return null;
    }
}
