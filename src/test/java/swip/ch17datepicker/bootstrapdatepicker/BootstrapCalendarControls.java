package swip.ch17datepicker.bootstrapdatepicker;


import swip.ch15pageflow.framework.v2.Browser;

import java.util.function.Consumer;

import static swip.ch17datepicker.bootstrapdatepicker.BootstrapByClassName.*;

public enum BootstrapCalendarControls implements Consumer<Browser> {
    TRIGGER {
        @Override
        public void accept(Browser browser) {
            browser.untilFound(DATE_FIELD).click();
        }
    },
    NEXT_MONTH {
        @Override
        public void accept(Browser browser) {
            browser.untilFound(CALENDAR)
                .untilFound(NEXT_MONTH_BUTTON).click();
        }

    },
    PREVIOUS_MONTH {
        @Override
        public void accept(Browser browser) {
            browser.untilFound(CALENDAR)
                .untilFound(PREV_MONTH_BUTTON).click();
        }
    },

    NEXT_YEAR {
        @Override
        public void accept(Browser browser) {
            for (int i = 0; i < 12; i++) {
                NEXT_MONTH.accept(browser);
            }
        }
    },
    PREVIOUS_YEAR {
        @Override
        public void accept(Browser browser) {
            for (int i = 0; i < 12; i++) {
                PREVIOUS_MONTH.accept(browser);
            }
        }
    }
}