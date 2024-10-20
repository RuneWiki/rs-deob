package deob;

@ObfuscatedName("ix")
public class class252 extends class195 {

    @ObfuscatedName("ix.k")
    public static class190 field3387 = new class190(64);

    @ObfuscatedName("ix.e")
    public char field3388;

    @ObfuscatedName("ix.p")
    public int field3393;

    @ObfuscatedName("ix.q")
    public String field3390;

    @ObfuscatedName("ix.s")
    public boolean field3391 = true;

    @ObfuscatedName("bv.d(Lit;I)V")
    public static void method1037(class236 arg0) {
        Statics.field3389 = arg0;
    }

    @ObfuscatedName("ef.k(IB)Lix;")
    public static class252 method2786(int arg0) {
        class252 var1 = (class252) field3387.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3389.method3875(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4169(new class174(var2));
        }
        var3.method4184();
        field3387.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.e(B)V")
    public void method4184() {
    }

    @ObfuscatedName("ix.p(Lfg;I)V")
    public void method4169(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4181(arg0, var2);
        }
    }

    @ObfuscatedName("ix.q(Lfg;II)V")
    public void method4181(class174 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2956();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class267.field3666[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3388 = var6;
        } else if (arg1 == 2) {
            this.field3393 = arg0.method2960();
        } else if (arg1 == 4) {
            this.field3391 = false;
        } else if (arg1 == 5) {
            this.field3390 = arg0.method2964();
        }
    }

    @ObfuscatedName("ix.s(I)Z")
    public boolean method4170() {
        return this.field3388 == 's';
    }

    @ObfuscatedName("be.r(I)V")
    public static void method1097() {
        field3387.method3345();
    }
}
