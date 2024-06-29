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
   public PeerReference field10672;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field10673;

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "setPeer",
      descriptor = "(J)V"
   )
   public final void setPeer(long arg0) {
      this.method5233((byte)118);
      this.peer = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method5233(byte arg0) {
      if (arg0 != 118) {
         this.setPeer(-51L);
      }

      long var2;
      if (~this.peer == -1L) {
         var2 = 0L;
      } else {
         var2 = this.releasePeer(this.peer);
         this.peer = 0L;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "releasePeer",
      descriptor = "(J)J"
   )
   protected abstract long releasePeer(long arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5234(byte arg0) {
      int var2 = 49 % ((4 - arg0) / 61);
      return ~this.peer != -1L;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "<init>",
      descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/jv;)V"
   )
   public PeerReference(Peer arg0, class709 arg1) {
      super(arg0, arg1.field10668);
      arg1.method5227(13109, this);
   }
}
