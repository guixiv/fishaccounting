package com.fishfishfish.fishaccounting.model.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.fishfishfish.fishaccounting.model.bean.local.FishSort;
import com.fishfishfish.fishaccounting.model.bean.local.FishPay;
import com.fishfishfish.fishaccounting.model.bean.local.FishBill;

import com.fishfishfish.fishaccounting.model.gen.FishSortDao;
import com.fishfishfish.fishaccounting.model.gen.FishPayDao;
import com.fishfishfish.fishaccounting.model.gen.FishBillDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig fishSortDaoConfig;
    private final DaoConfig fishPayDaoConfig;
    private final DaoConfig fishBillDaoConfig;

    private final FishSortDao fishSortDao;
    private final FishPayDao fishPayDao;
    private final FishBillDao fishBillDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        fishSortDaoConfig = daoConfigMap.get(FishSortDao.class).clone();
        fishSortDaoConfig.initIdentityScope(type);

        fishPayDaoConfig = daoConfigMap.get(FishPayDao.class).clone();
        fishPayDaoConfig.initIdentityScope(type);

        fishBillDaoConfig = daoConfigMap.get(FishBillDao.class).clone();
        fishBillDaoConfig.initIdentityScope(type);

        fishSortDao = new FishSortDao(fishSortDaoConfig, this);
        fishPayDao = new FishPayDao(fishPayDaoConfig, this);
        fishBillDao = new FishBillDao(fishBillDaoConfig, this);

        registerDao(FishSort.class, fishSortDao);
        registerDao(FishPay.class, fishPayDao);
        registerDao(FishBill.class, fishBillDao);
    }

    public void clear() {
        fishSortDaoConfig.clearIdentityScope();
        fishPayDaoConfig.clearIdentityScope();
        fishBillDaoConfig.clearIdentityScope();
    }

    public FishSortDao getFishSortDao() {
        return fishSortDao;
    }

    public FishPayDao getFishPayDao() {
        return fishPayDao;
    }

    public FishBillDao getFishBillDao() {
        return fishBillDao;
    }

}
