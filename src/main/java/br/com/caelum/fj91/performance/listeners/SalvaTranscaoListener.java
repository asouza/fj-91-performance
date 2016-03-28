package br.com.caelum.fj91.performance.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import br.com.caelum.fj91.performance.models.Transacao;

@Service
public class SalvaTranscaoListener {
	
	@JmsListener(destination = "novas-transacoes")
	public void lida(Transacao transacao) throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("salvando a transacao");
	}
}
