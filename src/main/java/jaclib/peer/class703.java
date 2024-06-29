package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mca")
public class class703 extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/mca",
      name = "<init>",
      descriptor = "(Ljaclib/peer/go;)V"
   )
   protected class703(class704 arg0) {
      this.reference = new NativeHeapPeerReference(this, arg0);
   }
}
