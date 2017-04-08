package atg.repository;

import atg.beans.DynamicPropertyDescriptor;
import io.github.atg.stubs.NotImplementedException;

public class RepositoryPropertyDescriptor
    extends DynamicPropertyDescriptor
    implements Cloneable {


    //TODO: doc what happens if the default value IS null?
    //TODO: verify returning null means what the docs say
    /**
     * @return the default value of the property as a string. null if there is no default value
     */
    public String getDefaultValueString(){
        throw new NotImplementedException("getDefaultValueString", this.getClass());
    }
}
