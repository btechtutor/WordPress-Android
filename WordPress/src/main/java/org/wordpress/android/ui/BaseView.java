package org.wordpress.android.ui;

import android.content.Context;
import android.support.annotation.StringRes;

public interface BaseView {
    Context getContext();

    String getString(@StringRes int stringRes);

    CharSequence getText(@StringRes int textRes);

    void showToast(int stringResId);
}