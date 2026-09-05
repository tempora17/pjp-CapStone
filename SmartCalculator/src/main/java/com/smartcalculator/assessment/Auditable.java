package com.smartcalculator.assessment;

public interface Auditable {

  String getAuditLog();

  default String getAuditPrefix() {
    return "[AUDIT] ";
  }
}
