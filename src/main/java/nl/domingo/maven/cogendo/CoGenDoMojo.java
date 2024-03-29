package nl.domingo.maven.cogendo;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Goal which generates source files from templates.
 * 
 * @deprecated Don't use!
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CoGenDoMojo extends AbstractMojo {

	@Parameter(property = "cogendo.template", required = true)
	private String template;

	@Parameter(property = "cogendo.target", defaultValue="${project.basedir}/src/main/java", required = true)
	private String target;

	@Parameter(defaultValue = "${project.groupId}", property = "groupId", required = true)
	private String groupId;

	@Parameter(defaultValue = "${project.artifactId}", property = "artifactId", required = true)
	private String artifactId;

	/**
	 * Location of the file.
	 */
	@Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
	private File outputDirectory;

	public void execute() throws MojoExecutionException {
		getLog().info("-----------------------------");
		getLog().info("template   : "+template);
		getLog().info("target     : "+target);
		getLog().info("groupId    : "+groupId);
		getLog().info("artifactId : "+artifactId);
		getLog().info("-----------------------------");
		// File f = outputDirectory;
		//
		// if (!f.exists()) {
		// f.mkdirs();
		// }
		//
		// File touch = new File(f, "touch.txt");
		//
		// FileWriter w = null;
		// try {
		// w = new FileWriter(touch);
		//
		// w.write("touch.txt");
		// } catch (IOException e) {
		// throw new MojoExecutionException("Error creating file " + touch, e);
		// } finally {
		// if (w != null) {
		// try {
		// w.close();
		// } catch (IOException e) {
		// // ignore
		// }
		// }
		// }
	}
}
