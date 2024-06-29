package jagtheora.misc;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/misc/SimplePeer")
public abstract class SimplePeer {
   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "peer",
      descriptor = "J"
   )
   private long peer;

   static {
      init();
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "setPeer",
      descriptor = "(J)V",
      line = 7
   )
   private final void setPeer(long arg0) {
      this.peer = arg0;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "a",
      descriptor = "()Z",
      line = 16
   )
   public final boolean method5340() {
      return ~this.peer == -1L;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "finalize",
      descriptor = "()V",
      line = 23
   )
   protected final void finalize() throws Throwable {
      if (!this.method5340()) {
         this.method5341();
      }

      super.finalize();
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "b",
      descriptor = "()V",
      line = 41
   )
   public final void method5341() {
      if (!this.method5340()) {
         this.clear();
      }
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "clear",
      descriptor = "()V"
   )
   protected abstract void clear();

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "init",
      descriptor = "()V"
   )
   private static final native void init();
}
