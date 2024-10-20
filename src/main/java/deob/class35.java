package deob;

@ObfuscatedName("at")
public class class35 extends class174 {

    @ObfuscatedName("at.d")
    public static class170 field888 = new class170(64);

    @ObfuscatedName("at.k")
    public static class170 field899 = new class170(30);

    @ObfuscatedName("at.n")
    public int field890;

    @ObfuscatedName("at.s")
    public int field903;

    @ObfuscatedName("at.x")
    public int field892 = -1;

    @ObfuscatedName("at.b")
    public short[] field893;

    @ObfuscatedName("at.j")
    public short[] field891;

    @ObfuscatedName("at.p")
    public short[] field897;

    @ObfuscatedName("at.l")
    public short[] field896;

    @ObfuscatedName("at.i")
    public int field904 = 128;

    @ObfuscatedName("at.r")
    public int field898 = 128;

    @ObfuscatedName("at.o")
    public int field900 = 0;

    @ObfuscatedName("at.c")
    public int field895 = 0;

    @ObfuscatedName("at.f")
    public int field886 = 0;

    @ObfuscatedName("bs.y(IB)Lat;")
    public static class35 method1458(int arg0) {
        class35 var1 = (class35) field888.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method2991(13, arg0);
        class35 var3 = new class35();
        var3.field890 = arg0;
        if (var2 != null) {
            var3.method754(new class127(var2));
        }
        field888.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.m(Ldp;B)V")
    public void method754(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method749(arg0, var2);
        }
    }

    @ObfuscatedName("at.d(Ldp;IB)V")
    public void method749(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field903 = arg0.method2460();
        } else if (arg1 == 2) {
            this.field892 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field904 = arg0.method2460();
        } else if (arg1 == 5) {
            this.field898 = arg0.method2460();
        } else if (arg1 == 6) {
            this.field900 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field895 = arg0.method2534();
        } else if (arg1 == 8) {
            this.field886 = arg0.method2534();
        } else if (arg1 == 40) {
            int var3 = arg0.method2534();
            this.field893 = new short[var3];
            this.field891 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field893[var4] = (short) arg0.method2460();
                this.field891[var4] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2534();
            this.field897 = new short[var5];
            this.field896 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field897[var6] = (short) arg0.method2460();
                this.field896[var6] = (short) arg0.method2460();
            }
        }
    }

    @ObfuscatedName("at.k(IB)Ldw;")
    public final class112 method760(int arg0) {
        class112 var2 = (class112) field899.method3288((long) this.field890);
        if (var2 == null) {
            class101 var3 = class101.method2060(Statics.field887, this.field903, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field893 != null) {
                for (int var4 = 0; var4 < this.field893.length; var4++) {
                    var3.method2108(this.field893[var4], this.field891[var4]);
                }
            }
            if (this.field897 != null) {
                for (int var5 = 0; var5 < this.field897.length; var5++) {
                    var3.method2073(this.field897[var5], this.field896[var5]);
                }
            }
            var2 = var3.method2081(this.field895 + 64, this.field886 + 850, -30, -50, -30);
            field899.method3291(var2, (long) this.field890);
        }
        class112 var6;
        if (this.field892 == -1 || arg0 == -1) {
            var6 = var2.method2246(true);
        } else {
            var6 = class34.method540(this.field892).method714(var2, arg0);
        }
        if (this.field904 != 128 || this.field898 != 128) {
            var6.method2265(this.field904, this.field898, this.field904);
        }
        if (this.field900 != 0) {
            if (this.field900 == 90) {
                var6.method2254();
            }
            if (this.field900 == 180) {
                var6.method2254();
                var6.method2254();
            }
            if (this.field900 == 270) {
                var6.method2254();
                var6.method2254();
                var6.method2254();
            }
        }
        return var6;
    }
}
