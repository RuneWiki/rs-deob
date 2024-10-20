package deob;

@ObfuscatedName("jq")
public class class241 extends class253 {

    @ObfuscatedName("jq.ap")
    public int field2599;

    @ObfuscatedName("jq.aw")
    public int field2598;

    @ObfuscatedName("jq.ak")
    public int field2606;

    @ObfuscatedName("jq.aj")
    public int field2600;

    @ObfuscatedName("jq.ai")
    public int field2602;

    @ObfuscatedName("jq.ay")
    public int field2603;

    @ObfuscatedName("jq.as")
    public int field2604;

    @ObfuscatedName("jq.ae")
    public int field2605;

    @ObfuscatedName("jq.am")
    public int field2608;

    @ObfuscatedName("jq.at")
    public int field2607;

    @ObfuscatedName("jq.au")
    public int field2601;

    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2599 = arg0;
        this.field2598 = arg1;
        this.field2606 = arg2;
        this.field2600 = arg3;
        this.field2602 = arg4;
        this.field2603 = class240.field2591[arg3];
        this.field2604 = class240.field2592[arg3];
        this.field2605 = class240.field2591[arg4];
        this.field2608 = class240.field2592[arg4];
        this.field2607 = arg5;
        this.field2601 = arg6;
    }

    @ObfuscatedName("jq.ap(Ljv;IIIIJ)V")
    public void method4586(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4784(arg1, this.field2600, this.field2602, arg2, arg3, arg4, this.field2599, this.field2598, this.field2606, arg5, this.field2607, this.field2601, false);
    }

    @ObfuscatedName("jq.aw(Lji;Ljp;IIII)V")
    public void method4593(class245 arg0, class259 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = (arg3 << 7) - this.field2599;
        int var8;
        int var9 = var8 = (arg4 << 7) - this.field2606;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2675[arg2][arg3][arg4] - this.field2598;
        int var15 = arg0.field2675[arg2][arg3 + 1][arg4] - this.field2598;
        int var16 = arg0.field2675[arg2][arg3 + 1][arg4 + 1] - this.field2598;
        int var17 = arg0.field2675[arg2][arg3][arg4 + 1] - this.field2598;
        int var18 = this.field2608 * var7 + this.field2605 * var9 >> 16;
        int var19 = this.field2608 * var9 - this.field2605 * var7 >> 16;
        int var21 = this.field2604 * var14 - this.field2603 * var19 >> 16;
        int var22 = this.field2604 * var19 + this.field2603 * var14 >> 16;
        if (var22 < 50) {
            return;
        }
        int var24 = this.field2608 * var11 + this.field2605 * var8 >> 16;
        int var25 = this.field2608 * var8 - this.field2605 * var11 >> 16;
        int var27 = this.field2604 * var15 - this.field2603 * var25 >> 16;
        int var28 = this.field2604 * var25 + this.field2603 * var15 >> 16;
        if (var28 < 50) {
            return;
        }
        int var30 = this.field2608 * var10 + this.field2605 * var13 >> 16;
        int var31 = this.field2608 * var13 - this.field2605 * var10 >> 16;
        int var33 = this.field2604 * var16 - this.field2603 * var31 >> 16;
        int var34 = this.field2604 * var31 + this.field2603 * var16 >> 16;
        if (var34 < 50) {
            return;
        }
        int var36 = this.field2608 * var6 + this.field2605 * var12 >> 16;
        int var37 = this.field2608 * var12 - this.field2605 * var6 >> 16;
        int var39 = this.field2604 * var17 - this.field2603 * var37 >> 16;
        int var40 = this.field2604 * var37 + this.field2603 * var17 >> 16;
        if (var40 >= 50) {
            this.method4977(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
        }
    }

    @ObfuscatedName("jq.ak(Lji;Ljs;IIB)V")
    public void method4587(class245 arg0, class254 arg1, int arg2, int arg3) {
        int var5 = arg1.field2797.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2797[var6] - this.field2599;
            int var8 = arg1.field2803[var6] - this.field2598;
            int var9 = arg1.field2805[var6] - this.field2606;
            int var10 = this.field2608 * var7 + this.field2605 * var9 >> 16;
            int var11 = this.field2608 * var9 - this.field2605 * var7 >> 16;
            int var13 = this.field2604 * var8 - this.field2603 * var11 >> 16;
            int var14 = this.field2604 * var11 + this.field2603 * var8 >> 16;
            if (var14 < 50) {
                return;
            }
            if (arg1.field2793 != null) {
                class254.field2802[var6] = var10;
                class254.field2800[var6] = var13;
                class254.field2804[var6] = var14;
            }
            class254.field2799[var6] = class240.method4498() + var10 * class240.method4504() / var14;
            class254.field2785[var6] = class240.method4499() + var13 * class240.method4504() / var14;
            class254.field2801[var6] = class255.method3791(var14);
        }
        this.method4978(arg0, arg1, arg2, arg3);
    }
}
