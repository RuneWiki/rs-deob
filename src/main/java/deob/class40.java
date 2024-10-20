package deob;

@ObfuscatedName("at")
public class class40 extends class185 {

    @ObfuscatedName("at.k")
    public static class174 field937 = new class174(64);

    @ObfuscatedName("at.g")
    public static class174 field944 = new class174(30);

    @ObfuscatedName("at.q")
    public int field938;

    @ObfuscatedName("at.l")
    public int field939;

    @ObfuscatedName("at.a")
    public int field940 = -1;

    @ObfuscatedName("at.b")
    public short[] field941;

    @ObfuscatedName("at.z")
    public short[] field935;

    @ObfuscatedName("at.w")
    public short[] field943;

    @ObfuscatedName("at.j")
    public short[] field951;

    @ObfuscatedName("at.p")
    public int field945 = 128;

    @ObfuscatedName("at.n")
    public int field936 = 128;

    @ObfuscatedName("at.r")
    public int field947 = 0;

    @ObfuscatedName("at.s")
    public int field948 = 0;

    @ObfuscatedName("at.f")
    public int field949 = 0;

    @ObfuscatedName("dl.e(Lep;Lep;I)V")
    public static void method2352(class149 arg0, class149 arg1) {
        Statics.field954 = arg0;
        Statics.field2031 = arg1;
    }

    @ObfuscatedName("ey.v(IB)Lat;")
    public static class40 method2885(int arg0) {
        class40 var1 = (class40) field937.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field954.method2721(13, arg0);
        class40 var3 = new class40();
        var3.field938 = arg0;
        if (var2 != null) {
            var3.method745(new class108(var2));
        }
        field937.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.k(Ldd;I)V")
    public void method745(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method746(arg0, var2);
        }
    }

    @ObfuscatedName("at.g(Ldd;II)V")
    public void method746(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field939 = arg0.method2124();
        } else if (arg1 == 2) {
            this.field940 = arg0.method2124();
        } else if (arg1 == 4) {
            this.field945 = arg0.method2124();
        } else if (arg1 == 5) {
            this.field936 = arg0.method2124();
        } else if (arg1 == 6) {
            this.field947 = arg0.method2124();
        } else if (arg1 == 7) {
            this.field948 = arg0.method2122();
        } else if (arg1 == 8) {
            this.field949 = arg0.method2122();
        } else if (arg1 == 40) {
            int var3 = arg0.method2122();
            this.field941 = new short[var3];
            this.field935 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field941[var4] = (short) arg0.method2124();
                this.field935[var4] = (short) arg0.method2124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2122();
            this.field943 = new short[var5];
            this.field951 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field943[var6] = (short) arg0.method2124();
                this.field951[var6] = (short) arg0.method2124();
            }
        }
    }

    @ObfuscatedName("at.q(II)Lcu;")
    public final class99 method740(int arg0) {
        class99 var2 = (class99) field944.method3154((long) this.field938);
        if (var2 == null) {
            class94 var3 = class94.method1890(Statics.field2031, this.field939, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field941 != null) {
                for (int var4 = 0; var4 < this.field941.length; var4++) {
                    var3.method1901(this.field941[var4], this.field935[var4]);
                }
            }
            if (this.field943 != null) {
                for (int var5 = 0; var5 < this.field943.length; var5++) {
                    var3.method1902(this.field943[var5], this.field951[var5]);
                }
            }
            var2 = var3.method1909(this.field948 + 64, this.field949 + 850, -30, -50, -30);
            field944.method3156(var2, (long) this.field938);
        }
        class99 var6;
        if (this.field940 == -1 || arg0 == -1) {
            var6 = var2.method1987(true);
        } else {
            var6 = class39.method2315(this.field940).method717(var2, arg0);
        }
        if (this.field945 != 128 || this.field936 != 128) {
            var6.method1983(this.field945, this.field936, this.field945);
        }
        if (this.field947 != 0) {
            if (this.field947 == 90) {
                var6.method1985();
            }
            if (this.field947 == 180) {
                var6.method1985();
                var6.method1985();
            }
            if (this.field947 == 270) {
                var6.method1985();
                var6.method1985();
                var6.method1985();
            }
        }
        return var6;
    }
}
