package deob;

@ObfuscatedName("ac")
public class class35 extends class174 {

    @ObfuscatedName("ac.k")
    public static class170 field871 = new class170(64);

    @ObfuscatedName("ac.a")
    public static class170 field880 = new class170(30);

    @ObfuscatedName("ac.q")
    public int field873;

    @ObfuscatedName("ac.j")
    public int field887;

    @ObfuscatedName("ac.v")
    public int field875 = -1;

    @ObfuscatedName("ac.w")
    public short[] field892;

    @ObfuscatedName("ac.l")
    public short[] field877;

    @ObfuscatedName("ac.s")
    public short[] field878;

    @ObfuscatedName("ac.n")
    public short[] field879;

    @ObfuscatedName("ac.c")
    public int field876 = 128;

    @ObfuscatedName("ac.h")
    public int field883 = 128;

    @ObfuscatedName("ac.u")
    public int field872 = 0;

    @ObfuscatedName("ac.y")
    public int field869 = 0;

    @ObfuscatedName("ac.b")
    public int field870 = 0;

    @ObfuscatedName("cc.x(IB)Lac;")
    public static class35 method1621(int arg0) {
        class35 var1 = (class35) field871.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field882.method2920(13, arg0);
        class35 var3 = new class35();
        var3.field873 = arg0;
        if (var2 != null) {
            var3.method715(new class127(var2));
        }
        field871.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.p(Ldg;B)V")
    public void method715(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method716(arg0, var2);
        }
    }

    @ObfuscatedName("ac.k(Ldg;II)V")
    public void method716(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field887 = arg0.method2539();
        } else if (arg1 == 2) {
            this.field875 = arg0.method2539();
        } else if (arg1 == 4) {
            this.field876 = arg0.method2539();
        } else if (arg1 == 5) {
            this.field883 = arg0.method2539();
        } else if (arg1 == 6) {
            this.field872 = arg0.method2539();
        } else if (arg1 == 7) {
            this.field869 = arg0.method2484();
        } else if (arg1 == 8) {
            this.field870 = arg0.method2484();
        } else if (arg1 == 40) {
            int var3 = arg0.method2484();
            this.field892 = new short[var3];
            this.field877 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field892[var4] = (short) arg0.method2539();
                this.field877[var4] = (short) arg0.method2539();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2484();
            this.field878 = new short[var5];
            this.field879 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field878[var6] = (short) arg0.method2539();
                this.field879[var6] = (short) arg0.method2539();
            }
        }
    }

    @ObfuscatedName("ac.a(IB)Ldi;")
    public final class112 method717(int arg0) {
        class112 var2 = (class112) field880.method3196((long) this.field873);
        if (var2 == null) {
            class101 var3 = class101.method2034(Statics.field884, this.field887, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field892 != null) {
                for (int var4 = 0; var4 < this.field892.length; var4++) {
                    var3.method2016(this.field892[var4], this.field877[var4]);
                }
            }
            if (this.field878 != null) {
                for (int var5 = 0; var5 < this.field878.length; var5++) {
                    var3.method2017(this.field878[var5], this.field879[var5]);
                }
            }
            var2 = var3.method2004(this.field869 + 64, this.field870 + 850, -30, -50, -30);
            field880.method3197(var2, (long) this.field873);
        }
        class112 var6;
        if (this.field875 == -1 || arg0 == -1) {
            var6 = var2.method2193(true);
        } else {
            var6 = class34.method516(this.field875).method683(var2, arg0);
        }
        if (this.field876 != 128 || this.field883 != 128) {
            var6.method2224(this.field876, this.field883, this.field876);
        }
        if (this.field872 != 0) {
            if (this.field872 == 90) {
                var6.method2200();
            }
            if (this.field872 == 180) {
                var6.method2200();
                var6.method2200();
            }
            if (this.field872 == 270) {
                var6.method2200();
                var6.method2200();
                var6.method2200();
            }
        }
        return var6;
    }

    @ObfuscatedName("m.q(I)V")
    public static void method170() {
        field871.method3198();
        field880.method3198();
    }
}
