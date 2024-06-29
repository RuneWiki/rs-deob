package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class709;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "b",
      descriptor = "Ljaclib/peer/jv;"
   )
   private class709 field937;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "Present",
      descriptor = "(I)I"
   )
   public final native int Present(int arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "a",
      descriptor = "(II)Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method558(int arg0, int arg1) {
      IDirect3DSurface var3 = new IDirect3DSurface(this.field937);
      int var4 = this._GetBackBuffer(arg0, arg1, var3);
      if (class71.method549(var4, 15)) {
         throw new class73(String.valueOf(var4));
      } else {
         return var3;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "_GetBackBuffer",
      descriptor = "(IILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "<init>",
      descriptor = "(Ljaclib/peer/jv;)V"
   )
   public IDirect3DSwapChain(class709 arg0) {
      super(arg0);
      this.field937 = arg0;
   }
}
