package atg.repository;

import atg.nucleus.GenericService;

import javax.transaction.TransactionManager;

public abstract class RepositoryImpl
    extends GenericService
    implements Repository,
    DisplayableRepository,
    ProxyableRepository {


    private TransactionManager txManager;

    public void setTransactionManager(TransactionManager txManager){
        this.txManager = txManager;
    }

    public TransactionManager getTransactionManager(){
        return this.txManager;
    }


}
