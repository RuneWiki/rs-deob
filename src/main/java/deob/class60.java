package deob;

@ObfuscatedName("ci")
public class class60 {

    @ObfuscatedName("ci.ac")
    public class42 field414;

    @ObfuscatedName("ci.ae")
    public boolean field417;

    @ObfuscatedName("ci.ag")
    public int[] field416;

    @ObfuscatedName("ci.am")
    public int[] field418;

    @ObfuscatedName("ci.ax")
    public boolean[] field422;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field414 = arg0;
        this.field417 = arg1;
        this.field416 = arg2;
        this.field418 = arg3;
        this.field422 = arg4;
    }

    @ObfuscatedName("ci.ac([FII)V")
    public void method1104(float[] arg0, int arg1) {
        int var3 = this.field414.field258.length;
        class42 var10000 = this.field414;
        int var4 = class42.field254[this.field414.field255 - 1];
        boolean[] var5 = this.field422;
        this.field422[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field414.method766(this.field416, var6);
            int var8 = this.field414.method767(this.field416, var6);
            int var9 = this.field414.method774(this.field416[var7], this.field418[var7], this.field416[var8], this.field418[var8], this.field416[var6]);
            int var10 = this.field418[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field422[var6] = false;
                this.field418[var6] = var9;
            } else {
                boolean[] var14 = this.field422;
                this.field422[var8] = true;
                var14[var7] = true;
                this.field422[var6] = true;
                if (var10 >= var13) {
                    this.field418[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field418[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1113(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field418[0] * this.field414.field255;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field422[var18]) {
                int var19 = this.field416[var18];
                int var20 = this.field418[var18] * this.field414.field255;
                this.field414.method769(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field414;
        float var21 = class42.field253[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("ci.ae(I)Z")
    public boolean method1105() {
        return this.field417;
    }

    @ObfuscatedName("ci.ag(III)V")
    public void method1113(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field416[arg0];
        int var5 = this.field418[arg0];
        boolean var6 = this.field422[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field416[var7];
            if (var8 < var4) {
                this.field416[var3] = var8;
                this.field418[var3] = this.field418[var7];
                this.field422[var3] = this.field422[var7];
                var3++;
                this.field416[var7] = this.field416[var3];
                this.field418[var7] = this.field418[var3];
                this.field422[var7] = this.field422[var3];
            }
        }
        this.field416[var3] = var4;
        this.field418[var3] = var5;
        this.field422[var3] = var6;
        this.method1113(arg0, var3 - 1);
        this.method1113(var3 + 1, arg1);
    }
}
