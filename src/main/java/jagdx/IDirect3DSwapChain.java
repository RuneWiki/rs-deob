package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class378;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "b",
      descriptor = "Ljaclib/peer/ida;"
   )
   private class378 field11096;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "a",
      descriptor = "(II)Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method5488(int arg0, int arg1) {
      IDirect3DSurface var3 = new IDirect3DSurface(this.field11096);
      int var4 = this._GetBackBuffer(arg0, arg1, var3);
      if (class760.method5513(false, var4)) {
         throw new class759(String.valueOf(var4));
      } else {
         return var3;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "Present",
      descriptor = "(I)I"
   )
   public final native int Present(int arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "_GetBackBuffer",
      descriptor = "(IILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ida;)V"
   )
   public IDirect3DSwapChain(class378 arg0) {
      super(arg0);
      this.field11096 = arg0;
   }
}
