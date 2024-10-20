package deob;

@ObfuscatedName("an")
public class class34 extends class172 {

    @ObfuscatedName("an.x")
    public static class168 field880 = new class168(64);

    @ObfuscatedName("an.z")
    public static class168 field888 = new class168(30);

    @ObfuscatedName("an.c")
    public int field890;

    @ObfuscatedName("an.e")
    public int field878;

    @ObfuscatedName("an.s")
    public int field901 = -1;

    @ObfuscatedName("an.i")
    public short[] field885;

    @ObfuscatedName("an.g")
    public short[] field886;

    @ObfuscatedName("an.q")
    public short[] field887;

    @ObfuscatedName("an.w")
    public short[] field884;

    @ObfuscatedName("an.k")
    public int field889 = 128;

    @ObfuscatedName("an.v")
    public int field897 = 128;

    @ObfuscatedName("an.o")
    public int field891 = 0;

    @ObfuscatedName("an.m")
    public int field892 = 0;

    @ObfuscatedName("an.u")
    public int field893 = 0;

    @ObfuscatedName("ao.j(IB)Lan;")
    public static class34 method564(int arg0) {
        class34 var1 = (class34) field880.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field881.method2903(13, arg0);
        class34 var3 = new class34();
        var3.field890 = arg0;
        if (var2 != null) {
            var3.method717(new class126(var2));
        }
        field880.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.y(Ldr;B)V")
    public void method717(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method730(arg0, var2);
        }
    }

    @ObfuscatedName("an.x(Ldr;II)V")
    public void method730(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field878 = arg0.method2405();
        } else if (arg1 == 2) {
            this.field901 = arg0.method2405();
        } else if (arg1 == 4) {
            this.field889 = arg0.method2405();
        } else if (arg1 == 5) {
            this.field897 = arg0.method2405();
        } else if (arg1 == 6) {
            this.field891 = arg0.method2405();
        } else if (arg1 == 7) {
            this.field892 = arg0.method2399();
        } else if (arg1 == 8) {
            this.field893 = arg0.method2399();
        } else if (arg1 == 40) {
            int var3 = arg0.method2399();
            this.field885 = new short[var3];
            this.field886 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field885[var4] = (short) arg0.method2405();
                this.field886[var4] = (short) arg0.method2405();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2399();
            this.field887 = new short[var5];
            this.field884 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field887[var6] = (short) arg0.method2405();
                this.field884[var6] = (short) arg0.method2405();
            }
        }
    }

    @ObfuscatedName("an.z(II)Ldh;")
    public final class111 method719(int arg0) {
        class111 var2 = (class111) field888.method3191((long) this.field890);
        if (var2 == null) {
            class100 var3 = class100.method2001(Statics.field879, this.field878, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field885 != null) {
                for (int var4 = 0; var4 < this.field885.length; var4++) {
                    var3.method2013(this.field885[var4], this.field886[var4]);
                }
            }
            if (this.field887 != null) {
                for (int var5 = 0; var5 < this.field887.length; var5++) {
                    var3.method2000(this.field887[var5], this.field884[var5]);
                }
            }
            var2 = var3.method2057(this.field892 + 64, this.field893 + 850, -30, -50, -30);
            field888.method3181(var2, (long) this.field890);
        }
        class111 var6;
        if (this.field901 == -1 || arg0 == -1) {
            var6 = var2.method2214(true);
        } else {
            var6 = class33.method2614(this.field901).method715(var2, arg0);
        }
        if (this.field889 != 128 || this.field897 != 128) {
            var6.method2181(this.field889, this.field897, this.field889);
        }
        if (this.field891 != 0) {
            if (this.field891 == 90) {
                var6.method2233();
            }
            if (this.field891 == 180) {
                var6.method2233();
                var6.method2233();
            }
            if (this.field891 == 270) {
                var6.method2233();
                var6.method2233();
                var6.method2233();
            }
        }
        return var6;
    }

    @ObfuscatedName("bc.c(B)V")
    public static void method1447() {
        field880.method3185();
        field888.method3185();
    }
}
