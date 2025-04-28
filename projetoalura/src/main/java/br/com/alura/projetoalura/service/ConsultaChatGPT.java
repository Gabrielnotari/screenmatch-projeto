//package br.com.alura.projetoalura.service;
//
//import com.theokanning.openai.OpenAiHttpException;
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//public class ConsultaChatGPT {
//    public static String obterTraducao(String texto) {
//        OpenAiService service = new OpenAiService();
//        try {
//        CompletionRequest requisicao = CompletionRequest.builder()
//                .model("gpt-3.5-turbo-instruct")
//                .prompt("traduza para o português o texto: " + texto)
//                .maxTokens(1000)
//                .temperature(0.7)
//                .build();
//            return service.createCompletion(requisicao).getChoices().get(0).getText();
//        } catch (OpenAiHttpException e) {
//            System.out.println("Erro ao tentar traduzir: " + e.getMessage());
//            return "Tradução indisponível no momento.";
//        }
//    }
//}
