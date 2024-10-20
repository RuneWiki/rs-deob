package deob;

@ObfuscatedName("ay")
public class class41 extends class195 {

    @ObfuscatedName("ay.a")
    public static class184 field972 = new class184(64);

    @ObfuscatedName("ay.w")
    public static class184 field975 = new class184(30);

    @ObfuscatedName("ay.m")
    public int field976;

    @ObfuscatedName("ay.h")
    public int field977;

    @ObfuscatedName("ay.i")
    public int field974 = -1;

    @ObfuscatedName("ay.r")
    public short[] field978;

    @ObfuscatedName("ay.l")
    public short[] field980;

    @ObfuscatedName("ay.f")
    public short[] field983;

    @ObfuscatedName("ay.e")
    public short[] field984;

    @ObfuscatedName("ay.z")
    public int field979 = 128;

    @ObfuscatedName("ay.v")
    public int field973 = 128;

    @ObfuscatedName("ay.x")
    public int field985 = 0;

    @ObfuscatedName("ay.q")
    public int field986 = 0;

    @ObfuscatedName("ay.b")
    public int field987 = 0;

    @ObfuscatedName("ct.n(Lfd;Lfd;I)V")
    public static void method1963(class158 arg0, class158 arg1) {
        Statics.field981 = arg0;
        Statics.field982 = arg1;
    }

    @ObfuscatedName("s.o(II)Lay;")
    public static class41 method493(int arg0) {
        class41 var1 = (class41) field972.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method2925(13, arg0);
        class41 var3 = new class41();
        var3.field976 = arg0;
        if (var2 != null) {
            var3.method791(new class111(var2));
        }
        field972.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.a(Ldl;I)V")
    public void method791(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method799(arg0, var2);
        }
    }

    @ObfuscatedName("ay.w(Ldl;II)V")
    public void method799(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field977 = arg0.method2236();
        } else if (arg1 == 2) {
            this.field974 = arg0.method2236();
        } else if (arg1 == 4) {
            this.field979 = arg0.method2236();
        } else if (arg1 == 5) {
            this.field973 = arg0.method2236();
        } else if (arg1 == 6) {
            this.field985 = arg0.method2236();
        } else if (arg1 == 7) {
            this.field986 = arg0.method2234();
        } else if (arg1 == 8) {
            this.field987 = arg0.method2234();
        } else if (arg1 == 40) {
            int var3 = arg0.method2234();
            this.field978 = new short[var3];
            this.field980 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field978[var4] = (short) arg0.method2236();
                this.field980[var4] = (short) arg0.method2236();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2234();
            this.field983 = new short[var5];
            this.field984 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field983[var6] = (short) arg0.method2236();
                this.field984[var6] = (short) arg0.method2236();
            }
        }
    }

    @ObfuscatedName("ay.m(II)Lcp;")
    public final class100 method793(int arg0) {
        class100 var2 = (class100) field975.method3373((long) this.field976);
        if (var2 == null) {
            class95 var3 = class95.method2050(Statics.field982, this.field977, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field978 != null) {
                for (int var4 = 0; var4 < this.field978.length; var4++) {
                    var3.method1985(this.field978[var4], this.field980[var4]);
                }
            }
            if (this.field983 != null) {
                for (int var5 = 0; var5 < this.field983.length; var5++) {
                    var3.method1986(this.field983[var5], this.field984[var5]);
                }
            }
            var2 = var3.method2033(this.field986 + 64, this.field987 + 850, -30, -50, -30);
            field975.method3372(var2, (long) this.field976);
        }
        class100 var6;
        if (this.field974 == -1 || arg0 == -1) {
            var6 = var2.method2129(true);
        } else {
            var6 = Statics.method860(this.field974).method782(var2, arg0);
        }
        if (this.field979 != 128 || this.field973 != 128) {
            var6.method2091(this.field979, this.field973, this.field979);
        }
        if (this.field985 != 0) {
            if (this.field985 == 90) {
                var6.method2086();
            }
            if (this.field985 == 180) {
                var6.method2086();
                var6.method2086();
            }
            if (this.field985 == 270) {
                var6.method2086();
                var6.method2086();
                var6.method2086();
            }
        }
        return var6;
    }

    @ObfuscatedName("p.h(I)V")
    public static void method497() {
        field972.method3376();
        field975.method3376();
    }
}
