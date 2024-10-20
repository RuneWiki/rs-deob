package deob;

@ObfuscatedName("oo")
public class class410 {

    @ObfuscatedName("oo.a")
    public float[] field4584;

    @ObfuscatedName("oo.f")
    public int field4583;

    public class410(float[] arg0, int arg1) {
        this.field4584 = arg0;
        this.field4583 = arg1;
    }

    @ObfuscatedName("nd.a([FIFZFZ[FB)I")
    public static int method6610(float[] arg0, int arg1, float arg2, boolean arg3, float arg4, boolean arg5, float[] arg6) {
        float var7 = 0.0F;
        for (int var8 = 0; var8 < arg1 + 1; var8++) {
            var7 += Math.abs(arg0[var8]);
        }
        float var9 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * class122.field1455;
        if (var7 <= var9) {
            return -1;
        }
        float[] var10 = new float[arg1 + 1];
        for (int var11 = 0; var11 < arg1 + 1; var11++) {
            var10[var11] = 1.0F / var7 * arg0[var11];
        }
        while (Math.abs(var10[arg1]) < var9) {
            arg1--;
        }
        int var12 = 0;
        if (arg1 == 0) {
            return var12;
        } else if (arg1 == 1) {
            arg6[0] = -var10[0] / var10[1];
            boolean var13 = arg3 ? arg2 < arg6[0] + var9 : arg2 < arg6[0] - var9;
            boolean var14 = arg5 ? arg4 > arg6[0] - var9 : arg4 > arg6[0] + var9;
            int var15 = var13 && var14 ? 1 : 0;
            if (var15 > 0) {
                if (arg3 && arg6[0] < arg2) {
                    arg6[0] = arg2;
                } else if (arg5 && arg6[0] > arg4) {
                    arg6[0] = arg4;
                }
            }
            return var15;
        } else {
            class410 var16 = new class410(var10, arg1);
            float[] var17 = new float[arg1 + 1];
            for (int var18 = 1; var18 <= arg1; var18++) {
                var17[var18 - 1] = var10[var18] * (float) var18;
            }
            float[] var19 = new float[arg1 + 1];
            int var20 = method6610(var17, arg1 - 1, arg2, false, arg4, false, var19);
            if (var20 == -1) {
                return 0;
            }
            boolean var21 = false;
            float var22 = 0.0F;
            float var23 = 0.0F;
            float var24 = 0.0F;
            for (int var25 = 0; var25 <= var20; var25++) {
                if (var12 > arg1) {
                    return var12;
                }
                float var26;
                float var27;
                if (var25 == 0) {
                    var26 = arg2;
                    var27 = method9(var10, arg1, arg2);
                    if (Math.abs(var27) <= var9 && arg3) {
                        arg6[var12++] = arg2;
                    }
                } else {
                    var26 = var24;
                    var27 = var22;
                }
                if (var20 == var25) {
                    var24 = arg4;
                    var21 = false;
                } else {
                    var24 = var19[var25];
                }
                var22 = method9(var10, arg1, var24);
                if (var21) {
                    var21 = false;
                } else if (Math.abs(var22) < var9) {
                    if (var20 != var25 || arg5) {
                        arg6[var12++] = var24;
                        var21 = true;
                    }
                } else if (var27 < 0.0F && var22 > 0.0F || var27 > 0.0F && var22 < 0.0F) {
                    arg6[var12++] = Statics.method6978(var16, var26, var24, 0.0F);
                    if (var12 > 1 && arg6[var12 - 2] >= arg6[var12 - 1] - var9) {
                        arg6[var12 - 2] = (arg6[var12 - 1] + arg6[var12 - 2]) * 0.5F;
                        var12--;
                    }
                }
            }
            return var12;
        }
    }

    @ObfuscatedName("f.f([FIFI)F")
    public static float method9(float[] arg0, int arg1, float arg2) {
        float var3 = arg0[arg1];
        for (int var4 = arg1 - 1; var4 >= 0; var4--) {
            var3 = arg2 * var3 + arg0[var4];
        }
        return var3;
    }
}
