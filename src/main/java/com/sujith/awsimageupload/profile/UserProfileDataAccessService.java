package com.sujith.awsimageupload.profile;

import com.sujith.awsimageupload.datastore.FakeUserprofileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService
{
    private final FakeUserprofileDataStore fakeUserprofileDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserprofileDataStore fakeUserprofileDataStore) {
        this.fakeUserprofileDataStore = fakeUserprofileDataStore;
    }

    List<UserProfile> getUserProfiles()
    {
        return fakeUserprofileDataStore.getUserProfiles();
    }

}
