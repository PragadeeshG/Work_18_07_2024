create table if not exists regulatory_compliance_origin(
regulatory_compliance_code Integer not null,
data_custodian_id Integer null,
excempt_code_id Integer null,
excemption_applicable varchar(255) null,
business_indicator Integer null,
user_code char null,
country_code char null,
unit_name varchar(255) null,
custodial_account_mapping_id varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint regulatory_compliance_origin_pk primary key(regulatory_compliance_code));