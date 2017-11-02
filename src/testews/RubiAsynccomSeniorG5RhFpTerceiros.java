
package testews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "rubi_Asynccom_senior_g5_rh_fp_terceiros", targetNamespace = "http://services.senior.com.br")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RubiAsynccomSeniorG5RhFpTerceiros {


    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReceitaExportacaoServicos")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaExportacaoServicosRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaExportacaoServicosResponse")
    public String receitaExportacaoServicos(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosReceitaExportacaoServicosIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReceitaAtividadesConcomitantes")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaAtividadesConcomitantesRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaAtividadesConcomitantesResponse")
    public String receitaAtividadesConcomitantes(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosReceitaAtividadesConcomitantesIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RepasseClubeFutebol")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RepasseClubeFutebolRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RepasseClubeFutebolResponse")
    public String repasseClubeFutebol(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosRepasseClubeFutebolIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RepasseClubeFutebol_2")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RepasseClubeFutebol_2Request", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RepasseClubeFutebol_2Response")
    public String repasseClubeFutebol2(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosRepasseClubeFutebol2In parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecebimentoClubeFutebol")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RecebimentoClubeFutebolRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RecebimentoClubeFutebolResponse")
    public String recebimentoClubeFutebol(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosRecebimentoClubeFutebolIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecebimentoClubeFutebol_2")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RecebimentoClubeFutebol_2Request", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/RecebimentoClubeFutebol_2Response")
    public String recebimentoClubeFutebol2(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosRecebimentoClubeFutebol2In parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AquisicaoProducao")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/AquisicaoProducaoRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/AquisicaoProducaoResponse")
    public String aquisicaoProducao(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosAquisicaoProducaoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ComercializacaoProducao")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ComercializacaoProducaoRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ComercializacaoProducaoResponse")
    public String comercializacaoProducao(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosComercializacaoProducaoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReceitaDesoneracaoFolha")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaDesoneracaoFolhaRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ReceitaDesoneracaoFolhaResponse")
    public String receitaDesoneracaoFolha(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosReceitaDesoneracaoFolhaIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ServicoPrestado")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ServicoPrestadoRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ServicoPrestadoResponse")
    public String servicoPrestado(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosServicoPrestadoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ServicosTomados")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ServicosTomadosRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/ServicosTomadosResponse")
    public String servicosTomados(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosServicosTomadosIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PagtosFisica")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/PagtosFisicaRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/PagtosFisicaResponse")
    public String pagtosFisica(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosPagtosFisicaIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EspetaculoDesportivo")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/EspetaculoDesportivoRequest", output = "http://services.senior.com.br/rubi_Asynccom_senior_g5_rh_fp_terceiros/EspetaculoDesportivoResponse")
    public String espetaculoDesportivo(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        TerceirosEspetaculoDesportivoIn parameters);

}