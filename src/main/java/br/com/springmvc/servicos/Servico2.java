//package br.com.springmvc.servicos;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import br.com.springmvc.repository.EntidadeRepository;
//
//@Service
//public class Servico2 {
//	
//	@Autowired
//	@Qualifier("entidadeMockDao")
//	private EntidadeRepository entidadeRepository;
//
//	public void testeCrud() {
//		System.out.println("INI - Acessando servico...");
//		entidadeRepository.create();
//		entidadeRepository.read();
//		entidadeRepository.update();
//		entidadeRepository.delete();
//		System.out.println("FIM - Acessando servico.");
//	}
//}