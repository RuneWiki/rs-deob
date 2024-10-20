package deob;

import java.io.EOFException;

@ObfuscatedName("b")
public class class20 {

    @ObfuscatedName("b.k")
    public boolean[] field260 = new boolean[this.field264.length];

    @ObfuscatedName("b.t")
    public boolean[] field270;

    @ObfuscatedName("b.g")
    public int[] field264 = new int[Statics.field2719.method3046(19)];

    @ObfuscatedName("b.o")
    public String[] field261 = new String[Statics.field2719.method3046(15)];

    @ObfuscatedName("b.i")
    public boolean field262 = false;

    @ObfuscatedName("b.w")
    public long field263;

    public class20() {
        for (int var1 = 0; var1 < this.field264.length; var1++) {
            class46 var2 = (class46) class46.field1040.method3485((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1042.method2994(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method913(new class119(var4));
                }
                class46.field1040.method3487(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field260[var1] = var3.field1041;
        }
        this.field270 = new boolean[this.field261.length];
        for (int var7 = 0; var7 < this.field261.length; var7++) {
            class50 var8 = (class50) class50.field1088.method3485((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1089.method2994(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method964(new class119(var10));
                }
                class50.field1088.method3487(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field270[var7] = var9.field1086;
        }
        for (int var13 = 0; var13 < this.field264.length; var13++) {
            this.field264[var13] = -1;
        }
        this.method196();
    }

    @ObfuscatedName("b.c(III)V")
    public void method189(int arg0, int arg1) {
        this.field264[arg0] = arg1;
        if (this.field260[arg0]) {
            this.field262 = true;
        }
    }

    @ObfuscatedName("b.h(II)I")
    public int method190(int arg0) {
        return this.field264[arg0];
    }

    @ObfuscatedName("b.k(ILjava/lang/String;I)V")
    public void method191(int arg0, String arg1) {
        this.field261[arg0] = arg1;
        if (this.field270[arg0]) {
            this.field262 = true;
        }
    }

    @ObfuscatedName("b.t(II)Ljava/lang/String;")
    public String method202(int arg0) {
        return this.field261[arg0];
    }

    @ObfuscatedName("b.g(I)V")
    public void method193() {
        for (int var1 = 0; var1 < this.field264.length; var1++) {
            if (!this.field260[var1]) {
                this.field264[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field261.length; var2++) {
            if (!this.field270[var2]) {
                this.field261[var2] = null;
            }
        }
    }

    @ObfuscatedName("b.o(ZI)Lhv;")
    public class227 method194(boolean arg0) {
        return class149.method1999("2", Statics.field591.field2262, arg0);
    }

    @ObfuscatedName("b.i(I)V")
    public void method195() {
        class227 var1 = this.method194(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field264.length; var4++) {
                if (this.field260[var4] && this.field264[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field261.length; var6++) {
                if (this.field270[var6] && this.field261[var6] != null) {
                    var2 += 2 + class119.method224(this.field261[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2276(1);
            var7.method2451(var3);
            for (int var8 = 0; var8 < this.field264.length; var8++) {
                if (this.field260[var8] && this.field264[var8] != -1) {
                    var7.method2451(var8);
                    var7.method2484(this.field264[var8]);
                }
            }
            var7.method2451(var5);
            for (int var9 = 0; var9 < this.field261.length; var9++) {
                if (this.field270[var9] && this.field261[var9] != null) {
                    var7.method2451(var9);
                    var7.method2282(this.field261[var9]);
                }
            }
            var1.method3832(var7.field1956, 0, var7.field1955);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3826();
            } catch (Exception var20) {
            }
        }
        this.field262 = false;
        this.field263 = class115.method2622();
    }

    @ObfuscatedName("b.w(I)V")
    public void method196() {
        class227 var1 = this.method194(false);
        try {
            byte[] var2 = new byte[(int) var1.method3824()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3827(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class119 var5 = new class119(var2);
            if (var5.field1956.length - var5.field1955 < 1) {
                return;
            }
            int var7 = var5.method2291();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2293();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2293();
                int var12 = var5.method2296();
                if (this.field260[var11]) {
                    this.field264[var11] = var12;
                }
            }
            int var13 = var5.method2293();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2293();
                String var16 = var5.method2299();
                if (this.field270[var15]) {
                    this.field261[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3826();
            } catch (Exception var29) {
            }
        }
        this.field262 = false;
    }

    @ObfuscatedName("b.m(I)V")
    public void method197() {
        if (this.field262 && this.field263 < class115.method2622() - 60000L) {
            this.method195();
        }
    }

    @ObfuscatedName("b.r(I)Z")
    public boolean method222() {
        return this.field262;
    }
}
