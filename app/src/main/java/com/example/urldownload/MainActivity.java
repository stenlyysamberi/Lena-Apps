package com.example.urldownload;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CardView btn_download;
    EditText tx_url;
    String url_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx_url = findViewById(R.id.url_download);
        btn_download = findViewById(R.id.btn_download);
        btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url_id = tx_url.getText().toString();
                Uri url = Uri.parse(url_id);
                DownloadManager downloadManager = (DownloadManager) getSystemService(MainActivity.this.DOWNLOAD_SERVICE);
                DownloadManager.Request request = new DownloadManager.Request(url);
                request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE);
                request.setMimeType("image/jpeg");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);
            }
        });
    }
}