package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ia;)V"
   )
   protected IUnknown(class701 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "AddRef",
      descriptor = "()J"
   )
   public final native long AddRef();

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method5106(boolean arg0) {
      return !arg0 ? 59L : super.method3793();
   }
}
