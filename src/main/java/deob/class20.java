package deob;

import java.io.EOFException;

@ObfuscatedName("h")
public class class20 {

    @ObfuscatedName("h.t")
    public boolean[] field284 = new boolean[this.field286.length];

    @ObfuscatedName("h.p")
    public boolean[] field285;

    @ObfuscatedName("h.e")
    public int[] field286 = new int[Statics.field1077.method3122(19)];

    @ObfuscatedName("h.y")
    public String[] field287 = new String[Statics.field1077.method3122(15)];

    @ObfuscatedName("h.m")
    public boolean field292 = false;

    @ObfuscatedName("h.c")
    public long field289;

    public class20() {
        for (int var1 = 0; var1 < this.field286.length; var1++) {
            class46 var2 = (class46) class46.field1051.method3520((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1057.method3127(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method962(new class120(var4));
                }
                class46.field1051.method3522(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field284[var1] = var3.field1052;
        }
        this.field285 = new boolean[this.field287.length];
        for (int var7 = 0; var7 < this.field287.length; var7++) {
            class50 var8 = class50.method586(var7);
            this.field285[var7] = var8.field1103;
        }
        for (int var9 = 0; var9 < this.field286.length; var9++) {
            this.field286[var9] = -1;
        }
        this.method200();
    }

    @ObfuscatedName("h.w(III)V")
    public void method193(int arg0, int arg1) {
        this.field286[arg0] = arg1;
        if (this.field284[arg0]) {
            this.field292 = true;
        }
    }

    @ObfuscatedName("h.x(IB)I")
    public int method194(int arg0) {
        return this.field286[arg0];
    }

    @ObfuscatedName("h.t(ILjava/lang/String;I)V")
    public void method195(int arg0, String arg1) {
        this.field287[arg0] = arg1;
        if (this.field285[arg0]) {
            this.field292 = true;
        }
    }

    @ObfuscatedName("h.p(II)Ljava/lang/String;")
    public String method223(int arg0) {
        return this.field287[arg0];
    }

    @ObfuscatedName("h.e(I)V")
    public void method227() {
        for (int var1 = 0; var1 < this.field286.length; var1++) {
            if (!this.field284[var1]) {
                this.field286[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field287.length; var2++) {
            if (!this.field285[var2]) {
                this.field287[var2] = null;
            }
        }
    }

    @ObfuscatedName("h.y(ZI)Lhy;")
    public class228 method198(boolean arg0) {
        return class150.method2162("2", Statics.field271.field2312, arg0);
    }

    @ObfuscatedName("h.m(I)V")
    public void method199() {
        class228 var1 = this.method198(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field286.length; var4++) {
                if (this.field284[var4] && this.field286[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field287.length; var6++) {
                if (this.field285[var6] && this.field287[var6] != null) {
                    var2 += 2 + class120.method973(this.field287[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2430(1);
            var7.method2349(var3);
            for (int var8 = 0; var8 < this.field286.length; var8++) {
                if (this.field284[var8] && this.field286[var8] != -1) {
                    var7.method2349(var8);
                    var7.method2351(this.field286[var8]);
                }
            }
            var7.method2349(var5);
            for (int var9 = 0; var9 < this.field287.length; var9++) {
                if (this.field285[var9] && this.field287[var9] != null) {
                    var7.method2349(var9);
                    var7.method2518(this.field287[var9]);
                }
            }
            var1.method3887(var7.field2013, 0, var7.field2012);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3874();
            } catch (Exception var20) {
            }
        }
        this.field292 = false;
        this.field289 = Statics.method162();
    }

    @ObfuscatedName("h.c(I)V")
    public void method200() {
        class228 var1 = this.method198(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3876()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3875(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field2013.length - var5.field2012 >= 1) {
                    int var7 = var5.method2363();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2365();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2365();
                            int var12 = var5.method2368();
                            if (this.field284[var11]) {
                                this.field286[var11] = var12;
                            }
                        }
                        int var13 = var5.method2365();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2365();
                            String var16 = var5.method2540();
                            if (this.field285[var15]) {
                                this.field287[var15] = var16;
                            }
                            var14++;
                        }
                    }
                    return;
                }
            } catch (Exception var30) {
                break label197;
            } finally {
                try {
                    var1.method3874();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field292 = false;
    }

    @ObfuscatedName("h.v(I)V")
    public void method201() {
        if (this.field292 && this.field289 < Statics.method162() - 60000L) {
            this.method199();
        }
    }

    @ObfuscatedName("h.l(B)Z")
    public boolean method203() {
        return this.field292;
    }
}
