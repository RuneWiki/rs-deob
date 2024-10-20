package deob;

@ObfuscatedName("aw")
public class class35 extends class174 {

    @ObfuscatedName("aw.g")
    public static class170 field883 = new class170(64);

    @ObfuscatedName("aw.o")
    public static class170 field882 = new class170(30);

    @ObfuscatedName("aw.a")
    public int field885;

    @ObfuscatedName("aw.h")
    public int field895;

    @ObfuscatedName("aw.j")
    public int field887 = -1;

    @ObfuscatedName("aw.f")
    public short[] field888;

    @ObfuscatedName("aw.q")
    public short[] field902;

    @ObfuscatedName("aw.l")
    public short[] field890;

    @ObfuscatedName("aw.d")
    public short[] field892;

    @ObfuscatedName("aw.z")
    public int field889 = 128;

    @ObfuscatedName("aw.n")
    public int field893 = 128;

    @ObfuscatedName("aw.t")
    public int field894 = 0;

    @ObfuscatedName("aw.w")
    public int field900 = 0;

    @ObfuscatedName("aw.r")
    public int field884 = 0;

    @ObfuscatedName("ep.b(II)Law;")
    public static class35 method2850(int arg0) {
        class35 var1 = (class35) field883.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field898.method3026(13, arg0);
        class35 var3 = new class35();
        var3.field885 = arg0;
        if (var2 != null) {
            var3.method734(new class126(var2));
        }
        field883.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.e(Ldv;I)V")
    public void method734(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method735(arg0, var2);
        }
    }

    @ObfuscatedName("aw.g(Ldv;IB)V")
    public void method735(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field895 = arg0.method2572();
        } else if (arg1 == 2) {
            this.field887 = arg0.method2572();
        } else if (arg1 == 4) {
            this.field889 = arg0.method2572();
        } else if (arg1 == 5) {
            this.field893 = arg0.method2572();
        } else if (arg1 == 6) {
            this.field894 = arg0.method2572();
        } else if (arg1 == 7) {
            this.field900 = arg0.method2436();
        } else if (arg1 == 8) {
            this.field884 = arg0.method2436();
        } else if (arg1 == 40) {
            int var3 = arg0.method2436();
            this.field888 = new short[var3];
            this.field902 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field888[var4] = (short) arg0.method2572();
                this.field902[var4] = (short) arg0.method2572();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2436();
            this.field890 = new short[var5];
            this.field892 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field890[var6] = (short) arg0.method2572();
                this.field892[var6] = (short) arg0.method2572();
            }
        }
    }

    @ObfuscatedName("aw.o(II)Ldp;")
    public final class112 method741(int arg0) {
        class112 var2 = (class112) field882.method3248((long) this.field885);
        if (var2 == null) {
            class101 var3 = class101.method2032(Statics.field387, this.field895, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field888 != null) {
                for (int var4 = 0; var4 < this.field888.length; var4++) {
                    var3.method2047(this.field888[var4], this.field902[var4]);
                }
            }
            if (this.field890 != null) {
                for (int var5 = 0; var5 < this.field890.length; var5++) {
                    var3.method2048(this.field890[var5], this.field892[var5]);
                }
            }
            var2 = var3.method2056(this.field900 + 64, this.field884 + 850, -30, -50, -30);
            field882.method3252(var2, (long) this.field885);
        }
        class112 var6;
        if (this.field887 == -1 || arg0 == -1) {
            var6 = var2.method2224(true);
        } else {
            var6 = class34.method215(this.field887).method699(var2, arg0);
        }
        if (this.field889 != 128 || this.field893 != 128) {
            var6.method2275(this.field889, this.field893, this.field889);
        }
        if (this.field894 != 0) {
            if (this.field894 == 90) {
                var6.method2232();
            }
            if (this.field894 == 180) {
                var6.method2232();
                var6.method2232();
            }
            if (this.field894 == 270) {
                var6.method2232();
                var6.method2232();
                var6.method2232();
            }
        }
        return var6;
    }
}
