package deob;

import java.io.EOFException;

@ObfuscatedName("ci")
public class class98 {

    @ObfuscatedName("ci.u")
    public boolean[] field1503 = new boolean[this.field1505.length];

    @ObfuscatedName("ci.q")
    public boolean[] field1504;

    @ObfuscatedName("ci.g")
    public int[] field1505 = new int[Statics.field312.method3846(19)];

    @ObfuscatedName("ci.v")
    public String[] field1512 = new String[Statics.field312.method3846(15)];

    @ObfuscatedName("ci.t")
    public boolean field1507 = false;

    @ObfuscatedName("ci.p")
    public long field1513;

    public class98() {
        for (int var1 = 0; var1 < this.field1505.length; var1++) {
            class244 var2 = (class244) class244.field3304.method3308((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3303.method3836(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method4033(new class174(var4));
                }
                class244.field3304.method3316(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1503[var1] = var3.field3305;
        }
        this.field1504 = new boolean[this.field1512.length];
        for (int var7 = 0; var7 < this.field1512.length; var7++) {
            class245 var8 = class245.method3933(var7);
            this.field1504[var7] = var8.field3310;
        }
        for (int var9 = 0; var9 < this.field1505.length; var9++) {
            this.field1505[var9] = -1;
        }
        this.method1679();
    }

    @ObfuscatedName("ci.i(III)V")
    public void method1672(int arg0, int arg1) {
        this.field1505[arg0] = arg1;
        if (this.field1503[arg0]) {
            this.field1507 = true;
        }
    }

    @ObfuscatedName("ci.h(II)I")
    public int method1673(int arg0) {
        return this.field1505[arg0];
    }

    @ObfuscatedName("ci.u(ILjava/lang/String;B)V")
    public void method1702(int arg0, String arg1) {
        this.field1512[arg0] = arg1;
        if (this.field1504[arg0]) {
            this.field1507 = true;
        }
    }

    @ObfuscatedName("ci.q(IB)Ljava/lang/String;")
    public String method1681(int arg0) {
        return this.field1512[arg0];
    }

    @ObfuscatedName("ci.g(I)V")
    public void method1676() {
        for (int var1 = 0; var1 < this.field1505.length; var1++) {
            if (!this.field1503[var1]) {
                this.field1505[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1512.length; var2++) {
            if (!this.field1504[var2]) {
                this.field1512[var2] = null;
            }
        }
    }

    @ObfuscatedName("ci.v(ZI)Ldp;")
    public class125 method1677(boolean arg0) {
        return class156.method105("2", Statics.field26.field3188, arg0);
    }

    @ObfuscatedName("ci.t(I)V")
    public void method1678() {
        class125 var1 = this.method1677(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1505.length; var4++) {
                if (this.field1503[var4] && this.field1505[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1512.length; var6++) {
                if (this.field1504[var6] && this.field1512[var6] != null) {
                    var2 += 2 + class174.method640(this.field1512[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method3031(1);
            var7.method2917(var3);
            for (int var8 = 0; var8 < this.field1505.length; var8++) {
                if (this.field1503[var8] && this.field1505[var8] != -1) {
                    var7.method2917(var8);
                    var7.method2919(this.field1505[var8]);
                }
            }
            var7.method2917(var5);
            for (int var9 = 0; var9 < this.field1512.length; var9++) {
                if (this.field1504[var9] && this.field1512[var9] != null) {
                    var7.method2917(var9);
                    var7.method2922(this.field1512[var9]);
                }
            }
            var1.method2168(var7.field2387, 0, var7.field2384);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2169();
            } catch (Exception var20) {
            }
        }
        this.field1507 = false;
        this.field1513 = class176.method3821();
    }

    @ObfuscatedName("ci.p(I)V")
    public void method1679() {
        class125 var1 = this.method1677(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method2170()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2171(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2387.length - var5.field2384 >= 1) {
                    int var7 = var5.method2930();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2932();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2932();
                        int var12 = var5.method2927();
                        if (this.field1503[var11]) {
                            this.field1505[var11] = var12;
                        }
                    }
                    int var13 = var5.method2932();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2932();
                        String var16 = var5.method2938();
                        if (this.field1504[var15]) {
                            this.field1512[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method2169();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1507 = false;
    }

    @ObfuscatedName("ci.l(I)V")
    public void method1680() {
        if (this.field1507 && this.field1513 < class176.method3821() - 60000L) {
            this.method1678();
        }
    }

    @ObfuscatedName("ci.a(I)Z")
    public boolean method1693() {
        return this.field1507;
    }
}
