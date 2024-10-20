package deob;

@ObfuscatedName("al")
public class class35 extends class174 {

    @ObfuscatedName("al.n")
    public static class170 field896 = new class170(64);

    @ObfuscatedName("al.e")
    public static class170 field902 = new class170(30);

    @ObfuscatedName("al.l")
    public int field908;

    @ObfuscatedName("al.d")
    public int field899;

    @ObfuscatedName("al.r")
    public int field900 = -1;

    @ObfuscatedName("al.k")
    public short[] field901;

    @ObfuscatedName("al.u")
    public short[] field909;

    @ObfuscatedName("al.o")
    public short[] field903;

    @ObfuscatedName("al.g")
    public short[] field904;

    @ObfuscatedName("al.s")
    public int field905 = 128;

    @ObfuscatedName("al.b")
    public int field906 = 128;

    @ObfuscatedName("al.v")
    public int field907 = 0;

    @ObfuscatedName("al.j")
    public int field894 = 0;

    @ObfuscatedName("al.q")
    public int field915 = 0;

    @ObfuscatedName("g.f(IB)Lal;")
    public static class35 method115(int arg0) {
        class35 var1 = (class35) field896.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method3035(13, arg0);
        class35 var3 = new class35();
        var3.field908 = arg0;
        if (var2 != null) {
            var3.method735(new class127(var2));
        }
        field896.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.t(Ldq;I)V")
    public void method735(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("al.n(Ldq;II)V")
    public void method734(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field899 = arg0.method2460();
        } else if (arg1 == 2) {
            this.field900 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field905 = arg0.method2460();
        } else if (arg1 == 5) {
            this.field906 = arg0.method2460();
        } else if (arg1 == 6) {
            this.field907 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field894 = arg0.method2458();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2458();
        } else if (arg1 == 40) {
            int var3 = arg0.method2458();
            this.field901 = new short[var3];
            this.field909 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field901[var4] = (short) arg0.method2460();
                this.field909[var4] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2458();
            this.field903 = new short[var5];
            this.field904 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field903[var6] = (short) arg0.method2460();
                this.field904[var6] = (short) arg0.method2460();
            }
        }
    }

    @ObfuscatedName("al.e(II)Ldp;")
    public final class112 method737(int arg0) {
        class112 var2 = (class112) field902.method3276((long) this.field908);
        if (var2 == null) {
            class101 var3 = class101.method2067(Statics.field895, this.field899, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field901 != null) {
                for (int var4 = 0; var4 < this.field901.length; var4++) {
                    var3.method2071(this.field901[var4], this.field909[var4]);
                }
            }
            if (this.field903 != null) {
                for (int var5 = 0; var5 < this.field903.length; var5++) {
                    var3.method2079(this.field903[var5], this.field904[var5]);
                }
            }
            var2 = var3.method2112(this.field894 + 64, this.field915 + 850, -30, -50, -30);
            field902.method3275(var2, (long) this.field908);
        }
        class112 var6;
        if (this.field900 == -1 || arg0 == -1) {
            var6 = var2.method2238(true);
        } else {
            var6 = class34.method572(this.field900).method719(var2, arg0);
        }
        if (this.field905 != 128 || this.field906 != 128) {
            var6.method2250(this.field905, this.field906, this.field905);
        }
        if (this.field907 != 0) {
            if (this.field907 == 90) {
                var6.method2286();
            }
            if (this.field907 == 180) {
                var6.method2286();
                var6.method2286();
            }
            if (this.field907 == 270) {
                var6.method2286();
                var6.method2286();
                var6.method2286();
            }
        }
        return var6;
    }

    @ObfuscatedName("w.l(I)V")
    public static void method200() {
        field896.method3271();
        field902.method3271();
    }
}
