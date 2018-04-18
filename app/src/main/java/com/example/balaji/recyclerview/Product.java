package com.example.balaji.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Balaji on 26-03-2018.
 */

public class Product implements Parcelable {
    private String name;
    private  String surname;
    private int image;
    public Product(String name,String surname,int image)
    {
        this.name=name;
        this.surname=surname;
        this.image=image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                "surname'"+surname+'\''+
                "image'"+image+'\''+
                '}';
    }

    protected Product(Parcel in) {
        name = in.readString();
        surname =in.readString();
        image=in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getImage(){return image; }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeInt(image);
    }
}
