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
   public PeerReference field10241;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field10242;

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "releasePeer",
      descriptor = "(J)J"
   )
   protected abstract long releasePeer(long arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method5101(int arg0) {
      if (arg0 != 0) {
         this.peer = 68L;
      }

      return ~this.peer != -1L;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "setPeer",
      descriptor = "(J)V"
   )
   public final void setPeer(long arg0) {
      this.method5102(58);
      this.peer = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "<init>",
      descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/du;)V"
   )
   public PeerReference(Peer arg0, class700 arg1) {
      super(arg0, arg1.field10243);
      arg1.method5106((byte)-118, this);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method5102(int arg0) {
      if (arg0 <= 4) {
         this.field10241 = (PeerReference)null;
      }

      long var2;
      if (~this.peer != -1L) {
         var2 = this.releasePeer(this.peer);
         this.peer = 0L;
      } else {
         var2 = 0L;
      }

      return var2;
   }
}
