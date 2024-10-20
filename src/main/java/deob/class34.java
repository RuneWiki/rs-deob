package deob;

@ObfuscatedName("ai")
public class class34 extends class173 {

    @ObfuscatedName("ai.x")
    public static class169 field892 = new class169(64);

    @ObfuscatedName("ai.m")
    public static class169 field894 = new class169(30);

    @ObfuscatedName("ai.n")
    public int field895;

    @ObfuscatedName("ai.q")
    public int field897;

    @ObfuscatedName("ai.a")
    public int field904 = -1;

    @ObfuscatedName("ai.g")
    public short[] field898;

    @ObfuscatedName("ai.j")
    public short[] field899;

    @ObfuscatedName("ai.l")
    public short[] field900;

    @ObfuscatedName("ai.w")
    public short[] field893;

    @ObfuscatedName("ai.z")
    public int field902 = 128;

    @ObfuscatedName("ai.e")
    public int field910 = 128;

    @ObfuscatedName("ai.b")
    public int field906 = 0;

    @ObfuscatedName("ai.c")
    public int field905 = 0;

    @ObfuscatedName("ai.d")
    public int field908 = 0;

    @ObfuscatedName("ep.u(Leb;Leb;I)V")
    public static void method2949(class151 arg0, class151 arg1) {
        Statics.field2452 = arg0;
        Statics.field903 = arg1;
    }

    @ObfuscatedName("s.k(II)Lai;")
    public static class34 method203(int arg0) {
        class34 var1 = (class34) field892.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2452.method2965(13, arg0);
        class34 var3 = new class34();
        var3.field895 = arg0;
        if (var2 != null) {
            var3.method730(new class126(var2));
        }
        field892.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.x(Ldl;I)V")
    public void method730(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method712(arg0, var2);
        }
    }

    @ObfuscatedName("ai.m(Ldl;II)V")
    public void method712(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field897 = arg0.method2450();
        } else if (arg1 == 2) {
            this.field904 = arg0.method2450();
        } else if (arg1 == 4) {
            this.field902 = arg0.method2450();
        } else if (arg1 == 5) {
            this.field910 = arg0.method2450();
        } else if (arg1 == 6) {
            this.field906 = arg0.method2450();
        } else if (arg1 == 7) {
            this.field905 = arg0.method2559();
        } else if (arg1 == 8) {
            this.field908 = arg0.method2559();
        } else if (arg1 == 40) {
            int var3 = arg0.method2559();
            this.field898 = new short[var3];
            this.field899 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field898[var4] = (short) arg0.method2450();
                this.field899[var4] = (short) arg0.method2450();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2559();
            this.field900 = new short[var5];
            this.field893 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field900[var6] = (short) arg0.method2450();
                this.field893[var6] = (short) arg0.method2450();
            }
        }
    }

    @ObfuscatedName("ai.n(II)Ldd;")
    public final class111 method711(int arg0) {
        class111 var2 = (class111) field894.method3263((long) this.field895);
        if (var2 == null) {
            class100 var3 = class100.method2044(Statics.field903, this.field897, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field898 != null) {
                for (int var4 = 0; var4 < this.field898.length; var4++) {
                    var3.method2107(this.field898[var4], this.field899[var4]);
                }
            }
            if (this.field900 != null) {
                for (int var5 = 0; var5 < this.field900.length; var5++) {
                    var3.method2110(this.field900[var5], this.field893[var5]);
                }
            }
            var2 = var3.method2064(this.field905 + 64, this.field908 + 850, -30, -50, -30);
            field894.method3260(var2, (long) this.field895);
        }
        class111 var6;
        if (this.field904 == -1 || arg0 == -1) {
            var6 = var2.method2235(true);
        } else {
            var6 = Statics.method147(this.field904).method677(var2, arg0);
        }
        if (this.field902 != 128 || this.field910 != 128) {
            var6.method2279(this.field902, this.field910, this.field902);
        }
        if (this.field906 != 0) {
            if (this.field906 == 90) {
                var6.method2243();
            }
            if (this.field906 == 180) {
                var6.method2243();
                var6.method2243();
            }
            if (this.field906 == 270) {
                var6.method2243();
                var6.method2243();
                var6.method2243();
            }
        }
        return var6;
    }

    @ObfuscatedName("ba.q(B)V")
    public static void method1365() {
        field892.method3261();
        field894.method3261();
    }
}
