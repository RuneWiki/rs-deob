package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class701;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "b",
      descriptor = "Ljaclib/peer/ia;"
   )
   private class701 field7497;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ia;)V",
      line = 4
   )
   public IDirect3DSwapChain(class701 arg0) {
      super(arg0);
      this.field7497 = arg0;
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "a",
      descriptor = "(II)Ljagdx/IDirect3DSurface;",
      line = 16
   )
   public final IDirect3DSurface method3791(int arg0, int arg1) {
      IDirect3DSurface var3 = new IDirect3DSurface(this.field7497);
      int var4 = this._GetBackBuffer(arg0, arg1, var3);
      if (class508.method3767(var4, false)) {
         throw new class509(String.valueOf(var4));
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
}
