package deob;

@ObfuscatedName("ak")
public class class34 extends class172 {

    @ObfuscatedName("ak.n")
    public static class168 field901 = new class168(64);

    @ObfuscatedName("ak.j")
    public static class168 field885 = new class168(30);

    @ObfuscatedName("ak.i")
    public int field886;

    @ObfuscatedName("ak.o")
    public int field892;

    @ObfuscatedName("ak.l")
    public int field894 = -1;

    @ObfuscatedName("ak.p")
    public short[] field889;

    @ObfuscatedName("ak.t")
    public short[] field890;

    @ObfuscatedName("ak.w")
    public short[] field891;

    @ObfuscatedName("ak.r")
    public short[] field888;

    @ObfuscatedName("ak.a")
    public int field893 = 128;

    @ObfuscatedName("ak.q")
    public int field882 = 128;

    @ObfuscatedName("ak.z")
    public int field895 = 0;

    @ObfuscatedName("ak.d")
    public int field896 = 0;

    @ObfuscatedName("ak.x")
    public int field897 = 0;

    @ObfuscatedName("ae.g(II)Lak;")
    public static class34 method895(int arg0) {
        class34 var1 = (class34) field901.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field884.method3012(13, arg0);
        class34 var3 = new class34();
        var3.field886 = arg0;
        if (var2 != null) {
            var3.method748(new class126(var2));
        }
        field901.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.e(Ldu;I)V")
    public void method748(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("ak.n(Ldu;IB)V")
    public void method760(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field892 = arg0.method2487();
        } else if (arg1 == 2) {
            this.field894 = arg0.method2487();
        } else if (arg1 == 4) {
            this.field893 = arg0.method2487();
        } else if (arg1 == 5) {
            this.field882 = arg0.method2487();
        } else if (arg1 == 6) {
            this.field895 = arg0.method2487();
        } else if (arg1 == 7) {
            this.field896 = arg0.method2485();
        } else if (arg1 == 8) {
            this.field897 = arg0.method2485();
        } else if (arg1 == 40) {
            int var3 = arg0.method2485();
            this.field889 = new short[var3];
            this.field890 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field889[var4] = (short) arg0.method2487();
                this.field890[var4] = (short) arg0.method2487();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2485();
            this.field891 = new short[var5];
            this.field888 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field891[var6] = (short) arg0.method2487();
                this.field888[var6] = (short) arg0.method2487();
            }
        }
    }

    @ObfuscatedName("ak.j(II)Ldk;")
    public final class111 method749(int arg0) {
        class111 var2 = (class111) field885.method3311((long) this.field886);
        if (var2 == null) {
            class100 var3 = class100.method2068(Statics.field883, this.field892, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field889 != null) {
                for (int var4 = 0; var4 < this.field889.length; var4++) {
                    var3.method2100(this.field889[var4], this.field890[var4]);
                }
            }
            if (this.field891 != null) {
                for (int var5 = 0; var5 < this.field891.length; var5++) {
                    var3.method2083(this.field891[var5], this.field888[var5]);
                }
            }
            var2 = var3.method2067(this.field896 + 64, this.field897 + 850, -30, -50, -30);
            field885.method3314(var2, (long) this.field886);
        }
        class111 var6;
        if (this.field894 == -1 || arg0 == -1) {
            var6 = var2.method2312(true);
        } else {
            var6 = class33.method224(this.field894).method713(var2, arg0);
        }
        if (this.field893 != 128 || this.field882 != 128) {
            var6.method2278(this.field893, this.field882, this.field893);
        }
        if (this.field895 != 0) {
            if (this.field895 == 90) {
                var6.method2273();
            }
            if (this.field895 == 180) {
                var6.method2273();
                var6.method2273();
            }
            if (this.field895 == 270) {
                var6.method2273();
                var6.method2273();
                var6.method2273();
            }
        }
        return var6;
    }

    @ObfuscatedName("aw.i(B)V")
    public static void method608() {
        field901.method3315();
        field885.method3315();
    }
}
