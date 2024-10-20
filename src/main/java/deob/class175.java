package deob;

@ObfuscatedName("fv")
public class class175 extends class404 {

    @ObfuscatedName("fv.i")
    public static class257 field1860 = new class257(64);

    @ObfuscatedName("fv.f")
    public static class257 field1862 = new class257(64);

    @ObfuscatedName("fv.b")
    public int field1863;

    @ObfuscatedName("fv.l")
    public int field1861 = 255;

    @ObfuscatedName("fv.q")
    public int field1859 = 255;

    @ObfuscatedName("fv.o")
    public int field1866 = -1;

    @ObfuscatedName("fv.r")
    public int field1867 = 1;

    @ObfuscatedName("fv.p")
    public int field1868 = 70;

    @ObfuscatedName("fv.w")
    public int field1869 = -1;

    @ObfuscatedName("fv.k")
    public int field1870 = -1;

    @ObfuscatedName("fv.d")
    public int field1871 = 30;

    @ObfuscatedName("fv.m")
    public int field1872 = 0;

    @ObfuscatedName("dd.v(Lln;Lln;B)V")
    public static void method2470(class316 arg0, class316 arg1) {
        Statics.field1865 = arg0;
        Statics.field1864 = arg1;
    }

    @ObfuscatedName("ec.c(IB)Lfv;")
    public static class175 method2697(int arg0) {
        class175 var1 = (class175) field1860.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1865.method5296(33, arg0);
        class175 var3 = new class175();
        if (var2 != null) {
            var3.method3124(new class438(var2));
        }
        field1860.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fv.i(Lpi;I)V")
    public void method3124(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3125(arg0, var2);
        }
    }

    @ObfuscatedName("fv.f(Lpi;IB)V")
    public void method3125(class438 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7148();
        } else if (arg1 == 2) {
            this.field1861 = arg0.method6971();
        } else if (arg1 == 3) {
            this.field1859 = arg0.method6971();
        } else if (arg1 == 4) {
            this.field1866 = 0;
        } else if (arg1 == 5) {
            this.field1868 = arg0.method7148();
        } else if (arg1 == 6) {
            arg0.method6971();
        } else if (arg1 == 7) {
            this.field1869 = arg0.method6989();
        } else if (arg1 == 8) {
            this.field1870 = arg0.method6989();
        } else if (arg1 == 11) {
            this.field1866 = arg0.method7148();
        } else if (arg1 == 14) {
            this.field1871 = arg0.method6971();
        } else if (arg1 == 15) {
            this.field1872 = arg0.method6971();
        }
    }

    @ObfuscatedName("fv.b(I)Lqi;")
    public class451 method3126() {
        if (this.field1869 < 0) {
            return null;
        }
        class451 var1 = (class451) field1862.method4644((long) this.field1869);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field1864, this.field1869, 0);
        if (var2 != null) {
            field1862.method4651(var2, (long) this.field1869);
        }
        return var2;
    }

    @ObfuscatedName("fv.n(I)Lqi;")
    public class451 method3133() {
        if (this.field1870 < 0) {
            return null;
        }
        class451 var1 = (class451) field1862.method4644((long) this.field1870);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field1864, this.field1870, 0);
        if (var2 != null) {
            field1862.method4651(var2, (long) this.field1870);
        }
        return var2;
    }
}
