package com.example.organizze.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){
        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(data);
        return dataString;
    }

    public static String mesAnoDataEscolhida( String data){
        String retornoData[] = data.split("/");
        String dia = retornoData[0]; /* retorna dia */
        String mes = retornoData[1]; /* retorna mes */
        String ano = retornoData[2]; /* retorna ano */

        String mesAno = mes + ano;
        return mesAno;
    }

}
