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
      descriptor = "(B)J"
   )
   public final long method2971(byte arg0) {
      int var2 = -75 % ((17 - arg0) / 60);
      return super.method2973();
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ida;)V"
   )
   protected IUnknown(class378 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }
}
