package deob;

@ObfuscatedName("ie")
public class class250 extends class176 {

    @ObfuscatedName("ie.w")
    public static class146 field3302 = new class146(64);

    @ObfuscatedName("ie.e")
    public char field3307;

    @ObfuscatedName("ie.p")
    public int field3303;

    @ObfuscatedName("ie.k")
    public String field3304;

    @ObfuscatedName("ie.l")
    public boolean field3306 = true;

    @ObfuscatedName("ai.q(Lhp;I)V")
    public static void method656(class234 arg0) {
        Statics.field3308 = arg0;
    }

    @ObfuscatedName("j.w(IB)Lie;")
    public static class250 method195(int arg0) {
        class250 var1 = (class250) field3302.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3308.method3775(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4114(new class301(var2));
        }
        var3.method4113();
        field3302.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.e(B)V")
    public void method4113() {
    }

    @ObfuscatedName("ie.p(Lkf;B)V")
    public void method4114(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4115(arg0, var2);
        }
    }

    @ObfuscatedName("ie.k(Lkf;II)V")
    public void method4115(class301 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5068();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class289.field3668[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3307 = var6;
        } else if (arg1 == 2) {
            this.field3303 = arg0.method5072();
        } else if (arg1 == 4) {
            this.field3306 = false;
        } else if (arg1 == 5) {
            this.field3304 = arg0.method5076();
        }
    }

    @ObfuscatedName("ie.l(I)Z")
    public boolean method4116() {
        return this.field3307 == 's';
    }

    @ObfuscatedName("hv.b(I)V")
    public static void method3626() {
        field3302.method3042();
    }
}
