package deob;

@ObfuscatedName("ar")
public class class39 extends class182 {

    @ObfuscatedName("ar.h")
    public static class171 field928 = new class171(64);

    @ObfuscatedName("ar.v")
    public static class171 field929 = new class171(30);

    @ObfuscatedName("ar.q")
    public int field927;

    @ObfuscatedName("ar.s")
    public int field941;

    @ObfuscatedName("ar.g")
    public int field932 = -1;

    @ObfuscatedName("ar.u")
    public short[] field933;

    @ObfuscatedName("ar.d")
    public short[] field934;

    @ObfuscatedName("ar.y")
    public short[] field931;

    @ObfuscatedName("ar.e")
    public short[] field936;

    @ObfuscatedName("ar.l")
    public int field937 = 128;

    @ObfuscatedName("ar.o")
    public int field938 = 128;

    @ObfuscatedName("ar.w")
    public int field939 = 0;

    @ObfuscatedName("ar.t")
    public int field940 = 0;

    @ObfuscatedName("ar.z")
    public int field930 = 0;

    @ObfuscatedName("c.i(Ler;Ler;B)V")
    public static void method9(class146 arg0, class146 arg1) {
        Statics.field1758 = arg0;
        Statics.field935 = arg1;
    }

    @ObfuscatedName("go.c(IB)Lar;")
    public static class39 method3346(int arg0) {
        class39 var1 = (class39) field928.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1758.method2811(13, arg0);
        class39 var3 = new class39();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method750(new class107(var2));
        }
        field928.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.h(Ldm;I)V")
    public void method750(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method768(arg0, var2);
        }
    }

    @ObfuscatedName("ar.v(Ldm;II)V")
    public void method768(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field941 = arg0.method2313();
        } else if (arg1 == 2) {
            this.field932 = arg0.method2313();
        } else if (arg1 == 4) {
            this.field937 = arg0.method2313();
        } else if (arg1 == 5) {
            this.field938 = arg0.method2313();
        } else if (arg1 == 6) {
            this.field939 = arg0.method2313();
        } else if (arg1 == 7) {
            this.field940 = arg0.method2151();
        } else if (arg1 == 8) {
            this.field930 = arg0.method2151();
        } else if (arg1 == 40) {
            int var3 = arg0.method2151();
            this.field933 = new short[var3];
            this.field934 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field933[var4] = (short) arg0.method2313();
                this.field934[var4] = (short) arg0.method2313();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2151();
            this.field931 = new short[var5];
            this.field936 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field931[var6] = (short) arg0.method2313();
                this.field936[var6] = (short) arg0.method2313();
            }
        }
    }

    @ObfuscatedName("ar.q(II)Lcc;")
    public final class98 method752(int arg0) {
        class98 var2 = (class98) field929.method3185((long) this.field927);
        if (var2 == null) {
            class93 var3 = class93.method1903(Statics.field935, this.field941, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field933 != null) {
                for (int var4 = 0; var4 < this.field933.length; var4++) {
                    var3.method1915(this.field933[var4], this.field934[var4]);
                }
            }
            if (this.field931 != null) {
                for (int var5 = 0; var5 < this.field931.length; var5++) {
                    var3.method1916(this.field931[var5], this.field936[var5]);
                }
            }
            var2 = var3.method1902(this.field940 + 64, this.field930 + 850, -30, -50, -30);
            field929.method3186(var2, (long) this.field927);
        }
        class98 var6;
        if (this.field932 == -1 || arg0 == -1) {
            var6 = var2.method2004(true);
        } else {
            var6 = class38.method3551(this.field932).method735(var2, arg0);
        }
        if (this.field937 != 128 || this.field938 != 128) {
            var6.method2017(this.field937, this.field938, this.field937);
        }
        if (this.field939 != 0) {
            if (this.field939 == 90) {
                var6.method2050();
            }
            if (this.field939 == 180) {
                var6.method2050();
                var6.method2050();
            }
            if (this.field939 == 270) {
                var6.method2050();
                var6.method2050();
                var6.method2050();
            }
        }
        return var6;
    }

    @ObfuscatedName("ab.s(B)V")
    public static void method652() {
        field928.method3188();
        field929.method3188();
    }
}
