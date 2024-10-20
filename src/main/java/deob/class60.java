package deob;

@ObfuscatedName("cl")
public class class60 {

    @ObfuscatedName("cl.ap")
    public class42 field404;

    @ObfuscatedName("cl.aw")
    public boolean field402;

    @ObfuscatedName("cl.ak")
    public int[] field405;

    @ObfuscatedName("cl.aj")
    public int[] field403;

    @ObfuscatedName("cl.ai")
    public boolean[] field401;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field404 = arg0;
        this.field402 = arg1;
        this.field405 = arg2;
        this.field403 = arg3;
        this.field401 = arg4;
    }

    @ObfuscatedName("cl.ap([FII)V")
    public void method1130(float[] arg0, int arg1) {
        int var3 = this.field404.field248.length;
        class42 var10000 = this.field404;
        int var4 = class42.field252[this.field404.field249 - 1];
        boolean[] var5 = this.field401;
        this.field401[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field404.method761(this.field405, var6);
            int var8 = this.field404.method758(this.field405, var6);
            int var9 = this.field404.method766(this.field405[var7], this.field403[var7], this.field405[var8], this.field403[var8], this.field405[var6]);
            int var10 = this.field403[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field401[var6] = false;
                this.field403[var6] = var9;
            } else {
                boolean[] var14 = this.field401;
                this.field401[var8] = true;
                var14[var7] = true;
                this.field401[var6] = true;
                if (var10 >= var13) {
                    this.field403[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field403[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1131(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field403[0] * this.field404.field249;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field401[var18]) {
                int var19 = this.field405[var18];
                int var20 = this.field403[var18] * this.field404.field249;
                this.field404.method760(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field404;
        float var21 = class42.field247[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cl.aw(I)Z")
    public boolean method1129() {
        return this.field402;
    }

    @ObfuscatedName("cl.ak(III)V")
    public void method1131(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field405[arg0];
        int var5 = this.field403[arg0];
        boolean var6 = this.field401[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field405[var7];
            if (var8 < var4) {
                this.field405[var3] = var8;
                this.field403[var3] = this.field403[var7];
                this.field401[var3] = this.field401[var7];
                var3++;
                this.field405[var7] = this.field405[var3];
                this.field403[var7] = this.field403[var3];
                this.field401[var7] = this.field401[var3];
            }
        }
        this.field405[var3] = var4;
        this.field403[var3] = var5;
        this.field401[var3] = var6;
        this.method1131(arg0, var3 - 1);
        this.method1131(var3 + 1, arg1);
    }
}
