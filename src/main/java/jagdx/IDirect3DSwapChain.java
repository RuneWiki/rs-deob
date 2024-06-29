package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class702;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "b",
      descriptor = "Ljaclib/peer/pga;"
   )
   private class702 field7425;

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "a",
      descriptor = "(II)Ljagdx/IDirect3DSurface;",
      line = 9
   )
   public final IDirect3DSurface method3732(int arg0, int arg1) {
      IDirect3DSurface var3 = new IDirect3DSurface(this.field7425);
      int var4 = this._GetBackBuffer(arg0, arg1, var3);
      if (!class512.method3731(var4, (byte)-107)) {
         return var3;
      } else {
         throw new class511(String.valueOf(var4));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DSwapChain",
      name = "<init>",
      descriptor = "(Ljaclib/peer/pga;)V",
      line = 22
   )
   public IDirect3DSwapChain(class702 arg0) {
      super(arg0);
      this.field7425 = arg0;
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
