package fr.wildcodeschool.roomreservation;

import android.provider.BaseColumns;

public class DBContract{

    public class PersonEntry implements BaseColumns {
        public static final String TABLE_NAME = "Person";
        public static final String COLUMN_NAME_LASTNAME = "lastname";
        public static final String COLUMN_NAME_FIRSTNAME = "firstname";
    }

    public class RoomEntry implements BaseColumns{
        public static final String TABLE_NAME = "Room";
        public static final String COLUMN_NAME = "name";
    }
}

