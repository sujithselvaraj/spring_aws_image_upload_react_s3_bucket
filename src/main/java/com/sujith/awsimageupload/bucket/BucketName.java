package com.sujith.awsimageupload.bucket;

public enum BucketName
{
    PROFILE_IMAGE("aws-image-upload-sujith");

    private final String bucketname;

    BucketName(String bucketname)
    {
        this.bucketname=bucketname;
    }

    public String getBucketname()
    {
        return bucketname;
    }
}
