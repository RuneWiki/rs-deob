package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class360;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3D")
public class IDirect3D extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "b", descriptor = "Ljaclib/peer/ku;")
    private class360 field10166;

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(II)Ljagdx/D3DADAPTER_IDENTIFIER;", line = 8)
    public final D3DADAPTER_IDENTIFIER method4003(int arg0, int arg1) {
        D3DADAPTER_IDENTIFIER var3 = new D3DADAPTER_IDENTIFIER();
        int var4 = this._GetAdapterIdentifier(arg0, arg1, var3);
        if (class723.method3997(var4, -100)) {
            throw new class725(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(IILjava/awt/Canvas;ILjagdx/D3DPRESENT_PARAMETERS;)Ljagdx/IDirect3DDevice;", line = 22)
    public final IDirect3DDevice method4004(int arg0, int arg1, Canvas arg2, int arg3, D3DPRESENT_PARAMETERS arg4) {
        IDirect3DDevice var6 = new IDirect3DDevice(this.field10166);
        int var7 = this._CreateDevice(arg0, arg1, arg2, arg3, arg4, var6);
        if (class723.method3997(var7, -122)) {
            throw new class725(String.valueOf(var7));
        }
        return var6;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "<init>", descriptor = "(Ljaclib/peer/ku;)V", line = 34)
    private IDirect3D(class360 arg0) {
        super(arg0);
        this.field10166 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(ILjaclib/peer/ku;)Ljagdx/IDirect3D;", line = 45)
    public static final IDirect3D method4005(int arg0, class360 arg1) {
        IDirect3D var2 = new IDirect3D(arg1);
        int var3 = _Direct3DCreate(arg0, var2);
        if (class723.method3997(var3, -94)) {
            throw new class725(String.valueOf(var3));
        }
        return var2;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "b", descriptor = "(II)Ljagdx/D3DCAPS;", line = 67)
    public final D3DCAPS method4006(int arg0, int arg1) {
        D3DCAPS var3 = new D3DCAPS();
        int var4 = this._GetDeviceCaps(arg0, arg1, var3);
        if (class723.method3997(var4, -111)) {
            throw new class725(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(ILjagdx/D3DDISPLAYMODE;)I", line = 82)
    public final int method4007(int arg0, D3DDISPLAYMODE arg1) {
        return this._GetAdapterDisplayMode(arg0, arg1);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceType", descriptor = "(IIIIZ)I")
    public final native int CheckDeviceType(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceMultiSampleType", descriptor = "(IIIZI)I")
    public final native int CheckDeviceMultiSampleType(int arg0, int arg1, int arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDepthStencilMatch", descriptor = "(IIIII)I")
    public final native int CheckDepthStencilMatch(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "_CreateDevice", descriptor = "(IILjava/awt/Canvas;ILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3DDevice;)I")
    private final native int _CreateDevice(int arg0, int arg1, Canvas arg2, int arg3, D3DPRESENT_PARAMETERS arg4, IDirect3DDevice arg5);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetDeviceCaps", descriptor = "(IILjagdx/D3DCAPS;)I")
    private final native int _GetDeviceCaps(int arg0, int arg1, D3DCAPS arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetAdapterDisplayMode", descriptor = "(ILjagdx/D3DDISPLAYMODE;)I")
    private final native int _GetAdapterDisplayMode(int arg0, D3DDISPLAYMODE arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "_Direct3DCreate", descriptor = "(ILjagdx/IDirect3D;)I")
    private static final native int _Direct3DCreate(int arg0, IDirect3D arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceFormat", descriptor = "(IIIIII)I")
    public final native int CheckDeviceFormat(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetAdapterIdentifier", descriptor = "(IILjagdx/D3DADAPTER_IDENTIFIER;)I")
    private final native int _GetAdapterIdentifier(int arg0, int arg1, D3DADAPTER_IDENTIFIER arg2);
}
