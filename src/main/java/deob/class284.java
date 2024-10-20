package deob;

@ObfuscatedName("kx")
public class class284 extends class291 {

    @ObfuscatedName("kx.aq")
    public class425 field3002;

    @ObfuscatedName("kx.ad")
    public float[] field3003 = new float[3];

    public class284(class425 arg0) {
        this.field3002 = arg0;
    }

    @ObfuscatedName("kx.aq(Lkt;IIIIJ)V")
    public void method4849(class286 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method5176(arg1, this.field3002, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("kx.ad(Lkq;Llt;IIII)V")
    public void method4841(class283 arg0, class297 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = arg3 << 7;
        int var8;
        int var9 = var8 = arg4 << 7;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2973[arg2][arg3][arg4];
        int var15 = arg0.field2973[arg2][arg3 + 1][arg4];
        int var16 = arg0.field2973[arg2][arg3 + 1][arg4 + 1];
        int var17 = arg0.field2973[arg2][arg3][arg4 + 1];
        this.field3002.method7137((float) var7, (float) var14, (float) var9, this.field3003);
        int var18 = (int) this.field3003[0];
        int var19 = (int) this.field3003[1];
        int var20 = (int) this.field3003[2] | 0x1;
        this.field3002.method7137((float) var11, (float) var15, (float) var8, this.field3003);
        int var21 = (int) this.field3003[0];
        int var22 = (int) this.field3003[1];
        int var23 = (int) this.field3003[2] | 0x1;
        this.field3002.method7137((float) var10, (float) var16, (float) var13, this.field3003);
        int var24 = (int) this.field3003[0];
        int var25 = (int) this.field3003[1];
        int var26 = (int) this.field3003[2] | 0x1;
        this.field3002.method7137((float) var6, (float) var17, (float) var12, this.field3003);
        int var27 = (int) this.field3003[0];
        int var28 = (int) this.field3003[1];
        int var29 = (int) this.field3003[2] | 0x1;
        this.method5219(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
    }

    @ObfuscatedName("kx.ag(Lkq;Llw;IIB)V")
    public void method4843(class283 arg0, class292 arg1, int arg2, int arg3) {
        int var5 = arg1.field3079.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field3079[var6];
            int var8 = arg1.field3058[var6];
            int var9 = arg1.field3057[var6];
            this.field3002.method7137((float) var7, (float) var8, (float) var9, this.field3003);
            int var10 = (int) this.field3003[0];
            int var11 = (int) this.field3003[1];
            int var12 = (int) this.field3003[2];
            if (arg1.field3059 != null) {
                class292.field3064[var6] = var10;
                class292.field3076[var6] = var11;
                class292.field3077[var6] = var12;
            }
            int var13 = var12 | 0x1;
            class292.field3066[var6] = class278.method4763() + var10 * class278.method4769() / var13;
            class292.field3074[var6] = class278.method4758() + var11 * class278.method4769() / var13;
            class292.field3073[var6] = class293.method6536(var13);
        }
        this.method5224(arg0, arg1, arg2, arg3);
    }
}
