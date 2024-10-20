package deob;

import java.io.EOFException;

@ObfuscatedName("ci")
public class class85 {

    @ObfuscatedName("ci.n")
    public boolean[] field1231 = new boolean[this.field1229.length];

    @ObfuscatedName("ci.u")
    public boolean[] field1228;

    @ObfuscatedName("ci.i")
    public int[] field1229 = new int[Statics.field1759.method4287(19)];

    @ObfuscatedName("ci.r")
    public String[] field1230 = new String[Statics.field1759.method4287(15)];

    @ObfuscatedName("ci.j")
    public boolean field1226 = false;

    @ObfuscatedName("ci.p")
    public long field1227;

    public class85() {
        for (int var1 = 0; var1 < this.field1229.length; var1++) {
            class259 var2 = (class259) class259.field3307.method3685((long) var1);
            class259 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3308.method4263(19, var1);
                class259 var5 = new class259();
                if (var4 != null) {
                    var5.method4480(new class185(var4));
                }
                class259.field3307.method3687(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1231[var1] = var3.field3309;
        }
        this.field1228 = new boolean[this.field1230.length];
        for (int var7 = 0; var7 < this.field1230.length; var7++) {
            class260 var8 = class260.method1792(var7);
            this.field1228[var7] = var8.field3313;
        }
        for (int var9 = 0; var9 < this.field1229.length; var9++) {
            this.field1229[var9] = -1;
        }
        this.method1812();
    }

    @ObfuscatedName("ci.y(III)V")
    public void method1806(int arg0, int arg1) {
        this.field1229[arg0] = arg1;
        if (this.field1231[arg0]) {
            this.field1226 = true;
        }
    }

    @ObfuscatedName("ci.c(II)I")
    public int method1807(int arg0) {
        return this.field1229[arg0];
    }

    @ObfuscatedName("ci.n(ILjava/lang/String;I)V")
    public void method1808(int arg0, String arg1) {
        this.field1230[arg0] = arg1;
        if (this.field1228[arg0]) {
            this.field1226 = true;
        }
    }

    @ObfuscatedName("ci.u(IB)Ljava/lang/String;")
    public String method1809(int arg0) {
        return this.field1230[arg0];
    }

    @ObfuscatedName("ci.i(I)V")
    public void method1810() {
        for (int var1 = 0; var1 < this.field1229.length; var1++) {
            if (!this.field1231[var1]) {
                this.field1229[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1230.length; var2++) {
            if (!this.field1228[var2]) {
                this.field1230[var2] = null;
            }
        }
    }

    @ObfuscatedName("ci.p(ZI)Ldd;")
    public class113 method1816(boolean arg0) {
        return class158.method3166("2", Statics.field3664.field3185, arg0);
    }

    @ObfuscatedName("ci.e(I)V")
    public void method1811() {
        class113 var1 = this.method1816(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1229.length; var4++) {
                if (this.field1231[var4] && this.field1229[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1230.length; var6++) {
                if (this.field1228[var6] && this.field1230[var6] != null) {
                    var2 += 2 + class185.method637(this.field1230[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3253(1);
            var7.method3254(var3);
            for (int var8 = 0; var8 < this.field1229.length; var8++) {
                if (this.field1231[var8] && this.field1229[var8] != -1) {
                    var7.method3254(var8);
                    var7.method3256(this.field1229[var8]);
                }
            }
            var7.method3254(var5);
            for (int var9 = 0; var9 < this.field1230.length; var9++) {
                if (this.field1228[var9] && this.field1230[var9] != null) {
                    var7.method3254(var9);
                    var7.method3260(this.field1230[var9]);
                }
            }
            var1.method2324(var7.field2373, 0, var7.field2374);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2331();
            } catch (Exception var20) {
            }
        }
        this.field1226 = false;
        this.field1227 = class187.method1700();
    }

    @ObfuscatedName("ci.s(I)V")
    public void method1812() {
        class113 var1 = this.method1816(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2327()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2328(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2373.length - var5.field2374 < 1) {
                    return;
                }
                int var7 = var5.method3299();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3280();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3280();
                        int var12 = var5.method3374();
                        if (this.field1231[var11]) {
                            this.field1229[var11] = var12;
                        }
                    }
                    int var13 = var5.method3280();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method3280();
                        String var16 = var5.method3277();
                        if (this.field1228[var15]) {
                            this.field1230[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2331();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1226 = false;
    }

    @ObfuscatedName("ci.v(B)V")
    public void method1813() {
        if (this.field1226 && this.field1227 < class187.method1700() - 60000L) {
            this.method1811();
        }
    }

    @ObfuscatedName("ci.k(I)Z")
    public boolean method1814() {
        return this.field1226;
    }
}
