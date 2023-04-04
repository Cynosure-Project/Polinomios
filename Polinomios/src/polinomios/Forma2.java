
package polinomios;

import javax.swing.JOptionPane;

public class Forma2 {
    private int Du, VPF2[];

    public Forma2() {
        Du = 0;
        VPF2 = new int[20];
    }
    
    public Forma2(int NTer) {
        Du = NTer*2;
        VPF2 = new int[Du+1];
    }

    public int getDu() {
        return Du;
    }

    public void setDu(int Du) {
        this.Du = Du;
    }

    public int[] getVPF2() {
        return VPF2;
    }

    public void setVPF2(int[] VPF2) {
        this.VPF2 = VPF2;
    }
    
    public int getVPF2(int pos) {
        return VPF2[pos];
    }

    public void setVPF2(int pos, int d) {
        VPF2[pos] = d;
    }
    
    public void Construir(int[] V){
        int Va[], i, j, c;
        
        if (V.length > 2)
        {
            Va = new int[2];
            c = 0;
            
            for (i=1; i<V.length; i+=2)
            {
                for (j=(i+2); j<V.length; j+=2)
                {
                    if (V[j] > V[i])
                    {
                        Va[0] = V[i-1];
                        Va[1] = V[i];
                        V[i-1] = V[j-1];
                        V[i] = V[j];
                        V[j-1] = Va[0];
                        V[j] = Va[1];
                    }
                }
                
                c++;
            }
            
            VPF2[0] = c;
            Du = VPF2[0]*2;
            
            for (i=0; i<V.length; i++)
            {
                VPF2[i+1] = V[i];
            }
            
            Ajustar();
            RedimensionarP();
            Mostrar();
        }
    }
    
    public void Ajustar(){
        int i, j, c, c2, c3, c4;

        c = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        
        for (i=1; i<=Du; i+=2)
        {
            if ((VPF2[i]==0) && (i==1))
            {
                c++;
            }
            else
            {
                if ((VPF2[i]==0) && (VPF2[i-2]!=0))
                {
                    c++;
                }
            }
            
            if (VPF2[i] == 0)
            {
                c4++;
            }
        }
        
        j = 1;
        
        while (c2 < c)
        {
            for (i=j; (VPF2[i]==0)&&(i<VPF2.length); i+=2)
            {
                c3++;
            }
            
            j+=2;
            
            for ( ; i<VPF2.length; i++)
            {
                VPF2[i-(c3*2)] = VPF2[i];
            }
            
            c2++;
            c3 = 0;
        }
       
        Du = Du-(c4*2);
        VPF2[0] = Du/2;
    }
    
    public void RedimensionarP(){
        int V[], i;
        
        V = new int[Du+1];
        
        for (i=0; i<V.length; i++)
        {
            V[i] = VPF2[i];
        }
        
        VPF2 = V;
    }
    
    public void RedimensionarG(){
        int V[], i;
        
        V = new int [Du+1];
        
        for (i=0; i<VPF2.length; i++)
        {
            V[i] = VPF2[i];
        }
        
        VPF2 = V;
    }
    
    public boolean PolinomioVacio(){
        int i, c;

        c = 0;
        
        for (i=1; i<VPF2.length; i++)
        {
            if (VPF2[i] == 0)
            {
                c++;
            }
        }
        
        if (c == (VPF2.length-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void Mostrar(){
        int i;
        String s;
        
        s = "";
        
        for (i=0; i<VPF2.length; i++) 
        {
            s += "[" + VPF2[i] + "] ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void Insertar(){
        int i, j, k, V[];
        boolean b;
        
        V = Polinomios.Ingreso();
        
        for (j=1; j<V.length; j+=2)
        {
            b = true;
            
            for (i=2; (i<VPF2.length) && b; i+=2)
            {
                if (VPF2[i] == V[j])
                {
                    VPF2[i-1] = V[j-1];
                    
                    b = false;
                }
                else
                {
                    if (VPF2[i] < V[j])
                    {
                        Du += 2;
                        
                        RedimensionarG();
                        
                        k = i-1;
                        
                        while(VPF2[k] != 0)
                        {
                            k += 2;
                        }
                        
                        for (k-=1; k!=(i-2); k--)
                        {
                            VPF2[k+2] = VPF2[k];
                        }
                        
                        VPF2[i-1] = V[j-1];
                        VPF2[i] = V[j];
                        
                        b = false;
                    }
                }
            }
        }
        
        VPF2[0] = Du/2;
        
        Mostrar();
    }
    
    public void Eliminar(){
        
    }
    
    public void Reconstruir(){
        
    }
    
    public void Evaluar(){
        
    }
    
    public void Sumar(){
        int i, j, k, V[];
        boolean b;
        
        V = Polinomios.Ingreso();
        
        for (j=1; j<V.length; j+=2)
        {
            b = true;
            
            for (i=2; (i<VPF2.length) && b; i+=2)
            {
                if (VPF2[i] == V[j])
                {
                    VPF2[i-1] += V[j-1];
                    
                    b = false;
                }
                else
                {
                    if (VPF2[i] < V[j])
                    {
                        Du += 2;
                        
                        RedimensionarG();
                        
                        k = i-1;
                        
                        while(VPF2[k] != 0)
                        {
                            k += 2;
                        }
                        
                        for (k-=1; k!=(i-2); k--)
                        {
                            VPF2[k+2] = VPF2[k];
                        }
                        
                        VPF2[i-1] = V[j-1];
                        VPF2[i] = V[j];
                        
                        b = false;
                    }
                }
            }
        }
        
        VPF2[0] = Du/2;
        
        Mostrar();
    }
    
    public void Multiplicar(){
        
    }
}
