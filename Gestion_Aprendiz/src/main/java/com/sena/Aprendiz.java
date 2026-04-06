package com.sena;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
      
        Aprendiz aprendiz1 = new Aprendiz("1110522280", "ANA SOFIA VARGAS MENDEZ", "ana.vargas@misena.edu.co", 25);
        Aprendiz aprendiz2 = new Aprendiz("1000791646", "ANDREA CAROLINA GARCIA YATE", "andrea.garcia@misena.edu.co", 22);
        Aprendiz aprendiz3 = new Aprendiz("1022950241", "ANDRES ALEJANDRO MATALLANA FORERO", "andres.matallana@misena.edu.co", 28);
        Aprendiz aprendiz4 = new Aprendiz("1015412186", "ANGIE VALENTINA POSADA GÓMEZ", "angie.posada@misena.edu.co", 23);
        Aprendiz aprendiz5 = new Aprendiz("1019039411", "CAROL DAYANA SANABRIA FONSECA", "carol.sanabria@misena.edu.co", 26);
        Aprendiz aprendiz6 = new Aprendiz("1019050135", "CAROLL XIOMARA TORRES JEREZ", "caroll.torres@misena.edu.co", 21);
        Aprendiz aprendiz7 = new Aprendiz("1013621460", "CRISTHIAN DAVID PINEDA LARA", "cristhian.pineda@misena.edu.co", 24);
        Aprendiz aprendiz8 = new Aprendiz("1141121206", "DANIEL DAVID QUINTERO MEJÍA", "daniel.quintero@misena.edu.co", 22);
        Aprendiz aprendiz9 = new Aprendiz("1034290721", "DANNA VALENTINA FAJARDO BELTRÁN", "danna.fajardo@misena.edu.co", 27);
        Aprendiz aprendiz10 = new Aprendiz("1033714023", "DAYAN NICOLE MESA MONTOYA", "dayan.mesa@misena.edu.co", 23);
        Aprendiz aprendiz11 = new Aprendiz("1014665437", "DULCE NIKOLLE QUIJANO GARZON", "dulce.quijano@misena.edu.co", 24);
        Aprendiz aprendiz12 = new Aprendiz("1013265654", "GILBER ALEJANDRO ALDANA PAMPLONA", "gilber.aldana@misena.edu.co", 22);
        Aprendiz aprendiz13 = new Aprendiz("1031542440", "JOHAN ALEXIS GUERRERO VASQUEZ", "johan.guerrero@misena.edu.co", 25);
        Aprendiz aprendiz14 = new Aprendiz("1028865302", "JOHAN CAMILO MENDEZ PADILLA", "johan.mendez@misena.edu.co", 26);
        Aprendiz aprendiz15 = new Aprendiz("1013123489", "JOHAN SEBASTIÁN ALFONSO AVILLA", "johan.alfonso@misena.edu.co", 21);
        Aprendiz aprendiz16 = new Aprendiz("1010760974", "JOSUE DAVID PARRA SALAMANCA", "josue.parra@misena.edu.co", 23);
        Aprendiz aprendiz17 = new Aprendiz("1000124161", "JUAN DAVID DUARTE GONZALEZ", "juand.duarte@misena.edu.co", 24);
        Aprendiz aprendiz18 = new Aprendiz("1032680585", "JUAN ESTEBAN CARVAJAL SABOGAL", "juan.carvajal@misena.edu.co", 22);
        Aprendiz aprendiz19 = new Aprendiz("1140919614", "JUAN SEBASTIÁN CAMPOS RUIZ", "juans.campos@misena.edu.co", 27);
        Aprendiz aprendiz20 = new Aprendiz("1140918812", "JUAN SEBASTIAN SAAVEDRA JIMENEZ", "juans.saavedra@misena.edu.co", 23);
        Aprendiz aprendiz21 = new Aprendiz("1025537741", "LUISA FERNANDA MIRANDA MORATO", "luisa.miranda@misena.edu.co", 25);
        Aprendiz aprendiz22 = new Aprendiz("1141317937", "MAIAH SHALEN ORREGO RODRIGUEZ", "maiah.orrego@misena.edu.co", 22);
        Aprendiz aprendiz23 = new Aprendiz("1000856588", "MARIA CAMILA ALDANA AMADO", "maria.aldana@misena.edu.co", 26);
        Aprendiz aprendiz24 = new Aprendiz("1013108669", "MARIA VALENTINA MONROY BASTIDAS", "maria.monroy@misena.edu.co", 21);
        Aprendiz aprendiz25 = new Aprendiz("29233567", "MARIELA SATIZABAL RIASCOS", "mariela.satizabal@misena.edu.co", 24);
        Aprendiz aprendiz26 = new Aprendiz("1032939388", "NICOLE LORENA MIRANDA FRANCO", "nicole.miranda@misena.edu.co", 22);
        Aprendiz aprendiz27 = new Aprendiz("1073676013", "NICOLLE VANESSA CORTES SANCHEZ", "nicolle.cortes@misena.edu.co", 27);
        Aprendiz aprendiz28 = new Aprendiz("1141715750", "JUAN DAVID DAZA MORENO", "juand.daza@misena.edu.co", 23);
        Aprendiz aprendiz29 = new Aprendiz("1033103842", "VALERY GALINDO TOBAR", "valery.galindo@misena.edu.co", 25);
        Aprendiz aprendiz30 = new Aprendiz("1014211950", "VIVIANA CAROLINA CRUZ PINTO", "viviana.cruz@misena.edu.co", 22);
        Aprendiz aprendiz31 = new Aprendiz("1014863177", "WILSON JUNIOR MARTINEZ NAVARRO", "wilson.martinez@misena.edu.co", 26);
        Aprendiz aprendiz32 = new Aprendiz("1121218916", "YEIMI ANDREA GARCIA FERNANDEZ", "yeimi.garcia@misena.edu.co", 21);
        Aprendiz aprendiz33 = new Aprendiz("1002487210", "YELISA PAOLA ACOSTA HERRERA", "yelisa.acosta@misena.edu.co", 24);
        Aprendiz aprendiz34 = new Aprendiz("1002463561", "YERLIS DE LA HOZ RODRIGUEZ", "yerlis.delahoz@misena.edu.co", 22);
        Aprendiz aprendiz35 = new Aprendiz("1045503586", "YESID PANESSO GALAN", "yesid.panesso@misena.edu.co", 27);
        Aprendiz aprendiz36 = new Aprendiz("53124282", "YOLIMA LAVERDE MURIEL", "yolima.laverde@misena.edu.co", 23);
        Aprendiz aprendiz37 = new Aprendiz("1000047469", "YULIETH ESTEFANIA PARRA BRICEÑO", "yulieth.parra@misena.edu.co", 25);
        Aprendiz aprendiz38 = new Aprendiz("1097183324", "FABIÁN RICARDO MAHECHA LOPEZ", "fabian.mahecha@misena.edu.co", 22);
        Aprendiz aprendiz39 = new Aprendiz("1014479540", "DILAN GUSTAVO ALDANA CASTELLANOS", "dilan.aldana@misena.edu.co", 26);
        Aprendiz aprendiz40 = new Aprendiz("1013116918", "ESTEBAN DIAZ RAMIREZ", "esteban.diaz@misena.edu.co", 21);
        Aprendiz aprendiz41 = new Aprendiz("1056613037", "YERSON ALEXANDER ALONSO DIAZ", "yerson.alonso@misena.edu.co", 24);


        ArrayList<Aprendiz> ficha = new ArrayList<>();
        ficha.add(aprendiz1);
        ficha.add(aprendiz2);
        ficha.add(aprendiz3);
        ficha.add(aprendiz4);
        ficha.add(aprendiz5);
        ficha.add(aprendiz6);
        ficha.add(aprendiz7);
        ficha.add(aprendiz8);
        ficha.add(aprendiz9);
        ficha.add(aprendiz10);
        ficha.add(aprendiz11);
        ficha.add(aprendiz12);
        ficha.add(aprendiz13);
        ficha.add(aprendiz14);
        ficha.add(aprendiz15);
        ficha.add(aprendiz16);
        ficha.add(aprendiz17);
        ficha.add(aprendiz18);
        ficha.add(aprendiz19);
        ficha.add(aprendiz20);
        ficha.add(aprendiz21);
        ficha.add(aprendiz22);
        ficha.add(aprendiz23);
        ficha.add(aprendiz24);
        ficha.add(aprendiz25);
        ficha.add(aprendiz26);
        ficha.add(aprendiz27);
        ficha.add(aprendiz28);
        ficha.add(aprendiz29);
        ficha.add(aprendiz30);
        ficha.add(aprendiz31);
        ficha.add(aprendiz32);
        ficha.add(aprendiz33);
        ficha.add(aprendiz34);
        ficha.add(aprendiz35);
        ficha.add(aprendiz36);
        ficha.add(aprendiz37);
        ficha.add(aprendiz38);
        ficha.add(aprendiz39);
        ficha.add(aprendiz40);
        ficha.add(aprendiz41);

        for (Aprendiz aprendiz : ficha) {
            System.out.println(aprendiz.presentarse());
        }

        aprendiz1.setCorreo("ana.vargas@outlook.com");

        System.out.println("Información actualizada de aprendiz1: " + aprendiz1.presentarse());

        // prueba de validación: intentar asignar un correo inválido
        try {
            aprendiz2.setCorreo("andreagmail.com"); // correo sin '@'
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar correo de aprendiz2: " + e.getMessage());
        }

    }

}
