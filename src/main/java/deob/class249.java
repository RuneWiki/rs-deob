package deob;

@ObfuscatedName("jg")
public class class249 extends class261 {

    @ObfuscatedName("jg.ak")
    public int field2674;

    @ObfuscatedName("jg.al")
    public int field2675;

    @ObfuscatedName("jg.aj")
    public int field2676;

    @ObfuscatedName("jg.az")
    public int field2677;

    @ObfuscatedName("jg.af")
    public int field2681;

    @ObfuscatedName("jg.aa")
    public int field2679;

    @ObfuscatedName("jg.at")
    public int field2680;

    @ObfuscatedName("jg.ab")
    public int field2678;

    @ObfuscatedName("jg.ac")
    public int field2682;

    public class249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2674 = arg0;
        this.field2675 = arg1;
        this.field2676 = arg2;
        this.field2677 = arg3;
        this.field2681 = arg4;
        this.field2679 = class248.field2665[arg3];
        this.field2680 = class248.field2669[arg3];
        this.field2678 = class248.field2665[arg4];
        this.field2682 = class248.field2669[arg4];
    }

    @ObfuscatedName("jg.ak(Lju;IIIIJ)V")
    public void method4415(class256 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4510(arg1, this.field2677, this.field2681, arg2, arg3, arg4, this.field2674, this.field2675, this.field2676, arg5);
    }

    @ObfuscatedName("jg.al(Ljy;Lkg;IIIB)V")
    public void method4414(class253 arg0, class267 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = (arg3 << 7) - this.field2674;
        int var8;
        int var9 = var8 = (arg4 << 7) - this.field2676;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2733[arg2][arg3][arg4] - this.field2675;
        int var15 = arg0.field2733[arg2][arg3 + 1][arg4] - this.field2675;
        int var16 = arg0.field2733[arg2][arg3 + 1][arg4 + 1] - this.field2675;
        int var17 = arg0.field2733[arg2][arg3][arg4 + 1] - this.field2675;
        int var18 = this.field2682 * var7 + this.field2678 * var9 >> 16;
        int var19 = this.field2682 * var9 - this.field2678 * var7 >> 16;
        int var21 = this.field2680 * var14 - this.field2679 * var19 >> 16;
        int var22 = this.field2680 * var19 + this.field2679 * var14 >> 16;
        if (var22 < 50) {
            return;
        }
        int var24 = this.field2682 * var11 + this.field2678 * var8 >> 16;
        int var25 = this.field2682 * var8 - this.field2678 * var11 >> 16;
        int var27 = this.field2680 * var15 - this.field2679 * var25 >> 16;
        int var28 = this.field2680 * var25 + this.field2679 * var15 >> 16;
        if (var28 < 50) {
            return;
        }
        int var30 = this.field2682 * var10 + this.field2678 * var13 >> 16;
        int var31 = this.field2682 * var13 - this.field2678 * var10 >> 16;
        int var33 = this.field2680 * var16 - this.field2679 * var31 >> 16;
        int var34 = this.field2680 * var31 + this.field2679 * var16 >> 16;
        if (var34 < 50) {
            return;
        }
        int var36 = this.field2682 * var6 + this.field2678 * var12 >> 16;
        int var37 = this.field2682 * var12 - this.field2678 * var6 >> 16;
        int var39 = this.field2680 * var17 - this.field2679 * var37 >> 16;
        int var40 = this.field2680 * var37 + this.field2679 * var17 >> 16;
        if (var40 >= 50) {
            this.method4780(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
        }
    }

    @ObfuscatedName("jg.aj(Ljy;Lke;IIB)V")
    public void method4424(class253 arg0, class262 arg1, int arg2, int arg3) {
        int var5 = arg1.field2842.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2842[var6] - this.field2674;
            int var8 = arg1.field2854[var6] - this.field2675;
            int var9 = arg1.field2847[var6] - this.field2676;
            int var10 = this.field2682 * var7 + this.field2678 * var9 >> 16;
            int var11 = this.field2682 * var9 - this.field2678 * var7 >> 16;
            int var13 = this.field2680 * var8 - this.field2679 * var11 >> 16;
            int var14 = this.field2680 * var11 + this.field2679 * var8 >> 16;
            if (var14 < 50) {
                return;
            }
            if (arg1.field2850 != null) {
                class262.field2859[var6] = var10;
                class262.field2860[var6] = var13;
                class262.field2861[var6] = var14;
            }
            class262.field2856[var6] = class248.method4352() + var10 * class248.method4339() / var14;
            class262.field2857[var6] = class248.method4335() + var13 * class248.method4339() / var14;
            class262.field2858[var6] = class263.method3305(var14);
        }
        this.method4783(arg0, arg1, arg2, arg3);
    }
}
