package deob;

@ObfuscatedName("at")
public class class41 extends class194 {

    @ObfuscatedName("at.l")
    public static class183 field919 = new class183(64);

    @ObfuscatedName("at.c")
    public static class183 field931 = new class183(30);

    @ObfuscatedName("at.u")
    public int field921;

    @ObfuscatedName("at.w")
    public int field922;

    @ObfuscatedName("at.i")
    public int field932 = -1;

    @ObfuscatedName("at.r")
    public short[] field924;

    @ObfuscatedName("at.f")
    public short[] field925;

    @ObfuscatedName("at.g")
    public short[] field918;

    @ObfuscatedName("at.o")
    public short[] field927;

    @ObfuscatedName("at.h")
    public int field928 = 128;

    @ObfuscatedName("at.s")
    public int field929 = 128;

    @ObfuscatedName("at.j")
    public int field923 = 0;

    @ObfuscatedName("at.m")
    public int field926 = 0;

    @ObfuscatedName("at.t")
    public int field917 = 0;

    @ObfuscatedName("e.e(Lfv;Lfv;B)V")
    public static void method4(class158 arg0, class158 arg1) {
        Statics.field930 = arg0;
        Statics.field920 = arg1;
    }

    @ObfuscatedName("ez.a(II)Lat;")
    public static class41 method2784(int arg0) {
        class41 var1 = (class41) field919.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field930.method2843(13, arg0);
        class41 var3 = new class41();
        var3.field921 = arg0;
        if (var2 != null) {
            var3.method774(new class111(var2));
        }
        field919.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.l(Ldh;I)V")
    public void method774(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("at.c(Ldh;II)V")
    public void method775(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field922 = arg0.method2178();
        } else if (arg1 == 2) {
            this.field932 = arg0.method2178();
        } else if (arg1 == 4) {
            this.field928 = arg0.method2178();
        } else if (arg1 == 5) {
            this.field929 = arg0.method2178();
        } else if (arg1 == 6) {
            this.field923 = arg0.method2178();
        } else if (arg1 == 7) {
            this.field926 = arg0.method2176();
        } else if (arg1 == 8) {
            this.field917 = arg0.method2176();
        } else if (arg1 == 40) {
            int var3 = arg0.method2176();
            this.field924 = new short[var3];
            this.field925 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field924[var4] = (short) arg0.method2178();
                this.field925[var4] = (short) arg0.method2178();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2176();
            this.field918 = new short[var5];
            this.field927 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field918[var6] = (short) arg0.method2178();
                this.field927[var6] = (short) arg0.method2178();
            }
        }
    }

    @ObfuscatedName("at.u(II)Lcy;")
    public final class100 method776(int arg0) {
        class100 var2 = (class100) field931.method3302((long) this.field921);
        if (var2 == null) {
            class95 var3 = class95.method1937(Statics.field920, this.field922, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field924 != null) {
                for (int var4 = 0; var4 < this.field924.length; var4++) {
                    var3.method1936(this.field924[var4], this.field925[var4]);
                }
            }
            if (this.field918 != null) {
                for (int var5 = 0; var5 < this.field918.length; var5++) {
                    var3.method1951(this.field918[var5], this.field927[var5]);
                }
            }
            var2 = var3.method1957(this.field926 + 64, this.field917 + 850, -30, -50, -30);
            field931.method3304(var2, (long) this.field921);
        }
        class100 var6;
        if (this.field932 == -1 || arg0 == -1) {
            var6 = var2.method2070(true);
        } else {
            var6 = class40.method1826(this.field932).method746(var2, arg0);
        }
        if (this.field928 != 128 || this.field929 != 128) {
            var6.method2031(this.field928, this.field929, this.field928);
        }
        if (this.field923 != 0) {
            if (this.field923 == 90) {
                var6.method2038();
            }
            if (this.field923 == 180) {
                var6.method2038();
                var6.method2038();
            }
            if (this.field923 == 270) {
                var6.method2038();
                var6.method2038();
                var6.method2038();
            }
        }
        return var6;
    }

    @ObfuscatedName("fh.w(S)V")
    public static void method3097() {
        field919.method3303();
        field931.method3303();
    }
}
