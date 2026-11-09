package services;

import domain.Cliente;
import exceptions.DAOException;
import services.generic.IGenericService;

/**
 * @author gustavohmdm
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;
}
