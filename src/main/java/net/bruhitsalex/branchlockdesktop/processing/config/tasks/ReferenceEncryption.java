package net.bruhitsalex.branchlockdesktop.processing.config.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ReferenceEncryption {

    private boolean enabled;
    private Mode mode = Mode.REFLECTION;
    private boolean ignoreMethods;
    private boolean ignoreFields;
    private boolean forceUnresolvedEncryption;

    public enum Mode {
        REFLECTION,
        DYNAMIC
    }

}
