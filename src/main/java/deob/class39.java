package deob;

@ObfuscatedName("aj")
public class class39 extends class183 {

    @ObfuscatedName("aj.k")
    public static class172 field924 = new class172(64);

    @ObfuscatedName("aj.i")
    public static class172 field937 = new class172(30);

    @ObfuscatedName("aj.d")
    public int field926;

    @ObfuscatedName("aj.q")
    public int field927;

    @ObfuscatedName("aj.m")
    public int field928 = -1;

    @ObfuscatedName("aj.a")
    public short[] field929;

    @ObfuscatedName("aj.w")
    public short[] field930;

    @ObfuscatedName("aj.e")
    public short[] field931;

    @ObfuscatedName("aj.o")
    public short[] field932;

    @ObfuscatedName("aj.v")
    public int field925 = 128;

    @ObfuscatedName("aj.z")
    public int field934 = 128;

    @ObfuscatedName("aj.j")
    public int field935 = 0;

    @ObfuscatedName("aj.r")
    public int field936 = 0;

    @ObfuscatedName("aj.c")
    public int field923 = 0;

    @ObfuscatedName("ey.n(Lej;Lej;B)V")
    public static void method2653(class147 arg0, class147 arg1) {
        Statics.field933 = arg0;
        Statics.field2675 = arg1;
    }

    @ObfuscatedName("v.x(II)Laj;")
    public static class39 method138(int arg0) {
        class39 var1 = (class39) field924.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field933.method2738(13, arg0);
        class39 var3 = new class39();
        var3.field926 = arg0;
        if (var2 != null) {
            var3.method749(new class107(var2));
        }
        field924.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.k(Ldw;I)V")
    public void method749(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method750(arg0, var2);
        }
    }

    @ObfuscatedName("aj.i(Ldw;II)V")
    public void method750(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field927 = arg0.method2140();
        } else if (arg1 == 2) {
            this.field928 = arg0.method2140();
        } else if (arg1 == 4) {
            this.field925 = arg0.method2140();
        } else if (arg1 == 5) {
            this.field934 = arg0.method2140();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2140();
        } else if (arg1 == 7) {
            this.field936 = arg0.method2148();
        } else if (arg1 == 8) {
            this.field923 = arg0.method2148();
        } else if (arg1 == 40) {
            int var3 = arg0.method2148();
            this.field929 = new short[var3];
            this.field930 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field929[var4] = (short) arg0.method2140();
                this.field930[var4] = (short) arg0.method2140();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2148();
            this.field931 = new short[var5];
            this.field932 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field931[var6] = (short) arg0.method2140();
                this.field932[var6] = (short) arg0.method2140();
            }
        }
    }

    @ObfuscatedName("aj.d(II)Lcy;")
    public final class98 method751(int arg0) {
        class98 var2 = (class98) field937.method3115((long) this.field926);
        if (var2 == null) {
            class93 var3 = class93.method1894(Statics.field2675, this.field927, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field929 != null) {
                for (int var4 = 0; var4 < this.field929.length; var4++) {
                    var3.method1907(this.field929[var4], this.field930[var4]);
                }
            }
            if (this.field931 != null) {
                for (int var5 = 0; var5 < this.field931.length; var5++) {
                    var3.method1953(this.field931[var5], this.field932[var5]);
                }
            }
            var2 = var3.method1908(this.field936 + 64, this.field923 + 850, -30, -50, -30);
            field937.method3117(var2, (long) this.field926);
        }
        class98 var6;
        if (this.field928 == -1 || arg0 == -1) {
            var6 = var2.method2018(true);
        } else {
            var6 = class38.method658(this.field928).method716(var2, arg0);
        }
        if (this.field925 != 128 || this.field934 != 128) {
            var6.method2001(this.field925, this.field934, this.field925);
        }
        if (this.field935 != 0) {
            if (this.field935 == 90) {
                var6.method1996();
            }
            if (this.field935 == 180) {
                var6.method1996();
                var6.method1996();
            }
            if (this.field935 == 270) {
                var6.method1996();
                var6.method1996();
                var6.method1996();
            }
        }
        return var6;
    }

    @ObfuscatedName("q.q(I)V")
    public static void method45() {
        field924.method3124();
        field937.method3124();
    }
}
