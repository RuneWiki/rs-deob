package deob;

@ObfuscatedName("cm")
public class class60 {

    @ObfuscatedName("cm.ak")
    public class42 field432;

    @ObfuscatedName("cm.al")
    public boolean field430;

    @ObfuscatedName("cm.aj")
    public int[] field429;

    @ObfuscatedName("cm.az")
    public int[] field431;

    @ObfuscatedName("cm.af")
    public boolean[] field428;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field432 = arg0;
        this.field430 = arg1;
        this.field429 = arg2;
        this.field431 = arg3;
        this.field428 = arg4;
    }

    @ObfuscatedName("cm.ak([FIB)V")
    public void method1068(float[] arg0, int arg1) {
        int var3 = this.field432.field271.length;
        class42 var10000 = this.field432;
        int var4 = class42.field276[this.field432.field273 - 1];
        boolean[] var5 = this.field428;
        this.field428[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field432.method765(this.field429, var6);
            int var8 = this.field432.method759(this.field429, var6);
            int var9 = this.field432.method757(this.field429[var7], this.field431[var7], this.field429[var8], this.field431[var8], this.field429[var6]);
            int var10 = this.field431[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field428[var6] = false;
                this.field431[var6] = var9;
            } else {
                boolean[] var14 = this.field428;
                this.field428[var8] = true;
                var14[var7] = true;
                this.field428[var6] = true;
                if (var10 >= var13) {
                    this.field431[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field431[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1070(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field431[0] * this.field432.field273;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field428[var18]) {
                int var19 = this.field429[var18];
                int var20 = this.field431[var18] * this.field432.field273;
                this.field432.method758(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field432;
        float var21 = class42.field272[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cm.al(B)Z")
    public boolean method1069() {
        return this.field430;
    }

    @ObfuscatedName("cm.aj(III)V")
    public void method1070(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field429[arg0];
        int var5 = this.field431[arg0];
        boolean var6 = this.field428[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field429[var7];
            if (var8 < var4) {
                this.field429[var3] = var8;
                this.field431[var3] = this.field431[var7];
                this.field428[var3] = this.field428[var7];
                var3++;
                this.field429[var7] = this.field429[var3];
                this.field431[var7] = this.field431[var3];
                this.field428[var7] = this.field428[var3];
            }
        }
        this.field429[var3] = var4;
        this.field431[var3] = var5;
        this.field428[var3] = var6;
        this.method1070(arg0, var3 - 1);
        this.method1070(var3 + 1, arg1);
    }
}
