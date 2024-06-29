package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class699;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/hk;")
    private class699 field7117;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 9)
    public final IDirect3DSurface method2975(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field7117);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class509.method2978(0, var4)) {
            throw new class508(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/hk;)V", line = 20)
    public IDirect3DSwapChain(class699 arg0) {
        super(arg0);
        this.field7117 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
