package com.buckley;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Echos an object string to the output screen.
 * @goal echo
 * @requiresProject false
 */
@Mojo( name = "acceptable-plugin" )
public class AcceptableAnnotationFinderMojo extends AbstractMojo{

    public void execute() throws MojoExecutionException, MojoFailureException {
            getLog().info("James is awesome");
    }
}
