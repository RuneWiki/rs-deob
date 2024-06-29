package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "a",
      descriptor = "(I)J",
      line = 5
   )
   public final long method5120(int arg0) {
      return arg0 != 9575 ? -88L : super.method3734();
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/pga;)V",
      line = 14
   )
   protected IUnknown(class702 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "AddRef",
      descriptor = "()J"
   )
   public final native long AddRef();
}
