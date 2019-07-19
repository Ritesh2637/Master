package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
private	List<Topic> topics = Arrays.asList(new Topic("Shubham" , "Priyanka" , "Forever"),
		new Topic("Java" , "Core java" , "Advance java"),
		new Topic("Spring" , "Spring Framework" , "Spring Framework Description"));


public List<Topic> getAllTopics()

{
	return topics;
}

public Topic getTopic(String id) {
	return topics.stream().filter(t -> t.getId().contentEquals(id)).findFirst().get();
}
}
