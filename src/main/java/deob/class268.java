package deob;

@ObfuscatedName("jp")
public class class268 extends class214 {

    @ObfuscatedName("jp.g")
    public static class208 field3387 = new class208(64);

    @ObfuscatedName("jp.x")
    public static class208 field3388 = new class208(64);

    @ObfuscatedName("jp.h")
    public int field3401;

    @ObfuscatedName("jp.m")
    public int field3397 = 255;

    @ObfuscatedName("jp.q")
    public int field3392 = 255;

    @ObfuscatedName("jp.b")
    public int field3393 = -1;

    @ObfuscatedName("jp.n")
    public int field3394 = 1;

    @ObfuscatedName("jp.e")
    public int field3395 = 70;

    @ObfuscatedName("jp.r")
    public int field3390 = -1;

    @ObfuscatedName("jp.t")
    public int field3385 = -1;

    @ObfuscatedName("jp.l")
    public int field3391 = 30;

    @ObfuscatedName("jp.o")
    public int field3399 = 0;

    @ObfuscatedName("jn.a(Liz;Liz;B)V")
    public static void method4605(class255 arg0, class255 arg1) {
        Statics.field3398 = arg0;
        Statics.field3386 = arg1;
    }

    @ObfuscatedName("jp.s(Lgx;B)V")
    public void method4707(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4699(arg0, var2);
        }
    }

    @ObfuscatedName("jp.g(Lgx;II)V")
    public void method4699(class190 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3610();
        } else if (arg1 == 2) {
            this.field3397 = arg0.method3443();
        } else if (arg1 == 3) {
            this.field3392 = arg0.method3443();
        } else if (arg1 == 4) {
            this.field3393 = 0;
        } else if (arg1 == 5) {
            this.field3395 = arg0.method3610();
        } else if (arg1 == 6) {
            arg0.method3443();
        } else if (arg1 == 7) {
            this.field3390 = arg0.method3656();
        } else if (arg1 == 8) {
            this.field3385 = arg0.method3656();
        } else if (arg1 == 11) {
            this.field3393 = arg0.method3610();
        } else if (arg1 == 14) {
            this.field3391 = arg0.method3443();
        } else if (arg1 == 15) {
            this.field3399 = arg0.method3443();
        }
    }

    @ObfuscatedName("jp.x(B)Lld;")
    public class328 method4700() {
        if (this.field3390 < 0) {
            return null;
        }
        class328 var1 = (class328) field3388.method3885((long) this.field3390);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field3386, this.field3390, 0);
        if (var2 != null) {
            field3388.method3878(var2, (long) this.field3390);
        }
        return var2;
    }

    @ObfuscatedName("jp.h(I)Lld;")
    public class328 method4701() {
        if (this.field3385 < 0) {
            return null;
        }
        class328 var1 = (class328) field3388.method3885((long) this.field3385);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field3386, this.field3385, 0);
        if (var2 != null) {
            field3388.method3878(var2, (long) this.field3385);
        }
        return var2;
    }

    @ObfuscatedName("ig.f(I)V")
    public static void method4416() {
        field3387.method3879();
        field3388.method3879();
    }
}
