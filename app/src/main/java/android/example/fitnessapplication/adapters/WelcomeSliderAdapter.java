package android.example.fitnessapplication.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.example.fitnessapplication.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.io.IOException;
import java.io.InputStream;

import static android.example.fitnessapplication.activities.WelcomeActivity.msg_welcome;

public class WelcomeSliderAdapter extends SliderViewAdapter<WelcomeSliderAdapter.SliderAdapterVH> {

    private Context context;
    TextView tvw;


    public WelcomeSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        tvw = ((Activity)context).findViewById(R.id.tv_welcome);
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.welcome_image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
//        viewHolder.textViewDescription.setText("This is slider item " + position);
//        tvw.setText(msg_welcome);
//        viewHolder.textViewDescription.setText("");
        /*View root = LayoutInflater.from(context).inflate(R.layout.activity_welcome, null);
        tv_welcome = root.findViewById(R.id.tv_welcome);*/
        String imageFileName = null;
        switch (position) {
            case 0:
               /* Glide.with(viewHolder.itemView)
                        .load("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260")
                        .into(viewHolder.imageViewBackground);*/
                imageFileName = "welcome_img1.png";
                viewHolder.imageViewBackground.setImageBitmap(getBitmapFromAssets(imageFileName));
                msg_welcome = "We care for your health";
//                tvw.setText(msg_welcome);
//                tv_welcome.setText(msg_welcome);
                break;
            case 1:
                /*Glide.with(viewHolder.itemView)
                        .load("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
                        .into(viewHolder.imageViewBackground);*/
                imageFileName = "welcome_img2.png";
                viewHolder.imageViewBackground.setImageBitmap(getBitmapFromAssets(imageFileName));
                msg_welcome = "You have the power to change";
//                tvw = ((Activity)context).findViewById(R.id.tv_welcome);
//                tvw.setText(msg_welcome);
//                tv_welcome.setText(msg_welcome);
                break;
            default:
               /* Glide.with(viewHolder.itemView)
                        .load("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
                        .into(viewHolder.imageViewBackground);*/
                imageFileName = "welcome_img3.png";
                viewHolder.imageViewBackground.setImageBitmap(getBitmapFromAssets(imageFileName));
                msg_welcome = "You have the ability to do anything !";
//                tvw = ((Activity)context).findViewById(R.id.tv_welcome);
//                tvw.setText(msg_welcome);
//                tv_welcome.setText(msg_welcome);
                break;

        }

    }

    // Custom method to get assets folder image as bitmap
    private Bitmap getBitmapFromAssets(String fileName) {
        AssetManager am = context.getAssets();
        InputStream is = null;
        try {
            is = am.open(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bitmap bitmap = BitmapFactory.decodeStream(is);
        return bitmap;
    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 3;  //no. of
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}