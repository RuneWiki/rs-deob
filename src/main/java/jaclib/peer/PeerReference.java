package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "peer",
      descriptor = "J"
   )
   private long peer;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field10516;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field10517;

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method5104(boolean arg0) {
      if (!arg0) {
         this.setPeer(16L);
      }

      long var2;
      if (this.peer != 0L) {
         var2 = this.releasePeer(this.peer);
         this.peer = 0L;
      } else {
         var2 = 0L;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "<init>",
      descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/ia;)V"
   )
   public PeerReference(Peer arg0, class701 arg1) {
      super(arg0, arg1.field10518);
      arg1.method5110((byte)123, this);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5105(byte arg0) {
      if (arg0 != -29) {
         this.field10516 = (PeerReference)null;
      }

      return ~this.peer != -1L;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "releasePeer",
      descriptor = "(J)J"
   )
   protected abstract long releasePeer(long arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "setPeer",
      descriptor = "(J)V"
   )
   public final void setPeer(long arg0) {
      this.method5104(true);
      this.peer = arg0;
   }
}
