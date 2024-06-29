package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {
   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method5223(int arg0) {
      if (arg0 != -18900) {
         this.method5223(23);
      }

      return super.method552();
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "AddRef",
      descriptor = "()J"
   )
   public final native long AddRef();

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "<init>",
      descriptor = "(Ljaclib/peer/jv;)V"
   )
   protected IUnknown(class709 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }
}
