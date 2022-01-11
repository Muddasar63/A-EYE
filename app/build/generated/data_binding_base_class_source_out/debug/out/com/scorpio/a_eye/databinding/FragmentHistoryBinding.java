// Generated by view binder compiler. Do not edit!
package com.scorpio.a_eye.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scorpio.a_eye.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppbarMainBinding appbar;

  @NonNull
  public final ImageView imgCurrency;

  @NonNull
  public final ImageView imgFaces;

  @NonNull
  public final RelativeLayout layoutCurrency;

  @NonNull
  public final RelativeLayout layoutFaces;

  private FragmentHistoryBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppbarMainBinding appbar, @NonNull ImageView imgCurrency,
      @NonNull ImageView imgFaces, @NonNull RelativeLayout layoutCurrency,
      @NonNull RelativeLayout layoutFaces) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.imgCurrency = imgCurrency;
    this.imgFaces = imgFaces;
    this.layoutCurrency = layoutCurrency;
    this.layoutFaces = layoutFaces;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      View appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }
      AppbarMainBinding binding_appbar = AppbarMainBinding.bind(appbar);

      id = R.id.img_currency;
      ImageView imgCurrency = ViewBindings.findChildViewById(rootView, id);
      if (imgCurrency == null) {
        break missingId;
      }

      id = R.id.img_faces;
      ImageView imgFaces = ViewBindings.findChildViewById(rootView, id);
      if (imgFaces == null) {
        break missingId;
      }

      id = R.id.layout_currency;
      RelativeLayout layoutCurrency = ViewBindings.findChildViewById(rootView, id);
      if (layoutCurrency == null) {
        break missingId;
      }

      id = R.id.layout_faces;
      RelativeLayout layoutFaces = ViewBindings.findChildViewById(rootView, id);
      if (layoutFaces == null) {
        break missingId;
      }

      return new FragmentHistoryBinding((ConstraintLayout) rootView, binding_appbar, imgCurrency,
          imgFaces, layoutCurrency, layoutFaces);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}