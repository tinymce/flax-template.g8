package example

import com.ephox.flax.api.action.{Action, FlaxActions}
import com.ephox.flax.api.specs2.{FlaxAssertions, FlaxSpec}

class HelloSpec extends TestBase {
  "Open web page" >> {
    for {
      _ <- Action.nested("Open flax github page", FlaxActions.get("https://github.com/ephox/flax"))
      _ <- FlaxAssertions.assert(true must_=== true)
    } yield ()
  }
}
