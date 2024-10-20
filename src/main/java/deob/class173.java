package deob;

@ObfuscatedName("fo")
public class class173 extends class382 {

    @ObfuscatedName("fo.p")
    public static class249 field1881 = new class249(64);

    @ObfuscatedName("fo.m")
    public static class249 field1882 = new class249(30);

    @ObfuscatedName("fo.t")
    public int field1883;

    @ObfuscatedName("fo.s")
    public int field1884;

    @ObfuscatedName("fo.j")
    public int field1885 = -1;

    @ObfuscatedName("fo.w")
    public short[] field1886;

    @ObfuscatedName("fo.n")
    public short[] field1893;

    @ObfuscatedName("fo.r")
    public short[] field1888;

    @ObfuscatedName("fo.o")
    public short[] field1894;

    @ObfuscatedName("fo.v")
    public int field1890 = 128;

    @ObfuscatedName("fo.d")
    public int field1891 = 128;

    @ObfuscatedName("fo.h")
    public int field1879 = 0;

    @ObfuscatedName("fo.g")
    public int field1889 = 0;

    @ObfuscatedName("fo.e")
    public int field1892 = 0;

    @ObfuscatedName("cz.c(Lku;Lku;B)V")
    public static void method2245(class302 arg0, class302 arg1) {
        Statics.field1887 = arg0;
        Statics.field1880 = arg1;
    }

    @ObfuscatedName("oa.b(II)Lfo;")
    public static class173 method6501(int arg0) {
        class173 var1 = (class173) field1881.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1887.method5053(13, arg0);
        class173 var3 = new class173();
        var3.field1883 = arg0;
        if (var2 != null) {
            var3.method3049(new class419(var2));
        }
        field1881.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fo.p(Lpi;B)V")
    public void method3049(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3033(arg0, var2);
        }
    }

    @ObfuscatedName("fo.m(Lpi;IB)V")
    public void method3033(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1884 = arg0.method6672();
        } else if (arg1 == 2) {
            this.field1885 = arg0.method6672();
        } else if (arg1 == 4) {
            this.field1890 = arg0.method6672();
        } else if (arg1 == 5) {
            this.field1891 = arg0.method6672();
        } else if (arg1 == 6) {
            this.field1879 = arg0.method6672();
        } else if (arg1 == 7) {
            this.field1889 = arg0.method6781();
        } else if (arg1 == 8) {
            this.field1892 = arg0.method6781();
        } else if (arg1 == 40) {
            int var3 = arg0.method6781();
            this.field1886 = new short[var3];
            this.field1893 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1886[var4] = (short) arg0.method6672();
                this.field1893[var4] = (short) arg0.method6672();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6781();
            this.field1888 = new short[var5];
            this.field1894 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1888[var6] = (short) arg0.method6672();
                this.field1894[var6] = (short) arg0.method6672();
            }
        }
    }

    @ObfuscatedName("fo.t(IB)Lgo;")
    public final class204 method3047(int arg0) {
        class204 var2 = (class204) field1882.method4514((long) this.field1883);
        if (var2 == null) {
            class189 var3 = class189.method3427(Statics.field1880, this.field1884, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1886 != null) {
                for (int var4 = 0; var4 < this.field1886.length; var4++) {
                    var3.method3443(this.field1886[var4], this.field1893[var4]);
                }
            }
            if (this.field1888 != null) {
                for (int var5 = 0; var5 < this.field1888.length; var5++) {
                    var3.method3456(this.field1888[var5], this.field1894[var5]);
                }
            }
            var2 = var3.method3450(this.field1889 + 64, this.field1892 + 850, -30, -50, -30);
            field1882.method4515(var2, (long) this.field1883);
        }
        class204 var6;
        if (this.field1885 == -1 || arg0 == -1) {
            var6 = var2.method3892(true);
        } else {
            var6 = class183.method2402(this.field1885).method3334(var2, arg0);
        }
        if (this.field1890 != 128 || this.field1891 != 128) {
            var6.method3889(this.field1890, this.field1891, this.field1890);
        }
        if (this.field1879 != 0) {
            if (this.field1879 == 90) {
                var6.method3884();
            }
            if (this.field1879 == 180) {
                var6.method3884();
                var6.method3884();
            }
            if (this.field1879 == 270) {
                var6.method3884();
                var6.method3884();
                var6.method3884();
            }
        }
        return var6;
    }

    @ObfuscatedName("cl.s(I)V")
    public static void method2046() {
        field1881.method4518();
        field1882.method4518();
    }
}
