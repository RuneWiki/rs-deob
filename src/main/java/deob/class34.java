package deob;

@ObfuscatedName("ae")
public class class34 extends class173 {

    @ObfuscatedName("ae.n")
    public static class169 field881 = new class169(64);

    @ObfuscatedName("ae.c")
    public static class169 field884 = new class169(30);

    @ObfuscatedName("ae.r")
    public int field883;

    @ObfuscatedName("ae.k")
    public int field882;

    @ObfuscatedName("ae.e")
    public int field885 = -1;

    @ObfuscatedName("ae.q")
    public short[] field879;

    @ObfuscatedName("ae.u")
    public short[] field887;

    @ObfuscatedName("ae.s")
    public short[] field888;

    @ObfuscatedName("ae.l")
    public short[] field889;

    @ObfuscatedName("ae.o")
    public int field890 = 128;

    @ObfuscatedName("ae.h")
    public int field891 = 128;

    @ObfuscatedName("ae.p")
    public int field892 = 0;

    @ObfuscatedName("ae.d")
    public int field893 = 0;

    @ObfuscatedName("ae.m")
    public int field894 = 0;

    @ObfuscatedName("y.v(II)Lae;")
    public static class34 method239(int arg0) {
        class34 var1 = (class34) field881.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field897.method3020(13, arg0);
        class34 var3 = new class34();
        var3.field883 = arg0;
        if (var2 != null) {
            var3.method741(new class126(var2));
        }
        field881.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.f(Ldr;I)V")
    public void method741(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ae.n(Ldr;II)V")
    public void method742(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field882 = arg0.method2468();
        } else if (arg1 == 2) {
            this.field885 = arg0.method2468();
        } else if (arg1 == 4) {
            this.field890 = arg0.method2468();
        } else if (arg1 == 5) {
            this.field891 = arg0.method2468();
        } else if (arg1 == 6) {
            this.field892 = arg0.method2468();
        } else if (arg1 == 7) {
            this.field893 = arg0.method2466();
        } else if (arg1 == 8) {
            this.field894 = arg0.method2466();
        } else if (arg1 == 40) {
            int var3 = arg0.method2466();
            this.field879 = new short[var3];
            this.field887 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field879[var4] = (short) arg0.method2468();
                this.field887[var4] = (short) arg0.method2468();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2466();
            this.field888 = new short[var5];
            this.field889 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field888[var6] = (short) arg0.method2468();
                this.field889[var6] = (short) arg0.method2468();
            }
        }
    }

    @ObfuscatedName("ae.c(II)Ldf;")
    public final class111 method743(int arg0) {
        class111 var2 = (class111) field884.method3224((long) this.field883);
        if (var2 == null) {
            class100 var3 = class100.method2060(Statics.field880, this.field882, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field879 != null) {
                for (int var4 = 0; var4 < this.field879.length; var4++) {
                    var3.method2082(this.field879[var4], this.field887[var4]);
                }
            }
            if (this.field888 != null) {
                for (int var5 = 0; var5 < this.field888.length; var5++) {
                    var3.method2101(this.field888[var5], this.field889[var5]);
                }
            }
            var2 = var3.method2080(this.field893 + 64, this.field894 + 850, -30, -50, -30);
            field884.method3231(var2, (long) this.field883);
        }
        class111 var6;
        if (this.field885 == -1 || arg0 == -1) {
            var6 = var2.method2273(true);
        } else {
            var6 = class33.method1401(this.field885).method708(var2, arg0);
        }
        if (this.field890 != 128 || this.field891 != 128) {
            var6.method2264(this.field890, this.field891, this.field890);
        }
        if (this.field892 != 0) {
            if (this.field892 == 90) {
                var6.method2259();
            }
            if (this.field892 == 180) {
                var6.method2259();
                var6.method2259();
            }
            if (this.field892 == 270) {
                var6.method2259();
                var6.method2259();
                var6.method2259();
            }
        }
        return var6;
    }
}
