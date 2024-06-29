package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qp")
public class class703 extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/qp",
      name = "<init>",
      descriptor = "(Ljaclib/peer/pga;)V"
   )
   protected class703(class702 arg0) {
      this.reference = new NativeHeapPeerReference(this, arg0);
   }
}
