package deob;

@ObfuscatedName("kc")
public class class279 extends class291 {

    @ObfuscatedName("kc.aq")
    public int field2892;

    @ObfuscatedName("kc.ad")
    public int field2885;

    @ObfuscatedName("kc.ag")
    public int field2886;

    @ObfuscatedName("kc.ak")
    public int field2887;

    @ObfuscatedName("kc.ap")
    public int field2888;

    @ObfuscatedName("kc.an")
    public int field2884;

    @ObfuscatedName("kc.aj")
    public int field2890;

    @ObfuscatedName("kc.av")
    public int field2891;

    @ObfuscatedName("kc.ab")
    public int field2889;

    public class279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2892 = arg0;
        this.field2885 = arg1;
        this.field2886 = arg2;
        this.field2887 = arg3;
        this.field2888 = arg4;
        this.field2884 = class278.field2878[arg3];
        this.field2890 = class278.field2879[arg3];
        this.field2891 = class278.field2878[arg4];
        this.field2889 = class278.field2879[arg4];
    }

    @ObfuscatedName("kc.aq(Lkt;IIIIJ)V")
    public void method4849(class286 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4971(arg1, this.field2887, this.field2888, arg2, arg3, arg4, this.field2892, this.field2885, this.field2886, arg5);
    }

    @ObfuscatedName("kc.ad(Lkq;Llt;IIII)V")
    public void method4841(class283 arg0, class297 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = (arg3 << 7) - this.field2892;
        int var8;
        int var9 = var8 = (arg4 << 7) - this.field2886;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2973[arg2][arg3][arg4] - this.field2885;
        int var15 = arg0.field2973[arg2][arg3 + 1][arg4] - this.field2885;
        int var16 = arg0.field2973[arg2][arg3 + 1][arg4 + 1] - this.field2885;
        int var17 = arg0.field2973[arg2][arg3][arg4 + 1] - this.field2885;
        int var18 = this.field2891 * var9 + this.field2889 * var7 >> 16;
        int var19 = this.field2889 * var9 - this.field2891 * var7 >> 16;
        int var21 = this.field2890 * var14 - this.field2884 * var19 >> 16;
        int var22 = this.field2890 * var19 + this.field2884 * var14 >> 16;
        if (var22 < 50) {
            return;
        }
        int var24 = this.field2891 * var8 + this.field2889 * var11 >> 16;
        int var25 = this.field2889 * var8 - this.field2891 * var11 >> 16;
        int var27 = this.field2890 * var15 - this.field2884 * var25 >> 16;
        int var28 = this.field2890 * var25 + this.field2884 * var15 >> 16;
        if (var28 < 50) {
            return;
        }
        int var30 = this.field2891 * var13 + this.field2889 * var10 >> 16;
        int var31 = this.field2889 * var13 - this.field2891 * var10 >> 16;
        int var33 = this.field2890 * var16 - this.field2884 * var31 >> 16;
        int var34 = this.field2890 * var31 + this.field2884 * var16 >> 16;
        if (var34 < 50) {
            return;
        }
        int var36 = this.field2891 * var12 + this.field2889 * var6 >> 16;
        int var37 = this.field2889 * var12 - this.field2891 * var6 >> 16;
        int var39 = this.field2890 * var17 - this.field2884 * var37 >> 16;
        int var40 = this.field2890 * var37 + this.field2884 * var17 >> 16;
        if (var40 >= 50) {
            this.method5219(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
        }
    }

    @ObfuscatedName("kc.ag(Lkq;Llw;IIB)V")
    public void method4843(class283 arg0, class292 arg1, int arg2, int arg3) {
        int var5 = arg1.field3079.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field3079[var6] - this.field2892;
            int var8 = arg1.field3058[var6] - this.field2885;
            int var9 = arg1.field3057[var6] - this.field2886;
            int var10 = this.field2891 * var9 + this.field2889 * var7 >> 16;
            int var11 = this.field2889 * var9 - this.field2891 * var7 >> 16;
            int var13 = this.field2890 * var8 - this.field2884 * var11 >> 16;
            int var14 = this.field2890 * var11 + this.field2884 * var8 >> 16;
            if (var14 < 50) {
                return;
            }
            if (arg1.field3059 != null) {
                class292.field3064[var6] = var10;
                class292.field3076[var6] = var13;
                class292.field3077[var6] = var14;
            }
            class292.field3066[var6] = class278.method4763() + var10 * class278.method4769() / var14;
            class292.field3074[var6] = class278.method4758() + var13 * class278.method4769() / var14;
            class292.field3073[var6] = class293.method6536(var14);
        }
        this.method5224(arg0, arg1, arg2, arg3);
    }
}
