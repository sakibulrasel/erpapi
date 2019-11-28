package com.symphony.api.inv

import groovy.sql.Sql

class AppsDashboardService {

    def dataSource

    def getMonthlySalesDatabyYear() {

        String sql = """
         select to_char(INVOICE_DATE,'Mon') "Month", sum(A.GRAND_TOTAL) total
         from sls_invoice_master  a
         group by  to_char(INVOICE_DATE,'Mon'),to_number(to_char(INVOICE_DATE,'mm'))
         order by to_number(to_char(INVOICE_DATE,'mm'))
          """

        def db = new Sql(dataSource)
        def result = db.rows(sql)
        return result.toList()

    }
}
