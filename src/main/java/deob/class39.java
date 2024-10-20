package deob;

@ObfuscatedName("ay")
public class class39 extends class181 {

    @ObfuscatedName("ay.a")
    public static class171 field892 = new class171(64);

    @ObfuscatedName("ay.y")
    public static class171 field911 = new class171(30);

    @ObfuscatedName("ay.i")
    public int field894;

    @ObfuscatedName("ay.b")
    public int field895;

    @ObfuscatedName("ay.s")
    public int field896 = -1;

    @ObfuscatedName("ay.q")
    public short[] field900;

    @ObfuscatedName("ay.p")
    public short[] field893;

    @ObfuscatedName("ay.h")
    public short[] field899;

    @ObfuscatedName("ay.r")
    public short[] field910;

    @ObfuscatedName("ay.o")
    public int field891 = 128;

    @ObfuscatedName("ay.f")
    public int field902 = 128;

    @ObfuscatedName("ay.u")
    public int field903 = 0;

    @ObfuscatedName("ay.c")
    public int field904 = 0;

    @ObfuscatedName("ay.l")
    public int field905 = 0;

    @ObfuscatedName("bd.z(II)Lay;")
    public static class39 method1360(int arg0) {
        class39 var1 = (class39) field892.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1877.method2705(13, arg0);
        class39 var3 = new class39();
        var3.field894 = arg0;
        if (var2 != null) {
            var3.method724(new class107(var2));
        }
        field892.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.j(Ldq;I)V")
    public void method724(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method725(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldq;II)V")
    public void method725(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field895 = arg0.method2239();
        } else if (arg1 == 2) {
            this.field896 = arg0.method2239();
        } else if (arg1 == 4) {
            this.field891 = arg0.method2239();
        } else if (arg1 == 5) {
            this.field902 = arg0.method2239();
        } else if (arg1 == 6) {
            this.field903 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field904 = arg0.method2122();
        } else if (arg1 == 8) {
            this.field905 = arg0.method2122();
        } else if (arg1 == 40) {
            int var3 = arg0.method2122();
            this.field900 = new short[var3];
            this.field893 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field900[var4] = (short) arg0.method2239();
                this.field893[var4] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2122();
            this.field899 = new short[var5];
            this.field910 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field899[var6] = (short) arg0.method2239();
                this.field910[var6] = (short) arg0.method2239();
            }
        }
    }

    @ObfuscatedName("ay.y(IB)Lcu;")
    public final class98 method728(int arg0) {
        class98 var2 = (class98) field911.method3162((long) this.field894);
        if (var2 == null) {
            class93 var3 = class93.method1883(Statics.field898, this.field895, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field900 != null) {
                for (int var4 = 0; var4 < this.field900.length; var4++) {
                    var3.method1888(this.field900[var4], this.field893[var4]);
                }
            }
            if (this.field899 != null) {
                for (int var5 = 0; var5 < this.field899.length; var5++) {
                    var3.method1930(this.field899[var5], this.field910[var5]);
                }
            }
            var2 = var3.method1897(this.field904 + 64, this.field905 + 850, -30, -50, -30);
            field911.method3171(var2, (long) this.field894);
        }
        class98 var6;
        if (this.field896 == -1 || arg0 == -1) {
            var6 = var2.method1979(true);
        } else {
            var6 = class38.method84(this.field896).method692(var2, arg0);
        }
        if (this.field891 != 128 || this.field902 != 128) {
            var6.method2008(this.field891, this.field902, this.field891);
        }
        if (this.field903 != 0) {
            if (this.field903 == 90) {
                var6.method2045();
            }
            if (this.field903 == 180) {
                var6.method2045();
                var6.method2045();
            }
            if (this.field903 == 270) {
                var6.method2045();
                var6.method2045();
                var6.method2045();
            }
        }
        return var6;
    }

    @ObfuscatedName("cf.i(I)V")
    public static void method1961() {
        field892.method3164();
        field911.method3164();
    }
}
