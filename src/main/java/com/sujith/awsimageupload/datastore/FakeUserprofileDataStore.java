package com.sujith.awsimageupload.datastore;

import com.sujith.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserprofileDataStore
{
     private static final List<UserProfile> USER_PROFILES=new ArrayList<>();



        static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("2aeb885d-8630-4880-b4a3-e83aaa8f6a80"), "sujith", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("9e54dfd9-2901-41c1-9c6d-799d21df0a84"), "nisanth", null));


    }

    public  List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
