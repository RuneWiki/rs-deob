package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class700;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DIndexBuffer")
public class IDirect3DIndexBuffer extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DIndexBuffer",
      name = "Lock",
      descriptor = "(IIILjagdx/GeometryBuffer;)I"
   )
   public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DIndexBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/du;)V"
   )
   public IDirect3DIndexBuffer(class700 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DIndexBuffer",
      name = "_Update",
      descriptor = "(JII)Z"
   )
   private final native boolean _Update(long arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DIndexBuffer",
      name = "a",
      descriptor = "()J"
   )
   protected final long method3822() {
      return super.method3822();
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DIndexBuffer",
      name = "Unlock",
      descriptor = "()I"
   )
   public final native int Unlock();
}
