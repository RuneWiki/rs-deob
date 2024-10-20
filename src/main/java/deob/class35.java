package deob;

@ObfuscatedName("ah")
public class class35 extends class174 {

    @ObfuscatedName("ah.j")
    public static class170 field904 = new class170(64);

    @ObfuscatedName("ah.i")
    public static class170 field906 = new class170(30);

    @ObfuscatedName("ah.k")
    public int field912;

    @ObfuscatedName("ah.q")
    public int field916;

    @ObfuscatedName("ah.t")
    public int field909 = -1;

    @ObfuscatedName("ah.v")
    public short[] field910;

    @ObfuscatedName("ah.y")
    public short[] field920;

    @ObfuscatedName("ah.w")
    public short[] field919;

    @ObfuscatedName("ah.g")
    public short[] field908;

    @ObfuscatedName("ah.s")
    public int field914 = 128;

    @ObfuscatedName("ah.n")
    public int field915 = 128;

    @ObfuscatedName("ah.x")
    public int field917 = 0;

    @ObfuscatedName("ah.o")
    public int field905 = 0;

    @ObfuscatedName("ah.l")
    public int field918 = 0;

    @ObfuscatedName("f.b(IB)Lah;")
    public static class35 method216(int arg0) {
        class35 var1 = (class35) field904.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2964(13, arg0);
        class35 var3 = new class35();
        var3.field912 = arg0;
        if (var2 != null) {
            var3.method732(new class127(var2));
        }
        field904.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.c(Ldv;I)V")
    public void method732(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method743(arg0, var2);
        }
    }

    @ObfuscatedName("ah.j(Ldv;II)V")
    public void method743(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field916 = arg0.method2394();
        } else if (arg1 == 2) {
            this.field909 = arg0.method2394();
        } else if (arg1 == 4) {
            this.field914 = arg0.method2394();
        } else if (arg1 == 5) {
            this.field915 = arg0.method2394();
        } else if (arg1 == 6) {
            this.field917 = arg0.method2394();
        } else if (arg1 == 7) {
            this.field905 = arg0.method2416();
        } else if (arg1 == 8) {
            this.field918 = arg0.method2416();
        } else if (arg1 == 40) {
            int var3 = arg0.method2416();
            this.field910 = new short[var3];
            this.field920 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field910[var4] = (short) arg0.method2394();
                this.field920[var4] = (short) arg0.method2394();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2416();
            this.field919 = new short[var5];
            this.field908 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field919[var6] = (short) arg0.method2394();
                this.field908[var6] = (short) arg0.method2394();
            }
        }
    }

    @ObfuscatedName("ah.i(IB)Ldr;")
    public final class112 method731(int arg0) {
        class112 var2 = (class112) field906.method3188((long) this.field912);
        if (var2 == null) {
            class101 var3 = class101.method2065(Statics.field2828, this.field916, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field910 != null) {
                for (int var4 = 0; var4 < this.field910.length; var4++) {
                    var3.method2077(this.field910[var4], this.field920[var4]);
                }
            }
            if (this.field919 != null) {
                for (int var5 = 0; var5 < this.field919.length; var5++) {
                    var3.method2013(this.field919[var5], this.field908[var5]);
                }
            }
            var2 = var3.method2046(this.field905 + 64, this.field918 + 850, -30, -50, -30);
            field906.method3190(var2, (long) this.field912);
        }
        class112 var6;
        if (this.field909 == -1 || arg0 == -1) {
            var6 = var2.method2194(true);
        } else {
            var6 = Statics.method61(this.field909).method720(var2, arg0);
        }
        if (this.field914 != 128 || this.field915 != 128) {
            var6.method2206(this.field914, this.field915, this.field914);
        }
        if (this.field917 != 0) {
            if (this.field917 == 90) {
                var6.method2202();
            }
            if (this.field917 == 180) {
                var6.method2202();
                var6.method2202();
            }
            if (this.field917 == 270) {
                var6.method2202();
                var6.method2202();
                var6.method2202();
            }
        }
        return var6;
    }
}
