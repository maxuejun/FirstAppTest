package com.example.maxuejun.firstapptest.fragment;

import com.cleveroad.slidingtutorial.PageFragment;
import com.cleveroad.slidingtutorial.TransformItem;
import com.example.maxuejun.firstapptest.R;

/**
 * Created by maxuejun on 2016/2/18.
 */
public class ThirdCustomPageFragment extends PageFragment{
    @Override
    protected TransformItem[] provideTransformItems() {
        return new TransformItem[]{
                new TransformItem(R.id.ivFirstImage, true, 20),
                new TransformItem(R.id.ivSecondImage, false, 6),
                new TransformItem(R.id.ivThirdImage, true, 8),
                new TransformItem(R.id.ivFourthImage, false, 10),
                new TransformItem(R.id.ivFifthImage, false, 3),
                new TransformItem(R.id.ivSixthImage, false, 9),
                new TransformItem(R.id.ivSeventhImage, false, 14),
        };
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_page_third;
    }
}
