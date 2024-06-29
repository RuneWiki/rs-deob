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

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method1218() {
      return ~this.peer == -1L;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "clear",
      descriptor = "()V"
   )
   protected abstract void clear();

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "setPeer",
      descriptor = "(J)V"
   )
   private final void setPeer(long arg0) {
      this.peer = arg0;
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "b",
      descriptor = "()V"
   )
   public final void method1219() {
      if (!this.method1218()) {
         this.clear();
      }
   }

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "init",
      descriptor = "()V"
   )
   private static final native void init();

   @OriginalMember(
      owner = "client!jagtheora/misc/SimplePeer",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      if (!this.method1218()) {
         this.method1219();
      }

      super.finalize();
   }

   static {
      init();
   }
}
