package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class571;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/ik;")
    private class571 field5473;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/ik;)V")
    public IDirect3DSwapChain(class571 arg0) {
        super(arg0);
        this.field5473 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;")
    public final IDirect3DSurface method2374(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field5473);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class399.method2378(var4, -1)) {
            throw new class398(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
