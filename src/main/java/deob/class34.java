package deob;

@ObfuscatedName("aw")
public class class34 extends class172 {

    @ObfuscatedName("aw.f")
    public static class168 field880 = new class168(64);

    @ObfuscatedName("aw.y")
    public static class168 field894 = new class168(30);

    @ObfuscatedName("aw.x")
    public int field882;

    @ObfuscatedName("aw.e")
    public int field884;

    @ObfuscatedName("aw.m")
    public int field895 = -1;

    @ObfuscatedName("aw.s")
    public short[] field885;

    @ObfuscatedName("aw.p")
    public short[] field886;

    @ObfuscatedName("aw.w")
    public short[] field881;

    @ObfuscatedName("aw.r")
    public short[] field888;

    @ObfuscatedName("aw.n")
    public int field889 = 128;

    @ObfuscatedName("aw.b")
    public int field890 = 128;

    @ObfuscatedName("aw.z")
    public int field891 = 0;

    @ObfuscatedName("aw.h")
    public int field892 = 0;

    @ObfuscatedName("aw.q")
    public int field878 = 0;

    @ObfuscatedName("q.c(II)Law;")
    public static class34 method135(int arg0) {
        class34 var1 = (class34) field880.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field887.method2821(13, arg0);
        class34 var3 = new class34();
        var3.field882 = arg0;
        if (var2 != null) {
            var3.method706(new class125(var2));
        }
        field880.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.j(Ldl;I)V")
    public void method706(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method711(arg0, var2);
        }
    }

    @ObfuscatedName("aw.f(Ldl;II)V")
    public void method711(class125 arg0, int arg1) {
        if (arg1 == 1) {
            this.field884 = arg0.method2328();
        } else if (arg1 == 2) {
            this.field895 = arg0.method2328();
        } else if (arg1 == 4) {
            this.field889 = arg0.method2328();
        } else if (arg1 == 5) {
            this.field890 = arg0.method2328();
        } else if (arg1 == 6) {
            this.field891 = arg0.method2328();
        } else if (arg1 == 7) {
            this.field892 = arg0.method2326();
        } else if (arg1 == 8) {
            this.field878 = arg0.method2326();
        } else if (arg1 == 40) {
            int var3 = arg0.method2326();
            this.field885 = new short[var3];
            this.field886 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field885[var4] = (short) arg0.method2328();
                this.field886[var4] = (short) arg0.method2328();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2326();
            this.field881 = new short[var5];
            this.field888 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field881[var6] = (short) arg0.method2328();
                this.field888[var6] = (short) arg0.method2328();
            }
        }
    }

    @ObfuscatedName("aw.y(IB)Ldf;")
    public final class111 method708(int arg0) {
        class111 var2 = (class111) field894.method3087((long) this.field882);
        if (var2 == null) {
            class100 var3 = class100.method1925(Statics.field883, this.field884, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field885 != null) {
                for (int var4 = 0; var4 < this.field885.length; var4++) {
                    var3.method1938(this.field885[var4], this.field886[var4]);
                }
            }
            if (this.field881 != null) {
                for (int var5 = 0; var5 < this.field881.length; var5++) {
                    var3.method1959(this.field881[var5], this.field888[var5]);
                }
            }
            var2 = var3.method1946(this.field892 + 64, this.field878 + 850, -30, -50, -30);
            field894.method3089(var2, (long) this.field882);
        }
        class111 var6;
        if (this.field895 == -1 || arg0 == -1) {
            var6 = var2.method2119(true);
        } else {
            var6 = class33.method2589(this.field895).method688(var2, arg0);
        }
        if (this.field889 != 128 || this.field890 != 128) {
            var6.method2132(this.field889, this.field890, this.field889);
        }
        if (this.field891 != 0) {
            if (this.field891 == 90) {
                var6.method2127();
            }
            if (this.field891 == 180) {
                var6.method2127();
                var6.method2127();
            }
            if (this.field891 == 270) {
                var6.method2127();
                var6.method2127();
                var6.method2127();
            }
        }
        return var6;
    }
}
