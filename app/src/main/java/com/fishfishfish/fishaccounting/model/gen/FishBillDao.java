package com.fishfishfish.fishaccounting.model.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.fishfishfish.fishaccounting.model.bean.local.FishBill;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "FISH_BILL".
 */
public class FishBillDao extends AbstractDao<FishBill, Long> {

    public static final String TABLENAME = "FISH_BILL";

    /**
     * Properties of entity FishBill.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Rid = new Property(1, String.class, "rid", false, "RID");
        public final static Property Cost = new Property(2, float.class, "cost", false, "COST");
        public final static Property Content = new Property(3, String.class, "content", false, "CONTENT");
        public final static Property Userid = new Property(4, String.class, "userid", false, "USERID");
        public final static Property PayName = new Property(5, String.class, "payName", false, "PAY_NAME");
        public final static Property PayImg = new Property(6, String.class, "payImg", false, "PAY_IMG");
        public final static Property SortName = new Property(7, String.class, "sortName", false, "SORT_NAME");
        public final static Property SortImg = new Property(8, String.class, "sortImg", false, "SORT_IMG");
        public final static Property Crdate = new Property(9, long.class, "crdate", false, "CRDATE");
        public final static Property Income = new Property(10, boolean.class, "income", false, "INCOME");
        public final static Property Version = new Property(11, int.class, "version", false, "VERSION");
    }


    public FishBillDao(DaoConfig config) {
        super(config);
    }

    public FishBillDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FISH_BILL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"RID\" TEXT," + // 1: rid
                "\"COST\" REAL NOT NULL ," + // 2: cost
                "\"CONTENT\" TEXT," + // 3: content
                "\"USERID\" TEXT," + // 4: userid
                "\"PAY_NAME\" TEXT," + // 5: payName
                "\"PAY_IMG\" TEXT," + // 6: payImg
                "\"SORT_NAME\" TEXT," + // 7: sortName
                "\"SORT_IMG\" TEXT," + // 8: sortImg
                "\"CRDATE\" INTEGER NOT NULL ," + // 9: crdate
                "\"INCOME\" INTEGER NOT NULL ," + // 10: income
                "\"VERSION\" INTEGER NOT NULL );"); // 11: version
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FISH_BILL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FishBill entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String rid = entity.getRid();
        if (rid != null) {
            stmt.bindString(2, rid);
        }
        stmt.bindDouble(3, entity.getCost());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(5, userid);
        }
 
        String payName = entity.getPayName();
        if (payName != null) {
            stmt.bindString(6, payName);
        }
 
        String payImg = entity.getPayImg();
        if (payImg != null) {
            stmt.bindString(7, payImg);
        }
 
        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(8, sortName);
        }
 
        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(9, sortImg);
        }
        stmt.bindLong(10, entity.getCrdate());
        stmt.bindLong(11, entity.getIncome() ? 1L: 0L);
        stmt.bindLong(12, entity.getVersion());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FishBill entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String rid = entity.getRid();
        if (rid != null) {
            stmt.bindString(2, rid);
        }
        stmt.bindDouble(3, entity.getCost());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(5, userid);
        }
 
        String payName = entity.getPayName();
        if (payName != null) {
            stmt.bindString(6, payName);
        }
 
        String payImg = entity.getPayImg();
        if (payImg != null) {
            stmt.bindString(7, payImg);
        }
 
        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(8, sortName);
        }
 
        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(9, sortImg);
        }
        stmt.bindLong(10, entity.getCrdate());
        stmt.bindLong(11, entity.getIncome() ? 1L: 0L);
        stmt.bindLong(12, entity.getVersion());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FishBill readEntity(Cursor cursor, int offset) {
        FishBill entity = new FishBill( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // rid
                cursor.getFloat(offset + 2), // cost
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // content
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userid
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // payName
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // payImg
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // sortName
                cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // sortImg
                cursor.getLong(offset + 9), // crdate
                cursor.getShort(offset + 10) != 0, // income
                cursor.getInt(offset + 11) // version
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FishBill entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCost(cursor.getFloat(offset + 2));
        entity.setContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPayName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPayImg(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSortName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSortImg(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCrdate(cursor.getLong(offset + 9));
        entity.setIncome(cursor.getShort(offset + 10) != 0);
        entity.setVersion(cursor.getInt(offset + 11));
    }

    @Override
    protected final Long updateKeyAfterInsert(FishBill entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FishBill entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FishBill entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
