package net.bruhitsalex.branchlockdesktop.processing.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Tasks {

    private Trimmer trimmer;
    private StacktraceEncryption stacktraceEncryption;
    private RemoveDebugInformation removeDebugInformation;
    private boolean runtimeCoverage;
    private boolean numberObfuscation;
    private DescriptorObfuscation descriptorObfuscation;

    private ControlFlowObfuscation controlFlowObfuscation;
    private boolean scrambleCodeLogic;
    private boolean generalizeAccess;
    private AntiDebug antiDebug;
    private Renamer renamer;

    private ReferenceEncryption referenceEncryption;
    private boolean shuffleClassMembers;
    private StringEncryption stringEncryption;
    private CrashRETools crashRETools;

}
