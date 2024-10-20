package deob;

@ObfuscatedName("cl")
public class class60 {

    @ObfuscatedName("cl.am")
    public class42 field425;

    @ObfuscatedName("cl.ap")
    public boolean field426;

    @ObfuscatedName("cl.af")
    public int[] field428;

    @ObfuscatedName("cl.aj")
    public int[] field427;

    @ObfuscatedName("cl.aq")
    public boolean[] field429;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field425 = arg0;
        this.field426 = arg1;
        this.field428 = arg2;
        this.field427 = arg3;
        this.field429 = arg4;
    }

    @ObfuscatedName("cl.am([FII)V")
    public void method1109(float[] arg0, int arg1) {
        int var3 = this.field425.field275.length;
        class42 var10000 = this.field425;
        int var4 = class42.field277[this.field425.field276 - 1];
        boolean[] var5 = this.field429;
        this.field429[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field425.method792(this.field428, var6);
            int var8 = this.field425.method789(this.field428, var6);
            int var9 = this.field425.method785(this.field428[var7], this.field427[var7], this.field428[var8], this.field427[var8], this.field428[var6]);
            int var10 = this.field427[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field429[var6] = false;
                this.field427[var6] = var9;
            } else {
                boolean[] var14 = this.field429;
                this.field429[var8] = true;
                var14[var7] = true;
                this.field429[var6] = true;
                if (var10 >= var13) {
                    this.field427[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field427[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1117(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field427[0] * this.field425.field276;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field429[var18]) {
                int var19 = this.field428[var18];
                int var20 = this.field427[var18] * this.field425.field276;
                this.field425.method786(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field425;
        float var21 = class42.field274[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cl.ap(I)Z")
    public boolean method1110() {
        return this.field426;
    }

    @ObfuscatedName("cl.af(III)V")
    public void method1117(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field428[arg0];
        int var5 = this.field427[arg0];
        boolean var6 = this.field429[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field428[var7];
            if (var8 < var4) {
                this.field428[var3] = var8;
                this.field427[var3] = this.field427[var7];
                this.field429[var3] = this.field429[var7];
                var3++;
                this.field428[var7] = this.field428[var3];
                this.field427[var7] = this.field427[var3];
                this.field429[var7] = this.field429[var3];
            }
        }
        this.field428[var3] = var4;
        this.field427[var3] = var5;
        this.field429[var3] = var6;
        this.method1117(arg0, var3 - 1);
        this.method1117(var3 + 1, arg1);
    }
}
