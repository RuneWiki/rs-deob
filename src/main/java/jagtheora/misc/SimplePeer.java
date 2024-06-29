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
      name = "a",
      descriptor = "()V",
      line = 5
   )
   public final void method5388() {
      if (!this.method5389()) {
         this.clear();
      }
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "finalize",
      descriptor = "()V",
      line = 22
   )
   protected final void finalize() throws Throwable {
      if (!this.method5389()) {
         this.method5388();
      }

      super.finalize();
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "setPeer",
      descriptor = "(J)V",
      line = 36
   )
   private final void setPeer(long arg0) {
      this.peer = arg0;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "b",
      descriptor = "()Z",
      line = 46
   )
   public final boolean method5389() {
      return ~this.peer == -1L;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "init",
      descriptor = "()V"
   )
   private static final native void init();

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "clear",
      descriptor = "()V"
   )
   protected abstract void clear();
}
