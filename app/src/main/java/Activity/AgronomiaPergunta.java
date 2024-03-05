package Activity;

import java.util.HashMap;
import java.util.Map;

public class AgronomiaPergunta {
    private String reuniaoComCoordenadores;
    private String mapeamentoDosProdutores;
    private String revisaoLiteratura;
    private String reuniaoProximasAtividadesColetadeDados;
    private String roletaDeDadosBioinsumos;
    private String relatorioParcial;
    private String relatorioFinal;
    private String entregaRelatorioFinal;

   private Map<String, Object> relatorioAgronomico = new HashMap<>();
    public AgronomiaPergunta(String reuniaoComCoordenadores, String mapeamentoDosProdutores, String revisaoLiteratura, String reuniaoProximasAtividadesColetadeDados, String roletaDeDadosBioinsumos, String relatorioParcial, String relatorioFinal, String entregaRelatorioFinal) {
        this.reuniaoComCoordenadores = reuniaoComCoordenadores;
        this.mapeamentoDosProdutores = mapeamentoDosProdutores;
        this.revisaoLiteratura = revisaoLiteratura;
        this.reuniaoProximasAtividadesColetadeDados = reuniaoProximasAtividadesColetadeDados;
        this.roletaDeDadosBioinsumos = roletaDeDadosBioinsumos;
        this.relatorioParcial = relatorioParcial;
        this.relatorioFinal = relatorioFinal;
        this.entregaRelatorioFinal = entregaRelatorioFinal;

        relatorioAgronomico.put("Reunião com os coordenadores dos cursos de Agronomia Cogna", reuniaoComCoordenadores);
        relatorioAgronomico.put("Mapeamento dos produtoresorgânicos nas regiões escolhidas", mapeamentoDosProdutores);
        relatorioAgronomico.put("Primeiro relatório para o coordenador", revisaoLiteratura);
        relatorioAgronomico.put("Reunião para discussão das próximas atividades de coletas de dados", reuniaoProximasAtividadesColetadeDados);
        relatorioAgronomico.put("Coletas de dados de bioinsumos", roletaDeDadosBioinsumos);
        relatorioAgronomico.put("Relatório parcial", relatorioParcial);
        relatorioAgronomico.put("Relatório final 1", relatorioFinal);
        relatorioAgronomico.put("Entrega do relatório final", entregaRelatorioFinal);
    }
    public String getReuniaoComCoordenadores() {
        return reuniaoComCoordenadores;
    }
    public void setReuniaoComCoordenadores(String reuniaoComCoordenadores) {
        this.reuniaoComCoordenadores = reuniaoComCoordenadores;
    }

    public String getmapeamentoDosProdutores() {
        return mapeamentoDosProdutores;
    }

    public void setMapeamentoDosProdutores(String mapeamentoDosProdutores) {
        mapeamentoDosProdutores = mapeamentoDosProdutores;
    }
    public String getRevisaoLiteratura() {
        return revisaoLiteratura;
    }

    public void setRevisaoLiteratura(String revisaoLiteratura) {
        this.revisaoLiteratura = revisaoLiteratura;
    }

    public String getReuniaoProximasAtividadesColetadeDados() {
        return reuniaoProximasAtividadesColetadeDados;
    }

    public void setReuniaoProximasAtividadesColetadeDados(String reuniaoProximasAtividadesColetadeDados) {
        this.reuniaoProximasAtividadesColetadeDados = reuniaoProximasAtividadesColetadeDados;
    }

    public String getRoletaDeDadosBioinsumos() {
        return roletaDeDadosBioinsumos;
    }

    public void setRoletaDeDadosBioinsumos(String roletaDeDadosBioinsumos) {
        this.roletaDeDadosBioinsumos = roletaDeDadosBioinsumos;
    }

    public String getRelatorioParcial() {
        return relatorioParcial;
    }

    public void setRelatorioParcial(String relatorioParcial) {
        this.relatorioParcial = relatorioParcial;
    }

    public String getRelatorioFinal() {
        return relatorioFinal;
    }

    public void setRelatorioFinal(String relatorioFinal) {
        this.relatorioFinal = relatorioFinal;
    }

    public String getEntregaRelatorioFinal() {
        return entregaRelatorioFinal;
    }

    public void setEntregaRelatorioFinal(String entregaRelatorioFinal) {
        this.entregaRelatorioFinal = entregaRelatorioFinal;
    }

    public Map<String, Object> getRelatorioAgronomico() {
        return relatorioAgronomico;
    }

    public void setRelatorioAgronomico(Map<String, Object> relatorioAgronomico) {
        this.relatorioAgronomico = relatorioAgronomico;
    }
}