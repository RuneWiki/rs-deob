package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class421;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/ep;")
    private class421 field10304;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/ep;)V", line = 4)
    public IDirect3DSwapChain(class421 arg0) {
        super(arg0);
        this.field10304 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 14)
    public final IDirect3DSurface method4120(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field10304);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class735.method4118(var4, -2420)) {
            throw new class736(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
