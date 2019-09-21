package com.csource;

import org.csource.fastdfs.*;

public class Test {
    public static void main(String[] args) throws Exception {
        ClientGlobal.init("D:\\JavaItems\\Vue\\src\\main\\lib\\fdfs_client.conf");

        TrackerClient trackerClient = new TrackerClient();

        TrackerServer trackerServer = trackerClient.getConnection();

        StorageServer storageServer = null;

        StorageClient storageClient = new StorageClient(trackerServer,storageServer);

        String[] jpgs = storageClient.upload_file("D:\\wendang\\壁纸\\1.jpg", "jpg", null);
        for (String jpg : jpgs) {
            System.out.println(jpg);
        }
    }
}
