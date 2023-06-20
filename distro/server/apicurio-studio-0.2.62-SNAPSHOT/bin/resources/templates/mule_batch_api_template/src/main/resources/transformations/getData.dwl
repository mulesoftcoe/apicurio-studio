%dw 2.0

output application/csv header=true
---
readUrl("classpath://examples/data.csv", "application/csv")