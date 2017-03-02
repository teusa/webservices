package co.gov.alcaldiabogota.parameters;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class ParametersConfecamaras {

    public ParametersConfecamaras() {
    }
    
    public static Node xmlEstablishment(Document xmlDoc, StablishmentCCB listStablishment) {
    
        /**
         * Multiple node:
         * xmlEstablecimiento
         */                
        Node xmlEstablecimiento = xmlDoc.createElement("xmlEstablecimiento");

        /**
         * Multiple node:
         * datosIdentificacion
         */                
        Node datosIdentificacion = xmlDoc.createElement("datosIdentificacion");
        /*
        Matricula
        */
        Node matricula = xmlDoc.createElement("matricula");
        matricula.appendChild(xmlDoc.createTextNode(listStablishment.getNumber_identification_establishment()));     
        datosIdentificacion.appendChild(matricula);
        /*
        orgJuridica
        */
        Node orgJuridica = xmlDoc.createElement("orgJuridica");
        orgJuridica.appendChild(xmlDoc.createTextNode("02"));     
        datosIdentificacion.appendChild(orgJuridica);
        /*
        categoria
        */
        Node categoria = xmlDoc.createElement("categoria");
        categoria.appendChild(xmlDoc.createTextNode("0"));     
        datosIdentificacion.appendChild(categoria);
        /*
        fecMatricula
        */
        Node fecMatricula = xmlDoc.createElement("fecMatricula");
        fecMatricula.appendChild(xmlDoc.createTextNode(listStablishment.getDate_commercial_registration()));     
        datosIdentificacion.appendChild(fecMatricula);
        /*
        fecRenovacion
        */
        Node fecRenovacion = xmlDoc.createElement("fecRenovacion");
        fecRenovacion.appendChild(xmlDoc.createTextNode(listStablishment.getDate_end_commercial_registration()));     
        datosIdentificacion.appendChild(fecRenovacion);
        /*
        ultAgnoRenovado
        */
        Node ultAgnoRenovado = xmlDoc.createElement("ultAgnoRenovado");
        ultAgnoRenovado.appendChild(xmlDoc.createTextNode(listStablishment.getDate_last_renewal()));     
        datosIdentificacion.appendChild(ultAgnoRenovado);
	/*
        fecCancelacion
        */
        Node fecCancelacion = xmlDoc.createElement("fecCancelacion");
        fecCancelacion.appendChild(xmlDoc.createTextNode(""));     
        datosIdentificacion.appendChild(fecCancelacion);        
        /*
        Nombre
        */
        Node nombre = xmlDoc.createElement("nombre");
        nombre.appendChild(xmlDoc.createTextNode(listStablishment.getName_commercial()));     
        datosIdentificacion.appendChild(nombre);
        /*
        datosIdentificacion
        */
        xmlEstablecimiento.appendChild(datosIdentificacion);
        
        /**
         * Multiple node:
         * datosUbicacion
         */                
        Node datosUbicacion = xmlDoc.createElement("datosUbicacion");
        /*
        dirCom1_textual
        */
        Node dirCom1_textual = xmlDoc.createElement("dirCom1_textual");
        dirCom1_textual.appendChild(xmlDoc.createTextNode(listStablishment.getAddress_commercial()));     
        datosUbicacion.appendChild(dirCom1_textual);
        /*
        dirCom1_tipovia
        */
        Node dirCom1_tipovia = xmlDoc.createElement("dirCom1_tipovia");
        dirCom1_tipovia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_tipovia);
        /*
        dirCom1_numvia
        */
        Node dirCom1_numvia = xmlDoc.createElement("dirCom1_numvia");
        dirCom1_numvia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_numvia);
	/*
        dirCom1_apevia
        */
        Node dirCom1_apevia = xmlDoc.createElement("dirCom1_apevia");
        dirCom1_apevia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_apevia);
        /*
        dirCom1_numcruce
        */
        Node dirCom1_numcruce = xmlDoc.createElement("dirCom1_numcruce");
        dirCom1_numcruce.appendChild(xmlDoc.createTextNode(""));
        datosUbicacion.appendChild(dirCom1_numcruce);
        /*
        dirCom1_apecruce
        */
        Node dirCom1_apecruce = xmlDoc.createElement("dirCom1_apecruce");
        dirCom1_apecruce.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_apecruce);
	/*
        dirCom1_oricruce
        */
        Node dirCom1_oricruce = xmlDoc.createElement("dirCom1_oricruce");
        dirCom1_oricruce.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_oricruce);		
        /*
        dirCom1_numplaca
        */
        Node dirCom1_numplaca = xmlDoc.createElement("dirCom1_numplaca");
        dirCom1_numplaca.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_numplaca);		
        /*
        dirCom1_complemento
        */
        Node dirCom1_complemento = xmlDoc.createElement("dirCom1_complemento");
        dirCom1_complemento.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom1_complemento);
                /*
        dirCom2_textual
        */
        Node dirCom2_textual = xmlDoc.createElement("dirCom2_textual");
        dirCom2_textual.appendChild(xmlDoc.createTextNode(listStablishment.getAddress_standard()));     
        datosUbicacion.appendChild(dirCom2_textual);
        /*
        dirCom2_tipovia
        */
        Node dirCom2_tipovia = xmlDoc.createElement("dirCom2_tipovia");
        dirCom2_tipovia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_tipovia);
        /*
        dirCom2_numvia
        */
        Node dirCom2_numvia = xmlDoc.createElement("dirCom2_numvia");
        dirCom2_numvia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_numvia);
	/*
        dirCom2_apevia
        */
        Node dirCom2_apevia = xmlDoc.createElement("dirCom2_apevia");
        dirCom2_apevia.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_apevia);
        /*
        dirCom2_numcruce
        */
        Node dirCom2_numcruce = xmlDoc.createElement("dirCom2_numcruce");
        dirCom2_numcruce.appendChild(xmlDoc.createTextNode(""));
        datosUbicacion.appendChild(dirCom2_numcruce);
        /*
        dirCom2_apecruce
        */
        Node dirCom2_apecruce = xmlDoc.createElement("dirCom2_apecruce");
        dirCom2_apecruce.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_apecruce);
	/*
        dirCom2_oricruce
        */
        Node dirCom2_oricruce = xmlDoc.createElement("dirCom2_oricruce");
        dirCom2_oricruce.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_oricruce);		
        /*
        dirCom2_numplaca
        */
        Node dirCom2_numplaca = xmlDoc.createElement("dirCom2_numplaca");
        dirCom2_numplaca.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_numplaca);		
        /*
        dirCom2_complemento
        */
        Node dirCom2_complemento = xmlDoc.createElement("dirCom2_complemento");
        dirCom2_complemento.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom2_complemento);
        /*
        dirCom_latitud
        */
        Node dirCom_latitud = xmlDoc.createElement("dirCom_latitud");
        dirCom_latitud.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom_latitud);
        /*
        dirCom_longitud
        */
        Node dirCom_longitud = xmlDoc.createElement("dirCom_longitud");
        dirCom_longitud.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(dirCom_longitud);
        /*
        munCom
        */
        Node munCom = xmlDoc.createElement("munCom");
        munCom.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(munCom);
        /*
        numPredial
        */
        Node numPredial = xmlDoc.createElement("numPredial");
        numPredial.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(numPredial);
        /*
        url
        */
        Node url = xmlDoc.createElement("url");
        url.appendChild(xmlDoc.createTextNode(listStablishment.getPage_web()));     
        datosUbicacion.appendChild(url);
        /*
        telCom1
        */
        Node telCom1 = xmlDoc.createElement("telCom1");
        telCom1.appendChild(xmlDoc.createTextNode(listStablishment.getPhone()));     
        datosUbicacion.appendChild(telCom1);
        /*
        telCom2
        */
        Node telCom2 = xmlDoc.createElement("telCom2");
        telCom2.appendChild(xmlDoc.createTextNode(listStablishment.getPhone_two()));     
        datosUbicacion.appendChild(telCom2);              
        /*
        celCom
        */
        Node celCom = xmlDoc.createElement("celCom");
        celCom.appendChild(xmlDoc.createTextNode(""));     
        datosUbicacion.appendChild(celCom);
        /*
        faxCom
        */
        Node faxCom = xmlDoc.createElement("faxCom");
        faxCom.appendChild(xmlDoc.createTextNode(listStablishment.getPage_web()));     
        datosUbicacion.appendChild(faxCom);
        /*
        emailCom
        */
        Node emailCom = xmlDoc.createElement("emailCom");
        emailCom.appendChild(xmlDoc.createTextNode(listStablishment.getPage_web()));     
        datosUbicacion.appendChild(emailCom);
        /*
        datosUbicacion
        */
        xmlEstablecimiento.appendChild(datosUbicacion);
        
        /**
         * Multiple node:
         * datosUbicacion
         */                
        Node datosActividad = xmlDoc.createElement("datosActividad");
        /*
        ciiu1
        */
        Node ciiu1 = xmlDoc.createElement("ciiu1");
        ciiu1.appendChild(xmlDoc.createTextNode(listStablishment.getCiiu()));     
        datosActividad.appendChild(ciiu1);
        /*
        ciiu2
        */
        Node ciiu2 = xmlDoc.createElement("ciiu2");
        ciiu2.appendChild(xmlDoc.createTextNode(listStablishment.getCiiu2()));     
        datosActividad.appendChild(ciiu2);
        /*
        ciiu3
        */
        Node ciiu3 = xmlDoc.createElement("ciiu3");
        ciiu3.appendChild(xmlDoc.createTextNode(listStablishment.getCiiu3()));     
        datosActividad.appendChild(ciiu3);
        /*
        ciiu4
        */
        Node ciiu4 = xmlDoc.createElement("ciiu4");
        ciiu4.appendChild(xmlDoc.createTextNode(""));     
        datosActividad.appendChild(ciiu4);
        /*
        ciiu5
        */
        Node ciiu5 = xmlDoc.createElement("ciiu5");
        ciiu5.appendChild(xmlDoc.createTextNode(""));     
        datosActividad.appendChild(ciiu5);        
        /*
        datosActividad
        */
        xmlEstablecimiento.appendChild(datosActividad);
        
        /**
         * Multiple node:
         * datosComplementarios
         */                
        Node datosComplementarios = xmlDoc.createElement("datosComplementarios");
        /*
        fecInicioActividades
        */
        Node fecInicioActividades = xmlDoc.createElement("fecInicioActividades");
        fecInicioActividades.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(fecInicioActividades);
        /*
        valorActivos
        */
        Node valorActivos = xmlDoc.createElement("valorActivos");
        valorActivos.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(valorActivos);
        /*
        ingresosEsperados
        */
        Node ingresosEsperados = xmlDoc.createElement("ingresosEsperados");
        ingresosEsperados.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(ingresosEsperados);        
        /*
        predioEsquinero
        */
        Node predioEsquinero = xmlDoc.createElement("predioEsquinero");
        predioEsquinero.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(predioEsquinero);
        /*
        esTienda
        */
        Node esTienda = xmlDoc.createElement("esTienda");
        esTienda.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(esTienda);
        /*
        tipoPredio
        */
        Node tipoPredio = xmlDoc.createElement("tipoPredio");
        tipoPredio.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(tipoPredio);
        /*
        regimenTributario
        */
        Node regimenTributario = xmlDoc.createElement("regimenTributario");
        regimenTributario.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(regimenTributario);
        /*
        usoSuelos
        */
        Node usoSuelos = xmlDoc.createElement("usoSuelos");
        usoSuelos.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(usoSuelos);
        /*
        aream2
        */
        Node aream2 = xmlDoc.createElement("aream2");
        aream2.appendChild(xmlDoc.createTextNode(""));     
        datosComplementarios.appendChild(aream2);
        /*
        datosComplementarios
        */
        xmlEstablecimiento.appendChild(datosComplementarios);
        
        /**
         * Multiple node:
         * variablesRiesgo
         */                
        Node variablesRiesgo = xmlDoc.createElement("variablesRiesgo");
        /*
        criterioq1
        */
        Node criterioq1 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq1 = (Element) criterioq1;
        ecriterioq1.setAttribute("n", "q1");
        ecriterioq1.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq1);
        /*
        criterioq2
        */
        Node criterioq2 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq2 = (Element) criterioq2;
        ecriterioq2.setAttribute("n", "q2");
        ecriterioq2.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq2);
        /*
        criterioq3
        */
        Node criterioq3 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq3 = (Element) criterioq3;
        ecriterioq3.setAttribute("n", "q3");
        ecriterioq3.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq3);
        /*
        criterioq4
        */
        Node criterioq4 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq4 = (Element) criterioq4;
        ecriterioq4.setAttribute("n", "q4");
        ecriterioq4.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq4);
        /*
        criterioq5
        */
        Node criterioq5 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq5 = (Element) criterioq5;
        ecriterioq5.setAttribute("n", "q5");
        ecriterioq5.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq5);
        /*
        criterioq6
        */
        Node criterioq6 = (Element) xmlDoc.createElement("criterio");
        Element ecriterioq6 = (Element) criterioq6;
        ecriterioq6.setAttribute("n", "q5");
        ecriterioq6.appendChild(xmlDoc.createTextNode("N"));     
        variablesRiesgo.appendChild(ecriterioq6);
        /*
        variablesRiesgo
        */
        xmlEstablecimiento.appendChild(variablesRiesgo);
        
        /**
         * Multiple node:
         * propietario
         */                
        Node propietario = xmlDoc.createElement("propietario");
        /*
        tipoIdProp
        */
        Node tipoIdProp = xmlDoc.createElement("tipoIdProp");
        tipoIdProp.appendChild(xmlDoc.createTextNode(listStablishment.getType_identification_owner()));     
        propietario.appendChild(tipoIdProp);
        /*
        numIdProp
        */
        Node numIdProp = xmlDoc.createElement("numIdProp");
        numIdProp.appendChild(xmlDoc.createTextNode(listStablishment.getNumber_identification_owner()));     
        propietario.appendChild(numIdProp);
        /*
        dvProp
        */
        Node dvProp = xmlDoc.createElement("dvProp");
        dvProp.appendChild(xmlDoc.createTextNode(listStablishment.getDigit_verification_owner()));     
        propietario.appendChild(dvProp);
        /*
        orgJurProp
        */
        Node orgJurProp = xmlDoc.createElement("orgJurProp");
        orgJurProp.appendChild(xmlDoc.createTextNode(listStablishment.getNumber_identification_owner()));     
        propietario.appendChild(orgJurProp);
        /*
        nombreProp
        */
        Node nombreProp = xmlDoc.createElement("nombreProp");
        nombreProp.appendChild(xmlDoc.createTextNode(listStablishment.getName_owner()));     
        propietario.appendChild(nombreProp);
        /*
        dirComProp_textual
        */
        Node dirComProp_textual = xmlDoc.createElement("dirComProp_textual");
        dirComProp_textual.appendChild(xmlDoc.createTextNode(""));     
        propietario.appendChild(dirComProp_textual);
        /*
        dirnotProp_textual
        */
        Node dirnotProp_textual = xmlDoc.createElement("dirnotProp_textual");
        dirnotProp_textual.appendChild(xmlDoc.createTextNode(listStablishment.getAddress_notification()));     
        propietario.appendChild(dirnotProp_textual);
        /*
        telNotprop
        */
        Node telNotprop = xmlDoc.createElement("telNotprop");
        telNotprop.appendChild(xmlDoc.createTextNode(""));     
        propietario.appendChild(telNotprop);
        /*
        celNotProp
        */
        Node celNotProp = xmlDoc.createElement("celNotProp");
        celNotProp.appendChild(xmlDoc.createTextNode(""));     
        propietario.appendChild(celNotProp);
        /*
        munNotProp
        */
        Node munNotProp = xmlDoc.createElement("munNotProp");
        munNotProp.appendChild(xmlDoc.createTextNode(""));     
        propietario.appendChild(munNotProp);
        /*
        nomRepLegProp
        */
        Node nomRepLegProp = xmlDoc.createElement("nomRepLegProp");        
        nomRepLegProp.appendChild(xmlDoc.createTextNode( listStablishment.getName_legal_representative() + " " + listStablishment.getName_legal_representative()  ));
        propietario.appendChild(nomRepLegProp);
        /*
        numldRepLegProp
        */
        Node numldRepLegProp = xmlDoc.createElement("numldRepLegProp");        
        numldRepLegProp.appendChild(xmlDoc.createTextNode( listStablishment.getNumber_identificacion_legal_representative()  ));
        propietario.appendChild(numldRepLegProp);
        /*
        nomAdmProp
        */
        Node nomAdmProp = xmlDoc.createElement("nomAdmProp");        
        nomAdmProp.appendChild(xmlDoc.createTextNode(""));
        propietario.appendChild(nomAdmProp);
        /*
        propietario
        */
        xmlEstablecimiento.appendChild(propietario);
        
        return xmlEstablecimiento;
    
    }
    
}
