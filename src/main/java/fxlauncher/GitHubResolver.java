package fxlauncher;

import java.net.URI;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GitHub")
public class GitHubResolver extends AbstractResolver {
  @XmlElement
  public String project;
  @XmlElement
  public String release;

  @Override
  public URI getLibraryURI() {
    return URI.create(String.format("https://github.com/%s/releases/download/%s/harvesterdroid-1.0.1.zip", project, release));
  }

  @Override
  public URI getManifestURI() {
    return URI.create(String.format("https://raw.githubusercontent.com/%s/%s/app.xml", project, release));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubResolver that = (GitHubResolver) o;
    return Objects.equals(project, that.project) &&
        Objects.equals(release, that.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, release);
  }
}
