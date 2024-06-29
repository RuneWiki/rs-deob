package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class576;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/pe;")
    private class576 field5337;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 8)
    public final IDirect3DSurface method2338(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field5337);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class407.method2321((byte) 60, var4)) {
            throw new class408("");
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/pe;)V", line = 21)
    public IDirect3DSwapChain(class576 arg0) {
        super(arg0);
        this.field5337 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
