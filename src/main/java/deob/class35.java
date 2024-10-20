package deob;

@ObfuscatedName("ay")
public class class35 extends class174 {

    @ObfuscatedName("ay.u")
    public static class170 field897 = new class170(64);

    @ObfuscatedName("ay.t")
    public static class170 field883 = new class170(30);

    @ObfuscatedName("ay.k")
    public int field891;

    @ObfuscatedName("ay.x")
    public int field887;

    @ObfuscatedName("ay.v")
    public int field888 = -1;

    @ObfuscatedName("ay.g")
    public short[] field889;

    @ObfuscatedName("ay.n")
    public short[] field890;

    @ObfuscatedName("ay.q")
    public short[] field885;

    @ObfuscatedName("ay.i")
    public short[] field892;

    @ObfuscatedName("ay.p")
    public int field893 = 128;

    @ObfuscatedName("ay.e")
    public int field884 = 128;

    @ObfuscatedName("ay.o")
    public int field895 = 0;

    @ObfuscatedName("ay.j")
    public int field896 = 0;

    @ObfuscatedName("ay.s")
    public int field882 = 0;

    @ObfuscatedName("aq.a(IB)Lay;")
    public static class35 method651(int arg0) {
        class35 var1 = (class35) field897.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method2943(13, arg0);
        class35 var3 = new class35();
        var3.field891 = arg0;
        if (var2 != null) {
            var3.method685(new class126(var2));
        }
        field897.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.r(Ldf;I)V")
    public void method685(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method690(arg0, var2);
        }
    }

    @ObfuscatedName("ay.u(Ldf;IB)V")
    public void method690(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field887 = arg0.method2373();
        } else if (arg1 == 2) {
            this.field888 = arg0.method2373();
        } else if (arg1 == 4) {
            this.field893 = arg0.method2373();
        } else if (arg1 == 5) {
            this.field884 = arg0.method2373();
        } else if (arg1 == 6) {
            this.field895 = arg0.method2373();
        } else if (arg1 == 7) {
            this.field896 = arg0.method2481();
        } else if (arg1 == 8) {
            this.field882 = arg0.method2481();
        } else if (arg1 == 40) {
            int var3 = arg0.method2481();
            this.field889 = new short[var3];
            this.field890 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field889[var4] = (short) arg0.method2373();
                this.field890[var4] = (short) arg0.method2373();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2481();
            this.field885 = new short[var5];
            this.field892 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field885[var6] = (short) arg0.method2373();
                this.field892[var6] = (short) arg0.method2373();
            }
        }
    }

    @ObfuscatedName("ay.t(IB)Ldw;")
    public final class112 method686(int arg0) {
        class112 var2 = (class112) field883.method3208((long) this.field891);
        if (var2 == null) {
            class101 var3 = class101.method1993(Statics.field886, this.field887, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field889 != null) {
                for (int var4 = 0; var4 < this.field889.length; var4++) {
                    var3.method2006(this.field889[var4], this.field890[var4]);
                }
            }
            if (this.field885 != null) {
                for (int var5 = 0; var5 < this.field885.length; var5++) {
                    var3.method2007(this.field885[var5], this.field892[var5]);
                }
            }
            var2 = var3.method2014(this.field896 + 64, this.field882 + 850, -30, -50, -30);
            field883.method3210(var2, (long) this.field891);
        }
        class112 var6;
        if (this.field888 == -1 || arg0 == -1) {
            var6 = var2.method2177(true);
        } else {
            var6 = class34.method30(this.field888).method658(var2, arg0);
        }
        if (this.field893 != 128 || this.field884 != 128) {
            var6.method2228(this.field893, this.field884, this.field893);
        }
        if (this.field895 != 0) {
            if (this.field895 == 90) {
                var6.method2208();
            }
            if (this.field895 == 180) {
                var6.method2208();
                var6.method2208();
            }
            if (this.field895 == 270) {
                var6.method2208();
                var6.method2208();
                var6.method2208();
            }
        }
        return var6;
    }
}
