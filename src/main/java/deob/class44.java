package deob;

@ObfuscatedName("ac")
public class class44 extends class205 {

    @ObfuscatedName("ac.f")
    public static class194 field985 = new class194(64);

    @ObfuscatedName("ac.s")
    public static class194 field986 = new class194(30);

    @ObfuscatedName("ac.p")
    public int field990;

    @ObfuscatedName("ac.h")
    public int field988;

    @ObfuscatedName("ac.g")
    public int field989 = -1;

    @ObfuscatedName("ac.a")
    public short[] field995;

    @ObfuscatedName("ac.r")
    public short[] field991;

    @ObfuscatedName("ac.k")
    public short[] field992;

    @ObfuscatedName("ac.m")
    public short[] field987;

    @ObfuscatedName("ac.n")
    public int field994 = 128;

    @ObfuscatedName("ac.y")
    public int field998 = 128;

    @ObfuscatedName("ac.i")
    public int field996 = 0;

    @ObfuscatedName("ac.j")
    public int field997 = 0;

    @ObfuscatedName("ac.l")
    public int field984 = 0;

    @ObfuscatedName("cq.e(IB)Lac;")
    public static class44 method1763(int arg0) {
        class44 var1 = (class44) field985.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3160.method3048(13, arg0);
        class44 var3 = new class44();
        var3.field990 = arg0;
        if (var2 != null) {
            var3.method875(new class120(var2));
        }
        field985.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.w(Ldq;I)V")
    public void method875(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("ac.f(Ldq;IB)V")
    public void method874(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field988 = arg0.method2532();
        } else if (arg1 == 2) {
            this.field989 = arg0.method2532();
        } else if (arg1 == 4) {
            this.field994 = arg0.method2532();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2532();
        } else if (arg1 == 6) {
            this.field996 = arg0.method2532();
        } else if (arg1 == 7) {
            this.field997 = arg0.method2355();
        } else if (arg1 == 8) {
            this.field984 = arg0.method2355();
        } else if (arg1 == 40) {
            int var3 = arg0.method2355();
            this.field995 = new short[var3];
            this.field991 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = (short) arg0.method2532();
                this.field991[var4] = (short) arg0.method2532();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2355();
            this.field992 = new short[var5];
            this.field987 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field992[var6] = (short) arg0.method2532();
                this.field987[var6] = (short) arg0.method2532();
            }
        }
    }

    @ObfuscatedName("ac.s(IB)Ldy;")
    public final class106 method889(int arg0) {
        class106 var2 = (class106) field986.method3473((long) this.field990);
        if (var2 == null) {
            class101 var3 = class101.method2063(Statics.field993, this.field988, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field995 != null) {
                for (int var4 = 0; var4 < this.field995.length; var4++) {
                    var3.method2076(this.field995[var4], this.field991[var4]);
                }
            }
            if (this.field992 != null) {
                for (int var5 = 0; var5 < this.field992.length; var5++) {
                    var3.method2077(this.field992[var5], this.field987[var5]);
                }
            }
            var2 = var3.method2078(this.field997 + 64, this.field984 + 850, -30, -50, -30);
            field986.method3475(var2, (long) this.field990);
        }
        class106 var6;
        if (this.field989 == -1 || arg0 == -1) {
            var6 = var2.method2207(true);
        } else {
            var6 = class43.method949(this.field989).method837(var2, arg0);
        }
        if (this.field994 != 128 || this.field998 != 128) {
            var6.method2225(this.field994, this.field998, this.field994);
        }
        if (this.field996 != 0) {
            if (this.field996 == 90) {
                var6.method2222();
            }
            if (this.field996 == 180) {
                var6.method2222();
                var6.method2222();
            }
            if (this.field996 == 270) {
                var6.method2222();
                var6.method2222();
                var6.method2222();
            }
        }
        return var6;
    }
}
