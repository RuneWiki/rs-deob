package deob;

@ObfuscatedName("ax")
public class class36 extends class174 {

    @ObfuscatedName("ax.u")
    public static class167 field907 = new class167(64);

    @ObfuscatedName("ax.t")
    public static class167 field898 = new class167(30);

    @ObfuscatedName("ax.e")
    public int field900;

    @ObfuscatedName("ax.a")
    public int field903;

    @ObfuscatedName("ax.l")
    public int field902 = -1;

    @ObfuscatedName("ax.v")
    public short[] field901;

    @ObfuscatedName("ax.j")
    public short[] field904;

    @ObfuscatedName("ax.k")
    public short[] field905;

    @ObfuscatedName("ax.g")
    public short[] field906;

    @ObfuscatedName("ax.d")
    public int field912 = 128;

    @ObfuscatedName("ax.b")
    public int field908 = 128;

    @ObfuscatedName("ax.i")
    public int field911 = 0;

    @ObfuscatedName("ax.o")
    public int field910 = 0;

    @ObfuscatedName("ax.x")
    public int field896 = 0;

    @ObfuscatedName("fz.z(Lel;Lel;B)V")
    public static void method3162(class142 arg0, class142 arg1) {
        Statics.field909 = arg0;
        Statics.field897 = arg1;
    }

    @ObfuscatedName("ee.n(IB)Lax;")
    public static class36 method2724(int arg0) {
        class36 var1 = (class36) field907.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field909.method2768(13, arg0);
        class36 var3 = new class36();
        var3.field900 = arg0;
        if (var2 != null) {
            var3.method750(new class104(var2));
        }
        field907.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.u(Lcj;S)V")
    public void method750(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method751(arg0, var2);
        }
    }

    @ObfuscatedName("ax.t(Lcj;II)V")
    public void method751(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field903 = arg0.method2206();
        } else if (arg1 == 2) {
            this.field902 = arg0.method2206();
        } else if (arg1 == 4) {
            this.field912 = arg0.method2206();
        } else if (arg1 == 5) {
            this.field908 = arg0.method2206();
        } else if (arg1 == 6) {
            this.field911 = arg0.method2206();
        } else if (arg1 == 7) {
            this.field910 = arg0.method2257();
        } else if (arg1 == 8) {
            this.field896 = arg0.method2257();
        } else if (arg1 == 40) {
            int var3 = arg0.method2257();
            this.field901 = new short[var3];
            this.field904 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field901[var4] = (short) arg0.method2206();
                this.field904[var4] = (short) arg0.method2206();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2257();
            this.field905 = new short[var5];
            this.field906 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field905[var6] = (short) arg0.method2206();
                this.field906[var6] = (short) arg0.method2206();
            }
        }
    }

    @ObfuscatedName("ax.e(II)Lcp;")
    public final class95 method752(int arg0) {
        class95 var2 = (class95) field898.method3183((long) this.field900);
        if (var2 == null) {
            class90 var3 = class90.method1964(Statics.field897, this.field903, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field901 != null) {
                for (int var4 = 0; var4 < this.field901.length; var4++) {
                    var3.method1909(this.field901[var4], this.field904[var4]);
                }
            }
            if (this.field905 != null) {
                for (int var5 = 0; var5 < this.field905.length; var5++) {
                    var3.method1898(this.field905[var5], this.field906[var5]);
                }
            }
            var2 = var3.method1975(this.field910 + 64, this.field896 + 850, -30, -50, -30);
            field898.method3185(var2, (long) this.field900);
        }
        class95 var6;
        if (this.field902 == -1 || arg0 == -1) {
            var6 = var2.method1990(true);
        } else {
            var6 = class35.method2065(this.field902).method714(var2, arg0);
        }
        if (this.field912 != 128 || this.field908 != 128) {
            var6.method2020(this.field912, this.field908, this.field912);
        }
        if (this.field911 != 0) {
            if (this.field911 == 90) {
                var6.method1998();
            }
            if (this.field911 == 180) {
                var6.method1998();
                var6.method1998();
            }
            if (this.field911 == 270) {
                var6.method1998();
                var6.method1998();
                var6.method1998();
            }
        }
        return var6;
    }

    @ObfuscatedName("ea.a(I)V")
    public static void method2727() {
        field907.method3193();
        field898.method3193();
    }
}
