package deob;

@ObfuscatedName("gq")
public class class189 extends class428 {

    @ObfuscatedName("gq.v")
    public static class269 field2080 = new class269(64);

    @ObfuscatedName("gq.x")
    public static class269 field2081 = new class269(30);

    @ObfuscatedName("gq.m")
    public int field2091;

    @ObfuscatedName("gq.q")
    public int field2083;

    @ObfuscatedName("gq.f")
    public int field2084 = -1;

    @ObfuscatedName("gq.r")
    public short[] field2085;

    @ObfuscatedName("gq.u")
    public short[] field2078;

    @ObfuscatedName("gq.b")
    public short[] field2087;

    @ObfuscatedName("gq.j")
    public short[] field2088;

    @ObfuscatedName("gq.g")
    public int field2082 = 128;

    @ObfuscatedName("gq.i")
    public int field2089 = 128;

    @ObfuscatedName("gq.o")
    public int field2092 = 0;

    @ObfuscatedName("gq.n")
    public int field2086 = 0;

    @ObfuscatedName("gq.k")
    public int field2093 = 0;

    @ObfuscatedName("im.h(Lly;Lly;I)V")
    public static void method4761(class333 arg0, class333 arg1) {
        Statics.field2079 = arg0;
        Statics.field2090 = arg1;
    }

    @ObfuscatedName("ep.e(II)Lgq;")
    public static class189 method3000(int arg0) {
        class189 var1 = (class189) field2080.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2079.method5909(13, arg0);
        class189 var3 = new class189();
        var3.field2091 = arg0;
        if (var2 != null) {
            var3.method3386(new class467(var2));
        }
        field2080.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.v(Lqy;B)V")
    public void method3386(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3382(arg0, var2);
        }
    }

    @ObfuscatedName("gq.x(Lqy;IB)V")
    public void method3382(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2083 = arg0.method7794();
        } else if (arg1 == 2) {
            this.field2084 = arg0.method7794();
        } else if (arg1 == 4) {
            this.field2082 = arg0.method7794();
        } else if (arg1 == 5) {
            this.field2089 = arg0.method7794();
        } else if (arg1 == 6) {
            this.field2092 = arg0.method7794();
        } else if (arg1 == 7) {
            this.field2086 = arg0.method7792();
        } else if (arg1 == 8) {
            this.field2093 = arg0.method7792();
        } else if (arg1 == 40) {
            int var3 = arg0.method7792();
            this.field2085 = new short[var3];
            this.field2078 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2085[var4] = (short) arg0.method7794();
                this.field2078[var4] = (short) arg0.method7794();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7792();
            this.field2087 = new short[var5];
            this.field2088 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2087[var6] = (short) arg0.method7794();
                this.field2088[var6] = (short) arg0.method7794();
            }
        }
    }

    @ObfuscatedName("gq.m(II)Lhh;")
    public final class224 method3385(int arg0) {
        class224 var2 = (class224) field2081.method4917((long) this.field2091);
        if (var2 == null) {
            class208 var3 = class208.method3813(Statics.field2090, this.field2083, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2085 != null) {
                for (int var4 = 0; var4 < this.field2085.length; var4++) {
                    var3.method3828(this.field2085[var4], this.field2078[var4]);
                }
            }
            if (this.field2087 != null) {
                for (int var5 = 0; var5 < this.field2087.length; var5++) {
                    var3.method3829(this.field2087[var5], this.field2088[var5]);
                }
            }
            var2 = var3.method3836(this.field2086 + 64, this.field2093 + 850, -30, -50, -30);
            field2081.method4925(var2, (long) this.field2091);
        }
        class224 var6;
        if (this.field2084 == -1 || arg0 == -1) {
            var6 = var2.method4272(true);
        } else {
            var6 = class199.method4223(this.field2084).method3670(var2, arg0);
        }
        if (this.field2082 != 128 || this.field2089 != 128) {
            var6.method4324(this.field2082, this.field2089, this.field2082);
        }
        if (this.field2092 != 0) {
            if (this.field2092 == 90) {
                var6.method4286();
            }
            if (this.field2092 == 180) {
                var6.method4286();
                var6.method4286();
            }
            if (this.field2092 == 270) {
                var6.method4286();
                var6.method4286();
                var6.method4286();
            }
        }
        return var6;
    }

    @ObfuscatedName("eg.q(B)V")
    public static void method3004() {
        field2080.method4918();
        field2081.method4918();
    }
}
