package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class701;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DDevice")
public class IDirect3DDevice extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "Ljaclib/peer/ia;"
   )
   private class701 field7496;
   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "c",
      descriptor = "[F"
   )
   private static float[] field7495 = new float[4];

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(I)Ljagdx/IDirect3DSurface;",
      line = 7
   )
   public final IDirect3DSurface method3773(int arg0) {
      IDirect3DSurface var2 = new IDirect3DSurface(this.field7496);
      int var3 = this._GetRenderTarget(arg0, var2);
      if (class508.method3767(var3, false)) {
         throw new class509(String.valueOf(var3));
      } else {
         return var2;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "<init>",
      descriptor = "(Ljaclib/peer/ia;)V",
      line = 19
   )
   public IDirect3DDevice(class701 arg0) {
      super(arg0);
      this.field7496 = arg0;
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "(I)Ljagdx/IDirect3DSwapChain;",
      line = 35
   )
   public final IDirect3DSwapChain method3774(int arg0) {
      IDirect3DSwapChain var2 = new IDirect3DSwapChain(this.field7496);
      int var3 = this._GetSwapChain(arg0, var2);
      if (!class508.method3767(var3, false)) {
         return var2;
      } else {
         throw new class509(String.valueOf(var3));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIII)Ljagdx/IDirect3DCubeTexture;",
      line = 53
   )
   public final IDirect3DCubeTexture method3775(int arg0, int arg1, int arg2, int arg3, int arg4) {
      IDirect3DCubeTexture var6 = new IDirect3DCubeTexture(this.field7496);
      int var7 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, var6);
      if (class508.method3767(var7, false)) {
         throw new class509(String.valueOf(var7));
      } else {
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(I[F)I",
      line = 70
   )
   public final int method3776(int arg0, float[] arg1) {
      return this.SetVertexShaderConstantF(arg0, arg1, arg1.length / 4);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IFFFF)I",
      line = 77
   )
   public final int method3777(int arg0, float arg1, float arg2, float arg3, float arg4) {
      field7495[0] = arg1;
      field7495[2] = arg3;
      field7495[3] = arg4;
      field7495[1] = arg2;
      return this.SetPixelShaderConstantF(arg0, field7495, 1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IZ)I",
      line = 92
   )
   public final int method3778(int arg0, boolean arg1) {
      return this.SetRenderStateb(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "c",
      descriptor = "()Ljagdx/IDirect3DEventQuery;",
      line = 101
   )
   public final IDirect3DEventQuery method3779() {
      IDirect3DEventQuery var1 = new IDirect3DEventQuery(this.field7496);
      if (class508.method3766(this._CreateEventQuery(var1), (byte)-44)) {
         return !var1.method5100((byte)97) ? null : var1;
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "([B)Ljagdx/IDirect3DPixelShader;",
      line = 116
   )
   public final IDirect3DPixelShader method3780(byte[] arg0) {
      if (arg0 == null) {
         return null;
      } else {
         IDirect3DPixelShader var2 = new IDirect3DPixelShader(this.field7496);
         int var3 = this._CreatePixelShader(arg0, var2);
         if (class508.method3767(var3, false)) {
            throw new class509(String.valueOf(var3));
         } else {
            return var2;
         }
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "(IFFFF)I",
      line = 133
   )
   public final int method3781(int arg0, float arg1, float arg2, float arg3, float arg4) {
      field7495[0] = arg1;
      field7495[1] = arg2;
      field7495[3] = arg4;
      field7495[2] = arg3;
      return this.SetVertexShaderConstantF(arg0, field7495, 1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)Ljagdx/IDirect3DIndexBuffer;",
      line = 144
   )
   public final IDirect3DIndexBuffer method3782(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4) {
      if (arg4 == null) {
         arg4 = new IDirect3DIndexBuffer(this.field7496);
      } else {
         arg4.method5106(true);
      }

      int var6 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4);
      if (class508.method3767(var6, false)) {
         throw new class509(String.valueOf(var6));
      } else {
         return arg4;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "([B)Ljagdx/IDirect3DVertexShader;",
      line = 166
   )
   public final IDirect3DVertexShader method3783(byte[] arg0) {
      if (arg0 == null) {
         return null;
      } else {
         IDirect3DVertexShader var2 = new IDirect3DVertexShader(this.field7496);
         int var3 = this._CreateVertexShader(arg0, var2);
         if (!class508.method3767(var3, false)) {
            return var2;
         } else {
            throw new class509(String.valueOf(var3));
         }
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)Ljagdx/IDirect3DVertexDeclaration;",
      line = 195
   )
   public final IDirect3DVertexDeclaration method3784(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1) {
      if (arg1 != null) {
         arg1.method5106(true);
      } else {
         arg1 = new IDirect3DVertexDeclaration(this.field7496);
      }

      int var3 = this._CreateVertexDeclaration(arg0, arg1);
      if (!class508.method3767(var3, false)) {
         return arg1;
      } else {
         throw new class509(String.valueOf(var3));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IF)I",
      line = 213
   )
   public final int method3785(int arg0, float arg1) {
      return this.SetRenderStatef(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIIII)Ljagdx/IDirect3DVolumeTexture;",
      line = 222
   )
   public final IDirect3DVolumeTexture method3786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      IDirect3DVolumeTexture var8 = new IDirect3DVolumeTexture(this.field7496);
      int var9 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, var8);
      if (class508.method3767(var9, false)) {
         throw new class509(String.valueOf(var9));
      } else {
         return var8;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "()Ljagdx/IDirect3DSurface;",
      line = 243
   )
   public final IDirect3DSurface method3787() {
      IDirect3DSurface var1 = new IDirect3DSurface(this.field7496);
      int var2 = this._GetDepthStencilSurface(var1);
      if (class508.method3767(var2, false)) {
         throw new class509(String.valueOf(var2));
      } else {
         return var1;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIIZ)Ljagdx/IDirect3DSurface;",
      line = 256
   )
   public final IDirect3DSurface method3788(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      IDirect3DSurface var7 = new IDirect3DSurface(this.field7496);
      int var8 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, var7);
      if (!class508.method3767(var8, false)) {
         return var7;
      } else {
         throw new class509(String.valueOf(var8));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)Ljagdx/IDirect3DVertexBuffer;",
      line = 274
   )
   public final IDirect3DVertexBuffer method3789(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4) {
      if (arg4 == null) {
         arg4 = new IDirect3DVertexBuffer(this.field7496);
      } else {
         arg4.method5106(true);
      }

      int var6 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4);
      if (!class508.method3767(var6, false)) {
         arg4.field7498 = arg0;
         return arg4;
      } else {
         throw new class509(String.valueOf(var6));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIII)Ljagdx/IDirect3DTexture;",
      line = 305
   )
   public final IDirect3DTexture method3790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      IDirect3DTexture var7 = new IDirect3DTexture(this.field7496);
      int var8 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, var7);
      if (!class508.method3767(var8, false)) {
         return var7;
      } else {
         throw new class509(String.valueOf(var8));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "DrawIndexedPrimitive",
      descriptor = "(IIIIII)I"
   )
   public final native int DrawIndexedPrimitive(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetPixelShader",
      descriptor = "(Ljagdx/IDirect3DPixelShader;)I"
   )
   public final native int SetPixelShader(IDirect3DPixelShader arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateOffscreenPlainSurface",
      descriptor = "(IIIILjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateOffscreenPlainSurface(int arg0, int arg1, int arg2, int arg3, IDirect3DSurface arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderStateb",
      descriptor = "(IZ)I"
   )
   private final native int SetRenderStateb(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetDepthStencilSurface",
      descriptor = "(Ljagdx/IDirect3DSurface;)I"
   )
   private final native int _GetDepthStencilSurface(IDirect3DSurface arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetViewport",
      descriptor = "(IIIIFF)I"
   )
   public final native int SetViewport(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateTexture",
      descriptor = "(IIIIIILjagdx/IDirect3DTexture;)I"
   )
   public final native int _CreateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IDirect3DTexture arg6);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "EndScene",
      descriptor = "()I"
   )
   public final native int EndScene();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetScissorRect",
      descriptor = "(IIII)I"
   )
   public final native int SetScissorRect(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetStreamSource",
      descriptor = "(ILjagdx/IDirect3DVertexBuffer;II)I"
   )
   public final native int SetStreamSource(int arg0, IDirect3DVertexBuffer arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "TestCooperativeLevel",
      descriptor = "()I"
   )
   public final native int TestCooperativeLevel();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "DrawPrimitive",
      descriptor = "(III)I"
   )
   public final native int DrawPrimitive(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetSwapChain",
      descriptor = "(ILjagdx/IDirect3DSwapChain;)I"
   )
   private final native int _GetSwapChain(int arg0, IDirect3DSwapChain arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetPixelShaderConstantF",
      descriptor = "(I[FI)I"
   )
   public final native int SetPixelShaderConstantF(int arg0, float[] arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetIndices",
      descriptor = "(Ljagdx/IDirect3DIndexBuffer;)I"
   )
   public final native int SetIndices(IDirect3DIndexBuffer arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetLight",
      descriptor = "(ILjagdx/D3DLIGHT;)I"
   )
   public final native int SetLight(int arg0, class510 arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexShader",
      descriptor = "(Ljagdx/IDirect3DVertexShader;)I"
   )
   public final native int SetVertexShader(IDirect3DVertexShader arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "Clear",
      descriptor = "(IIFI)I"
   )
   public final native int Clear(int arg0, int arg1, float arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateIndexBuffer",
      descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)I"
   )
   private final native int _CreateIndexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetRenderTarget",
      descriptor = "(ILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetRenderTarget(int arg0, IDirect3DSurface arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateEventQuery",
      descriptor = "(Ljagdx/IDirect3DEventQuery;)I"
   )
   private final native int _CreateEventQuery(IDirect3DEventQuery arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTextureStageState",
      descriptor = "(III)I"
   )
   public final native int SetTextureStageState(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexShaderConstantF",
      descriptor = "(I[FI)I"
   )
   public final native int SetVertexShaderConstantF(int arg0, float[] arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderStatef",
      descriptor = "(IF)I"
   )
   private final native int SetRenderStatef(int arg0, float arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetFVF",
      descriptor = "(I)I"
   )
   public final native int SetFVF(int arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTexture",
      descriptor = "(ILjagdx/IDirect3DBaseTexture;)I"
   )
   public final native int SetTexture(int arg0, IDirect3DBaseTexture arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVolumeTexture",
      descriptor = "(IIIIIIILjagdx/IDirect3DVolumeTexture;)I"
   )
   public final native int _CreateVolumeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, IDirect3DVolumeTexture arg7);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "StretchRect",
      descriptor = "(Ljagdx/IDirect3DSurface;IIIILjagdx/IDirect3DSurface;IIIII)I"
   )
   public final native int StretchRect(IDirect3DSurface arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DSurface arg5, int arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "LightEnable",
      descriptor = "(IZ)Z"
   )
   public final native boolean LightEnable(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "BeginScene",
      descriptor = "()I"
   )
   public final native int BeginScene();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreatePixelShader",
      descriptor = "([BLjagdx/IDirect3DPixelShader;)I"
   )
   public final native int _CreatePixelShader(byte[] arg0, IDirect3DPixelShader arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderState",
      descriptor = "(II)I"
   )
   public final native int SetRenderState(int arg0, int arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateDepthStencilSurface",
      descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateDepthStencilSurface(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexDeclaration",
      descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)I"
   )
   private final native int _CreateVertexDeclaration(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexDeclaration",
      descriptor = "(Ljagdx/IDirect3DVertexDeclaration;)I"
   )
   public final native int SetVertexDeclaration(IDirect3DVertexDeclaration arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexShader",
      descriptor = "([BLjagdx/IDirect3DVertexShader;)I"
   )
   public final native int _CreateVertexShader(byte[] arg0, IDirect3DVertexShader arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateCubeTexture",
      descriptor = "(IIIIILjagdx/IDirect3DCubeTexture;)I"
   )
   public final native int _CreateCubeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DCubeTexture arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetBackBuffer",
      descriptor = "(IIILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetBackBuffer(int arg0, int arg1, int arg2, IDirect3DSurface arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTransform",
      descriptor = "(I[F)I"
   )
   public final native int SetTransform(int arg0, float[] arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexBuffer",
      descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)I"
   )
   private final native int _CreateVertexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "Reset",
      descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;)I"
   )
   public final native int Reset(D3DPRESENT_PARAMETERS arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetSamplerState",
      descriptor = "(III)I"
   )
   public final native int SetSamplerState(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateRenderTarget",
      descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateRenderTarget(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);
}
