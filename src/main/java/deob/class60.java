package deob;

@ObfuscatedName("cy")
public class class60 {

    @ObfuscatedName("cy.at")
    public class42 field429;

    @ObfuscatedName("cy.an")
    public boolean field430;

    @ObfuscatedName("cy.av")
    public int[] field431;

    @ObfuscatedName("cy.as")
    public int[] field432;

    @ObfuscatedName("cy.ax")
    public boolean[] field436;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field429 = arg0;
        this.field430 = arg1;
        this.field431 = arg2;
        this.field432 = arg3;
        this.field436 = arg4;
    }

    @ObfuscatedName("cy.at([FII)V")
    public void method1044(float[] arg0, int arg1) {
        int var3 = this.field429.field271.length;
        class42 var10000 = this.field429;
        int var4 = class42.field275[this.field429.field272 - 1];
        boolean[] var5 = this.field436;
        this.field436[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field429.method724(this.field431, var6);
            int var8 = this.field429.method725(this.field431, var6);
            int var9 = this.field429.method737(this.field431[var7], this.field432[var7], this.field431[var8], this.field432[var8], this.field431[var6]);
            int var10 = this.field432[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field436[var6] = false;
                this.field432[var6] = var9;
            } else {
                boolean[] var14 = this.field436;
                this.field436[var8] = true;
                var14[var7] = true;
                this.field436[var6] = true;
                if (var10 >= var13) {
                    this.field432[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field432[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1043(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field432[0] * this.field429.field272;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field436[var18]) {
                int var19 = this.field431[var18];
                int var20 = this.field432[var18] * this.field429.field272;
                this.field429.method726(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field429;
        float var21 = class42.field270[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("cy.an(B)Z")
    public boolean method1042() {
        return this.field430;
    }

    @ObfuscatedName("cy.av(IIB)V")
    public void method1043(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field431[arg0];
        int var5 = this.field432[arg0];
        boolean var6 = this.field436[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field431[var7];
            if (var8 < var4) {
                this.field431[var3] = var8;
                this.field432[var3] = this.field432[var7];
                this.field436[var3] = this.field436[var7];
                var3++;
                this.field431[var7] = this.field431[var3];
                this.field432[var7] = this.field432[var3];
                this.field436[var7] = this.field436[var3];
            }
        }
        this.field431[var3] = var4;
        this.field432[var3] = var5;
        this.field436[var3] = var6;
        this.method1043(arg0, var3 - 1);
        this.method1043(var3 + 1, arg1);
    }
}
