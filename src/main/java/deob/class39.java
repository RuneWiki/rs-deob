package deob;

@ObfuscatedName("ae")
public class class39 extends class182 {

    @ObfuscatedName("ae.e")
    public static class171 field926 = new class171(64);

    @ObfuscatedName("ae.i")
    public static class171 field924 = new class171(30);

    @ObfuscatedName("ae.t")
    public int field927;

    @ObfuscatedName("ae.z")
    public int field931;

    @ObfuscatedName("ae.g")
    public int field934 = -1;

    @ObfuscatedName("ae.c")
    public short[] field942;

    @ObfuscatedName("ae.o")
    public short[] field932;

    @ObfuscatedName("ae.q")
    public short[] field933;

    @ObfuscatedName("ae.w")
    public short[] field943;

    @ObfuscatedName("ae.y")
    public int field928 = 128;

    @ObfuscatedName("ae.p")
    public int field936 = 128;

    @ObfuscatedName("ae.m")
    public int field937 = 0;

    @ObfuscatedName("ae.a")
    public int field938 = 0;

    @ObfuscatedName("ae.u")
    public int field939 = 0;

    @ObfuscatedName("an.k(Ley;Ley;B)V")
    public static void method596(class146 arg0, class146 arg1) {
        Statics.field925 = arg0;
        Statics.field944 = arg1;
    }

    @ObfuscatedName("ay.b(IB)Lae;")
    public static class39 method788(int arg0) {
        class39 var1 = (class39) field926.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field925.method2759(13, arg0);
        class39 var3 = new class39();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method746(new class107(var2));
        }
        field926.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.e(Ldi;I)V")
    public void method746(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method758(arg0, var2);
        }
    }

    @ObfuscatedName("ae.i(Ldi;II)V")
    public void method758(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field931 = arg0.method2117();
        } else if (arg1 == 2) {
            this.field934 = arg0.method2117();
        } else if (arg1 == 4) {
            this.field928 = arg0.method2117();
        } else if (arg1 == 5) {
            this.field936 = arg0.method2117();
        } else if (arg1 == 6) {
            this.field937 = arg0.method2117();
        } else if (arg1 == 7) {
            this.field938 = arg0.method2115();
        } else if (arg1 == 8) {
            this.field939 = arg0.method2115();
        } else if (arg1 == 40) {
            int var3 = arg0.method2115();
            this.field942 = new short[var3];
            this.field932 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field942[var4] = (short) arg0.method2117();
                this.field932[var4] = (short) arg0.method2117();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2115();
            this.field933 = new short[var5];
            this.field943 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field933[var6] = (short) arg0.method2117();
                this.field943[var6] = (short) arg0.method2117();
            }
        }
    }

    @ObfuscatedName("ae.t(II)Lck;")
    public final class98 method738(int arg0) {
        class98 var2 = (class98) field924.method3166((long) this.field927);
        if (var2 == null) {
            class93 var3 = class93.method1881(Statics.field944, this.field931, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field942 != null) {
                for (int var4 = 0; var4 < this.field942.length; var4++) {
                    var3.method1895(this.field942[var4], this.field932[var4]);
                }
            }
            if (this.field933 != null) {
                for (int var5 = 0; var5 < this.field933.length; var5++) {
                    var3.method1924(this.field933[var5], this.field943[var5]);
                }
            }
            var2 = var3.method1902(this.field938 + 64, this.field939 + 850, -30, -50, -30);
            field924.method3161(var2, (long) this.field927);
        }
        class98 var6;
        if (this.field934 == -1 || arg0 == -1) {
            var6 = var2.method1977(true);
        } else {
            var6 = class38.method595(this.field934).method700(var2, arg0);
        }
        if (this.field928 != 128 || this.field936 != 128) {
            var6.method2020(this.field928, this.field936, this.field928);
        }
        if (this.field937 != 0) {
            if (this.field937 == 90) {
                var6.method1984();
            }
            if (this.field937 == 180) {
                var6.method1984();
                var6.method1984();
            }
            if (this.field937 == 270) {
                var6.method1984();
                var6.method1984();
                var6.method1984();
            }
        }
        return var6;
    }

    @ObfuscatedName("dz.z(I)V")
    public static void method2414() {
        field926.method3162();
        field924.method3162();
    }
}
