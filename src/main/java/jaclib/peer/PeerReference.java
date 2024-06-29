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
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field5961;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field5962;

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method3158(boolean arg0) {
      if (arg0) {
         this.field5961 = (PeerReference)null;
      }

      return this.peer != 0L;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3159(int arg0) {
      long var2;
      if (this.peer == 0L) {
         var2 = 0L;
      } else {
         var2 = this.releasePeer(this.peer);
         this.peer = 0L;
      }

      int var4 = 77 / ((-53 - arg0) / 59);
      return var2;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "<init>",
      descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/aj;)V"
   )
   public PeerReference(Peer arg0, class406 arg1) {
      super(arg0, arg1.field5966);
      arg1.method3166((byte)43, this);
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
      this.method3159(-125);
      this.peer = arg0;
   }
}
