package component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


/**
 * MoniQue component configuration
 *
 * @author Pavel Didkovskii
 */
@Data
public class Config {

    Deploy deploy;

    @JsonProperty("params")
    Param param;

    @Data
    static class Deploy {

        private Monique monique;

        @Data
        static class Monique {

            @JsonProperty("scheduler-in")
            private Scheduler in;

            @JsonProperty("scheduler-out")
            private Scheduler out;

            private Scheduler controller;


            @Data
            static class Scheduler {
                private String host;
                private Integer comport;
                private Integer techport;
            }

        }

    }

    @Data
    static class Param {
        private String name;
        private String creator;
        private Integer frequency;
        private Integer port;
    }

}
