package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty;

import java.time.LocalDateTime;

public class EventDeleteWarranty {

	private String event_id;
	private String event_schema;
	private String event_action;
	private LocalDateTime event_timestamp;
	private String idProposal;
	private String idWarranty;

	public EventDeleteWarranty(String event_id, String event_schema, String event_action, LocalDateTime event_timestamp,
			String idProposal, String idWarranty) {
		this.event_id = event_id;
		this.event_schema = event_schema;
		this.event_action = event_action;
		this.event_timestamp = event_timestamp;
		this.idProposal = idProposal;
		this.idWarranty = idWarranty;
	}

	public String getIdWarranty() {
		return idWarranty;
	}

	public String getEvent_id() {
		return event_id;
	}

	public String getEvent_schema() {
		return event_schema;
	}

	public String getEvent_action() {
		return event_action;
	}

	public LocalDateTime getEvent_timestamp() {
		return event_timestamp;
	}

	public String getIdProposal() {
		return idProposal;
	}

}
