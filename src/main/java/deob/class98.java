package deob;

import java.io.EOFException;

@ObfuscatedName("cs")
public class class98 {

    @ObfuscatedName("cs.e")
    public boolean[] field1505 = new boolean[this.field1507.length];

    @ObfuscatedName("cs.t")
    public boolean[] field1506;

    @ObfuscatedName("cs.w")
    public int[] field1507 = new int[Statics.field25.method3784(19)];

    @ObfuscatedName("cs.z")
    public String[] field1508 = new String[Statics.field25.method3784(15)];

    @ObfuscatedName("cs.j")
    public boolean field1509 = false;

    @ObfuscatedName("cs.i")
    public long field1510;

    public class98() {
        for (int var1 = 0; var1 < this.field1507.length; var1++) {
            class244 var2 = class244.method3679(var1);
            this.field1505[var1] = var2.field3321;
        }
        this.field1506 = new boolean[this.field1508.length];
        for (int var3 = 0; var3 < this.field1508.length; var3++) {
            class245 var4 = (class245) class245.field3329.method3182((long) var3);
            class245 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field354.method3720(15, var3);
                class245 var7 = new class245();
                if (var6 != null) {
                    var7.method3898(new class174(var6));
                }
                class245.field3329.method3179(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1506[var3] = var5.field3327;
        }
        for (int var9 = 0; var9 < this.field1507.length; var9++) {
            this.field1507[var9] = -1;
        }
        this.method1595();
    }

    @ObfuscatedName("cs.p(IIS)V")
    public void method1615(int arg0, int arg1) {
        this.field1507[arg0] = arg1;
        if (this.field1505[arg0]) {
            this.field1509 = true;
        }
    }

    @ObfuscatedName("cs.m(IS)I")
    public int method1609(int arg0) {
        return this.field1507[arg0];
    }

    @ObfuscatedName("cs.e(ILjava/lang/String;I)V")
    public void method1590(int arg0, String arg1) {
        this.field1508[arg0] = arg1;
        if (this.field1506[arg0]) {
            this.field1509 = true;
        }
    }

    @ObfuscatedName("cs.t(II)Ljava/lang/String;")
    public String method1618(int arg0) {
        return this.field1508[arg0];
    }

    @ObfuscatedName("cs.w(I)V")
    public void method1592() {
        for (int var1 = 0; var1 < this.field1507.length; var1++) {
            if (!this.field1505[var1]) {
                this.field1507[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1508.length; var2++) {
            if (!this.field1506[var2]) {
                this.field1508[var2] = null;
            }
        }
    }

    @ObfuscatedName("cs.z(ZI)Ldd;")
    public class125 method1606(boolean arg0) {
        return class156.method2132("2", Statics.field1170.field3201, arg0);
    }

    @ObfuscatedName("cs.j(I)V")
    public void method1594() {
        class125 var1 = this.method1606(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1507.length; var4++) {
                if (this.field1505[var4] && this.field1507[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1508.length; var6++) {
                if (this.field1506[var6] && this.field1508[var6] != null) {
                    var2 += 2 + class174.method954(this.field1508[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2961(1);
            var7.method2957(var3);
            for (int var8 = 0; var8 < this.field1507.length; var8++) {
                if (this.field1505[var8] && this.field1507[var8] != -1) {
                    var7.method2957(var8);
                    var7.method2798(this.field1507[var8]);
                }
            }
            var7.method2957(var5);
            for (int var9 = 0; var9 < this.field1508.length; var9++) {
                if (this.field1506[var9] && this.field1508[var9] != null) {
                    var7.method2957(var9);
                    var7.method2902(this.field1508[var9]);
                }
            }
            var1.method2091(var7.field2415, 0, var7.field2408);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2101();
            } catch (Exception var20) {
            }
        }
        this.field1509 = false;
        this.field1510 = class176.method2747();
    }

    @ObfuscatedName("cs.c(I)V")
    public void method1595() {
        class125 var1 = this.method1606(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2093()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2094(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2415.length - var5.field2408 >= 1) {
                    int var7 = var5.method2810();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2824();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2824();
                            int var12 = var5.method2803();
                            if (this.field1505[var11]) {
                                this.field1507[var11] = var12;
                            }
                        }
                        int var13 = var5.method2824();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2824();
                            String var16 = var5.method2818();
                            if (this.field1506[var15]) {
                                this.field1508[var15] = var16;
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
                    var1.method2101();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1509 = false;
    }

    @ObfuscatedName("cs.o(I)V")
    public void method1596() {
        if (this.field1509 && this.field1510 < class176.method2747() - 60000L) {
            this.method1594();
        }
    }

    @ObfuscatedName("cs.q(B)Z")
    public boolean method1597() {
        return this.field1509;
    }
}
