package services;

import dao.IProdutoDAO;
import domain.Produto;
import services.generic.GenericService;

/**
 * @author gustavohmdm
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}
}
