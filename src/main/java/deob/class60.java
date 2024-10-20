package deob;

@ObfuscatedName("cy")
public class class60 {

    @ObfuscatedName("cy.ac")
    public class42 field446;

    @ObfuscatedName("cy.al")
    public boolean field444;

    @ObfuscatedName("cy.ak")
    public int[] field456;

    @ObfuscatedName("cy.ax")
    public int[] field450;

    @ObfuscatedName("cy.ao")
    public boolean[] field447;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field446 = arg0;
        this.field444 = arg1;
        this.field456 = arg2;
        this.field450 = arg3;
        this.field447 = arg4;
    }

    @ObfuscatedName("cy.ac([FII)V")
    public void method1087(float[] arg0, int arg1) {
        int var3 = this.field446.field283.length;
        class42 var10000 = this.field446;
        int var4 = class42.field287[this.field446.field282 - 1];
        boolean[] var5 = this.field447;
        this.field447[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field446.method754(this.field456, var6);
            int var8 = this.field446.method748(this.field456, var6);
            int var9 = this.field446.method749(this.field456[var7], this.field450[var7], this.field456[var8], this.field450[var8], this.field456[var6]);
            int var10 = this.field450[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field447[var6] = false;
                this.field450[var6] = var9;
            } else {
                boolean[] var14 = this.field447;
                this.field447[var8] = true;
                var14[var7] = true;
                this.field447[var6] = true;
                if (var10 >= var13) {
                    this.field450[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field450[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1090(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field450[0] * this.field446.field282;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field447[var18]) {
                int var19 = this.field456[var18];
                int var20 = this.field450[var18] * this.field446.field282;
                this.field446.method765(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field446;
        float var21 = class42.field284[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cy.al(I)Z")
    public boolean method1088() {
        return this.field444;
    }

    @ObfuscatedName("cy.ak(III)V")
    public void method1090(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field456[arg0];
        int var5 = this.field450[arg0];
        boolean var6 = this.field447[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field456[var7];
            if (var8 < var4) {
                this.field456[var3] = var8;
                this.field450[var3] = this.field450[var7];
                this.field447[var3] = this.field447[var7];
                var3++;
                this.field456[var7] = this.field456[var3];
                this.field450[var7] = this.field450[var3];
                this.field447[var7] = this.field447[var3];
            }
        }
        this.field456[var3] = var4;
        this.field450[var3] = var5;
        this.field447[var3] = var6;
        this.method1090(arg0, var3 - 1);
        this.method1090(var3 + 1, arg1);
    }
}
