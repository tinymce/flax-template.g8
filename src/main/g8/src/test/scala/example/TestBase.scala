package example

import com.ephox.flax.api.elem.Browser
import com.ephox.flax.api.specs2.FlaxSpec
import org.specs2.mutable.Specification

abstract class TestBase extends Specification with FlaxSpec {
  sequential

  // TODO: Perhaps get this from environment variables.
  override def curBrowser: Browser = Browser.firefox
}