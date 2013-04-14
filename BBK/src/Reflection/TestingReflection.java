package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import DesignPatterns.*;

public class TestingReflection {

	public static void main(String[] args) {

		Class reflectClass = UFOEnemyShip.class;

		Class reflectESOUFOENgine = ESOUFOEngine.class;

		String className = reflectClass.getName();

		System.out.println(className + "\n");

		int classModifier = reflectClass.getModifiers();

		System.out.println("is the UFOEnemyShip pubic.....  "
				+ Modifier.isPublic(classModifier) + "\n");

		// some of the other class modifiers that you can check for are
		// isAbstract, isFinal, isInterface, isPrivate, isProtected
		// isStatic, isStrict, isSynchronized, isVolatile

		// the answer will come back true because if you have a look at
		// UFOEnemyShip class you will see that it is a public class

		// this is now you get a list a different interfaces used by a class
		// They will all be saved inside a class array

		Class[] interfaces = reflectESOUFOENgine.getInterfaces();

		// to get the names of the super class that the class uses
		// so lets tyr this out for the ESUFOEngine and see if we can get the
		// name of the inteface that it is using
		System.out.println("What interface does the ESOUFOEngine use ... "
				+ interfaces[0]);
		// the above rpint ln would not work if it implemented more than one
		// interface
		// you would need a for loop printing out the array

		Class classSuper = reflectClass.getSuperclass();

		// to print the super class on screen you would do the following

		System.out.println("What is the super class of UFOEnemyShip   "
				+ classSuper.getName());

		Method[] classMethods = reflectClass.getMethods();

		for (Method method : classMethods) {

			System.out.print("Method Name: " + method.getName() + "\n");

			if (method.getName().startsWith("get")) {

				System.out.println("  : this is a getter");

			}

			if (method.getName().startsWith("set")) {

				System.out.println("  :This is a setter");
			}

			System.out.println("return Type: " + method.getReturnType());

			// how about we get all of the parameters for the class
			// lets create a new array to contain all of the parameter types
			// because there may be more than one

			Class[] parameterType = method.getParameterTypes();

			System.out.println("The parameters types are ");

			for (Class parameter : parameterType) {

				System.out.println(parameter.getName());

				// why does the below not work??
				if (parameterType.equals("")) {

					System.out.println("this method takes in no parameters");
				}

				System.out.println();

			}

		}

		// lets start accessing class consrtctors
		Constructor constructor = null;

		// create on object

		Object constructor2 = null;

		try {
			constructor = reflectClass
					.getConstructor(new Class[] { EnemyShipFactory.class });

			try {
				constructor2 = reflectClass.getConstructor(int.class,
						String.class).newInstance(12, "HELLO!");
			} catch (InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Class[] constructParameters = constructor.getParameterTypes();

		for (Class parameter : constructParameters) {

			System.out.println(parameter.getName());

		}

		// now we can create ourselves a new object

		UFOEnemyShip newEnemyShip = null;

		EnemyShipFactory shipFactory = null;

		try {
			newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newEnemyShip.setName("XT-100");

		System.out.println("EnmeyShip Name: " + newEnemyShip.getName());

		// laets start to access some private data

		Field privateStringName = null;

		UFOEnemyShip UFOENemyShipPrivate = new UFOEnemyShip(shipFactory);

		// define the private field that i want to access

		try {

			// this is the you can dynamically access any field with just the
			// knowledge of its name
			String idCodeString = "idCode";

			privateStringName = UFOEnemyShip.class
					.getDeclaredField(idCodeString);

			// lets shut down the security so we can access the private feild!!

			privateStringName.setAccessible(true);

			// Lets go in and get some private feild data

			try {
				String valueOfName = (String) privateStringName.get(UFOENemyShipPrivate);
				
				System.out.println("Private ship name: " + valueOfName);
				
				
				// now lets get some private method data 
				
				String methodName = "getPrivate";
				
				try {
					Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);
					
					// lets make the private ethod accessable
					
					privateMethod.setAccessible(true);
					
					// lets get the retur value of the private method 
					
					try {
						String priavteReturnVal = (String)privateMethod.invoke(UFOENemyShipPrivate, null);
						
						System.out.println("EnemyShip Private Methods: "  + priavteReturnVal);
						
						
						Class[] methodParameters = new Class[]{Integer.TYPE, String.class};
						
						Object[] params = new Object[]{new Integer(10), new String("Random")};
						
						
						
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
