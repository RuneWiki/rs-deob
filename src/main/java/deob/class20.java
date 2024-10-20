package deob;

import java.io.EOFException;

@ObfuscatedName("v")
public class class20 {

    @ObfuscatedName("v.r")
    public boolean[] field277 = new boolean[this.field290.length];

    @ObfuscatedName("v.e")
    public boolean[] field289;

    @ObfuscatedName("v.h")
    public int[] field290 = new int[Statics.field1449.method3204(19)];

    @ObfuscatedName("v.s")
    public String[] field280 = new String[Statics.field1449.method3204(15)];

    @ObfuscatedName("v.k")
    public boolean field281 = false;

    @ObfuscatedName("v.u")
    public long field282;

    public class20() {
        for (int var1 = 0; var1 < this.field290.length; var1++) {
            class48 var2 = class48.method2394(var1);
            this.field277[var1] = var2.field1072;
        }
        this.field289 = new boolean[this.field280.length];
        for (int var3 = 0; var3 < this.field280.length; var3++) {
            class54 var4 = class54.method672(var3);
            this.field289[var3] = var4.field1167;
        }
        for (int var5 = 0; var5 < this.field290.length; var5++) {
            this.field290[var5] = -1;
        }
        this.method215();
    }

    @ObfuscatedName("v.l(III)V")
    public void method247(int arg0, int arg1) {
        this.field290[arg0] = arg1;
        if (this.field277[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("v.g(II)I")
    public int method213(int arg0) {
        return this.field290[arg0];
    }

    @ObfuscatedName("v.r(ILjava/lang/String;B)V")
    public void method217(int arg0, String arg1) {
        this.field280[arg0] = arg1;
        if (this.field289[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("v.e(II)Ljava/lang/String;")
    public String method212(int arg0) {
        return this.field280[arg0];
    }

    @ObfuscatedName("v.h(B)V")
    public void method216() {
        for (int var1 = 0; var1 < this.field290.length; var1++) {
            if (!this.field277[var1]) {
                this.field290[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field280.length; var2++) {
            if (!this.field289[var2]) {
                this.field280[var2] = null;
            }
        }
    }

    @ObfuscatedName("v.s(ZI)Lhl;")
    public class231 method214(boolean arg0) {
        return class153.method2401("2", Statics.field299.field2347, arg0);
    }

    @ObfuscatedName("v.k(B)V")
    public void method218() {
        class231 var1 = this.method214(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field290.length; var4++) {
                if (this.field277[var4] && this.field290[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field280.length; var6++) {
                if (this.field289[var6] && this.field280[var6] != null) {
                    var2 += 2 + Statics.method1140(this.field280[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2640(1);
            var7.method2476(var3);
            for (int var8 = 0; var8 < this.field290.length; var8++) {
                if (this.field277[var8] && this.field290[var8] != -1) {
                    var7.method2476(var8);
                    var7.method2585(this.field290[var8]);
                }
            }
            var7.method2476(var5);
            for (int var9 = 0; var9 < this.field280.length; var9++) {
                if (this.field289[var9] && this.field280[var9] != null) {
                    var7.method2476(var9);
                    var7.method2560(this.field280[var9]);
                }
            }
            var1.method4016(var7.field2052, 0, var7.field2051);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method4024();
            } catch (Exception var20) {
            }
        }
        this.field281 = false;
        this.field282 = class119.method1224();
    }

    @ObfuscatedName("v.u(B)V")
    public void method215() {
        class231 var1 = this.method214(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method4014()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method4015(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2052.length - var5.field2051 >= 1) {
                    int var7 = var5.method2490();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2492();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2492();
                            int var12 = var5.method2477();
                            if (this.field277[var11]) {
                                this.field290[var11] = var12;
                            }
                        }
                        int var13 = var5.method2492();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2492();
                            String var16 = var5.method2520();
                            if (this.field289[var15]) {
                                this.field280[var15] = var16;
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
                    var1.method4024();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field281 = false;
    }

    @ObfuscatedName("v.n(B)V")
    public void method220() {
        if (this.field281 && this.field282 < class119.method1224() - 60000L) {
            this.method218();
        }
    }

    @ObfuscatedName("v.b(B)Z")
    public boolean method221() {
        return this.field281;
    }
}
