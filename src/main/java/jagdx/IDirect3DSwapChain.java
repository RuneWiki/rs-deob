package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class704;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "b",
      descriptor = "Ljaclib/peer/go;"
   )
   private class704 field7083;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "Present",
      descriptor = "(I)I"
   )
   public final native int Present(int arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "<init>",
      descriptor = "(Ljaclib/peer/go;)V"
   )
   public IDirect3DSwapChain(class704 arg0) {
      super(arg0);
      this.field7083 = arg0;
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "a",
      descriptor = "(II)Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method3738(int arg0, int arg1) {
      IDirect3DSurface var3 = new IDirect3DSurface(this.field7083);
      int var4 = this._GetBackBuffer(arg0, arg1, var3);
      if (!class512.method3719(var4, -2005530586)) {
         return var3;
      } else {
         throw new class513(String.valueOf(var4));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "_GetBackBuffer",
      descriptor = "(IILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
