package aps;

//Não Permite Letras e Simbolos no campo de digitação, apenas números

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author Fabiano Filho
 */
public class Numeros extends PlainDocument{
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        super.insertString(offs, str.replaceAll("[^0-9]",""), a);
    }
}
