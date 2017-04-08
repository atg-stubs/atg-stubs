package atg.adapter.gsa;

import atg.adapter.gsa.event.GSAEventListener;
import atg.repository.*;
import atg.repository.content.ContentRepository;
import atg.service.jdbc.DataSourceShutdownListener;
import atg.service.jdbc.SwitchingDataSourceEventListener;
import atg.service.lockmanager.LockOwnershipListener;
import io.github.atg.stubs.NotImplementedException;

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
        throw new NotImplementedException("getItemDescriptorNames", this.getClass());
    }


    //From Repository interface
    public RepositoryItemDescriptor getItemDescriptor(String descriptorName) throws RepositoryException {
        throw new NotImplementedException("getItemDescriptor", this.getClass());
    }
}
