package org.eten.authentication.core

//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaService(
//    @Autowired
//    val kafka: KafkaTemplate<String, String>,
) {
  fun send(
      topic: KafkaTopics,
      message: String,
  ) {
    println("${topic.name}:$message")
//    kafka.send(topic.name, message)
  }
}