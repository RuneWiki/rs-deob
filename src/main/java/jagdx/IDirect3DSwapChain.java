package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class669;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/wf;")
    private class669 field6834;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 8)
    public final IDirect3DSurface method2904(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6834);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class480.method2880((byte) -54, var4)) {
            throw new class481(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/wf;)V", line = 20)
    public IDirect3DSwapChain(class669 arg0) {
        super(arg0);
        this.field6834 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);
}
