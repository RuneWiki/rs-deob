package deob;

@ObfuscatedName("cw")
public class class60 {

    @ObfuscatedName("cw.aw")
    public class42 field453;

    @ObfuscatedName("cw.ay")
    public boolean field452;

    @ObfuscatedName("cw.ar")
    public int[] field451;

    @ObfuscatedName("cw.am")
    public int[] field454;

    @ObfuscatedName("cw.as")
    public boolean[] field455;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field453 = arg0;
        this.field452 = arg1;
        this.field451 = arg2;
        this.field454 = arg3;
        this.field455 = arg4;
    }

    @ObfuscatedName("cw.aw([FIS)V")
    public void method1099(float[] arg0, int arg1) {
        int var3 = this.field453.field294.length;
        class42 var10000 = this.field453;
        int var4 = class42.field295[this.field453.field291 - 1];
        boolean[] var5 = this.field455;
        this.field455[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field453.method761(this.field451, var6);
            int var8 = this.field453.method757(this.field451, var6);
            int var9 = this.field453.method756(this.field451[var7], this.field454[var7], this.field451[var8], this.field454[var8], this.field451[var6]);
            int var10 = this.field454[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field455[var6] = false;
                this.field454[var6] = var9;
            } else {
                boolean[] var14 = this.field455;
                this.field455[var8] = true;
                var14[var7] = true;
                this.field455[var6] = true;
                if (var10 >= var13) {
                    this.field454[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field454[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1110(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field454[0] * this.field453.field291;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field455[var18]) {
                int var19 = this.field451[var18];
                int var20 = this.field454[var18] * this.field453.field291;
                this.field453.method759(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field453;
        float var21 = class42.field289[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cw.ay(B)Z")
    public boolean method1103() {
        return this.field452;
    }

    @ObfuscatedName("cw.ar(IIB)V")
    public void method1110(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field451[arg0];
        int var5 = this.field454[arg0];
        boolean var6 = this.field455[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field451[var7];
            if (var8 < var4) {
                this.field451[var3] = var8;
                this.field454[var3] = this.field454[var7];
                this.field455[var3] = this.field455[var7];
                var3++;
                this.field451[var7] = this.field451[var3];
                this.field454[var7] = this.field454[var3];
                this.field455[var7] = this.field455[var3];
            }
        }
        this.field451[var3] = var4;
        this.field454[var3] = var5;
        this.field455[var3] = var6;
        this.method1110(arg0, var3 - 1);
        this.method1110(var3 + 1, arg1);
    }
}
