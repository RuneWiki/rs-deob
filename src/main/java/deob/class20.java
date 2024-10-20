package deob;

import java.io.EOFException;

@ObfuscatedName("x")
public class class20 {

    @ObfuscatedName("x.f")
    public boolean[] field279 = new boolean[this.field283.length];

    @ObfuscatedName("x.s")
    public boolean[] field288;

    @ObfuscatedName("x.y")
    public int[] field283 = new int[Statics.field1080.method3035(19)];

    @ObfuscatedName("x.e")
    public String[] field282 = new String[Statics.field1080.method3035(15)];

    @ObfuscatedName("x.g")
    public boolean field278 = false;

    @ObfuscatedName("x.m")
    public long field284;

    public class20() {
        for (int var1 = 0; var1 < this.field283.length; var1++) {
            class46 var2 = (class46) class46.field1039.method3507((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1047.method3025(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method932(new class119(var4));
                }
                class46.field1039.method3509(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field279[var1] = var3.field1041;
        }
        this.field288 = new boolean[this.field282.length];
        for (int var7 = 0; var7 < this.field282.length; var7++) {
            class50 var8 = class50.method29(var7);
            this.field288[var7] = var8.field1091;
        }
        for (int var9 = 0; var9 < this.field283.length; var9++) {
            this.field283[var9] = -1;
        }
        this.method233();
    }

    @ObfuscatedName("x.a(III)V")
    public void method210(int arg0, int arg1) {
        this.field283[arg0] = arg1;
        if (this.field279[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("x.r(II)I")
    public int method212(int arg0) {
        return this.field283[arg0];
    }

    @ObfuscatedName("x.f(ILjava/lang/String;I)V")
    public void method216(int arg0, String arg1) {
        this.field282[arg0] = arg1;
        if (this.field288[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("x.s(II)Ljava/lang/String;")
    public String method217(int arg0) {
        return this.field282[arg0];
    }

    @ObfuscatedName("x.y(I)V")
    public void method213() {
        for (int var1 = 0; var1 < this.field283.length; var1++) {
            if (!this.field279[var1]) {
                this.field283[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field282.length; var2++) {
            if (!this.field288[var2]) {
                this.field282[var2] = null;
            }
        }
    }

    @ObfuscatedName("x.e(ZB)Lhn;")
    public class227 method209(boolean arg0) {
        return class149.method2708("2", Statics.field275.field2273, arg0);
    }

    @ObfuscatedName("x.g(I)V")
    public void method214() {
        class227 var1 = this.method209(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field283.length; var4++) {
                if (this.field279[var4] && this.field283[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field282.length; var6++) {
                if (this.field288[var6] && this.field282[var6] != null) {
                    var2 += 2 + class119.method571(this.field282[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2330(1);
            var7.method2331(var3);
            for (int var8 = 0; var8 < this.field283.length; var8++) {
                if (this.field279[var8] && this.field283[var8] != -1) {
                    var7.method2331(var8);
                    var7.method2496(this.field283[var8]);
                }
            }
            var7.method2331(var5);
            for (int var9 = 0; var9 < this.field282.length; var9++) {
                if (this.field288[var9] && this.field282[var9] != null) {
                    var7.method2331(var9);
                    var7.method2336(this.field282[var9]);
                }
            }
            var1.method3862(var7.field1981, 0, var7.field1980);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3876();
            } catch (Exception var20) {
            }
        }
        this.field278 = false;
        this.field284 = class115.method207();
    }

    @ObfuscatedName("x.m(I)V")
    public void method233() {
        class227 var1 = this.method209(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method3864()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3865(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1981.length - var5.field1980 < 1) {
                    return;
                }
                int var7 = var5.method2412();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2347();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2347();
                        int var12 = var5.method2350();
                        if (this.field279[var11]) {
                            this.field283[var11] = var12;
                        }
                    }
                    int var13 = var5.method2347();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2347();
                        String var16 = var5.method2353();
                        if (this.field288[var15]) {
                            this.field282[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method3876();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field278 = false;
    }

    @ObfuscatedName("x.j(I)V")
    public void method211() {
        if (this.field278 && this.field284 < class115.method207() - 60000L) {
            this.method214();
        }
    }

    @ObfuscatedName("x.n(B)Z")
    public boolean method218() {
        return this.field278;
    }
}
