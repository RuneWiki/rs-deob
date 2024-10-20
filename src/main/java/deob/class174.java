package deob;

@ObfuscatedName("fi")
public class class174 extends class406 {

    @ObfuscatedName("fi.w")
    public static class256 field1861 = new class256(64);

    @ObfuscatedName("fi.v")
    public static class256 field1862 = new class256(64);

    @ObfuscatedName("fi.c")
    public int field1863;

    @ObfuscatedName("fi.k")
    public int field1872 = 255;

    @ObfuscatedName("fi.o")
    public int field1866 = 255;

    @ObfuscatedName("fi.n")
    public int field1867 = -1;

    @ObfuscatedName("fi.d")
    public int field1868 = 1;

    @ObfuscatedName("fi.a")
    public int field1876 = 70;

    @ObfuscatedName("fi.m")
    public int field1870 = -1;

    @ObfuscatedName("fi.u")
    public int field1877 = -1;

    @ObfuscatedName("fi.l")
    public int field1873 = 30;

    @ObfuscatedName("fi.z")
    public int field1859 = 0;

    @ObfuscatedName("fi.s(Lqr;B)V")
    public void method3033(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3037(arg0, var2);
        }
    }

    @ObfuscatedName("fi.h(Lqr;IB)V")
    public void method3037(class444 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7120();
        } else if (arg1 == 2) {
            this.field1872 = arg0.method6929();
        } else if (arg1 == 3) {
            this.field1866 = arg0.method6929();
        } else if (arg1 == 4) {
            this.field1867 = 0;
        } else if (arg1 == 5) {
            this.field1876 = arg0.method7120();
        } else if (arg1 == 6) {
            arg0.method6929();
        } else if (arg1 == 7) {
            this.field1870 = arg0.method6945();
        } else if (arg1 == 8) {
            this.field1877 = arg0.method6945();
        } else if (arg1 == 11) {
            this.field1867 = arg0.method7120();
        } else if (arg1 == 14) {
            this.field1873 = arg0.method6929();
        } else if (arg1 == 15) {
            this.field1859 = arg0.method6929();
        }
    }

    @ObfuscatedName("fi.w(I)Lqn;")
    public class457 method3035() {
        if (this.field1870 < 0) {
            return null;
        }
        class457 var1 = (class457) field1862.method4599((long) this.field1870);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field1860, this.field1870, 0);
        if (var2 != null) {
            field1862.method4600(var2, (long) this.field1870);
        }
        return var2;
    }

    @ObfuscatedName("fi.v(B)Lqn;")
    public class457 method3036() {
        if (this.field1877 < 0) {
            return null;
        }
        class457 var1 = (class457) field1862.method4599((long) this.field1877);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field1860, this.field1877, 0);
        if (var2 != null) {
            field1862.method4600(var2, (long) this.field1877);
        }
        return var2;
    }
}
