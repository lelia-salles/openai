# OpenAI Chat Integration

This project integrates with the OpenAI API to provide a conversational interface using the **Text Completion** model.

## Model Details

* **Model Type:** Text Completion
* **API Endpoint:** `https://api.openai.com/v1/chat/completions`
* **Model Description:** This model generates human-like text based on a given prompt or input.

## Features

* **Conversational Interface:** Users can interact with the model using natural language input.
* **Text Completion:** The model generates responses to user input, creating a conversational flow.

## Limitations

This is an exaple of how to start creating a functional OpenAi. A chat can be developed from here and change the API token from your own API. This API was buld upon Feign. However Spring has already its AI API which can be found [here](https://docs.spring.io/spring-ai/reference/).

## Technical Details

* **API Client:** OpenAiClient (using Feign)
* **Request/Response Format:** JSON
* **Programming Language:** Java

## Usage

To use this integration, simply send a request to the OpenAiClient with a prompt or input, and the model will generate a response.

## Notes

* Make sure to replace the `https://api.openai.com/v1/chat/completions` endpoint with your own OpenAI API endpoint.
* This integration uses the Text Completion model, but you can experiment with other models and endpoints to achieve different results.
