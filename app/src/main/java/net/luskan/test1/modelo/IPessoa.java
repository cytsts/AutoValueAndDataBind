package net.luskan.test1.modelo;

import android.os.Parcelable;

/**
 * Created by Clayton on 21/02/2017.
 */
public interface IPessoa extends Parcelable {
    abstract Long Id();
    abstract String Name();
    abstract String Email();
}
