package deob;

@ObfuscatedName("fx")
public class class180 extends class405 {

    @ObfuscatedName("fx.q")
    public static class256 field1969 = new class256(64);

    @ObfuscatedName("fx.f")
    public static class256 field1970 = new class256(30);

    @ObfuscatedName("fx.j")
    public int field1980;

    @ObfuscatedName("fx.e")
    public int field1972;

    @ObfuscatedName("fx.g")
    public int field1976 = -1;

    @ObfuscatedName("fx.w")
    public short[] field1979;

    @ObfuscatedName("fx.y")
    public short[] field1975;

    @ObfuscatedName("fx.i")
    public short[] field1971;

    @ObfuscatedName("fx.s")
    public short[] field1977;

    @ObfuscatedName("fx.t")
    public int field1978 = 128;

    @ObfuscatedName("fx.z")
    public int field1973 = 128;

    @ObfuscatedName("fx.r")
    public int field1968 = 0;

    @ObfuscatedName("fx.u")
    public int field1981 = 0;

    @ObfuscatedName("fx.k")
    public int field1982 = 0;

    @ObfuscatedName("bv.c(IB)Lfx;")
    public static class180 method1612(int arg0) {
        class180 var1 = (class180) field1969.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1974.method5305(13, arg0);
        class180 var3 = new class180();
        var3.field1980 = arg0;
        if (var2 != null) {
            var3.method3211(new class443(var2));
        }
        field1969.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fx.v(Lqt;B)V")
    public void method3211(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3212(arg0, var2);
        }
    }

    @ObfuscatedName("fx.q(Lqt;II)V")
    public void method3212(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1972 = arg0.method7049();
        } else if (arg1 == 2) {
            this.field1976 = arg0.method7049();
        } else if (arg1 == 4) {
            this.field1978 = arg0.method7049();
        } else if (arg1 == 5) {
            this.field1973 = arg0.method7049();
        } else if (arg1 == 6) {
            this.field1968 = arg0.method7049();
        } else if (arg1 == 7) {
            this.field1981 = arg0.method7047();
        } else if (arg1 == 8) {
            this.field1982 = arg0.method7047();
        } else if (arg1 == 40) {
            int var3 = arg0.method7047();
            this.field1979 = new short[var3];
            this.field1975 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1979[var4] = (short) arg0.method7049();
                this.field1975[var4] = (short) arg0.method7049();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7047();
            this.field1971 = new short[var5];
            this.field1977 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1971[var6] = (short) arg0.method7049();
                this.field1977[var6] = (short) arg0.method7049();
            }
        }
    }

    @ObfuscatedName("fx.f(II)Lhy;")
    public final class211 method3213(int arg0) {
        class211 var2 = (class211) field1970.method4691((long) this.field1980);
        if (var2 == null) {
            class196 var3 = class196.method3646(Statics.field1686, this.field1972, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1979 != null) {
                for (int var4 = 0; var4 < this.field1979.length; var4++) {
                    var3.method3606(this.field1979[var4], this.field1975[var4]);
                }
            }
            if (this.field1971 != null) {
                for (int var5 = 0; var5 < this.field1971.length; var5++) {
                    var3.method3626(this.field1971[var5], this.field1977[var5]);
                }
            }
            var2 = var3.method3658(this.field1981 + 64, this.field1982 + 850, -30, -50, -30);
            field1970.method4693(var2, (long) this.field1980);
        }
        class211 var6;
        if (this.field1976 == -1 || arg0 == -1) {
            var6 = var2.method4053(true);
        } else {
            var6 = class190.method983(this.field1976).method3505(var2, arg0);
        }
        if (this.field1978 != 128 || this.field1973 != 128) {
            var6.method4058(this.field1978, this.field1973, this.field1978);
        }
        if (this.field1968 != 0) {
            if (this.field1968 == 90) {
                var6.method4068();
            }
            if (this.field1968 == 180) {
                var6.method4068();
                var6.method4068();
            }
            if (this.field1968 == 270) {
                var6.method4068();
                var6.method4068();
                var6.method4068();
            }
        }
        return var6;
    }

    @ObfuscatedName("fw.j(I)V")
    public static void method2992() {
        field1969.method4695();
        field1970.method4695();
    }
}
