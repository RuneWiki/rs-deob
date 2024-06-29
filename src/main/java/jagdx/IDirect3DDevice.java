package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class709;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DDevice")
public class IDirect3DDevice extends IUnknown {
   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "c",
      descriptor = "Ljaclib/peer/jv;"
   )
   private class709 field938;
   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "[F"
   )
   private static float[] field939 = new float[4];

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIII)Ljagdx/IDirect3DTexture;"
   )
   public final IDirect3DTexture method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      IDirect3DTexture var7 = new IDirect3DTexture(this.field938);
      int var8 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, var7);
      if (class71.method549(var8, 41)) {
         throw new class73(String.valueOf(var8));
      } else {
         return var7;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method562(int arg0, boolean arg1) {
      return this.SetRenderStateb(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "BeginScene",
      descriptor = "()I"
   )
   public final native int BeginScene();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetStreamSource",
      descriptor = "(ILjagdx/IDirect3DVertexBuffer;II)I"
   )
   public final native int SetStreamSource(int arg0, IDirect3DVertexBuffer arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(I[F)I"
   )
   public final int method563(int arg0, float[] arg1) {
      return this.SetVertexShaderConstantF(arg0, arg1, arg1.length / 4);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIIZ)Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method564(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      IDirect3DSurface var7 = new IDirect3DSurface(this.field938);
      int var8 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, var7);
      if (!class71.method549(var8, 126)) {
         return var7;
      } else {
         throw new class73(String.valueOf(var8));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexShader",
      descriptor = "(Ljagdx/IDirect3DVertexShader;)I"
   )
   public final native int SetVertexShader(IDirect3DVertexShader arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetIndices",
      descriptor = "(Ljagdx/IDirect3DIndexBuffer;)I"
   )
   public final native int SetIndices(IDirect3DIndexBuffer arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "Reset",
      descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;)I"
   )
   public final native int Reset(D3DPRESENT_PARAMETERS arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexBuffer",
      descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)I"
   )
   private final native int _CreateVertexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetFVF",
      descriptor = "(I)I"
   )
   public final native int SetFVF(int arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IFFFF)I"
   )
   public final int method565(int arg0, float arg1, float arg2, float arg3, float arg4) {
      field939[3] = arg4;
      field939[2] = arg3;
      field939[0] = arg1;
      field939[1] = arg2;
      return this.SetVertexShaderConstantF(arg0, field939, 1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIII)Ljagdx/IDirect3DCubeTexture;"
   )
   public final IDirect3DCubeTexture method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
      IDirect3DCubeTexture var6 = new IDirect3DCubeTexture(this.field938);
      int var7 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, var6);
      if (class71.method549(var7, 65)) {
         throw new class73(String.valueOf(var7));
      } else {
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTexture",
      descriptor = "(ILjagdx/IDirect3DBaseTexture;)I"
   )
   public final native int SetTexture(int arg0, IDirect3DBaseTexture arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetViewport",
      descriptor = "(IIIIFF)I"
   )
   public final native int SetViewport(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateIndexBuffer",
      descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)I"
   )
   private final native int _CreateIndexBuffer(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "DrawPrimitive",
      descriptor = "(III)I"
   )
   public final native int DrawPrimitive(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderStatef",
      descriptor = "(IF)I"
   )
   private final native int SetRenderStatef(int arg0, float arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)Ljagdx/IDirect3DVertexDeclaration;"
   )
   public final IDirect3DVertexDeclaration method567(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1) {
      if (arg1 == null) {
         arg1 = new IDirect3DVertexDeclaration(this.field938);
      } else {
         arg1.method5223(-18900);
      }

      int var3 = this._CreateVertexDeclaration(arg0, arg1);
      if (class71.method549(var3, 119)) {
         throw new class73(String.valueOf(var3));
      } else {
         return arg1;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "Clear",
      descriptor = "(IIFI)I"
   )
   public final native int Clear(int arg0, int arg1, float arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateDepthStencilSurface",
      descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateDepthStencilSurface(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "DrawIndexedPrimitive",
      descriptor = "(IIIIII)I"
   )
   public final native int DrawIndexedPrimitive(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexShader",
      descriptor = "([BLjagdx/IDirect3DVertexShader;)I"
   )
   public final native int _CreateVertexShader(byte[] arg0, IDirect3DVertexShader arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVertexDeclaration",
      descriptor = "(Ljagdx/VertexElementCollection;Ljagdx/IDirect3DVertexDeclaration;)I"
   )
   private final native int _CreateVertexDeclaration(VertexElementCollection arg0, IDirect3DVertexDeclaration arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetSwapChain",
      descriptor = "(ILjagdx/IDirect3DSwapChain;)I"
   )
   private final native int _GetSwapChain(int arg0, IDirect3DSwapChain arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetScissorRect",
      descriptor = "(IIII)I"
   )
   public final native int SetScissorRect(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "<init>",
      descriptor = "(Ljaclib/peer/jv;)V"
   )
   public IDirect3DDevice(class709 arg0) {
      super(arg0);
      this.field938 = arg0;
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "EndScene",
      descriptor = "()I"
   )
   public final native int EndScene();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "TestCooperativeLevel",
      descriptor = "()I"
   )
   public final native int TestCooperativeLevel();

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetLight",
      descriptor = "(ILjagdx/D3DLIGHT;)I"
   )
   public final native int SetLight(int arg0, class72 arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreatePixelShader",
      descriptor = "([BLjagdx/IDirect3DPixelShader;)I"
   )
   public final native int _CreatePixelShader(byte[] arg0, IDirect3DPixelShader arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "d",
      descriptor = "(I)Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method568(int arg0) {
      IDirect3DSurface var2 = new IDirect3DSurface(this.field938);
      int var3 = this._GetRenderTarget(arg0, var2);
      if (!class71.method549(var3, 114)) {
         return var2;
      } else {
         throw new class73(String.valueOf(var3));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetSamplerState",
      descriptor = "(III)I"
   )
   public final native int SetSamplerState(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexDeclaration",
      descriptor = "(Ljagdx/IDirect3DVertexDeclaration;)I"
   )
   public final native int SetVertexDeclaration(IDirect3DVertexDeclaration arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetBackBuffer",
      descriptor = "(IIILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetBackBuffer(int arg0, int arg1, int arg2, IDirect3DSurface arg3);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateCubeTexture",
      descriptor = "(IIIIILjagdx/IDirect3DCubeTexture;)I"
   )
   public final native int _CreateCubeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DCubeTexture arg5);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetDepthStencilSurface",
      descriptor = "(Ljagdx/IDirect3DSurface;)I"
   )
   private final native int _GetDepthStencilSurface(IDirect3DSurface arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "LightEnable",
      descriptor = "(IZ)Z"
   )
   public final native boolean LightEnable(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTextureStageState",
      descriptor = "(III)I"
   )
   public final native int SetTextureStageState(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "c",
      descriptor = "(I)Ljagdx/IDirect3DSwapChain;"
   )
   public final IDirect3DSwapChain method569(int arg0) {
      IDirect3DSwapChain var2 = new IDirect3DSwapChain(this.field938);
      int var3 = this._GetSwapChain(arg0, var2);
      if (!class71.method549(var3, 83)) {
         return var2;
      } else {
         throw new class73(String.valueOf(var3));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetPixelShader",
      descriptor = "(Ljagdx/IDirect3DPixelShader;)I"
   )
   public final native int SetPixelShader(IDirect3DPixelShader arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetVertexShaderConstantF",
      descriptor = "(I[FI)I"
   )
   public final native int SetVertexShaderConstantF(int arg0, float[] arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateOffscreenPlainSurface",
      descriptor = "(IIIILjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateOffscreenPlainSurface(int arg0, int arg1, int arg2, int arg3, IDirect3DSurface arg4);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIIIII)Ljagdx/IDirect3DVolumeTexture;"
   )
   public final IDirect3DVolumeTexture method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      IDirect3DVolumeTexture var8 = new IDirect3DVolumeTexture(this.field938);
      int var9 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, var8);
      if (class71.method549(var9, 26)) {
         throw new class73(String.valueOf(var9));
      } else {
         return var8;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateVolumeTexture",
      descriptor = "(IIIIIIILjagdx/IDirect3DVolumeTexture;)I"
   )
   public final native int _CreateVolumeTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, IDirect3DVolumeTexture arg7);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderStateb",
      descriptor = "(IZ)I"
   )
   private final native int SetRenderStateb(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIILjagdx/IDirect3DVertexBuffer;)Ljagdx/IDirect3DVertexBuffer;"
   )
   public final IDirect3DVertexBuffer method571(int arg0, int arg1, int arg2, int arg3, IDirect3DVertexBuffer arg4) {
      if (arg4 != null) {
         arg4.method5223(-18900);
      } else {
         arg4 = new IDirect3DVertexBuffer(this.field938);
      }

      int var6 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4);
      if (!class71.method549(var6, 6)) {
         arg4.field935 = arg0;
         return arg4;
      } else {
         throw new class73(String.valueOf(var6));
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "(IFFFF)I"
   )
   public final int method572(int arg0, float arg1, float arg2, float arg3, float arg4) {
      field939[0] = arg1;
      field939[3] = arg4;
      field939[1] = arg2;
      field939[2] = arg3;
      return this.SetPixelShaderConstantF(arg0, field939, 1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "([B)Ljagdx/IDirect3DVertexShader;"
   )
   public final IDirect3DVertexShader method573(byte[] arg0) {
      if (arg0 == null) {
         return null;
      } else {
         IDirect3DVertexShader var2 = new IDirect3DVertexShader(this.field938);
         int var3 = this._CreateVertexShader(arg0, var2);
         if (class71.method549(var3, 29)) {
            throw new class73(String.valueOf(var3));
         } else {
            return var2;
         }
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateRenderTarget",
      descriptor = "(IIIIIZLjagdx/IDirect3DSurface;)I"
   )
   private final native int _CreateRenderTarget(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, IDirect3DSurface arg6);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetPixelShaderConstantF",
      descriptor = "(I[FI)I"
   )
   public final native int SetPixelShaderConstantF(int arg0, float[] arg1, int arg2);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateTexture",
      descriptor = "(IIIIIILjagdx/IDirect3DTexture;)I"
   )
   public final native int _CreateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IDirect3DTexture arg6);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "c",
      descriptor = "()Ljagdx/IDirect3DSurface;"
   )
   public final IDirect3DSurface method574() {
      IDirect3DSurface var1 = new IDirect3DSurface(this.field938);
      int var2 = this._GetDepthStencilSurface(var1);
      if (class71.method549(var2, 81)) {
         throw new class73(String.valueOf(var2));
      } else {
         return var1;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetRenderState",
      descriptor = "(II)I"
   )
   public final native int SetRenderState(int arg0, int arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "StretchRect",
      descriptor = "(Ljagdx/IDirect3DSurface;IIIILjagdx/IDirect3DSurface;IIIII)I"
   )
   public final native int StretchRect(IDirect3DSurface arg0, int arg1, int arg2, int arg3, int arg4, IDirect3DSurface arg5, int arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "([B)Ljagdx/IDirect3DPixelShader;"
   )
   public final IDirect3DPixelShader method575(byte[] arg0) {
      if (arg0 != null) {
         IDirect3DPixelShader var2 = new IDirect3DPixelShader(this.field938);
         int var3 = this._CreatePixelShader(arg0, var2);
         if (!class71.method549(var3, 74)) {
            return var2;
         } else {
            throw new class73(String.valueOf(var3));
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_CreateEventQuery",
      descriptor = "(Ljagdx/IDirect3DEventQuery;)I"
   )
   private final native int _CreateEventQuery(IDirect3DEventQuery arg0);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IIIILjagdx/IDirect3DIndexBuffer;)Ljagdx/IDirect3DIndexBuffer;"
   )
   public final IDirect3DIndexBuffer method576(int arg0, int arg1, int arg2, int arg3, IDirect3DIndexBuffer arg4) {
      if (arg4 == null) {
         arg4 = new IDirect3DIndexBuffer(this.field938);
      } else {
         arg4.method5223(-18900);
      }

      int var6 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4);
      if (class71.method549(var6, 48)) {
         throw new class73(String.valueOf(var6));
      } else {
         return arg4;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "SetTransform",
      descriptor = "(I[F)I"
   )
   public final native int SetTransform(int arg0, float[] arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method577(int arg0, float arg1) {
      return this.SetRenderStatef(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "_GetRenderTarget",
      descriptor = "(ILjagdx/IDirect3DSurface;)I"
   )
   private final native int _GetRenderTarget(int arg0, IDirect3DSurface arg1);

   @OriginalMember(
      owner = "client!jagdx/IDirect3DDevice",
      name = "b",
      descriptor = "()Ljagdx/IDirect3DEventQuery;"
   )
   public final IDirect3DEventQuery method578() {
      IDirect3DEventQuery var1 = new IDirect3DEventQuery(this.field938);
      if (!class71.method550(this._CreateEventQuery(var1), (byte)-80)) {
         return null;
      } else {
         return !var1.method5229(-1984) ? null : var1;
      }
   }
}
