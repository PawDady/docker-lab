package pl.epoint.dockerlab.yacht;

import lombok.Data;

/**
 * @author Kamil Murawski
 */
@Data
public class Yacht {

    private String name;
    private Integer length;
    private Integer maxCrew;
}
