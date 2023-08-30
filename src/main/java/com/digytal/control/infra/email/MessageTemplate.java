package com.digytal.control.infra.email;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class MessageTemplate {
    @Value("${app.name}")
    private String app;
    public String novoAcessoTitulo(){
        return app + " - Credencial para acesso à plataforma";
    }
    public String redefinicaoSenhaTitulo(){
        return app + " - Redefinição de senha";
    }
    public String alteracaoSenhaTitulo(){
        return app + " - Alteração de senha";
    }
    public String novoAcessoMensagem(String nome, String login,String senhaTemporaria){
        String msg = String.format("Olá %s,\nSeja bem-vindo a nossa plataforma online, " +
                "para acessar os recursos online basta informar seu login e senha conforme abaixo.\n\nLogin: %s\nSenha: %s\n\nAtenciosamente,\nDigytal",
                nome, login, senhaTemporaria);
        return msg;
    }
    public String novoLinkAlteraSenhaMensagem(String nome, Integer id,String senhaTemporaria){
        String url = String.format("<a href=\\\"%s&%d&%s\\\">CLICK AQUI</a>",ServletUriComponentsBuilder.fromCurrentContextPath().toUriString(),id,senhaTemporaria);


        String msg = String.format("Olá %s,\nSeja bem-vindo a nossa plataforma online, " +
                        "clique no link abaixo para definir uma senha e acessar nossos conteúdos.\n\nLink: %s\n\nAtenciosamente,\nDigytal",
                nome, url);
        return msg;
    }
    public String alteracaoSenhaMensagem(String nome){
        String msg = String.format("Olá %s,\nHouve uma solicitação de alteração de senha em sua conta.\n\nAtenciosamente,\nDigytal",nome);
        return msg;
    }
}
