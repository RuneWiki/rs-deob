package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class622;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/tc;")
    private class622 field6160;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/tc;)V", line = 4)
    public IDirect3DSwapChain(class622 arg0) {
        super(arg0);
        this.field6160 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 17)
    public final IDirect3DSurface method2505(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6160);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class439.method2512(var4, 0)) {
            throw new class438(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
