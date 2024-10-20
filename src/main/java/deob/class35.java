package deob;

@ObfuscatedName("ax")
public class class35 extends class174 {

    @ObfuscatedName("ax.c")
    public static class170 field921 = new class170(64);

    @ObfuscatedName("ax.d")
    public static class170 field929 = new class170(30);

    @ObfuscatedName("ax.b")
    public int field923;

    @ObfuscatedName("ax.i")
    public int field924;

    @ObfuscatedName("ax.p")
    public int field925 = -1;

    @ObfuscatedName("ax.y")
    public short[] field920;

    @ObfuscatedName("ax.u")
    public short[] field927;

    @ObfuscatedName("ax.z")
    public short[] field928;

    @ObfuscatedName("ax.j")
    public short[] field922;

    @ObfuscatedName("ax.h")
    public int field926 = 128;

    @ObfuscatedName("ax.x")
    public int field931 = 128;

    @ObfuscatedName("ax.q")
    public int field930 = 0;

    @ObfuscatedName("ax.w")
    public int field933 = 0;

    @ObfuscatedName("ax.k")
    public int field939 = 0;

    @ObfuscatedName("z.t(Lev;Lev;B)V")
    public static void method115(class152 arg0, class152 arg1) {
        Statics.field932 = arg0;
        Statics.field1297 = arg1;
    }

    @ObfuscatedName("an.l(II)Lax;")
    public static class35 method711(int arg0) {
        class35 var1 = (class35) field921.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field932.method2987(13, arg0);
        class35 var3 = new class35();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method771(new class127(var2));
        }
        field921.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.c(Ldo;B)V")
    public void method771(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method784(arg0, var2);
        }
    }

    @ObfuscatedName("ax.d(Ldo;II)V")
    public void method784(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field924 = arg0.method2440();
        } else if (arg1 == 2) {
            this.field925 = arg0.method2440();
        } else if (arg1 == 4) {
            this.field926 = arg0.method2440();
        } else if (arg1 == 5) {
            this.field931 = arg0.method2440();
        } else if (arg1 == 6) {
            this.field930 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field933 = arg0.method2438();
        } else if (arg1 == 8) {
            this.field939 = arg0.method2438();
        } else if (arg1 == 40) {
            int var3 = arg0.method2438();
            this.field920 = new short[var3];
            this.field927 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field920[var4] = (short) arg0.method2440();
                this.field927[var4] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2438();
            this.field928 = new short[var5];
            this.field922 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field928[var6] = (short) arg0.method2440();
                this.field922[var6] = (short) arg0.method2440();
            }
        }
    }

    @ObfuscatedName("ax.b(II)Ldk;")
    public final class112 method773(int arg0) {
        class112 var2 = (class112) field929.method3260((long) this.field923);
        if (var2 == null) {
            class101 var3 = class101.method2086(Statics.field1297, this.field924, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field920 != null) {
                for (int var4 = 0; var4 < this.field920.length; var4++) {
                    var3.method2063(this.field920[var4], this.field927[var4]);
                }
            }
            if (this.field928 != null) {
                for (int var5 = 0; var5 < this.field928.length; var5++) {
                    var3.method2064(this.field928[var5], this.field922[var5]);
                }
            }
            var2 = var3.method2125(this.field933 + 64, this.field939 + 850, -30, -50, -30);
            field929.method3261(var2, (long) this.field923);
        }
        class112 var6;
        if (this.field925 == -1 || arg0 == -1) {
            var6 = var2.method2236(true);
        } else {
            var6 = Statics.method31(this.field925).method727(var2, arg0);
        }
        if (this.field926 != 128 || this.field931 != 128) {
            var6.method2294(this.field926, this.field931, this.field926);
        }
        if (this.field930 != 0) {
            if (this.field930 == 90) {
                var6.method2295();
            }
            if (this.field930 == 180) {
                var6.method2295();
                var6.method2295();
            }
            if (this.field930 == 270) {
                var6.method2295();
                var6.method2295();
                var6.method2295();
            }
        }
        return var6;
    }
}
