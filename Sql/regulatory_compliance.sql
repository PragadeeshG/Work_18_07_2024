create table if not exists regulatory_compliance(
regulatory_compliance_code Integer not null,
custodial_account_effective Integer null,
custodial_account_effective_date varchar(255) null,
custodial_accountregulatory_compliance_desc varchar(255) null,
custodial_accountregulatory_compliance_short_desc varchar(255) null,
custodial_account_decimal_positions Integer null,
custodial_accountregulatory_compliance_symbol varchar(255) null,
custodial_accountregulatory_compliance_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint regulatory_compliance_pk primary key(regulatory_compliance_code));