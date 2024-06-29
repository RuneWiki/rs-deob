package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class670;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/rh;")
    private class670 field6877;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/rh;)V", line = 5)
    public IDirect3DSwapChain(class670 arg0) {
        super(arg0);
        this.field6877 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 16)
    public final IDirect3DSurface method2916(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6877);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class481.method2897(var4, -15560)) {
            throw new class482(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
