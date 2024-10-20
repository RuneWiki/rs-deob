package deob;

@ObfuscatedName("jo")
public class class241 extends class253 {

    @ObfuscatedName("jo.ac")
    public int field2604;

    @ObfuscatedName("jo.ae")
    public int field2595;

    @ObfuscatedName("jo.ag")
    public int field2596;

    @ObfuscatedName("jo.am")
    public int field2594;

    @ObfuscatedName("jo.ax")
    public int field2598;

    @ObfuscatedName("jo.aq")
    public int field2599;

    @ObfuscatedName("jo.af")
    public int field2605;

    @ObfuscatedName("jo.at")
    public int field2601;

    @ObfuscatedName("jo.au")
    public int field2600;

    @ObfuscatedName("jo.ar")
    public int field2602;

    @ObfuscatedName("jo.al")
    public int field2597;

    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2604 = arg0;
        this.field2595 = arg1;
        this.field2596 = arg2;
        this.field2594 = arg3;
        this.field2598 = arg4;
        this.field2599 = class240.field2590[arg3];
        this.field2605 = class240.field2588[arg3];
        this.field2601 = class240.field2590[arg4];
        this.field2600 = class240.field2588[arg4];
        this.field2602 = arg5;
        this.field2597 = arg6;
    }

    @ObfuscatedName("jo.ac(Lju;IIIIJ)V")
    public void method4418(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4690(arg1, this.field2594, this.field2598, arg2, arg3, arg4, this.field2604, this.field2595, this.field2596, arg5, this.field2602, this.field2597, false);
    }

    @ObfuscatedName("jo.ae(Ljh;Ljl;IIII)V")
    public void method4419(class245 arg0, class259 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = (arg3 << 7) - this.field2604;
        int var8;
        int var9 = var8 = (arg4 << 7) - this.field2596;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2640[arg2][arg3][arg4] - this.field2595;
        int var15 = arg0.field2640[arg2][arg3 + 1][arg4] - this.field2595;
        int var16 = arg0.field2640[arg2][arg3 + 1][arg4 + 1] - this.field2595;
        int var17 = arg0.field2640[arg2][arg3][arg4 + 1] - this.field2595;
        int var18 = this.field2601 * var9 + this.field2600 * var7 >> 16;
        int var19 = this.field2600 * var9 - this.field2601 * var7 >> 16;
        int var21 = this.field2605 * var14 - this.field2599 * var19 >> 16;
        int var22 = this.field2605 * var19 + this.field2599 * var14 >> 16;
        if (var22 < 50) {
            return;
        }
        int var24 = this.field2601 * var8 + this.field2600 * var11 >> 16;
        int var25 = this.field2600 * var8 - this.field2601 * var11 >> 16;
        int var27 = this.field2605 * var15 - this.field2599 * var25 >> 16;
        int var28 = this.field2605 * var25 + this.field2599 * var15 >> 16;
        if (var28 < 50) {
            return;
        }
        int var30 = this.field2601 * var13 + this.field2600 * var10 >> 16;
        int var31 = this.field2600 * var13 - this.field2601 * var10 >> 16;
        int var33 = this.field2605 * var16 - this.field2599 * var31 >> 16;
        int var34 = this.field2605 * var31 + this.field2599 * var16 >> 16;
        if (var34 < 50) {
            return;
        }
        int var36 = this.field2601 * var12 + this.field2600 * var6 >> 16;
        int var37 = this.field2600 * var12 - this.field2601 * var6 >> 16;
        int var39 = this.field2605 * var17 - this.field2599 * var37 >> 16;
        int var40 = this.field2605 * var37 + this.field2599 * var17 >> 16;
        if (var40 >= 50) {
            this.method4783(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
        }
    }

    @ObfuscatedName("jo.ag(Ljh;Ljb;III)V")
    public void method4417(class245 arg0, class254 arg1, int arg2, int arg3) {
        int var5 = arg1.field2775.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2775[var6] - this.field2604;
            int var8 = arg1.field2788[var6] - this.field2595;
            int var9 = arg1.field2786[var6] - this.field2596;
            int var10 = this.field2601 * var9 + this.field2600 * var7 >> 16;
            int var11 = this.field2600 * var9 - this.field2601 * var7 >> 16;
            int var13 = this.field2605 * var8 - this.field2599 * var11 >> 16;
            int var14 = this.field2605 * var11 + this.field2599 * var8 >> 16;
            if (var14 < 50) {
                return;
            }
            if (arg1.field2780 != null) {
                class254.field2789[var6] = var10;
                class254.field2790[var6] = var13;
                class254.field2792[var6] = var14;
            }
            class254.field2771[var6] = class240.method4391() + var10 * class240.method4339() / var14;
            class254.field2787[var6] = class240.method4341() + var13 * class240.method4339() / var14;
            class254.field2785[var6] = class255.method3204(var14);
        }
        this.method4784(arg0, arg1, arg2, arg3);
    }
}
