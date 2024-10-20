package deob;

import java.io.EOFException;

@ObfuscatedName("cd")
public class class85 {

    @ObfuscatedName("cd.e")
    public boolean[] field1238 = new boolean[this.field1240.length];

    @ObfuscatedName("cd.q")
    public boolean[] field1239;

    @ObfuscatedName("cd.c")
    public int[] field1240 = new int[Statics.field506.method4496(19)];

    @ObfuscatedName("cd.l")
    public String[] field1237 = new String[Statics.field506.method4496(15)];

    @ObfuscatedName("cd.b")
    public boolean field1242 = false;

    @ObfuscatedName("cd.w")
    public long field1246;

    public class85() {
        for (int var1 = 0; var1 < this.field1240.length; var1++) {
            class259 var2 = Statics.method4561(var1);
            this.field1238[var1] = var2.field3338;
        }
        this.field1239 = new boolean[this.field1237.length];
        for (int var3 = 0; var3 < this.field1237.length; var3++) {
            class260 var4 = class260.method1(var3);
            this.field1239[var3] = var4.field3342;
        }
        for (int var5 = 0; var5 < this.field1240.length; var5++) {
            this.field1240[var5] = -1;
        }
        this.method1963();
    }

    @ObfuscatedName("cd.g(III)V")
    public void method1984(int arg0, int arg1) {
        this.field1240[arg0] = arg1;
        if (this.field1238[arg0]) {
            this.field1242 = true;
        }
    }

    @ObfuscatedName("cd.r(II)I")
    public int method1961(int arg0) {
        return this.field1240[arg0];
    }

    @ObfuscatedName("cd.e(ILjava/lang/String;B)V")
    public void method1976(int arg0, String arg1) {
        this.field1237[arg0] = arg1;
        if (this.field1239[arg0]) {
            this.field1242 = true;
        }
    }

    @ObfuscatedName("cd.q(II)Ljava/lang/String;")
    public String method1959(int arg0) {
        return this.field1237[arg0];
    }

    @ObfuscatedName("cd.c(I)V")
    public void method1978() {
        for (int var1 = 0; var1 < this.field1240.length; var1++) {
            if (!this.field1238[var1]) {
                this.field1240[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1237.length; var2++) {
            if (!this.field1239[var2]) {
                this.field1237[var2] = null;
            }
        }
    }

    @ObfuscatedName("cd.i(ZI)Ldn;")
    public class113 method1965(boolean arg0) {
        return class158.method86("2", Statics.field647.field3203, arg0);
    }

    @ObfuscatedName("cd.p(I)V")
    public void method1966() {
        class113 var1 = this.method1965(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1240.length; var4++) {
                if (this.field1238[var4] && this.field1240[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1237.length; var6++) {
                if (this.field1239[var6] && this.field1237[var6] != null) {
                    var2 += 2 + class185.method2245(this.field1237[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3501(1);
            var7.method3450(var3);
            for (int var8 = 0; var8 < this.field1240.length; var8++) {
                if (this.field1238[var8] && this.field1240[var8] != -1) {
                    var7.method3450(var8);
                    var7.method3617(this.field1240[var8]);
                }
            }
            var7.method3450(var5);
            for (int var9 = 0; var9 < this.field1237.length; var9++) {
                if (this.field1239[var9] && this.field1237[var9] != null) {
                    var7.method3450(var9);
                    var7.method3585(this.field1237[var9]);
                }
            }
            var1.method2514(var7.field2405, 0, var7.field2406);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2515();
            } catch (Exception var20) {
            }
        }
        this.field1242 = false;
        this.field1246 = class187.method2664();
    }

    @ObfuscatedName("cd.m(I)V")
    public void method1963() {
        class113 var1 = this.method1965(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method2517()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2518(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2405.length - var5.field2406 >= 1) {
                    int var7 = var5.method3679();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method3467();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3467();
                        int var12 = var5.method3588();
                        if (this.field1238[var11]) {
                            this.field1240[var11] = var12;
                        }
                    }
                    int var13 = var5.method3467();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method3467();
                        String var16 = var5.method3474();
                        if (this.field1239[var15]) {
                            this.field1237[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method2515();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1242 = false;
    }

    @ObfuscatedName("cd.d(I)V")
    public void method1960() {
        if (this.field1242 && this.field1246 < class187.method2664() - 60000L) {
            this.method1966();
        }
    }

    @ObfuscatedName("cd.j(B)Z")
    public boolean method1969() {
        return this.field1242;
    }
}
