package com.features;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Manifest;

import org.junit.Test;

public class MainManifest {

    @Test
    public void testManifestVersion() throws IOException {
        Enumeration<URL> resource = MainManifest.class.getClassLoader().getResources("META-INF/FEST.MF");
        while (resource.hasMoreElements()) {
            try (InputStream stream = resource.nextElement().openStream()) {
                Manifest manifest = new Manifest(stream);
                String version = manifest.getMainAttributes().getValue("Version");
                if (version != null) {
                    System.out.println(version);
                }
            }
        }
    }

}
