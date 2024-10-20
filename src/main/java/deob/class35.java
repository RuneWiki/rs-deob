package deob;

@ObfuscatedName("at")
public class class35 extends class174 {

    @ObfuscatedName("at.e")
    public static class170 field916 = new class170(64);

    @ObfuscatedName("at.r")
    public static class170 field917 = new class170(30);

    @ObfuscatedName("at.p")
    public int field925;

    @ObfuscatedName("at.n")
    public int field919;

    @ObfuscatedName("at.o")
    public int field920 = -1;

    @ObfuscatedName("at.l")
    public short[] field927;

    @ObfuscatedName("at.t")
    public short[] field923;

    @ObfuscatedName("at.q")
    public short[] field921;

    @ObfuscatedName("at.c")
    public short[] field924;

    @ObfuscatedName("at.z")
    public int field914 = 128;

    @ObfuscatedName("at.s")
    public int field928 = 128;

    @ObfuscatedName("at.h")
    public int field918 = 0;

    @ObfuscatedName("at.f")
    public int field922 = 0;

    @ObfuscatedName("at.w")
    public int field929 = 0;

    @ObfuscatedName("da.a(IB)Lat;")
    public static class35 method2175(int arg0) {
        class35 var1 = (class35) field916.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field926.method2961(13, arg0);
        class35 var3 = new class35();
        var3.field925 = arg0;
        if (var2 != null) {
            var3.method749(new class127(var2));
        }
        field916.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.x(Ldy;B)V")
    public void method749(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldy;II)V")
    public void method760(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field919 = arg0.method2413();
        } else if (arg1 == 2) {
            this.field920 = arg0.method2413();
        } else if (arg1 == 4) {
            this.field914 = arg0.method2413();
        } else if (arg1 == 5) {
            this.field928 = arg0.method2413();
        } else if (arg1 == 6) {
            this.field918 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field922 = arg0.method2411();
        } else if (arg1 == 8) {
            this.field929 = arg0.method2411();
        } else if (arg1 == 40) {
            int var3 = arg0.method2411();
            this.field927 = new short[var3];
            this.field923 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field927[var4] = (short) arg0.method2413();
                this.field923[var4] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2411();
            this.field921 = new short[var5];
            this.field924 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field921[var6] = (short) arg0.method2413();
                this.field924[var6] = (short) arg0.method2413();
            }
        }
    }

    @ObfuscatedName("at.r(II)Ldd;")
    public final class112 method751(int arg0) {
        class112 var2 = (class112) field917.method3196((long) this.field925);
        if (var2 == null) {
            class101 var3 = class101.method1989(Statics.field915, this.field919, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field927 != null) {
                for (int var4 = 0; var4 < this.field927.length; var4++) {
                    var3.method2002(this.field927[var4], this.field923[var4]);
                }
            }
            if (this.field921 != null) {
                for (int var5 = 0; var5 < this.field921.length; var5++) {
                    var3.method2021(this.field921[var5], this.field924[var5]);
                }
            }
            var2 = var3.method2010(this.field922 + 64, this.field929 + 850, -30, -50, -30);
            field917.method3193(var2, (long) this.field925);
        }
        class112 var6;
        if (this.field920 == -1 || arg0 == -1) {
            var6 = var2.method2182(true);
        } else {
            var6 = class34.method57(this.field920).method715(var2, arg0);
        }
        if (this.field914 != 128 || this.field928 != 128) {
            var6.method2215(this.field914, this.field928, this.field914);
        }
        if (this.field918 != 0) {
            if (this.field918 == 90) {
                var6.method2189();
            }
            if (this.field918 == 180) {
                var6.method2189();
                var6.method2189();
            }
            if (this.field918 == 270) {
                var6.method2189();
                var6.method2189();
                var6.method2189();
            }
        }
        return var6;
    }
}
