package deob;

import java.io.EOFException;

@ObfuscatedName("h")
public class class20 {

    @ObfuscatedName("h.g")
    public boolean[] field289 = new boolean[this.field282.length];

    @ObfuscatedName("h.w")
    public boolean[] field281;

    @ObfuscatedName("h.e")
    public int[] field282 = new int[Statics.field3141.method3050(19)];

    @ObfuscatedName("h.c")
    public String[] field280 = new String[Statics.field3141.method3050(15)];

    @ObfuscatedName("h.a")
    public boolean field284 = false;

    @ObfuscatedName("h.q")
    public long field285;

    public class20() {
        for (int var1 = 0; var1 < this.field282.length; var1++) {
            class46 var2 = class46.method41(var1);
            this.field289[var1] = var2.field1042;
        }
        this.field281 = new boolean[this.field280.length];
        for (int var3 = 0; var3 < this.field280.length; var3++) {
            class50 var4 = class50.method1062(var3);
            this.field281[var3] = var4.field1090;
        }
        for (int var5 = 0; var5 < this.field282.length; var5++) {
            this.field282[var5] = -1;
        }
        this.method209();
    }

    @ObfuscatedName("h.y(IIB)V")
    public void method217(int arg0, int arg1) {
        this.field282[arg0] = arg1;
        if (this.field289[arg0]) {
            this.field284 = true;
        }
    }

    @ObfuscatedName("h.d(II)I")
    public int method214(int arg0) {
        return this.field282[arg0];
    }

    @ObfuscatedName("h.g(ILjava/lang/String;I)V")
    public void method204(int arg0, String arg1) {
        this.field280[arg0] = arg1;
        if (this.field281[arg0]) {
            this.field284 = true;
        }
    }

    @ObfuscatedName("h.w(II)Ljava/lang/String;")
    public String method231(int arg0) {
        return this.field280[arg0];
    }

    @ObfuscatedName("h.e(I)V")
    public void method206() {
        for (int var1 = 0; var1 < this.field282.length; var1++) {
            if (!this.field289[var1]) {
                this.field282[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field280.length; var2++) {
            if (!this.field281[var2]) {
                this.field280[var2] = null;
            }
        }
    }

    @ObfuscatedName("h.c(ZB)Lhq;")
    public class227 method207(boolean arg0) {
        return class149.method2114("2", Statics.field1092.field2271, arg0);
    }

    @ObfuscatedName("h.a(B)V")
    public void method208() {
        class227 var1 = this.method207(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field282.length; var4++) {
                if (this.field289[var4] && this.field282[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field280.length; var6++) {
                if (this.field281[var6] && this.field280[var6] != null) {
                    var2 += 2 + class119.method636(this.field280[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2354(1);
            var7.method2312(var3);
            for (int var8 = 0; var8 < this.field282.length; var8++) {
                if (this.field289[var8] && this.field282[var8] != -1) {
                    var7.method2312(var8);
                    var7.method2423(this.field282[var8]);
                }
            }
            var7.method2312(var5);
            for (int var9 = 0; var9 < this.field280.length; var9++) {
                if (this.field281[var9] && this.field280[var9] != null) {
                    var7.method2312(var9);
                    var7.method2372(this.field280[var9]);
                }
            }
            var1.method3791(var7.field1974, 0, var7.field1973);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3788();
            } catch (Exception var20) {
            }
        }
        this.field284 = false;
        this.field285 = class115.method671();
    }

    @ObfuscatedName("h.q(I)V")
    public void method209() {
        class227 var1 = this.method207(false);
        try {
            byte[] var2 = new byte[(int) var1.method3792()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3793(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class119 var5 = new class119(var2);
            if (var5.field1974.length - var5.field1973 < 1) {
                return;
            }
            int var7 = var5.method2326();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2525();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2525();
                int var12 = var5.method2331();
                if (this.field289[var11]) {
                    this.field282[var11] = var12;
                }
            }
            int var13 = var5.method2525();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2525();
                String var16 = var5.method2334();
                if (this.field281[var15]) {
                    this.field280[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3788();
            } catch (Exception var29) {
            }
        }
        this.field284 = false;
    }

    @ObfuscatedName("h.m(B)V")
    public void method202() {
        if (this.field284 && this.field285 < class115.method671() - 60000L) {
            this.method208();
        }
    }

    @ObfuscatedName("h.n(B)Z")
    public boolean method211() {
        return this.field284;
    }
}
