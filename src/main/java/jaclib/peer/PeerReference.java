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
   public PeerReference field5250;
   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   public PeerReference field5251;

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method2977(int arg0) {
      long var2;
      if ((long)arg0 == this.peer) {
         var2 = 0L;
      } else {
         var2 = this.releasePeer(this.peer);
         this.peer = 0L;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2978(byte arg0) {
      if (arg0 >= -100) {
         return true;
      } else {
         return this.peer != 0L;
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/PeerReference",
      name = "<init>",
      descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/ida;)V"
   )
   public PeerReference(Peer arg0, class378 arg1) {
      super(arg0, arg1.field5254);
      arg1.method2982(this, 474);
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
      this.method2977(0);
      this.peer = arg0;
   }
}
