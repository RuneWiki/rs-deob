package deob;

@ObfuscatedName("cr")
public class class60 {

    @ObfuscatedName("cr.ab")
    public class42 field407;

    @ObfuscatedName("cr.ay")
    public boolean field404;

    @ObfuscatedName("cr.an")
    public int[] field406;

    @ObfuscatedName("cr.au")
    public int[] field403;

    @ObfuscatedName("cr.ax")
    public boolean[] field405;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field407 = arg0;
        this.field404 = arg1;
        this.field406 = arg2;
        this.field403 = arg3;
        this.field405 = arg4;
    }

    @ObfuscatedName("cr.ab([FII)V")
    public void method1063(float[] arg0, int arg1) {
        int var3 = this.field407.field249.length;
        class42 var10000 = this.field407;
        int var4 = class42.field250[this.field407.field255 - 1];
        boolean[] var5 = this.field405;
        this.field405[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field407.method732(this.field406, var6);
            int var8 = this.field407.method726(this.field406, var6);
            int var9 = this.field407.method727(this.field406[var7], this.field403[var7], this.field406[var8], this.field403[var8], this.field406[var6]);
            int var10 = this.field403[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field405[var6] = false;
                this.field403[var6] = var9;
            } else {
                boolean[] var14 = this.field405;
                this.field405[var8] = true;
                var14[var7] = true;
                this.field405[var6] = true;
                if (var10 >= var13) {
                    this.field403[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field403[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1079(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field403[0] * this.field407.field255;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field405[var18]) {
                int var19 = this.field406[var18];
                int var20 = this.field403[var18] * this.field407.field255;
                this.field407.method728(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field407;
        float var21 = class42.field248[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cr.ay(B)Z")
    public boolean method1075() {
        return this.field404;
    }

    @ObfuscatedName("cr.an(III)V")
    public void method1079(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field406[arg0];
        int var5 = this.field403[arg0];
        boolean var6 = this.field405[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field406[var7];
            if (var8 < var4) {
                this.field406[var3] = var8;
                this.field403[var3] = this.field403[var7];
                this.field405[var3] = this.field405[var7];
                var3++;
                this.field406[var7] = this.field406[var3];
                this.field403[var7] = this.field403[var3];
                this.field405[var7] = this.field405[var3];
            }
        }
        this.field406[var3] = var4;
        this.field403[var3] = var5;
        this.field405[var3] = var6;
        this.method1079(arg0, var3 - 1);
        this.method1079(var3 + 1, arg1);
    }
}
