package net.luskan.test1.modelo;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcelable;

import com.gabrielittner.auto.value.cursor.ColumnName;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/**
 * Created by Clayton on 16/02/2017.
 */
@AutoValue
public abstract class Pessoa  implements IPessoa {


    static Pessoa create(Cursor cursor) {
        return AutoValue_Pessoa.createFromCursor(cursor);
    }

    static Pessoa create( Long Id,
                          String Name,
                          String Email){
        return new AutoValue_Pessoa(Id, Name, Email);
    }

    public static TypeAdapter<Pessoa> typeAdapter(Gson gson) {
        return new AutoValue_Pessoa.GsonTypeAdapter(gson);
    }

    abstract ContentValues toContentValues();

    public static Builder builder() {
        return new AutoValue_Pessoa.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public  abstract Builder Id(Long value);
        public  abstract Builder Name(String value);
        public abstract Builder Email(String value);
        public abstract Pessoa build();
    }
}
