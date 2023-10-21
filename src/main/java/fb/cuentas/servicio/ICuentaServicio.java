package fb.cuentas.servicio;

import fb.cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer IdCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta contacto);
}

