package deob;

@ObfuscatedName("jw")
public class class245 extends class504 {

    @ObfuscatedName("jw.af")
    public int field2616;

    @ObfuscatedName("jw.aa")
    public boolean field2619;

    @ObfuscatedName("jw.at")
    public int[] field2618;

    @ObfuscatedName("jw.ab")
    public int[] field2614;

    @ObfuscatedName("jw.ac")
    public int[] field2620;

    @ObfuscatedName("jw.ao")
    public int[] field2613;

    @ObfuscatedName("jw.ah")
    public int field2622;

    @ObfuscatedName("jw.av")
    public int field2623;

    @ObfuscatedName("jw.aq")
    public int[] field2612;

    @ObfuscatedName("jw.ap")
    public boolean field2625 = false;

    public class245(class546 arg0) {
        this.field2616 = arg0.method8798();
        this.field2619 = arg0.method8796() == 1;
        int var2 = arg0.method8796();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2618 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2618[var3] = arg0.method8798();
        }
        if (var2 > 1) {
            this.field2614 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2614[var4] = arg0.method8796();
            }
        }
        if (var2 > 1) {
            this.field2620 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2620[var5] = arg0.method8796();
            }
        }
        this.field2613 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2613[var6] = arg0.method8801();
        }
        this.field2622 = arg0.method8796();
        this.field2623 = arg0.method8796();
        this.field2612 = null;
    }

    @ObfuscatedName("jw.ak(DILor;)Z")
    public boolean method4319(double arg0, int arg1, class387 arg2) {
        for (int var5 = 0; var5 < this.field2618.length; var5++) {
            if (arg2.method6580(this.field2618[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2612 = new int[var6];
        for (int var7 = 0; var7 < this.field2618.length; var7++) {
            class559 var8 = class561.method2902(arg2, this.field2618[var7]);
            var8.method9194();
            byte[] var9 = var8.field5433;
            int[] var10 = var8.field5434;
            int var11 = this.field2613[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class248.method4364(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2614[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5432 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2612[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5432 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2612[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5432 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2612[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("jw.al()V")
    public void method4320() {
        this.field2612 = null;
    }

    @ObfuscatedName("jw.aj(I)V")
    public void method4321(int arg0) {
        if (this.field2612 == null) {
            return;
        }
        if (this.field2622 == 1 || this.field2622 == 3) {
            if (Statics.field2626 == null || Statics.field2626.length < this.field2612.length) {
                Statics.field2626 = new int[this.field2612.length];
            }
            short var2;
            if (this.field2612.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2612.length;
            int var4 = arg0 * var2 * this.field2623;
            int var5 = var3 - 1;
            if (this.field2622 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2626[var6] = this.field2612[var7];
            }
            int[] var8 = this.field2612;
            this.field2612 = Statics.field2626;
            Statics.field2626 = var8;
        }
        if (this.field2622 != 2 && this.field2622 != 4) {
            return;
        }
        if (Statics.field2626 == null || Statics.field2626.length < this.field2612.length) {
            Statics.field2626 = new int[this.field2612.length];
        }
        short var9;
        if (this.field2612.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2612.length;
        int var11 = this.field2623 * arg0;
        int var12 = var9 - 1;
        if (this.field2622 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2626[var15] = this.field2612[var16];
            }
        }
        int[] var17 = this.field2612;
        this.field2612 = Statics.field2626;
        Statics.field2626 = var17;
    }
}
