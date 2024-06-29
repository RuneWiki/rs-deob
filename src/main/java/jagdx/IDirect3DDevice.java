package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class630;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DDevice")
public class IDirect3DDevice extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "Ljaclib/peer/dj;")
    private class630 field5659;

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "[F")
    private static float[] field5658 = new float[4];

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IF)I", line = 6)
    public final int method2463(int arg0, float arg1) {
        return this.SetRenderStatef(arg0, arg1);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "(I)Ljagdx/IDirect3DSurface;", line = 17)
    public final IDirect3DSurface method2464(int arg0) {
        IDirect3DSurface var2 = new IDirect3DSurface(this.field5659);
        int var3 = this._GetRenderTarget(arg0, var2);
        if (class451.method2481(-2147467259, var3)) {
            throw new class450(String.valueOf(var3));
        }
        return var2;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "<init>", descriptor = "(Ljaclib/peer/dj;)V", line = 35)
    public IDirect3DDevice(class630 arg0) {
        super(arg0);
        this.field5659 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "(I)Ljagdx/IDirect3DSwapChain;", line = 50)
    public final IDirect3DSwapChain method2465(int arg0) {
        IDirect3DSwapChain var2 = new IDirect3DSwapChain(this.field5659);
        int var3 = this._GetSwapChain(arg0, var2);
        if (class451.method2481(-2147467259, var3)) {
            throw new class450(String.valueOf(var3));
        }
        return var2;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIIII)Ljagdx/IDirect3DVolumeTexture;", line = 65)
    public final IDirect3DVolumeTexture method2466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        IDirect3DVolumeTexture var8 = new IDirect3DVolumeTexture(this.field5659);
        int var9 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, var8);
        if (class451.method2481(-2147467259, var9)) {
            throw new class450(String.valueOf(var9));
        }
        return var8;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIII)Ljagdx/IDirect3DCubeTexture;", line = 81)
    public final IDirect3DCubeTexture method2467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        IDirect3DCubeTexture var6 = new IDirect3DCubeTexture(this.field5659);
        int var7 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, var6);
        if (class451.method2481(-2147467259, var7)) {
            throw new class450(String.valueOf(var7));
        }
        return var6;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)Ljagdx/IDirect3DIndexBuffer;", line = 96)
    public final IDirect3DIndexBuffer method2468(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4) {
        if (arg4 == null) {
            arg4 = new IDirect3DIndexBuffer(this.field5659);
        } else {
            arg4.method3542(75);
        }
        int var6 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4);
        if (class451.method2481(-2147467259, var6)) {
            throw new class450(String.valueOf(var6));
        }
        return arg4;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIII)Ljagdx/IDirect3DTexture;", line = 119)
    public final IDirect3DTexture method2469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        IDirect3DTexture var7 = new IDirect3DTexture(this.field5659);
        int var8 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, var7);
        if (class451.method2481(-2147467259, var8)) {
            throw new class450(String.valueOf(var8));
        }
        return var7;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IZ)I", line = 133)
    public final int method2470(int arg0, boolean arg1) {
        return this.SetRenderStateb(arg0, arg1);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "()Ljagdx/IDirect3DEventQuery;", line = 144)
    public final IDirect3DEventQuery method2471() {
        IDirect3DEventQuery var1 = new IDirect3DEventQuery(this.field5659);
        if (class451.method2482(14528, this._CreateEventQuery(var1))) {
            return var1.method3533((byte) 89) ? var1 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(I[F)I", line = 161)
    public final int method2472(int arg0, float[] arg1) {
        return this.SetVertexShaderConstantF(arg0, arg1, arg1.length / 4);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IFFFF)I", line = 174)
    public final int method2473(int arg0, float arg1, float arg2, float arg3, float arg4) {
        field5658[1] = arg2;
        field5658[3] = arg4;
        field5658[2] = arg3;
        field5658[0] = arg1;
        return this.method2472(arg0, field5658);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "([B)Ljagdx/IDirect3DVertexShader;", line = 187)
    public final IDirect3DVertexShader method2474(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        IDirect3DVertexShader var2 = new IDirect3DVertexShader(this.field5659);
        int var3 = this._CreateVertexShader(arg0, var2);
        if (class451.method2481(-2147467259, var3)) {
            throw new class450(String.valueOf(var3));
        }
        return var2;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)Ljagdx/IDirect3DVertexBuffer;", line = 207)
    public final IDirect3DVertexBuffer method2475(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4) {
        if (arg4 == null) {
            arg4 = new IDirect3DVertexBuffer(this.field5659);
        } else {
            arg4.method3542(87);
        }
        int var6 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4);
        if (class451.method2481(-2147467259, var6)) {
            throw new class450(String.valueOf(var6));
        }
        arg4.field5661 = arg0;
        return arg4;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIIZ)Ljagdx/IDirect3DSurface;", line = 231)
    public final IDirect3DSurface method2476(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        IDirect3DSurface var7 = new IDirect3DSurface(this.field5659);
        int var8 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, var7);
        if (class451.method2481(-2147467259, var8)) {
            throw new class450(String.valueOf(var8));
        }
        return var7;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "()Ljagdx/IDirect3DSurface;", line = 244)
    public final IDirect3DSurface method2477() {
        IDirect3DSurface var1 = new IDirect3DSurface(this.field5659);
        int var2 = this._GetDepthStencilSurface(var1);
        if (class451.method2481(-2147467259, var2)) {
            throw new class450(String.valueOf(var2));
        }
        return var1;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)Ljagdx/IDirect3DVertexDeclaration;", line = 265)
    public final IDirect3DVertexDeclaration method2478(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1) {
        if (arg1 == null) {
            arg1 = new IDirect3DVertexDeclaration(this.field5659);
        } else {
            arg1.method3542(92);
        }
        int var3 = this._CreateVertexDeclaration(arg0, arg1);
        if (class451.method2481(-2147467259, var3)) {
            throw new class450(String.valueOf(var3));
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "TestCooperativeLevel", descriptor = "()I")
    public final native int TestCooperativeLevel();

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStateb", descriptor = "(IZ)I")
    private final native int SetRenderStateb(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Reset", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;)I")
    public final native int Reset(D3DPRESENT_PARAMETERS arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexDeclaration", descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)I")
    private final native int _CreateVertexDeclaration(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVolumeTexture", descriptor = "(IIIIIIILjagdx/IDirect3DVolumeTexture;)I")
    public final native int _CreateVolumeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, IDirect3DVolumeTexture arg7);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetStreamSource", descriptor = "(ILjagdx/IDirect3DVertexBuffer;II)I")
    public final native int SetStreamSource(int arg0, IDirect3DVertexBuffer arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShaderConstantF", descriptor = "(I[FI)I")
    public final native int SetVertexShaderConstantF(int arg0, float[] arg1, int arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetScissorRect", descriptor = "(IIII)I")
    public final native int SetScissorRect(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTexture", descriptor = "(ILjagdx/IDirect3DBaseTexture;)I")
    public final native int SetTexture(int arg0, IDirect3DBaseTexture arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTextureStageState", descriptor = "(III)I")
    public final native int SetTextureStageState(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateTexture", descriptor = "(IIIIIILjagdx/IDirect3DTexture;)I")
    public final native int _CreateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IDirect3DTexture arg6);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetFVF", descriptor = "(I)I")
    public final native int SetFVF(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTransform", descriptor = "(I[F)I")
    public final native int SetTransform(int arg0, float[] arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "BeginScene", descriptor = "()I")
    public final native int BeginScene();

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateRenderTarget", descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I")
    private final native int _CreateRenderTarget(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShader", descriptor = "(Ljagdx/IDirect3DVertexShader;)I")
    public final native int SetVertexShader(IDirect3DVertexShader arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "LightEnable", descriptor = "(IZ)Z")
    public final native boolean LightEnable(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetDepthStencilSurface", descriptor = "(Ljagdx/IDirect3DSurface;)I")
    private final native int _GetDepthStencilSurface(IDirect3DSurface arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetSamplerState", descriptor = "(III)I")
    public final native int SetSamplerState(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetBackBuffer", descriptor = "(IIILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, int arg2, IDirect3DSurface arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateOffscreenPlainSurface", descriptor = "(IIIILjagdx/IDirect3DSurface;)I")
    private final native int _CreateOffscreenPlainSurface(int arg0, int arg1, int arg2, int arg3, IDirect3DSurface arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetViewport", descriptor = "(IIIIFF)I")
    public final native int SetViewport(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateCubeTexture", descriptor = "(IIIIILjagdx/IDirect3DCubeTexture;)I")
    public final native int _CreateCubeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DCubeTexture arg5);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexBuffer", descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)I")
    private final native int _CreateVertexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Clear", descriptor = "(IIFI)I")
    public final native int Clear(int arg0, int arg1, float arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "EndScene", descriptor = "()I")
    public final native int EndScene();

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetLight", descriptor = "(ILjagdx/D3DLIGHT;)I")
    public final native int SetLight(int arg0, class452 arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateEventQuery", descriptor = "(Ljagdx/IDirect3DEventQuery;)I")
    private final native int _CreateEventQuery(IDirect3DEventQuery arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetRenderTarget", descriptor = "(ILjagdx/IDirect3DSurface;)I")
    private final native int _GetRenderTarget(int arg0, IDirect3DSurface arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetIndices", descriptor = "(Ljagdx/IDirect3DIndexBuffer;)I")
    public final native int SetIndices(IDirect3DIndexBuffer arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawPrimitive", descriptor = "(III)I")
    public final native int DrawPrimitive(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStatef", descriptor = "(IF)I")
    private final native int SetRenderStatef(int arg0, float arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "StretchRect", descriptor = "(Ljagdx/IDirect3DSurface;IIIILjagdx/IDirect3DSurface;IIIII)I")
    public final native int StretchRect(IDirect3DSurface arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DSurface arg5, int arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateDepthStencilSurface", descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I")
    private final native int _CreateDepthStencilSurface(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexDeclaration", descriptor = "(Ljagdx/IDirect3DVertexDeclaration;)I")
    public final native int SetVertexDeclaration(IDirect3DVertexDeclaration arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateIndexBuffer", descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)I")
    private final native int _CreateIndexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexShader", descriptor = "([BLjagdx/IDirect3DVertexShader;)I")
    public final native int _CreateVertexShader(byte[] arg0, IDirect3DVertexShader arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetSwapChain", descriptor = "(ILjagdx/IDirect3DSwapChain;)I")
    private final native int _GetSwapChain(int arg0, IDirect3DSwapChain arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderState", descriptor = "(II)I")
    public final native int SetRenderState(int arg0, int arg1);

    @OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawIndexedPrimitive", descriptor = "(IIIIII)I")
    public final native int DrawIndexedPrimitive(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
