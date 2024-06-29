package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class378;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "b",
      descriptor = "I"
   )
   public int field11097;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "a",
      descriptor = "()J"
   )
   protected final long method2973() {
      this.field11097 = 0;
      return super.method2973();
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "Lock",
      descriptor = "(IIILjagdx/GeometryBuffer;)I"
   )
   public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;IIII)Z"
   )
   public final boolean method5489(Source arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != null && 0 <= arg1 && arg0.getSize() + arg1 >= arg3) {
         if (arg2 >= 0 && this.field11097 + arg2 >= arg3) {
            return this._Update((long)arg1 + arg0.getAddress(), arg2, arg3, arg4);
         } else {
            throw new class759("");
         }
      } else {
         throw new class759("");
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "_Update",
      descriptor = "(JIII)Z"
   )
   private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ida;)V"
   )
   public IDirect3DVertexBuffer(class378 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DVertexBuffer",
      name = "Unlock",
      descriptor = "()I"
   )
   public final native int Unlock();
}
