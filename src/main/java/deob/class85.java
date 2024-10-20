package deob;

import java.io.EOFException;

@ObfuscatedName("cp")
public class class85 {

    @ObfuscatedName("cp.e")
    public boolean[] field1222 = new boolean[this.field1220.length];

    @ObfuscatedName("cp.b")
    public boolean[] field1219;

    @ObfuscatedName("cp.l")
    public int[] field1220 = new int[Statics.field1917.method4279(19)];

    @ObfuscatedName("cp.w")
    public String[] field1221 = new String[Statics.field1917.method4279(15)];

    @ObfuscatedName("cp.d")
    public boolean field1223 = false;

    @ObfuscatedName("cp.n")
    public long field1218;

    public class85() {
        for (int var1 = 0; var1 < this.field1220.length; var1++) {
            class259 var2 = (class259) class259.field3313.method3724((long) var1);
            class259 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3312.method4267(19, var1);
                class259 var5 = new class259();
                if (var4 != null) {
                    var5.method4478(new class185(var4));
                }
                class259.field3313.method3723(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1222[var1] = var3.field3314;
        }
        this.field1219 = new boolean[this.field1221.length];
        for (int var7 = 0; var7 < this.field1221.length; var7++) {
            class260 var8 = class260.method928(var7);
            this.field1219[var7] = var8.field3318;
        }
        for (int var9 = 0; var9 < this.field1220.length; var9++) {
            this.field1220[var9] = -1;
        }
        this.method1816();
    }

    @ObfuscatedName("cp.f(III)V")
    public void method1830(int arg0, int arg1) {
        this.field1220[arg0] = arg1;
        if (this.field1222[arg0]) {
            this.field1223 = true;
        }
    }

    @ObfuscatedName("cp.h(II)I")
    public int method1815(int arg0) {
        return this.field1220[arg0];
    }

    @ObfuscatedName("cp.e(ILjava/lang/String;B)V")
    public void method1806(int arg0, String arg1) {
        this.field1221[arg0] = arg1;
        if (this.field1219[arg0]) {
            this.field1223 = true;
        }
    }

    @ObfuscatedName("cp.b(IB)Ljava/lang/String;")
    public String method1807(int arg0) {
        return this.field1221[arg0];
    }

    @ObfuscatedName("cp.l(I)V")
    public void method1808() {
        for (int var1 = 0; var1 < this.field1220.length; var1++) {
            if (!this.field1222[var1]) {
                this.field1220[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1221.length; var2++) {
            if (!this.field1219[var2]) {
                this.field1221[var2] = null;
            }
        }
    }

    @ObfuscatedName("cp.w(ZI)Ldf;")
    public class113 method1809(boolean arg0) {
        return class158.method212("2", Statics.field553.field3197, arg0);
    }

    @ObfuscatedName("cp.d(I)V")
    public void method1823() {
        class113 var1 = this.method1809(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1220.length; var4++) {
                if (this.field1222[var4] && this.field1220[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1221.length; var6++) {
                if (this.field1219[var6] && this.field1221[var6] != null) {
                    var2 += 2 + class185.method459(this.field1221[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3531(1);
            var7.method3449(var3);
            for (int var8 = 0; var8 < this.field1220.length; var8++) {
                if (this.field1222[var8] && this.field1220[var8] != -1) {
                    var7.method3449(var8);
                    var7.method3528(this.field1220[var8]);
                }
            }
            var7.method3449(var5);
            for (int var9 = 0; var9 < this.field1221.length; var9++) {
                if (this.field1219[var9] && this.field1221[var9] != null) {
                    var7.method3449(var9);
                    var7.method3314(this.field1221[var9]);
                }
            }
            var1.method2347(var7.field2399, 0, var7.field2397);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2343();
            } catch (Exception var20) {
            }
        }
        this.field1223 = false;
        this.field1218 = class187.method2864();
    }

    @ObfuscatedName("cp.n(B)V")
    public void method1816() {
        class113 var1 = this.method1809(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2330()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2331(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2399.length - var5.field2397 < 1) {
                    return;
                }
                int var7 = var5.method3323();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3325();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3325();
                        int var12 = var5.method3328();
                        if (this.field1222[var11]) {
                            this.field1220[var11] = var12;
                        }
                    }
                    int var13 = var5.method3325();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method3325();
                        String var16 = var5.method3435();
                        if (this.field1219[var15]) {
                            this.field1221[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2343();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1223 = false;
    }

    @ObfuscatedName("cp.s(I)V")
    public void method1812() {
        if (this.field1223 && this.field1218 < class187.method2864() - 60000L) {
            this.method1823();
        }
    }

    @ObfuscatedName("cp.g(I)Z")
    public boolean method1811() {
        return this.field1223;
    }
}
