package com.demo

import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class MySpec extends Specification implements SomeTrait {

    void "test something"() {
        expect:
        true
    }
}
