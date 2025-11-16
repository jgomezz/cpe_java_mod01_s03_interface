package pe.edu.tecsup._08.exceptions._3_personalizado;

public class OperacionBancaria {

	public static void main(String[] args) /*throws Exception*/{
		
		double saldoCuenta = 50;
		double montoOperacion = 1000;
		
		try {
		
			validarMonto(saldoCuenta, montoOperacion);
			
			saldoCuenta = saldoCuenta - montoOperacion;
			System.out.println("Retirando fondos de S/" + montoOperacion);
			System.out.println("Saldo de la Cuenta despues de la operacion S/" + saldoCuenta);
			
		} catch (SinFondosException e) {
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
	 * @throws SinFondosException
	 */
	public static void validarMonto(double saldo, double monto)	{

		if( monto > saldo) { // Reglas de negocios
            throw new SinFondosException("Saldo actual, S/" + saldo + ", Monto a retirar: S/" + monto);

		}	
		
	}
	
}
