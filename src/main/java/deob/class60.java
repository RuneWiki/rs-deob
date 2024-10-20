package deob;

@ObfuscatedName("ce")
public class class60 {

    @ObfuscatedName("ce.aq")
    public class42 field404;

    @ObfuscatedName("ce.ad")
    public boolean field409;

    @ObfuscatedName("ce.ag")
    public int[] field405;

    @ObfuscatedName("ce.ak")
    public int[] field403;

    @ObfuscatedName("ce.ap")
    public boolean[] field406;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field404 = arg0;
        this.field409 = arg1;
        this.field405 = arg2;
        this.field403 = arg3;
        this.field406 = arg4;
    }

    @ObfuscatedName("ce.aq([FII)V")
    public void method1084(float[] arg0, int arg1) {
        int var3 = this.field404.field255.length;
        class42 var10000 = this.field404;
        int var4 = class42.field257[this.field404.field256 - 1];
        boolean[] var5 = this.field406;
        this.field406[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field404.method789(this.field405, var6);
            int var8 = this.field404.method771(this.field405, var6);
            int var9 = this.field404.method773(this.field405[var7], this.field403[var7], this.field405[var8], this.field403[var8], this.field405[var6]);
            int var10 = this.field403[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field406[var6] = false;
                this.field403[var6] = var9;
            } else {
                boolean[] var14 = this.field406;
                this.field406[var8] = true;
                var14[var7] = true;
                this.field406[var6] = true;
                if (var10 >= var13) {
                    this.field403[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field403[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1086(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field403[0] * this.field404.field256;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field406[var18]) {
                int var19 = this.field405[var18];
                int var20 = this.field403[var18] * this.field404.field256;
                this.field404.method774(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field404;
        float var21 = class42.field254[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("ce.ad(S)Z")
    public boolean method1087() {
        return this.field409;
    }

    @ObfuscatedName("ce.ag(IIB)V")
    public void method1086(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field405[arg0];
        int var5 = this.field403[arg0];
        boolean var6 = this.field406[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field405[var7];
            if (var8 < var4) {
                this.field405[var3] = var8;
                this.field403[var3] = this.field403[var7];
                this.field406[var3] = this.field406[var7];
                var3++;
                this.field405[var7] = this.field405[var3];
                this.field403[var7] = this.field403[var3];
                this.field406[var7] = this.field406[var3];
            }
        }
        this.field405[var3] = var4;
        this.field403[var3] = var5;
        this.field406[var3] = var6;
        this.method1086(arg0, var3 - 1);
        this.method1086(var3 + 1, arg1);
    }
}
