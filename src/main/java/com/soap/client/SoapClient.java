package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

//import com.soap.wsdl.Add;
// import com.soap.wsdl.AddResponse;

public class SoapClient extends WebServiceGatewaySupport {

    // public AddResponse getAddResponse(int numeroA, int numeroB) {

    //     Add addRequest = new Add();
    //     addRequest.setIntA(numeroA);
    //     addRequest.setIntB(numeroB);

    //     SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

    //     AddResponse addResponse = (AddResponse) getWebServiceTemplate()
    //             .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

    //     return addResponse;

    // }

}