package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/du;)V",
      line = 3
   )
   protected IUnknown(class700 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "a",
      descriptor = "(B)J",
      line = 13
   )
   public final long method5108(byte arg0) {
      return arg0 != 7 ? 55L : super.method3822();
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "AddRef",
      descriptor = "()J"
   )
   public final native long AddRef();
}
