package deob;

import java.io.EOFException;

@ObfuscatedName("ce")
public class class85 {

    @ObfuscatedName("ce.m")
    public boolean[] field1226 = new boolean[this.field1228.length];

    @ObfuscatedName("ce.j")
    public boolean[] field1227;

    @ObfuscatedName("ce.g")
    public int[] field1228 = new int[Statics.field2320.method4222(19)];

    @ObfuscatedName("ce.i")
    public String[] field1229 = new String[Statics.field2320.method4222(15)];

    @ObfuscatedName("ce.h")
    public boolean field1230 = false;

    @ObfuscatedName("ce.l")
    public long field1231;

    public class85() {
        for (int var1 = 0; var1 < this.field1228.length; var1++) {
            class259 var2 = class259.method4667(var1);
            this.field1226[var1] = var2.field3293;
        }
        this.field1227 = new boolean[this.field1229.length];
        for (int var3 = 0; var3 < this.field1229.length; var3++) {
            class260 var4 = class260.method4195(var3);
            this.field1227[var3] = var4.field3300;
        }
        for (int var5 = 0; var5 < this.field1228.length; var5++) {
            this.field1228[var5] = -1;
        }
        this.method1773();
    }

    @ObfuscatedName("ce.c(III)V")
    public void method1766(int arg0, int arg1) {
        this.field1228[arg0] = arg1;
        if (this.field1226[arg0]) {
            this.field1230 = true;
        }
    }

    @ObfuscatedName("ce.q(IB)I")
    public int method1776(int arg0) {
        return this.field1228[arg0];
    }

    @ObfuscatedName("ce.m(ILjava/lang/String;I)V")
    public void method1768(int arg0, String arg1) {
        this.field1229[arg0] = arg1;
        if (this.field1227[arg0]) {
            this.field1230 = true;
        }
    }

    @ObfuscatedName("ce.j(II)Ljava/lang/String;")
    public String method1769(int arg0) {
        return this.field1229[arg0];
    }

    @ObfuscatedName("ce.g(I)V")
    public void method1770() {
        for (int var1 = 0; var1 < this.field1228.length; var1++) {
            if (!this.field1226[var1]) {
                this.field1228[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1229.length; var2++) {
            if (!this.field1227[var2]) {
                this.field1229[var2] = null;
            }
        }
    }

    @ObfuscatedName("ce.i(ZB)Ldw;")
    public class113 method1783(boolean arg0) {
        return class158.method3074("2", Statics.field391.field3176, arg0);
    }

    @ObfuscatedName("ce.h(I)V")
    public void method1772() {
        class113 var1 = this.method1783(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1228.length; var4++) {
                if (this.field1226[var4] && this.field1228[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1229.length; var6++) {
                if (this.field1227[var6] && this.field1229[var6] != null) {
                    var2 += 2 + class185.method1686(this.field1229[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3227(1);
            var7.method3383(var3);
            for (int var8 = 0; var8 < this.field1228.length; var8++) {
                if (this.field1226[var8] && this.field1228[var8] != -1) {
                    var7.method3383(var8);
                    var7.method3230(this.field1228[var8]);
                }
            }
            var7.method3383(var5);
            for (int var9 = 0; var9 < this.field1229.length; var9++) {
                if (this.field1227[var9] && this.field1229[var9] != null) {
                    var7.method3383(var9);
                    var7.method3234(this.field1229[var9]);
                }
            }
            var1.method2265(var7.field2388, 0, var7.field2386);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2266();
            } catch (Exception var20) {
            }
        }
        this.field1230 = false;
        this.field1231 = class187.method918();
    }

    @ObfuscatedName("ce.l(I)V")
    public void method1773() {
        class113 var1 = this.method1783(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2268()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2269(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2388.length - var5.field2386 < 1) {
                    return;
                }
                int var7 = var5.method3243();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3245();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3245();
                        int var12 = var5.method3323();
                        if (this.field1226[var11]) {
                            this.field1228[var11] = var12;
                        }
                    }
                    int var13 = var5.method3245();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3245();
                        String var16 = var5.method3251();
                        if (this.field1227[var15]) {
                            this.field1229[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2266();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1230 = false;
    }

    @ObfuscatedName("ce.o(I)V")
    public void method1774() {
        if (this.field1230 && this.field1231 < class187.method918() - 60000L) {
            this.method1772();
        }
    }

    @ObfuscatedName("ce.k(I)Z")
    public boolean method1775() {
        return this.field1230;
    }
}
