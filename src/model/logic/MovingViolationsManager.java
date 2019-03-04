package model.logic;
import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;
import model.data_structures.IQueue;
import model.data_structures.IStack;
import model.data_structures.LinkedList;
import model.data_structures.Node;
import model.data_structures.Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
/**
 * Clase que maneja la carga de los archivos de tipo CSV.
 * @author Mario Hurtado
 *
 */
public class MovingViolationsManager implements IMovingViolationsManager {

	/**
	 * Lista en la que se va a cargar la información.
	 */
	ILinkedList<VOMovingViolations> listaViolaciones;

	/**
	 * Método que carga la información del archivo CSV a la lista.
	 * Dependiendo del cuatrimestre elegido por el usuario carga la información de los meses que correspondan.
	 */
	public void loadMovingViolations(String movingViolationsFile){
		//		listaViolaciones= new CsvToBeanBuilder(new FileReader(movingViolationsFile)).withType(VOMovingViolations.class).build().parse();
		System.out.println("ejecuto"); 
		if(movingViolationsFile.equals("1")) {
			System.out.println("1 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_January_2018.csv"));
				String [] nextLine;
				int contador1 =0;
				int contador2=0;
				int contador3=0;
				int contador4=0;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
								,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
										,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando1");
						contador1++;
					}
					//					CSVReader reader2 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_February_2018.csv"));
					//					String [] nextLine2;
					//
					//
					//					reader2.readNext();
					//					while ((nextLine2 = reader2.readNext()) != null) {
					//
					//
					//						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
					//								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
					//										,nextLine2[14],nextLine2[15],nextLine2[16]);
					//						listaViolaciones.add(mV);
					//						System.out.println("mapeando2" );
					//						contador2++;
					//					}
					//
					//					CSVReader reader3 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_March_2018.csv"));
					//					String [] nextLine3;
					//
					//					reader3.readNext();
					//					while ((nextLine3 = reader3.readNext()) != null) {
					//
					//
					//						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
					//								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
					//										,nextLine3[14],nextLine3[15],nextLine3[16]);
					//						listaViolaciones.add(mV);
					//						System.out.println("mapeando3" );
					//						contador3++;
					//					}
					//
					//					CSVReader reader4 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_April_2018.csv"));
					//					String [] nextLine4;
					//
					//					reader4.readNext();
					//					while ((nextLine4 = reader4.readNext()) != null) {
					//
					//
					//						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
					//								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
					//										,nextLine4[14],nextLine4[15],nextLine4[16]);
					//						listaViolaciones.add(mV);
					//						System.out.println("mapeando4" );
					//						contador4++;
					//					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				System.out.println("terminado"+System.currentTimeMillis());
				System.out.println("Se han cargado (infracciones): Enero: "+ contador1+" ; Febrero: "+contador2+" ; Marzo: "+contador3+" ; Abril: "+contador4+". \nY en total este cuatrimestre: "+(contador1+contador2+contador3+contador4)+".") ;
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(movingViolationsFile.equals("2")) {
			System.out.println("2 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_May_2018.csv"));
				String [] nextLine;
				int contador5 =0;
				int contador6=0;
				int contador7=0;
				int contador8=0;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
								,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
										,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando5");
						contador5++;
					}
					CSVReader reader2 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_June_2018.csv"));
					String [] nextLine2;

					reader2.readNext();
					while ((nextLine2 = reader2.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
										,nextLine2[14],nextLine2[15],nextLine2[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando6");
						contador6++;
					}

					CSVReader reader3 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_July_2018.csv"));
					String [] nextLine3;

					reader3.readNext();
					while ((nextLine3 = reader3.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
										,nextLine3[14],nextLine3[15],nextLine3[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando7");
						contador7++;
					}

					CSVReader reader4 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_August_2018.csv"));
					String [] nextLine4;

					reader4.readNext();
					while ((nextLine4 = reader4.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
										,nextLine4[14],nextLine4[15],nextLine4[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando8");
						contador8++;
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				System.out.println("terminado"+System.currentTimeMillis());
				System.out.println("Se han cargado (infracciones): Mayo: "+ contador5+" ; Junio: "+contador6+" ; Julio: "+contador7+" ; Agosto: "+contador8+". \nY en total este cuatrimestre: "+(contador5+contador6+contador7+contador8)+".") ;
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if(movingViolationsFile.equals("3")) {
			System.out.println("3 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_September_2018.csv"));
				String [] nextLine;
				int contador9=0;
				int contador10=0;
				int contador11=0;
				int contador12=0;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
								,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
										,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando9");
						contador9++;
					}
					CSVReader reader2 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_October_2018.csv"));
					String [] nextLine2;

					reader2.readNext();
					while ((nextLine2 = reader2.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
										,nextLine2[14],nextLine2[15],nextLine2[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando10");
						contador10++;
					}

					CSVReader reader3 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_November_2018.csv"));
					String [] nextLine3;

					reader3.readNext();
					while ((nextLine3 = reader3.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
										,nextLine3[14],nextLine3[15],nextLine3[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando11");
						contador11++;
					}

					CSVReader reader4 = new CSVReader (new FileReader ("./data/Moving_Violations_Issued_in_December_2018.csv"));
					String [] nextLine4;


					reader4.readNext();
					while ((nextLine4 = reader4.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
										,nextLine4[14],nextLine4[15],nextLine4[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando12");
						contador12++;
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				System.out.println("terminado"+System.currentTimeMillis());
				System.out.println("Se han cargado (infracciones): Septiembre: "+ contador9+" ; Octubre: "+contador10+" ; Noviembre: "+contador11+" ; Diciembre: "+contador12+". \nY en total este cuatrimestre: "+(contador9+contador10+contador11+contador12)+".") ;
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getViolationCode().
						equals(violationCode)) {
					resp.add(listaViolaciones.get(i));
				}
			}
		}
		return resp;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getAccidentId().
						equals(accidentIndicator)) {
					resp.add(listaViolaciones.get(i));
				}
			}

		}
		return resp;
	}


	@Override
	public LinkedList <VOMovingViolations> verificarObjectID() {
		HashMap<String, VOMovingViolations> hash = new HashMap<>();
		LinkedList<VOMovingViolations> respuesta = new LinkedList<>();
		for (int i=0; i<listaViolaciones.getCounter(); i++) {
			if(hash.get(listaViolaciones.get(i).getObjectId())==null){
				hash.put(listaViolaciones.get(i).getObjectId(), listaViolaciones.get(i));
			}
			else{
				System.out.println("Agrega " + i);
				respuesta.add(listaViolaciones.get(i));
			}
		}
		return (LinkedList<VOMovingViolations>) respuesta;
	}


	@Override
	public IQueue<VOMovingViolations> ConsultarInfraccionesFecha(String fInicial, String fFinal) throws Exception {
		IQueue<VOMovingViolations> encontrados =  new model.data_structures.Queue();
		try {
			SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			Date fechaInicial=null;
			Date fechaFinal=null;

			fechaInicial= SDF.parse(fInicial);
			System.out.println(fechaInicial);
			fechaFinal=SDF.parse(fFinal);
			System.out.println(fechaFinal);
			for (int i = 0; i < listaViolaciones.getCounter(); i++) {
				if(listaViolaciones.get(i).getTicketIssue().compareTo(fechaInicial)>=0&&listaViolaciones.get(i).getTicketIssue().compareTo(fechaFinal)<=0) {
					encontrados.enqueue(listaViolaciones.get(i));
				}
			}
		} catch (ParseException e) {

			//			Exception ee = new Exception("Error formato de fecha");
			throw e;
		}

		return (IQueue<VOMovingViolations>) encontrados;
	}

	public String darPromedio(String pViolationCode) {
		LinkedList<String> sinAccidente = new LinkedList<>();
		LinkedList<String> conAccidente = new LinkedList<>();
		int suma1 = 0;
		int suma2 = 0;
		double resp1 = 0;
		double resp2 = 0;


		for (int i=0; i<listaViolaciones.size(); i++)
		{
			if(listaViolaciones.get(i)
					!=null) {
				if (listaViolaciones.get(i).getViolationCode().equals(pViolationCode)) {
					if (listaViolaciones.get(i).getAccidentId().equals("No"))
						sinAccidente.add(listaViolaciones.get(i).getFine());
					else
						conAccidente.add(listaViolaciones.get(i).getFine());
				}
			}
		}

		for (int i=0; i<sinAccidente.size(); i++) {
			int a = Integer.parseInt(sinAccidente.get(i));
			suma1 += a;
		}
		for (int j=0; j<conAccidente.size(); j++) {
			int a = Integer.parseInt(sinAccidente.get(j));
			suma2 += a;
		}

		resp1 = suma1/sinAccidente.size();
		resp2 = suma2/conAccidente.size();

		return "Promedio FineAMT sin accidente: " + resp1 + "," + "Promedio FineAMT con accidente: " + resp2;
	}


	public String darDesvEstandar(String pViolationCode) {
		LinkedList<String> valores = new LinkedList<>();
		LinkedList<Integer> valoresNum = new LinkedList<>();
		double promedio = 0;
		int suma = 0;
		double varianza = 0;
		double sumatoria;
		int c = 0;
		double desviacion;
		for (int i=0; i<listaViolaciones.getCounter(); i++) {
			if (listaViolaciones.get(i) != null) {
				if(listaViolaciones.get(i).getViolationCode().equals(pViolationCode)) {
					valores.add(listaViolaciones.get(i).getFine());
				}
			}
		}
		for (int k=0; k<valores.getCounter(); k++) {
			int a = Integer.parseInt(valores.get(k));
			suma += a;
		}
		promedio = suma/valores.getCounter();
		for (int i=0; i<valores.getCounter(); i++) {
			c = Integer.parseInt(valores.get(i));
			valoresNum.add(c);
		}
		for (int i=0; i<valoresNum.getCounter(); i++) {
			sumatoria = Math.pow((valoresNum.get(i))-promedio, 2);
			varianza = varianza + sumatoria;
		}
		varianza = varianza / (valoresNum.getCounter())-1;
		desviacion = Math.sqrt(varianza);

		return "El FINEAMT promedio es: " + promedio + "," + "La desviación estándar es: " + desviacion;
	}

	public double deudaTotal(String pFechaInicial, String pFechaFinal) throws Exception {
		LinkedList<VOMovingViolations> encontrados1 =  new LinkedList<>();
		double fine = 0;
		double paid = 0;
		double penalty1 = 0;
		double penalty2 = 0;
		double total = 0;
		try {
			SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			Date fechaInicial=null;
			Date fechaFinal=null;

			fechaInicial= SDF.parse(pFechaInicial);
			System.out.println(pFechaInicial);
			fechaFinal=SDF.parse(pFechaFinal);
			System.out.println(pFechaFinal);
			for (int i = 0; i < listaViolaciones.getCounter(); i++) {
				if(listaViolaciones.get(i).getTicketIssue().compareTo(fechaInicial)>=0&&listaViolaciones.get(i).getTicketIssue().compareTo(fechaFinal)<=0) {
					encontrados1.add(listaViolaciones.get(i));
				}
			}

			for (int i=0; i<encontrados1.getCounter(); i++) {
				fine += Integer.parseInt(encontrados1.get(i).getFine());
				paid += Integer.parseInt(encontrados1.get(i).getPaid());
				penalty1 += Integer.parseInt(encontrados1.get(i).getPenalty1());
				penalty2 += Integer.parseInt(encontrados1.get(i).getPenalty2());
			}

			total = fine + paid + penalty1 + penalty2;
			return total;
		}
		catch (ParseException e) {
			throw e;
		}
	}

	public IStack<VOMovingViolations> ConsultarInfraccionesDireccion(String pFechaInicial, String pFechaFinal, String pAdressId) throws Exception {
		IStack<VOMovingViolations> encontrados =  new model.data_structures.Stack();
		try {
			SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			Date fechaInicial=null;
			Date fechaFinal=null;

			fechaInicial= SDF.parse(pFechaInicial);
			System.out.println(fechaInicial);
			fechaFinal=SDF.parse(pFechaFinal);
			System.out.println(fechaFinal);
			for (int i = 0; i < listaViolaciones.getCounter(); i++) {
				if (listaViolaciones.get(i).getAddressId().equals(pAdressId)) {
					if(listaViolaciones.get(i).getTicketIssue().compareTo(fechaInicial)>=0&&listaViolaciones.get(i).getTicketIssue().compareTo(fechaFinal)<=0) {
						encontrados.push(listaViolaciones.get(i));
					}
				}
			}
		} catch (ParseException e) {

			//			Exception ee = new Exception("Error formato de fecha");
			throw e;
		}

		return encontrados;
	}


	@Override
	public IQueue ConsultarInfraccionesPromedioRango(String min, String max) {
		LinkedList<String> violationCode =new LinkedList<String>();
		LinkedList<Integer> FINEprom =new LinkedList<Integer>();

		for (int i = 0; i < listaViolaciones.getCounter(); i++) {
			VOMovingViolations este = listaViolaciones.get(i);
			//		violationCode.add(este.getViolationCode(),i);
			//		FINEprom.add(este.getFine(), i);
			for (int j = i+1; j < listaViolaciones.getCounter(); j++) {
				if (listaViolaciones.get(j).getViolationCode().equals(este.getViolationCode())) {

				}
			}
		}
		return null;
	}


	@Override
	public Stack ConsultarInfraccionesPagadoRango(int min2, int max2, String orden) {
		LinkedList<VOMovingViolations> infrac = new LinkedList<>();
		for (int i=0; i<listaViolaciones.getCounter(); i++) {
			if (listaViolaciones.get(i) != null) {
				int fine=Integer.parseInt(listaViolaciones.get(i).getPaid());
				if(fine<max2&&fine>min2) {
					infrac.add(listaViolaciones.get(i));
				}
			}
		}
		//------ordenarlo-----
		//--------------------
		Stack<VOMovingViolations> lel =new Stack<VOMovingViolations>();
		for(VOMovingViolations inf : infrac) {
			lel.push(inf);
		}
		return lel;
	}


	@Override
	public IQueue ConsultarInfraccionesFecha2(String fechaInicial2, String fechaFinal2) {
		IQueue<VOMovingViolations> encontrados =  new model.data_structures.Queue();
		try {
			SimpleDateFormat SDF=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			Date fechaInicial=null;
			Date fechaFinal=null;

			fechaInicial= SDF.parse(fechaInicial2);
			System.out.println(fechaInicial);
			fechaFinal=SDF.parse(fechaFinal2);
			System.out.println(fechaFinal);
			for (int i = 0; i < listaViolaciones.getCounter(); i++) {
				if(listaViolaciones.get(i).getTicketIssue().compareTo(fechaInicial)>=0&&listaViolaciones.get(i).getTicketIssue().compareTo(fechaFinal)<=0) {
					encontrados.enqueue(listaViolaciones.get(i));
				}
			}
		} catch (ParseException e) {

			//			Exception ee = new Exception("Error formato de fecha");
			
		}
		//------ordenarlo-----
		//--------------------
		return (IQueue<VOMovingViolations>) encontrados;
	}
}