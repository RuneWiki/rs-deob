package deob;

@ObfuscatedName("ci")
public class class60 {

    @ObfuscatedName("ci.aq")
    public class42 field428;

    @ObfuscatedName("ci.aw")
    public boolean field424;

    @ObfuscatedName("ci.al")
    public int[] field425;

    @ObfuscatedName("ci.ai")
    public int[] field423;

    @ObfuscatedName("ci.ar")
    public boolean[] field427;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field428 = arg0;
        this.field424 = arg1;
        this.field425 = arg2;
        this.field423 = arg3;
        this.field427 = arg4;
    }

    @ObfuscatedName("ci.aq([FIS)V")
    public void method1054(float[] arg0, int arg1) {
        int var3 = this.field428.field275.length;
        class42 var10000 = this.field428;
        int var4 = class42.field277[this.field428.field274 - 1];
        boolean[] var5 = this.field427;
        this.field427[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field428.method725(this.field425, var6);
            int var8 = this.field428.method733(this.field425, var6);
            int var9 = this.field428.method720(this.field425[var7], this.field423[var7], this.field425[var8], this.field423[var8], this.field425[var6]);
            int var10 = this.field423[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field427[var6] = false;
                this.field423[var6] = var9;
            } else {
                boolean[] var14 = this.field427;
                this.field427[var8] = true;
                var14[var7] = true;
                this.field427[var6] = true;
                if (var10 >= var13) {
                    this.field423[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field423[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1062(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field423[0] * this.field428.field274;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field427[var18]) {
                int var19 = this.field425[var18];
                int var20 = this.field423[var18] * this.field428.field274;
                this.field428.method721(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field428;
        float var21 = class42.field272[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("ci.aw(I)Z")
    public boolean method1055() {
        return this.field424;
    }

    @ObfuscatedName("ci.al(IIB)V")
    public void method1062(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field425[arg0];
        int var5 = this.field423[arg0];
        boolean var6 = this.field427[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field425[var7];
            if (var8 < var4) {
                this.field425[var3] = var8;
                this.field423[var3] = this.field423[var7];
                this.field427[var3] = this.field427[var7];
                var3++;
                this.field425[var7] = this.field425[var3];
                this.field423[var7] = this.field423[var3];
                this.field427[var7] = this.field427[var3];
            }
        }
        this.field425[var3] = var4;
        this.field423[var3] = var5;
        this.field427[var3] = var6;
        this.method1062(arg0, var3 - 1);
        this.method1062(var3 + 1, arg1);
    }
}
