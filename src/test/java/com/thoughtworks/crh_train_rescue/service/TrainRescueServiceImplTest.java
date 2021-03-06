package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainRescueServiceImplTest {
    @Autowired
    TrainRescueServiceImpl trainRescueService;
    @Test
    public void shouldReturnTrainRescueGivenId () {
        TrainRescue trainRescue = trainRescueService.getTrainRescueById(1);
        assertThat(trainRescue.getToRescueTrainId().equals(1));
        assertThat(trainRescue.getRescueTrainId().equals(2));
    }
}
