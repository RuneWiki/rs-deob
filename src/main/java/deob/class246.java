package deob;

@ObfuscatedName("ja")
public class class246 extends class253 {

    @ObfuscatedName("ja.ac")
    public class428 field2727;

    @ObfuscatedName("ja.ae")
    public float[] field2725 = new float[3];

    public class246(class428 arg0) {
        this.field2727 = arg0;
    }

    @ObfuscatedName("ja.ac(Lju;IIIIJ)V")
    public void method4418(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4737(arg1, this.field2727, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ja.ae(Ljh;Ljl;IIII)V")
    public void method4419(class245 arg0, class259 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = arg3 << 7;
        int var8;
        int var9 = var8 = arg4 << 7;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2640[arg2][arg3][arg4];
        int var15 = arg0.field2640[arg2][arg3 + 1][arg4];
        int var16 = arg0.field2640[arg2][arg3 + 1][arg4 + 1];
        int var17 = arg0.field2640[arg2][arg3][arg4 + 1];
        this.field2727.method7414((float) var7, (float) var14, (float) var9, this.field2725);
        int var18 = (int) this.field2725[0];
        int var19 = (int) this.field2725[1];
        int var20 = (int) this.field2725[2] | 0x1;
        this.field2727.method7414((float) var11, (float) var15, (float) var8, this.field2725);
        int var21 = (int) this.field2725[0];
        int var22 = (int) this.field2725[1];
        int var23 = (int) this.field2725[2] | 0x1;
        this.field2727.method7414((float) var10, (float) var16, (float) var13, this.field2725);
        int var24 = (int) this.field2725[0];
        int var25 = (int) this.field2725[1];
        int var26 = (int) this.field2725[2] | 0x1;
        this.field2727.method7414((float) var6, (float) var17, (float) var12, this.field2725);
        int var27 = (int) this.field2725[0];
        int var28 = (int) this.field2725[1];
        int var29 = (int) this.field2725[2] | 0x1;
        this.method4783(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
    }

    @ObfuscatedName("ja.ag(Ljh;Ljb;III)V")
    public void method4417(class245 arg0, class254 arg1, int arg2, int arg3) {
        int var5 = arg1.field2775.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2775[var6];
            int var8 = arg1.field2788[var6];
            int var9 = arg1.field2786[var6];
            this.field2727.method7414((float) var7, (float) var8, (float) var9, this.field2725);
            int var10 = (int) this.field2725[0];
            int var11 = (int) this.field2725[1];
            int var12 = (int) this.field2725[2];
            if (arg1.field2780 != null) {
                class254.field2789[var6] = var10;
                class254.field2790[var6] = var11;
                class254.field2792[var6] = var12;
            }
            int var13 = var12 | 0x1;
            class254.field2771[var6] = class240.method4391() + var10 * class240.method4339() / var13;
            class254.field2787[var6] = class240.method4341() + var11 * class240.method4339() / var13;
            class254.field2785[var6] = class255.method3204(var13);
        }
        this.method4784(arg0, arg1, arg2, arg3);
    }
}
