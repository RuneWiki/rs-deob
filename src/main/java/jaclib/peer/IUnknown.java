package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "AddRef",
      descriptor = "()J"
   )
   public final native long AddRef();

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3157(int arg0) {
      int var2 = 20 % ((51 - arg0) / 45);
      return super.method3133();
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/aj;)V"
   )
   protected IUnknown(class406 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }
}
