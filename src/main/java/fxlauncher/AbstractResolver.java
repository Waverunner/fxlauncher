package fxlauncher;

import java.net.URI;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * An abstract class used for when the app manifest and libraries are located in differing URI's.
 */
@XmlRootElement
public abstract class AbstractResolver {

  /**
   * Used for resolving where library files should be downloaded from.
   * @return the URI where libraries are stored
   */
  public abstract URI getLibraryURI();

  /**
   * Where the manifest is stored. Used for when the library location deviates from the app manifest.
   * @return the manifest URI
   */
  public abstract URI getManifestURI();
}
