
public class Viagem extends Cliente {
		private String origem;
		private String dest;
		private String partida;
		private int duracao;
		private int motivo; // 0-turismo; 1-negocio; 2-visitaFamiliar
		
		Viagem(String n, String c, String r, String ud, String o, String d, String p, int du, int m){
			super(n, c, r, ud);
			setOrigem(o);
			setDest(d);
			setPartida(p);
			setDuracao(du);
			setMotivo(m);
		}
		
		public String retornaDados() {
			String motivo;
			int m = getMotivo();
			
			if(m == 0) motivo = "Turismo";
			else if(m == 1) motivo = "Negocio";
			else motivo = "Visita Familiar";
			
			String text;
			text = "Origem: " + getOrigem() + "\nDestino: " + getDest() + "\nPartida: " + getPartida() + "\nDuração da Viagem: " + getDuracao() + " horas\nMotivo da viagem: " + motivo + "\n";
			return text;
		}
		
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDest() {
			return dest;
		}
		public void setDest(String dest) {
			this.dest = dest;
		}
		public String getPartida() {
			return partida;
		}
		public void setPartida(String partida) {
			this.partida = partida;
		}
		public int getDuracao() {
			return duracao;
		}
		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}
		public int getMotivo() {
			return motivo;
		}
		public void setMotivo(int motivo) {
			this.motivo = motivo;
		}
		
		
}
