package deob;

@ObfuscatedName("fr")
public class class175 extends class406 {

    @ObfuscatedName("fr.l")
    public static class257 field1913 = new class257(64);

    @ObfuscatedName("fr.k")
    public static class257 field1910 = new class257(64);

    @ObfuscatedName("fr.a")
    public int field1909;

    @ObfuscatedName("fr.s")
    public int field1918 = 255;

    @ObfuscatedName("fr.r")
    public int field1914 = 255;

    @ObfuscatedName("fr.v")
    public int field1915 = -1;

    @ObfuscatedName("fr.y")
    public int field1916 = 1;

    @ObfuscatedName("fr.c")
    public int field1917 = 70;

    @ObfuscatedName("fr.w")
    public int field1911 = -1;

    @ObfuscatedName("fr.b")
    public int field1919 = -1;

    @ObfuscatedName("fr.t")
    public int field1920 = 30;

    @ObfuscatedName("fr.g")
    public int field1921 = 0;

    @ObfuscatedName("fr.o(Lpx;I)V")
    public void method3067(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3069(arg0, var2);
        }
    }

    @ObfuscatedName("fr.q(Lpx;IB)V")
    public void method3069(class440 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7082();
        } else if (arg1 == 2) {
            this.field1918 = arg0.method7071();
        } else if (arg1 == 3) {
            this.field1914 = arg0.method7071();
        } else if (arg1 == 4) {
            this.field1915 = 0;
        } else if (arg1 == 5) {
            this.field1917 = arg0.method7082();
        } else if (arg1 == 6) {
            arg0.method7071();
        } else if (arg1 == 7) {
            this.field1911 = arg0.method6910();
        } else if (arg1 == 8) {
            this.field1919 = arg0.method6910();
        } else if (arg1 == 11) {
            this.field1915 = arg0.method7082();
        } else if (arg1 == 14) {
            this.field1920 = arg0.method7071();
        } else if (arg1 == 15) {
            this.field1921 = arg0.method7071();
        }
    }

    @ObfuscatedName("fr.l(I)Lqr;")
    public class453 method3070() {
        if (this.field1911 < 0) {
            return null;
        }
        class453 var1 = (class453) field1910.method4566((long) this.field1911);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field1912, this.field1911, 0);
        if (var2 != null) {
            field1910.method4571(var2, (long) this.field1911);
        }
        return var2;
    }

    @ObfuscatedName("fr.k(I)Lqr;")
    public class453 method3071() {
        if (this.field1919 < 0) {
            return null;
        }
        class453 var1 = (class453) field1910.method4566((long) this.field1919);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field1912, this.field1919, 0);
        if (var2 != null) {
            field1910.method4571(var2, (long) this.field1919);
        }
        return var2;
    }

    @ObfuscatedName("fu.a(I)V")
    public static void method3090() {
        field1913.method4569();
        field1910.method4569();
    }
}
