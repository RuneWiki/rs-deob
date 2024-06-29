package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class709;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "b",
      descriptor = "I"
   )
   public int field935;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/jv;)V",
      line = 8
   )
   public IDirect3DVertexBuffer(class709 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;IIII)Z",
      line = 14
   )
   public final boolean method551(Source arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != null && arg1 >= 0 && ~(arg0.getSize() + arg1) <= ~arg3) {
         if (arg2 >= 0 && this.field935 + arg2 >= arg3) {
            return this._Update((long)arg1 + arg0.getAddress(), arg2, arg3, arg4);
         } else {
            throw new class73("");
         }
      } else {
         throw new class73("");
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "a",
      descriptor = "()J",
      line = 27
   )
   protected final long method552() {
      this.field935 = 0;
      return super.method552();
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "Unlock",
      descriptor = "()I"
   )
   public final native int Unlock();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "_Update",
      descriptor = "(JIII)Z"
   )
   private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "Lock",
      descriptor = "(IIILjagdx/GeometryBuffer;)I"
   )
   public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);
}
