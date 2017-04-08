package atg.repository;

import atg.nucleus.GenericService;
import io.github.atg.stubs.NotImplementedException;

import javax.transaction.TransactionManager;

public abstract class RepositoryImpl
    extends GenericService
    implements Repository,
    DisplayableRepository,
    ProxyableRepository {


    public void setTransactionManager(TransactionManager txManager){
        throw new NotImplementedException("setTransactionManager", this.getClass());
    }

    public TransactionManager getTransactionManager(){
        throw new NotImplementedException("getTransactionManager", this.getClass());
    }


}
