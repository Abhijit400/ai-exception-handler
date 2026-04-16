# 🚀 AI Exception Handler

## 📌 Project Overview

This project is a **Spring Boot-based AI-powered exception handling
system** that automatically:

-   Captures runtime exceptions globally\
-   Sends the exception details to an AI model\
-   Generates a possible fix/solution\
-   Notifies the team via Slack

👉 **Goal:** Reduce debugging time and improve production issue handling

------------------------------------------------------------------------

## 🧠 Key Features

-   ✅ Global Exception Handling using `@RestControllerAdvice`\
-   🤖 AI-based fix suggestions using Spring AI\
-   🔔 Real-time Slack notifications\
-   🧩 Clean layered architecture\
-   ⚡ Plug-and-play design

------------------------------------------------------------------------

## 🏗️ Tech Stack

-   Java 17\
-   Spring Boot 3\
-   Spring AI\
-   REST APIs\
-   Slack Webhooks

------------------------------------------------------------------------

## 📂 Project Structure

    ai-exception-handler
    │
    ├── controller
    │   └── TestController.java
    │
    ├── service
    │   ├── TestService.java
    │   └── impl
    │       ├── TestServiceImpl.java
    │       ├── AiService.java
    │       └── SlackService.java
    │
    ├── handler
    │   └── GlobalExceptionHandler.java
    │
    ├── constant
    │   └── PromptMessages.java
    │
    ├── requestDTO
    │   └── TestRequest.java
    │
    └── application.yml

------------------------------------------------------------------------

## ⚙️ How It Works

1.  Exception occurs in the application\
2.  `GlobalExceptionHandler` catches it\
3.  Exception is sent to `AiService`\
4.  AI generates a fix suggestion\
5.  `SlackService` sends alert with details

------------------------------------------------------------------------

## 🔄 Flow

    Request → Controller → Service → Exception ❌
                                          ↓
                               GlobalExceptionHandler
                                          ↓
                             AI Service (Fix Suggestion)
                                          ↓
                                Slack Notification 🚀

------------------------------------------------------------------------

## 🔧 Configuration

### Slack Webhook

``` yaml
slack:
  webhook-url: https://hooks.slack.com/services/your/webhook/url
```

------------------------------------------------------------------------

### AI Configuration

Configure your AI provider (OpenAI / Azure) in `application.yml`.

------------------------------------------------------------------------

## ▶️ Run the Project

``` bash
mvn clean install
mvn spring-boot:run
```

------------------------------------------------------------------------

## 🧪 Test the Flow

Call an API that throws an exception:

    GET /test/error

------------------------------------------------------------------------

## 💡 Use Cases

-   Production issue monitoring\
-   Faster debugging\
-   AI-assisted DevOps\
-   Developer productivity improvement

------------------------------------------------------------------------

## 🔥 Future Enhancements

-   Severity-based alerting\
-   Email notifications\
-   Monitoring dashboard\
-   Auto-healing suggestions\
-   ELK / Grafana integration

------------------------------------------------------------------------

## 👨‍💻 Author

**Abhijit Patel**\
Java Spring Boot Developer

------------------------------------------------------------------------

## ⭐ Why This Project Stands Out

-   Combines **AI + Backend + Real-world problem solving**\
-   Demonstrates **system design thinking**\
-   Shows **ownership and production-level mindset**
