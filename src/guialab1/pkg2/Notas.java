package guialab1.pkg2;
import javax.swing.JOptionPane;
public class Notas {
    public static void main(String[] args) {
    float nota;
    nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del alumno"));
    if (nota >=6.5 && nota<=6.99)
    {
        JOptionPane.showMessageDialog(null, "Hara EXAMEN de SUFICIENCIA, estudia mas","SEGUNDA OPORTUNIDAD",JOptionPane.QUESTION_MESSAGE);
    }
    else
    {
        if(nota>=7)
        {
            JOptionPane.showMessageDialog(null,"Ha APROBADO la materia con " + nota, "FELICIDADES" ,JOptionPane.INFORMATION_MESSAGE);
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Ha REPROBADO la materia " + nota, "ESFUERZATE MAS TU PUEDES", JOptionPane.ERROR_MESSAGE);
        }
    }
    }    
}
