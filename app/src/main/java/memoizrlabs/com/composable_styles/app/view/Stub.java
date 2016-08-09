package memoizrlabs.com.composable_styles.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import java.lang.ref.WeakReference;

public class Stub extends View {

    private WeakReference<View> mInflatedViewRef;

    private LayoutInflater mInflater;
    private OnInflateListener mInflateListener;

    public Stub(Context context) {
        super(context);
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        mInflater = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return mInflater;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
    }

//    @Override
//    public void setVisibility(int visibility) {
//        if (mInflatedViewRef != null) {
//            View view = mInflatedViewRef.get();
//            if (view != null) {
//                view.setVisibility(visibility);
//            } else {
//                throw new IllegalStateException("setVisibility called on un-referenced view");
//            }
//        } else {
//            super.setVisibility(visibility);
//            if (visibility == VISIBLE || visibility == INVISIBLE) {
//                inflate();
//            }
//        }
//    }

    public View inflate(View view) {
        final ViewParent viewParent = getParent();

        if (viewParent != null && viewParent instanceof ViewGroup) {
            final ViewGroup parent = (ViewGroup) viewParent;
            final LayoutInflater factory;
            if (mInflater != null) {
                factory = mInflater;
            } else {
                factory = LayoutInflater.from(getContext());
            }
//            final View view = factory.inflate(mLayoutResource, parent,
//                    false);

            final int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);

            final ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }

            mInflatedViewRef = new WeakReference<View>(view);

            if (mInflateListener != null) {
                mInflateListener.onInflate(this, view);
            }

            return view;
        } else {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(OnInflateListener inflateListener) {
        mInflateListener = inflateListener;
    }

    public static interface OnInflateListener {

        void onInflate(Stub stub, View inflated);
    }

}
