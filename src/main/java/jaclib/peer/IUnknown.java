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
      name = "<init>",
      descriptor = "(Ljaclib/peer/go;)V"
   )
   protected IUnknown(class704 arg0) {
      this.reference = new IUnknownReference(this, arg0);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/IUnknown",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method5123(int arg0) {
      if (arg0 != -1928) {
         this.AddRef();
      }

      return super.method3740();
   }
}
