package deob;

@ObfuscatedName("fb")
public class class181 extends class425 {

    @ObfuscatedName("fb.c")
    public static class266 field1929 = new class266(64);

    @ObfuscatedName("fb.x")
    public static class266 field1916 = new class266(64);

    @ObfuscatedName("fb.h")
    public int field1930;

    @ObfuscatedName("fb.d")
    public int field1919 = 255;

    @ObfuscatedName("fb.n")
    public int field1920 = 255;

    @ObfuscatedName("fb.r")
    public int field1921 = -1;

    @ObfuscatedName("fb.l")
    public int field1927 = 1;

    @ObfuscatedName("fb.s")
    public int field1923 = 70;

    @ObfuscatedName("fb.p")
    public int field1922 = -1;

    @ObfuscatedName("fb.b")
    public int field1915 = -1;

    @ObfuscatedName("fb.o")
    public int field1926 = 30;

    @ObfuscatedName("fb.u")
    public int field1917 = 0;

    @ObfuscatedName("bq.a(Llg;Llg;I)V")
    public static void method1075(class330 arg0, class330 arg1) {
        Statics.field1925 = arg0;
        Statics.field1914 = arg1;
    }

    @ObfuscatedName("mh.f(II)Lfb;")
    public static class181 method6014(int arg0) {
        class181 var1 = (class181) field1929.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1925.method5859(33, arg0);
        class181 var3 = new class181();
        if (var2 != null) {
            var3.method3200(new class464(var2));
        }
        field1929.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.c(Lqr;S)V")
    public void method3200(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3186(arg0, var2);
        }
    }

    @ObfuscatedName("fb.x(Lqr;IB)V")
    public void method3186(class464 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7716();
        } else if (arg1 == 2) {
            this.field1919 = arg0.method7735();
        } else if (arg1 == 3) {
            this.field1920 = arg0.method7735();
        } else if (arg1 == 4) {
            this.field1921 = 0;
        } else if (arg1 == 5) {
            this.field1923 = arg0.method7716();
        } else if (arg1 == 6) {
            arg0.method7735();
        } else if (arg1 == 7) {
            this.field1922 = arg0.method7734();
        } else if (arg1 == 8) {
            this.field1915 = arg0.method7734();
        } else if (arg1 == 11) {
            this.field1921 = arg0.method7716();
        } else if (arg1 == 14) {
            this.field1926 = arg0.method7735();
        } else if (arg1 == 15) {
            this.field1917 = arg0.method7735();
        }
    }

    @ObfuscatedName("fb.h(I)Lri;")
    public class477 method3208() {
        if (this.field1922 < 0) {
            return null;
        }
        class477 var1 = (class477) field1916.method4839((long) this.field1922);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field1914, this.field1922, 0);
        if (var2 != null) {
            field1916.method4834(var2, (long) this.field1922);
        }
        return var2;
    }

    @ObfuscatedName("fb.j(I)Lri;")
    public class477 method3202() {
        if (this.field1915 < 0) {
            return null;
        }
        class477 var1 = (class477) field1916.method4839((long) this.field1915);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field1914, this.field1915, 0);
        if (var2 != null) {
            field1916.method4834(var2, (long) this.field1915);
        }
        return var2;
    }
}
