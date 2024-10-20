package deob;

@ObfuscatedName("jc")
public class class246 extends class253 {

    @ObfuscatedName("jc.ap")
    public class429 field2736;

    @ObfuscatedName("jc.aw")
    public float[] field2733 = new float[3];

    public class246(class429 arg0) {
        this.field2736 = arg0;
    }

    @ObfuscatedName("jc.ap(Ljv;IIIIJ)V")
    public void method4586(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4934(arg1, this.field2736, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("jc.aw(Lji;Ljp;IIII)V")
    public void method4593(class245 arg0, class259 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = arg3 << 7;
        int var8;
        int var9 = var8 = arg4 << 7;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2675[arg2][arg3][arg4];
        int var15 = arg0.field2675[arg2][arg3 + 1][arg4];
        int var16 = arg0.field2675[arg2][arg3 + 1][arg4 + 1];
        int var17 = arg0.field2675[arg2][arg3][arg4 + 1];
        this.field2736.method7686((float) var7, (float) var14, (float) var9, this.field2733);
        int var18 = (int) this.field2733[0];
        int var19 = (int) this.field2733[1];
        int var20 = (int) this.field2733[2] | 0x1;
        this.field2736.method7686((float) var11, (float) var15, (float) var8, this.field2733);
        int var21 = (int) this.field2733[0];
        int var22 = (int) this.field2733[1];
        int var23 = (int) this.field2733[2] | 0x1;
        this.field2736.method7686((float) var10, (float) var16, (float) var13, this.field2733);
        int var24 = (int) this.field2733[0];
        int var25 = (int) this.field2733[1];
        int var26 = (int) this.field2733[2] | 0x1;
        this.field2736.method7686((float) var6, (float) var17, (float) var12, this.field2733);
        int var27 = (int) this.field2733[0];
        int var28 = (int) this.field2733[1];
        int var29 = (int) this.field2733[2] | 0x1;
        this.method4977(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
    }

    @ObfuscatedName("jc.ak(Lji;Ljs;IIB)V")
    public void method4587(class245 arg0, class254 arg1, int arg2, int arg3) {
        int var5 = arg1.field2797.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2797[var6];
            int var8 = arg1.field2803[var6];
            int var9 = arg1.field2805[var6];
            this.field2736.method7686((float) var7, (float) var8, (float) var9, this.field2733);
            int var10 = (int) this.field2733[0];
            int var11 = (int) this.field2733[1];
            int var12 = (int) this.field2733[2];
            if (arg1.field2793 != null) {
                class254.field2802[var6] = var10;
                class254.field2800[var6] = var11;
                class254.field2804[var6] = var12;
            }
            int var13 = var12 | 0x1;
            class254.field2799[var6] = class240.method4498() + var10 * class240.method4504() / var13;
            class254.field2785[var6] = class240.method4499() + var11 * class240.method4504() / var13;
            class254.field2801[var6] = class255.method3791(var13);
        }
        this.method4978(arg0, arg1, arg2, arg3);
    }
}
