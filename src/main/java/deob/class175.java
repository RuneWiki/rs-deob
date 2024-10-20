package deob;

@ObfuscatedName("fd")
public class class175 extends class407 {

    @ObfuscatedName("fd.f")
    public static class257 field1894 = new class257(64);

    @ObfuscatedName("fd.n")
    public static class257 field1893 = new class257(64);

    @ObfuscatedName("fd.k")
    public int field1890;

    @ObfuscatedName("fd.q")
    public int field1895 = 255;

    @ObfuscatedName("fd.m")
    public int field1896 = 255;

    @ObfuscatedName("fd.x")
    public int field1903 = -1;

    @ObfuscatedName("fd.j")
    public int field1898 = 1;

    @ObfuscatedName("fd.v")
    public int field1891 = 70;

    @ObfuscatedName("fd.h")
    public int field1900 = -1;

    @ObfuscatedName("fd.t")
    public int field1899 = -1;

    @ObfuscatedName("fd.u")
    public int field1902 = 30;

    @ObfuscatedName("fd.d")
    public int field1892 = 0;

    @ObfuscatedName("bu.c(Llv;Llv;I)V")
    public static void method2116(class317 arg0, class317 arg1) {
        Statics.field1901 = arg0;
        Statics.field1897 = arg1;
    }

    @ObfuscatedName("fd.p(Lqq;I)V")
    public void method3233(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3230(arg0, var2);
        }
    }

    @ObfuscatedName("fd.f(Lqq;II)V")
    public void method3230(class445 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7198();
        } else if (arg1 == 2) {
            this.field1895 = arg0.method7196();
        } else if (arg1 == 3) {
            this.field1896 = arg0.method7196();
        } else if (arg1 == 4) {
            this.field1903 = 0;
        } else if (arg1 == 5) {
            this.field1891 = arg0.method7198();
        } else if (arg1 == 6) {
            arg0.method7196();
        } else if (arg1 == 7) {
            this.field1900 = arg0.method7301();
        } else if (arg1 == 8) {
            this.field1899 = arg0.method7301();
        } else if (arg1 == 11) {
            this.field1903 = arg0.method7198();
        } else if (arg1 == 14) {
            this.field1902 = arg0.method7196();
        } else if (arg1 == 15) {
            this.field1892 = arg0.method7196();
        }
    }

    @ObfuscatedName("fd.n(I)Lqi;")
    public class458 method3231() {
        if (this.field1900 < 0) {
            return null;
        }
        class458 var1 = (class458) field1893.method4789((long) this.field1900);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field1897, this.field1900, 0);
        if (var2 != null) {
            field1893.method4781(var2, (long) this.field1900);
        }
        return var2;
    }

    @ObfuscatedName("fd.k(I)Lqi;")
    public class458 method3232() {
        if (this.field1899 < 0) {
            return null;
        }
        class458 var1 = (class458) field1893.method4789((long) this.field1899);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field1897, this.field1899, 0);
        if (var2 != null) {
            field1893.method4781(var2, (long) this.field1899);
        }
        return var2;
    }
}
