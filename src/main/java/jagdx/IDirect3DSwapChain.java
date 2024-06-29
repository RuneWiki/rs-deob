package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class623;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/naa;")
    private class623 field6339;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/naa;)V")
    public IDirect3DSwapChain(class623 arg0) {
        super(arg0);
        this.field6339 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;")
    public final IDirect3DSurface method2667(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6339);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class448.method2665(var4, true)) {
            throw new class449(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
