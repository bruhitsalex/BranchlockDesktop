package net.bruhitsalex.branchlockdesktop.processing.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AntiDebug {

    private boolean enabled;
    private boolean checkNoverify;

}
