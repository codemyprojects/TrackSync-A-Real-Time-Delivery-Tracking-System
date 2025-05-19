# TrackSync-A-Real-Time-Delivery-Tracking-System
**TrackSync** is a modular, Kafka-based microservice system for real-time delivery tracking and communication. Built with Spring Boot and Apache Kafka, it ensures seamless, asynchronous message-driven interaction between delivery operations and end users.

## 🧩 Microservices

### 1. 🚚 Delivery Service (`deliveryApp`)
This service represents the logistics or delivery agent side. It collects and publishes real-time location updates and delivery events.

#### Key Features:
- Captures delivery-related data like GPS coordinates and delivery status.
- **Publishes events** to a Kafka topic (`delivery.location.updates`).
- Uses a `KafkaService` class for Kafka producer configuration and message dispatch.

#### Kafka Role:
- Acts as a **Kafka Producer**.
- Sends structured JSON or serialized delivery events to Kafka.

### 2. 📱 End User Service (`enduser`)
This service represents the customer or user interface side. It subscribes to delivery event updates for live tracking or status updates.

#### Key Features:
- **Consumes** events from Kafka topics in real-time.
- Updates the user interface or notifies clients when delivery status/location changes.
- Uses `KafkaConfig` to configure Kafka consumer logic.

#### Kafka Role:
- Acts as a **Kafka Consumer**.
- Subscribes to the `delivery.location.updates` topic to get continuous updates.

- **Topic Used:** `delivery.location.updates`
- **Broker:** Assumes Kafka is running locally or remotely and reachable by both services.
- **Format:** Messages can be JSON or POJO serialized using Spring Kafka.

## ⚙️ Tech Stack

| Component    | Technology     |
|--------------|----------------|
| Backend      | Java (Spring Boot) |
| Messaging    | Apache Kafka   |
| Build Tool   | Maven          |
| Architecture | Microservices  |
| Deployment   | Docker/Kubernetes (Optional) |


## 🚀 Use Cases

- Real-time delivery status tracking
- Live logistics location visualization
- Courier and food delivery notifications
- Fleet and asset movement monitoring

## 🧪 Getting Started

**Start Kafka Broker & Zookeeper**
   docker-compose up -d zookeeper kafka

**2. Build and Run Services**

**cd deliveryApp**
./mvnw spring-boot:run
**cd enduser**
./mvnw spring-boot:run

**3. Verify Kafka Messaging**
      Delivery service should push updates.
      End user service should log/consume updates.

**📝 Future Enhancements**
      Add WebSocket or REST API for frontend integration
      Visual tracking dashboard (e.g., map UI)
      Multi-topic support (e.g., order status, driver ETA)
      Authentication and secure messaging


