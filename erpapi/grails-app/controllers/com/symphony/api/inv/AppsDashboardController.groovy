package com.symphony.api.inv

import grails.converters.JSON

class AppsDashboardController {

    def appsDashboardService

    def yearlySalesData(){
        render appsDashboardService.monthlySalesDatabyYear as JSON
    }

}
