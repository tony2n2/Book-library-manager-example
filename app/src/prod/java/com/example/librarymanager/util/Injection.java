package com.example.librarymanager.util;

import android.content.Context;

import com.example.librarymanager.data.DataContract;
import com.example.librarymanager.data.DataRepository;

/**
 * Enables injection of production implementations at comoile time.
 */

public class Injection {

    public static ImageFile provideImageFile() {
        return new ImageFileImpl();
    }

    public static DataContract.Repository provideRepository(Context context) {
        return DataRepository.getInstance(context);
    }
}
