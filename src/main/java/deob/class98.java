package deob;

import java.io.EOFException;

@ObfuscatedName("ca")
public class class98 {

    @ObfuscatedName("ca.m")
    public boolean[] field1520 = new boolean[this.field1522.length];

    @ObfuscatedName("ca.g")
    public boolean[] field1521;

    @ObfuscatedName("ca.d")
    public int[] field1522 = new int[Statics.field351.method3771(19)];

    @ObfuscatedName("ca.b")
    public String[] field1523 = new String[Statics.field351.method3771(15)];

    @ObfuscatedName("ca.k")
    public boolean field1518 = false;

    @ObfuscatedName("ca.f")
    public long field1525;

    public class98() {
        for (int var1 = 0; var1 < this.field1522.length; var1++) {
            class244 var2 = (class244) class244.field3289.method3248((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3291.method3760(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method3938(new class174(var4));
                }
                class244.field3289.method3250(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1520[var1] = var3.field3290;
        }
        this.field1521 = new boolean[this.field1523.length];
        for (int var7 = 0; var7 < this.field1523.length; var7++) {
            class245 var8 = (class245) class245.field3293.method3248((long) var7);
            class245 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3295.method3760(15, var7);
                class245 var11 = new class245();
                if (var10 != null) {
                    var11.method3949(new class174(var10));
                }
                class245.field3293.method3250(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1521[var7] = var9.field3294;
        }
        for (int var13 = 0; var13 < this.field1522.length; var13++) {
            this.field1522[var13] = -1;
        }
        this.method1636();
    }

    @ObfuscatedName("ca.e(III)V")
    public void method1629(int arg0, int arg1) {
        this.field1522[arg0] = arg1;
        if (this.field1520[arg0]) {
            this.field1518 = true;
        }
    }

    @ObfuscatedName("ca.o(II)I")
    public int method1630(int arg0) {
        return this.field1522[arg0];
    }

    @ObfuscatedName("ca.m(ILjava/lang/String;I)V")
    public void method1631(int arg0, String arg1) {
        this.field1523[arg0] = arg1;
        if (this.field1521[arg0]) {
            this.field1518 = true;
        }
    }

    @ObfuscatedName("ca.g(II)Ljava/lang/String;")
    public String method1632(int arg0) {
        return this.field1523[arg0];
    }

    @ObfuscatedName("ca.d(B)V")
    public void method1633() {
        for (int var1 = 0; var1 < this.field1522.length; var1++) {
            if (!this.field1520[var1]) {
                this.field1522[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1523.length; var2++) {
            if (!this.field1521[var2]) {
                this.field1523[var2] = null;
            }
        }
    }

    @ObfuscatedName("ca.b(ZI)Ldi;")
    public class125 method1634(boolean arg0) {
        return class156.method1853("2", Statics.field1105.field3174, arg0);
    }

    @ObfuscatedName("ca.k(I)V")
    public void method1635() {
        class125 var1 = this.method1634(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1522.length; var4++) {
                if (this.field1520[var4] && this.field1522[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1523.length; var6++) {
                if (this.field1521[var6] && this.field1523[var6] != null) {
                    var2 += 2 + class174.method2750(this.field1523[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2876(1);
            var7.method2877(var3);
            for (int var8 = 0; var8 < this.field1522.length; var8++) {
                if (this.field1520[var8] && this.field1522[var8] != -1) {
                    var7.method2877(var8);
                    var7.method3055(this.field1522[var8]);
                }
            }
            var7.method2877(var5);
            for (int var9 = 0; var9 < this.field1523.length; var9++) {
                if (this.field1521[var9] && this.field1523[var9] != null) {
                    var7.method2877(var9);
                    var7.method2936(this.field1523[var9]);
                }
            }
            var1.method2135(var7.field2373, 0, var7.field2370);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2145();
            } catch (Exception var20) {
            }
        }
        this.field1518 = false;
        this.field1525 = class176.method218();
    }

    @ObfuscatedName("ca.q(I)V")
    public void method1636() {
        class125 var1 = this.method1634(false);
        try {
            byte[] var2 = new byte[(int) var1.method2139()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method2140(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class174 var5 = new class174(var2);
            if (var5.field2373.length - var5.field2370 < 1) {
                return;
            }
            int var7 = var5.method2891();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2930();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2930();
                int var12 = var5.method2896();
                if (this.field1520[var11]) {
                    this.field1522[var11] = var12;
                }
            }
            int var13 = var5.method2930();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2930();
                String var16 = var5.method2899();
                if (this.field1521[var15]) {
                    this.field1523[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method2145();
            } catch (Exception var29) {
            }
        }
        this.field1518 = false;
    }

    @ObfuscatedName("ca.h(B)V")
    public void method1637() {
        if (this.field1518 && this.field1525 < class176.method218() - 60000L) {
            this.method1635();
        }
    }

    @ObfuscatedName("ca.i(I)Z")
    public boolean method1638() {
        return this.field1518;
    }
}
