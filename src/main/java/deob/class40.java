package deob;

@ObfuscatedName("at")
public class class40 extends class187 {

    @ObfuscatedName("at.i")
    public static class176 field928 = new class176(64);

    @ObfuscatedName("at.b")
    public static class176 field930 = new class176(30);

    @ObfuscatedName("at.l")
    public int field931;

    @ObfuscatedName("at.m")
    public int field929;

    @ObfuscatedName("at.w")
    public int field935 = -1;

    @ObfuscatedName("at.e")
    public short[] field934;

    @ObfuscatedName("at.n")
    public short[] field943;

    @ObfuscatedName("at.s")
    public short[] field936;

    @ObfuscatedName("at.k")
    public short[] field937;

    @ObfuscatedName("at.f")
    public int field938 = 128;

    @ObfuscatedName("at.d")
    public int field939 = 128;

    @ObfuscatedName("at.x")
    public int field933 = 0;

    @ObfuscatedName("at.o")
    public int field941 = 0;

    @ObfuscatedName("at.q")
    public int field942 = 0;

    @ObfuscatedName("n.a(Lek;Lek;S)V")
    public static void method110(class151 arg0, class151 arg1) {
        Statics.field940 = arg0;
        Statics.field927 = arg1;
    }

    @ObfuscatedName("ci.v(II)Lat;")
    public static class40 method1765(int arg0) {
        class40 var1 = (class40) field928.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field940.method2731(13, arg0);
        class40 var3 = new class40();
        var3.field931 = arg0;
        if (var2 != null) {
            var3.method769(new class110(var2));
        }
        field928.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.i(Ldi;I)V")
    public void method769(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method782(arg0, var2);
        }
    }

    @ObfuscatedName("at.b(Ldi;II)V")
    public void method782(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field929 = arg0.method2282();
        } else if (arg1 == 2) {
            this.field935 = arg0.method2282();
        } else if (arg1 == 4) {
            this.field938 = arg0.method2282();
        } else if (arg1 == 5) {
            this.field939 = arg0.method2282();
        } else if (arg1 == 6) {
            this.field933 = arg0.method2282();
        } else if (arg1 == 7) {
            this.field941 = arg0.method2199();
        } else if (arg1 == 8) {
            this.field942 = arg0.method2199();
        } else if (arg1 == 40) {
            int var3 = arg0.method2199();
            this.field934 = new short[var3];
            this.field943 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field934[var4] = (short) arg0.method2282();
                this.field943[var4] = (short) arg0.method2282();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2199();
            this.field936 = new short[var5];
            this.field937 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field936[var6] = (short) arg0.method2282();
                this.field937[var6] = (short) arg0.method2282();
            }
        }
    }

    @ObfuscatedName("at.l(II)Lcl;")
    public final class99 method768(int arg0) {
        class99 var2 = (class99) field930.method3181((long) this.field931);
        if (var2 == null) {
            class94 var3 = class94.method1882(Statics.field927, this.field929, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field934 != null) {
                for (int var4 = 0; var4 < this.field934.length; var4++) {
                    var3.method1892(this.field934[var4], this.field943[var4]);
                }
            }
            if (this.field936 != null) {
                for (int var5 = 0; var5 < this.field936.length; var5++) {
                    var3.method1907(this.field936[var5], this.field937[var5]);
                }
            }
            var2 = var3.method1879(this.field941 + 64, this.field942 + 850, -30, -50, -30);
            field930.method3183(var2, (long) this.field931);
        }
        class99 var6;
        if (this.field935 == -1 || arg0 == -1) {
            var6 = var2.method1997(true);
        } else {
            var6 = Statics.method97(this.field935).method737(var2, arg0);
        }
        if (this.field938 != 128 || this.field939 != 128) {
            var6.method2036(this.field938, this.field939, this.field938);
        }
        if (this.field933 != 0) {
            if (this.field933 == 90) {
                var6.method1985();
            }
            if (this.field933 == 180) {
                var6.method1985();
                var6.method1985();
            }
            if (this.field933 == 270) {
                var6.method1985();
                var6.method1985();
                var6.method1985();
            }
        }
        return var6;
    }
}
