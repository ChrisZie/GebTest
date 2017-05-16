package com.test.pages

import geb.Page

/**
 * PageObject for example page
 */
class ExamplePage extends Page {

    static url = '/'

    static at = { title == 'Google' }

    /**
     * page content
     */
    static content = {
        headline(wait: true) { $('h2', 3) }
        searchinput{$('input#lst-ib')}
        searchbutton{$('input', type:'submit').btnK}
    }
}
