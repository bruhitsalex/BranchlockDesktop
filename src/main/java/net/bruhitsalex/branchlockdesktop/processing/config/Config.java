package net.bruhitsalex.branchlockdesktop.processing.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Config {

    // oop hell

    private GlobalSettings globalSettings;
    private Tasks tasks;
    private ObfuscationRanges obfuscationRanges;

}