package jjzee.conf.factory.mongoDbConfig;

import java.util.List;

public interface MongoUtil<E>{

    public void createEntity(E entity);

    public List<E> getAllEntity();

    public E getEntityBy(String property);

    public void updateEntity(E entity);

    public void deleteEntity(E entity);

}
