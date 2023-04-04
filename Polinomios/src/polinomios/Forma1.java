
package polinomios;

import javax.swing.JOptionPane;

public class Forma1 {
    private int Du, VPF1[];

    public Forma1() {
        Du = 0;
        VPF1 = new int[20];
    }
    
    public Forma1(int Expm) {
        Du = Expm+1;
        VPF1 = new int[Du+1];
    }

    public int getDu() {
        return Du;
    }

    public void setDu(int Du) {
        this.Du = Du;
    }

    public int[] getVPF1() {
        return VPF1;
    }

    public void setVPF1(int[] VAux) {
        VPF1 = VAux;
    }

    public int getVPF1(int pos) {
        return VPF1[pos];
    }

    public void setVPF1(int pos, int d) {
        VPF1[pos] = d;
    }
    
    public void Construir(int[] V){
        int i, Va[], Pos;
        
        if (V.length > 2)
        {
            Va = new int[2];
            
            for (i=3; i<V.length; i+=2)
            {
                if (V[i] > V[1])
                {
                    Va[0] = V[0];
                    Va[1] = V[1];
                    V[0] = V[i-1];
                    V[1] = V[i];
                    V[i-1] = Va[0];
                    V[i] = Va[1];
                }
            }

            VPF1[0] = V[1];
            VPF1[1] = V[0];
            Du = VPF1[0]+1;
            
            for (i=3; i<V.length; i+=2)
            {
                Pos = Du-V[i];
                VPF1[Pos] = V[i-1];
            }
        }
        else
        {
            VPF1[0] = V[1];
            VPF1[1] = V[0];
            Du = VPF1[0]+1;
        }

        RedimensionarP();
        Mostrar();
    }
    
    public void Ajustar(){
        int i, c;
        
        c = 0;
        
        for (i=1; VPF1[i]==0; i++)
        {
            c++;
        }
        
        if (c != 0)
        {
            VPF1[0] = Du-(c+2);
            
            for (i=1; i<=Du; i++)
            {
                VPF1[i] = VPF1[i+c];
            }

            Du = Du-c;
        }
    }
    
    public void RedimensionarP(){
        int V[], i;
        
        V = new int[Du+1];
        
        for (i=0; i<V.length; i++)
        {
            V[i] = VPF1[i];
        }
        
        VPF1 = V;
    }
    
    public void RedimensionarG(){
        int V[], i, Pos;
        
        V = new int [Du+1];
        
        for (i=1; i<VPF1.length; i++)
        {
            Pos = Du-((VPF1[0]+1)-i);
            V[Pos] = VPF1[i];
        }
        
        VPF1 = V;
    }
    
    public boolean PolinomioVacio(){
        int i, c;
        
        c = 0;
        
        for (i=1; i<VPF1.length; i++)
        {
            if (VPF1[i] == 0)
            {
                c++;
            }
        }
        
        if (c == (VPF1.length-1))
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
        
        for (i=0; i<VPF1.length; i++) 
        {
            s += "[" + VPF1[i] + "] ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void Insertar(){
        int V[], Pos, i;

        V = Polinomios.Ingreso();
        
        for (i=1; i<V.length; i+=2)
        {
            if (V[i] > VPF1[0])
            {
                Du = V[i]+1;
                
                RedimensionarG();
                
                VPF1[0] = V[i];
                VPF1[1] = V[i-1];
            }
            else
            {
                Pos = Du-V[i];
                VPF1[Pos] = V[i-1];
            } 
        }

        Mostrar();
    }
    
    public void Eliminar(){
        
    }
    
    public void Reconstruir(){
        
    }
    
    public void Evaluar(){
        
    }
    
    public void Sumar(){
        int V[], Pos, i;

        V = Polinomios.Ingreso();
        
        for (i=1; i<V.length; i+=2)
        {
            if (V[i] > VPF1[0])
            {
                Du = V[i]+1;
                
                RedimensionarG();
                
                VPF1[0] = V[i];
                VPF1[1] = V[i-1];
            }
            else
            {
                Pos = Du-V[i];
                VPF1[Pos] += V[i-1];
            } 
        }
        
        Mostrar();
    }
    
    public void Multiplicar(){
        
    }
}
