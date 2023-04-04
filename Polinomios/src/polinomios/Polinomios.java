 
package polinomios;

import javax.swing.JOptionPane;

public class Polinomios {

    public static void main(String[] args) {
        byte o;
        Forma1 F1;
        Forma2 F2;
        Forma3 F3;
        
        o = -1;
        F1 = new Forma1();
        F2 = new Forma2();
        F3 = new Forma3();
        
        do 
        {
            o = Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                                                            Polinomios
                                                                                          Menú Principal  
                                                                                            1. Forma 1            
                                                                                            2. Forma 2            
                                                                                            3. Forma 3            
                                                                                            0. Salir 
                                                                 
                                                                                 Digite la opción deseada:"""));
                                                                                            
            switch(o)
            {
                case 1:
                    do
                    {
                        o = Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                                                                        Polinomios
                                                                                                          Forma 1
                                                                                                    1. Crear polinomio
                                                                                                    2. Insertar
                                                                                                    3. Eliminar
                                                                                                    4. Reconstruir
                                                                                                    5. Evaluar
                                                                                                    6. Sumar
                                                                                                    7. Multiplicar
                                                                                                    8. Mostrar
                                                                                                    0. Salir 
                                                                             
                                                                                                Digite la opción deseada:"""));
                        
                        switch(o)
                        {
                            case 1:
                                F1.Construir(Ingreso());
                                break;
                                
                            case 2:
                                if (F1.PolinomioVacio())
                                {
                                    F1.Construir(Ingreso());
                                }
                                else
                                {
                                    F1.Insertar();
                                }
                                break;
                                
                            case 3:
                                if (F1.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F1.Eliminar();
                                }
                                break;
                                
                            case 4:
                                if (F1.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F1.Reconstruir();
                                }
                                break;
                                
                            case 5:
                                if (F1.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F1.Evaluar();
                                }
                                break;
                                
                            case 6:
                                if (F1.PolinomioVacio())
                                {
                                    F1.Construir(Ingreso());
                                }
                                else
                                {
                                    F1.Sumar();
                                }
                                break;
                                
                            case 7:
                                if (F1.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F1.Multiplicar();
                                }
                                break;
                                
                            case 8:
                                if (F1.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F1.Mostrar();
                                }
                                break;
                                
                            case 0:
                                JOptionPane.showMessageDialog(null, "Selecciono la opción Salir");
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no Válida");
                                break;
                        }
                    }
                    while(o != 0);
                    break;
                    
                case 2:
                    do
                    {
                        o = Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                                                                        Polinomios
                                                                                                          Forma 2
                                                                                                    1. Crear polinomio
                                                                                                    2. Insertar
                                                                                                    3. Eliminar
                                                                                                    4. Reconstruir
                                                                                                    5. Evaluar
                                                                                                    6. Sumar
                                                                                                    7. Multiplicar
                                                                                                    8. Mostrar
                                                                                                    0. Salir  
                                                                             
                                                                                               Digite la opción deseada:"""));
                        
                        switch(o)
                        {
                            case 1:
                                F2.Construir(Ingreso());
                                break;
                                
                            case 2:
                                if (F2.PolinomioVacio())
                                {
                                    F2.Construir(Ingreso());
                                }
                                else
                                {
                                    F2.Insertar();
                                }
                                break;
                                
                            case 3:
                                if (F2.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F2.Eliminar();
                                }
                                break;
                                
                            case 4:
                                if (F2.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F2.Reconstruir();
                                }
                                break;
                                
                            case 5:
                                if (F2.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F2.Evaluar();
                                }
                                break;
                                
                            case 6:
                                if (F2.PolinomioVacio())
                                {
                                    F2.Construir(Ingreso());
                                }
                                else
                                {
                                    F2.Sumar();
                                }
                                break;
                                
                            case 7:
                                if (F2.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F2.Multiplicar();
                                }
                                break;
                                
                            case 8:
                                if (F2.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F2.Mostrar();
                                }
                                break;
                                
                            case 0:
                                JOptionPane.showMessageDialog(null, "Selecciono la opción Salir");
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no Válida");
                                break;
                        }
                    }
                    while(o != 0);
                    break;
                    
                case 3:
                    do
                    {
                        o = Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                                                                        Polinomios
                                                                                                          Forma 3
                                                                                                    1. Crear polinomio
                                                                                                    2. Insertar
                                                                                                    3. Eliminar
                                                                                                    4. Reconstruir
                                                                                                    5. Evaluar
                                                                                                    6. Sumar
                                                                                                    7. Multiplicar
                                                                                                    8. Mostrar
                                                                                                    0. Salir  
                                                                             
                                                                                                Digite la opción deseada:"""));
                        
                        switch(o)
                        {
                            case 1:
                                F3.Construir(Ingreso());
                                break;
                                
                            case 2:
                                if (F3.PolinomioVacio())
                                {
                                    F3.Construir(Ingreso());
                                }
                                else
                                {
                                    F3.Insertar();
                                }
                                break;
                                
                            case 3:
                                if (F3.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F3.Eliminar();
                                }
                                break;
                                
                            case 4:
                                if (F3.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F3.Reconstruir();
                                }
                                break;
                                
                            case 5:
                                if (F3.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F3.Evaluar();
                                }
                                break;
                                
                            case 6:
                                if (F3.PolinomioVacio())
                                {
                                    F3.Construir(Ingreso());
                                }
                                else
                                {
                                    F3.Sumar();
                                }
                                break;
                                
                            case 7:
                                if (F3.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F3.Multiplicar();
                                }
                                break;
                                
                            case 8:
                                if (F3.PolinomioVacio())
                                {
                                    JOptionPane.showMessageDialog(null, "No hay polinomio");
                                }
                                else
                                {
                                    F3.Mostrar();
                                }
                                break;
                                
                            case 0:
                                JOptionPane.showMessageDialog(null, "Selecciono la opción Salir");
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no Válida");
                                break;
                        }
                    }
                    while(o != 0);
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Selecciono la opción Salir");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción no Válida");
                    break;
            }
            
        }
        while(o != 0);
    }
    
    public static int[] Ingreso(){
        String sp, Vs[], s;
        char Vc[];
        int i, j, Vi[], c;

        //sp = "-37+3x^5-16x^6+x^2-10x";
        s = "";
        j = 0;
        sp = JOptionPane.showInputDialog(null, "Ingresa el polinomio y/o termino: ");
        Vc = sp.toCharArray();
        Vs = new String[Vc.length+1];
        c = 0;

        for (i=0; i<Vc.length; i++)
        {
            if (Character.isDigit(Vc[i]) || (Vc[i]=='-') || (Vc[i]=='+'))
            {
                if ((Vc[i]=='+') || (Vc[i]=='-'))
                {
                    if ((i>0) && Character.isDigit(Vc[i-1]))
                    {
                        if (((i>1) && (Vc[i-2]!='^')) || (i==1))
                        {
                            Vs[j] = s;
                            s = "";
                                
                            j++;

                            Vs[j] = "0";

                            j++;
                        }
                        
                        if (Vc[i] == '-')
                        {
                            s += Vc[i];
                        }
                    }
                    else
                    {
                        if (Vc[i] == '-')
                        {
                            s += Vc[i];
                        }
                    }
                }
                else
                {
                    s += Vc[i];
                }
            }
            else
            {   
                if (Vc[i] == 'x')
                {
                    if (i == 0)
                    {
                        Vs[j] = "1";
                        
                        j++;
                    }
                    else
                    {
                        if (Vc[i-1] == '+')
                        {
                            Vs[j] = "1";
                            
                            j++;
                        }
                        else
                        {
                            if (s.equals("-"))
                            {
                                Vs[j] = "-1";
                                s = "";
                                
                                j++;
                            }
                            else
                            {
                                Vs[j] = s;
                                s = "";
                                
                                j++;
                            }
                        }
                    }

                    if ((i<(Vc.length-1)) && (Vc[i+1]=='^'))
                    {
                        Vs[j] = Character.toString(Vc[i+2]);
                        i += 2;
                            
                        j++;
                    }
                    else
                    {
                        Vs[j] = "1";
                            
                        j++;
                    }
                }
            } 
            
            if ((i==(Vc.length-1)) && (!s.equals("")))
            {
                Vs[j] = s;

                j++;
                
                Vs[j] = "0";
                
                j++;
            }
        }
        
        for (i=0; i<Vs.length; i++)
        {
            if (Vs[i] == null)
            {
                c++;
            }
        }
        
        Vi = new int[Vs.length-c];
        
        for (i=0; i<(Vs.length-c); i++)
        {
            Vi[i] = Integer.parseInt(Vs[i]);
        }
        
        /*
        Vi = new int[Vs.length];
        
        for (i=0; i<Vs.length; i++)
        {
            if (Vs[i] == null)
            {
                Vi[i] = 0;
            }
            else
            {
                Vi[i] = Integer.parseInt(Vs[i]);
            }
        }
        */
        
        return Vi;
    }

}
