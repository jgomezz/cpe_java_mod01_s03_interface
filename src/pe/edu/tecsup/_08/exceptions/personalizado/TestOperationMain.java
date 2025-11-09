package pe.edu.tecsup._08.exceptions.personalizado;

public class TestOperationMain {

	public static void main(String[] args) /*throws Exception*/{
		
		double saldoCuenta = 5000;
		double montoOperacion = 1000;
		
		try {
		
			validarMonto(saldoCuenta, montoOperacion);
			
			saldoCuenta = saldoCuenta - montoOperacion;
			System.out.println("Retirando fondos de S/" + montoOperacion);
			System.out.println("Saldo de la Cuenta despues de la operacion S/" + saldoCuenta);
			
		} catch (SinFondosExcepion e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Fin de la aplicacion");
		
		
	}

	/**
	 * 
	 * @param saldo
	 * @param monto
	 * @throws SinFondosExcepion
	 */
	public static void validarMonto(double saldo, double monto)	
			throws SinFondosExcepion{
		
		
		if( monto > saldo) { // Reglas de negocios
            throw new SinFondosExcepion("Saldo actual, S/" + saldo + ", Monto a retirar: S/" + monto);

		}	
		
	}
	
}
