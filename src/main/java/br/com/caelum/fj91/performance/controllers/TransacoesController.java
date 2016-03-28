package br.com.caelum.fj91.performance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.fj91.performance.daos.TransacaoDao;
import br.com.caelum.fj91.performance.models.Transacao;

@Controller
public class TransacoesController {
	
	@Autowired
	private TransacaoDao transacaoDao;

	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE,value="/transacoes")
	@ResponseBody
	public Iterable<Transacao> lista(){
		return transacaoDao.findAll();
	}
	
}
