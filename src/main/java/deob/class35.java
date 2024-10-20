package deob;

@ObfuscatedName("aj")
public class class35 extends class174 {

    @ObfuscatedName("aj.a")
    public static class170 field897 = new class170(64);

    @ObfuscatedName("aj.h")
    public static class170 field896 = new class170(30);

    @ObfuscatedName("aj.y")
    public int field902;

    @ObfuscatedName("aj.j")
    public int field895;

    @ObfuscatedName("aj.l")
    public int field891 = -1;

    @ObfuscatedName("aj.f")
    public short[] field894;

    @ObfuscatedName("aj.n")
    public short[] field898;

    @ObfuscatedName("aj.k")
    public short[] field893;

    @ObfuscatedName("aj.q")
    public short[] field900;

    @ObfuscatedName("aj.w")
    public int field901 = 128;

    @ObfuscatedName("aj.v")
    public int field892 = 128;

    @ObfuscatedName("aj.z")
    public int field903 = 0;

    @ObfuscatedName("aj.m")
    public int field904 = 0;

    @ObfuscatedName("aj.r")
    public int field905 = 0;

    @ObfuscatedName("i.p(II)Laj;")
    public static class35 method163(int arg0) {
        class35 var1 = (class35) field897.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2728.method3048(13, arg0);
        class35 var3 = new class35();
        var3.field902 = arg0;
        if (var2 != null) {
            var3.method762(new class127(var2));
        }
        field897.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.e(Ldj;I)V")
    public void method762(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method757(arg0, var2);
        }
    }

    @ObfuscatedName("aj.a(Ldj;II)V")
    public void method757(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field895 = arg0.method2496();
        } else if (arg1 == 2) {
            this.field891 = arg0.method2496();
        } else if (arg1 == 4) {
            this.field901 = arg0.method2496();
        } else if (arg1 == 5) {
            this.field892 = arg0.method2496();
        } else if (arg1 == 6) {
            this.field903 = arg0.method2496();
        } else if (arg1 == 7) {
            this.field904 = arg0.method2494();
        } else if (arg1 == 8) {
            this.field905 = arg0.method2494();
        } else if (arg1 == 40) {
            int var3 = arg0.method2494();
            this.field894 = new short[var3];
            this.field898 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = (short) arg0.method2496();
                this.field898[var4] = (short) arg0.method2496();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2494();
            this.field893 = new short[var5];
            this.field900 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field893[var6] = (short) arg0.method2496();
                this.field900[var6] = (short) arg0.method2496();
            }
        }
    }

    @ObfuscatedName("aj.h(II)Lds;")
    public final class112 method760(int arg0) {
        class112 var2 = (class112) field896.method3266((long) this.field902);
        if (var2 == null) {
            class101 var3 = class101.method2070(Statics.field899, this.field895, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field894 != null) {
                for (int var4 = 0; var4 < this.field894.length; var4++) {
                    var3.method2083(this.field894[var4], this.field898[var4]);
                }
            }
            if (this.field893 != null) {
                for (int var5 = 0; var5 < this.field893.length; var5++) {
                    var3.method2084(this.field893[var5], this.field900[var5]);
                }
            }
            var2 = var3.method2090(this.field904 + 64, this.field905 + 850, -30, -50, -30);
            field896.method3268(var2, (long) this.field902);
        }
        class112 var6;
        if (this.field891 == -1 || arg0 == -1) {
            var6 = var2.method2258(true);
        } else {
            var6 = Statics.method1204(this.field891).method741(var2, arg0);
        }
        if (this.field901 != 128 || this.field892 != 128) {
            var6.method2271(this.field901, this.field892, this.field901);
        }
        if (this.field903 != 0) {
            if (this.field903 == 90) {
                var6.method2266();
            }
            if (this.field903 == 180) {
                var6.method2266();
                var6.method2266();
            }
            if (this.field903 == 270) {
                var6.method2266();
                var6.method2266();
                var6.method2266();
            }
        }
        return var6;
    }
}
