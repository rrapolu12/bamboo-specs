package tutorial;

import com.atlassian.bamboo.specs.util.MapBuilder;

import java.util.Map;

public class Constants {

    @SuppressWarnings("")
    public static final Map mapper = new MapBuilder()
            .put("incrementalFileForInclusionList", "")
            .put("chosenSonarConfigId", "1")
            .put("useGradleWrapper", "")
            .put("useNewGradleSonarQubePlugin", "")
            .put("sonarJavaSource", "")
            .put("sonarProjectName", "")
            .put("buildJdk", "JDK 1.8")
            .put("gradleWrapperLocation", "")
            .put("sonarLanguage", "")
            .put("sonarSources", "")
            .put("useGlobalSonarServerConfig", "true")
            .put("incrementalMode", "")
            .put("failBuildForBrokenQualityGates", "")
            .put("sonarTests", "")
            .put("incrementalNoPullRequest", "incrementalModeFailBuildField")
            .put("failBuildForSonarErrors", "")
            .put("sonarProjectVersion", "")
            .put("sonarBranch", "")
            .put("executable", "Maven 3")
            .put("illegalBranchCharsReplacement", "_")
            .put("failBuildForTaskErrors", "true")
            .put("incrementalModeNotPossible", "incrementalModeRunFullAnalysis")
            .put("sonarJavaTarget", "")
            .put("environmentVariables", "")
            .put("incrementalModeGitBranchPattern", "")
            .put("legacyBranching", "true")
            .put("replaceSpecialBranchChars", "")
            .put("additionalProperties", "")
            .put("autoBranch", "true")
            .put("sonarProjectKey", "")
            .put("incrementalModeBambooUser", "")
            .put("overrideSonarBuildConfig", "")
            .put("workingSubDirectory", "")
            .build();
}
