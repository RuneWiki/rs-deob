package deob;

@ObfuscatedName("ak")
public class class41 extends class195 {

    @ObfuscatedName("ak.a")
    public static class184 field978 = new class184(64);

    @ObfuscatedName("ak.m")
    public static class184 field979 = new class184(30);

    @ObfuscatedName("ak.s")
    public int field980;

    @ObfuscatedName("ak.j")
    public int field1000;

    @ObfuscatedName("ak.f")
    public int field982 = -1;

    @ObfuscatedName("ak.b")
    public short[] field1001;

    @ObfuscatedName("ak.t")
    public short[] field984;

    @ObfuscatedName("ak.i")
    public short[] field985;

    @ObfuscatedName("ak.c")
    public short[] field976;

    @ObfuscatedName("ak.k")
    public int field987 = 128;

    @ObfuscatedName("ak.x")
    public int field990 = 128;

    @ObfuscatedName("ak.e")
    public int field989 = 0;

    @ObfuscatedName("ak.q")
    public int field981 = 0;

    @ObfuscatedName("ak.o")
    public int field995 = 0;

    @ObfuscatedName("d.n(Lfi;Lfi;B)V")
    public static void method543(class158 arg0, class158 arg1) {
        Statics.field983 = arg0;
        Statics.field977 = arg1;
    }

    @ObfuscatedName("m.g(IB)Lak;")
    public static class41 method24(int arg0) {
        class41 var1 = (class41) field978.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field983.method2929(13, arg0);
        class41 var3 = new class41();
        var3.field980 = arg0;
        if (var2 != null) {
            var3.method797(new class111(var2));
        }
        field978.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.a(Ldp;I)V")
    public void method797(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method781(arg0, var2);
        }
    }

    @ObfuscatedName("ak.m(Ldp;II)V")
    public void method781(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1000 = arg0.method2395();
        } else if (arg1 == 2) {
            this.field982 = arg0.method2395();
        } else if (arg1 == 4) {
            this.field987 = arg0.method2395();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2395();
        } else if (arg1 == 6) {
            this.field989 = arg0.method2395();
        } else if (arg1 == 7) {
            this.field981 = arg0.method2211();
        } else if (arg1 == 8) {
            this.field995 = arg0.method2211();
        } else if (arg1 == 40) {
            int var3 = arg0.method2211();
            this.field1001 = new short[var3];
            this.field984 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1001[var4] = (short) arg0.method2395();
                this.field984[var4] = (short) arg0.method2395();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2211();
            this.field985 = new short[var5];
            this.field976 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field985[var6] = (short) arg0.method2395();
                this.field976[var6] = (short) arg0.method2395();
            }
        }
    }

    @ObfuscatedName("ak.s(II)Lcs;")
    public final class100 method782(int arg0) {
        class100 var2 = (class100) field979.method3388((long) this.field980);
        if (var2 == null) {
            class95 var3 = class95.method2011(Statics.field977, this.field1000, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1001 != null) {
                for (int var4 = 0; var4 < this.field1001.length; var4++) {
                    var3.method1991(this.field1001[var4], this.field984[var4]);
                }
            }
            if (this.field985 != null) {
                for (int var5 = 0; var5 < this.field985.length; var5++) {
                    var3.method2030(this.field985[var5], this.field976[var5]);
                }
            }
            var2 = var3.method1982(this.field981 + 64, this.field995 + 850, -30, -50, -30);
            field979.method3396(var2, (long) this.field980);
        }
        class100 var6;
        if (this.field982 == -1 || arg0 == -1) {
            var6 = var2.method2070(true);
        } else {
            var6 = class40.method2146(this.field982).method751(var2, arg0);
        }
        if (this.field987 != 128 || this.field990 != 128) {
            var6.method2072(this.field987, this.field990, this.field987);
        }
        if (this.field989 != 0) {
            if (this.field989 == 90) {
                var6.method2067();
            }
            if (this.field989 == 180) {
                var6.method2067();
                var6.method2067();
            }
            if (this.field989 == 270) {
                var6.method2067();
                var6.method2067();
                var6.method2067();
            }
        }
        return var6;
    }
}
