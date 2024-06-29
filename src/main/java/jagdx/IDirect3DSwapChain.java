package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class336;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/wl;")
    private class336 field9450;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 8)
    public final IDirect3DSurface method3750(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field9450);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class672.method3776(var4, (byte) 42)) {
            throw new class671(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/wl;)V", line = 21)
    public IDirect3DSwapChain(class336 arg0) {
        super(arg0);
        this.field9450 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
