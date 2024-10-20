package deob;

@ObfuscatedName("cd")
public class class60 {

    @ObfuscatedName("cd.au")
    public class42 field456;

    @ObfuscatedName("cd.ae")
    public boolean field445;

    @ObfuscatedName("cd.ao")
    public int[] field446;

    @ObfuscatedName("cd.at")
    public int[] field457;

    @ObfuscatedName("cd.ac")
    public boolean[] field449;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field456 = arg0;
        this.field445 = arg1;
        this.field446 = arg2;
        this.field457 = arg3;
        this.field449 = arg4;
    }

    @ObfuscatedName("cd.au([FIB)V")
    public void method1093(float[] arg0, int arg1) {
        int var3 = this.field456.field287.length;
        class42 var10000 = this.field456;
        int var4 = class42.field286[this.field456.field285 - 1];
        boolean[] var5 = this.field449;
        this.field449[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field456.method783(this.field446, var6);
            int var8 = this.field456.method774(this.field446, var6);
            int var9 = this.field456.method775(this.field446[var7], this.field457[var7], this.field446[var8], this.field457[var8], this.field446[var6]);
            int var10 = this.field457[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field449[var6] = false;
                this.field457[var6] = var9;
            } else {
                boolean[] var14 = this.field449;
                this.field449[var8] = true;
                var14[var7] = true;
                this.field449[var6] = true;
                if (var10 >= var13) {
                    this.field457[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field457[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1095(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field457[0] * this.field456.field285;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field449[var18]) {
                int var19 = this.field446[var18];
                int var20 = this.field457[var18] * this.field456.field285;
                this.field456.method773(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field456;
        float var21 = class42.field288[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cd.ae(B)Z")
    public boolean method1094() {
        return this.field445;
    }

    @ObfuscatedName("cd.ao(III)V")
    public void method1095(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field446[arg0];
        int var5 = this.field457[arg0];
        boolean var6 = this.field449[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field446[var7];
            if (var8 < var4) {
                this.field446[var3] = var8;
                this.field457[var3] = this.field457[var7];
                this.field449[var3] = this.field449[var7];
                var3++;
                this.field446[var7] = this.field446[var3];
                this.field457[var7] = this.field457[var3];
                this.field449[var7] = this.field449[var3];
            }
        }
        this.field446[var3] = var4;
        this.field457[var3] = var5;
        this.field449[var3] = var6;
        this.method1095(arg0, var3 - 1);
        this.method1095(var3 + 1, arg1);
    }
}
