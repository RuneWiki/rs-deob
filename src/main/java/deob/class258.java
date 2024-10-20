package deob;

@ObfuscatedName("ix")
public class class258 extends class185 {

    @ObfuscatedName("ix.d")
    public static class155 field3311 = new class155(64);

    @ObfuscatedName("ix.c")
    public static class155 field3312 = new class155(64);

    @ObfuscatedName("ix.y")
    public int field3313;

    @ObfuscatedName("ix.e")
    public int field3320 = 255;

    @ObfuscatedName("ix.q")
    public int field3316 = 255;

    @ObfuscatedName("ix.l")
    public int field3319 = -1;

    @ObfuscatedName("ix.s")
    public int field3317 = 1;

    @ObfuscatedName("ix.b")
    public int field3318 = 70;

    @ObfuscatedName("ix.a")
    public int field3309 = -1;

    @ObfuscatedName("ix.w")
    public int field3321 = -1;

    @ObfuscatedName("ix.k")
    public int field3322 = 30;

    @ObfuscatedName("ix.i")
    public int field3323 = 0;

    @ObfuscatedName("fs.n(Lig;Lig;I)V")
    public static void method3282(class245 arg0, class245 arg1) {
        Statics.field3315 = arg0;
        Statics.field3310 = arg1;
    }

    @ObfuscatedName("ix.v(Lkx;B)V")
    public void method4262(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4264(arg0, var2);
        }
    }

    @ObfuscatedName("ix.d(Lkx;II)V")
    public void method4264(class311 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5247();
        } else if (arg1 == 2) {
            this.field3320 = arg0.method5310();
        } else if (arg1 == 3) {
            this.field3316 = arg0.method5310();
        } else if (arg1 == 4) {
            this.field3319 = 0;
        } else if (arg1 == 5) {
            this.field3318 = arg0.method5247();
        } else if (arg1 == 6) {
            arg0.method5310();
        } else if (arg1 == 7) {
            this.field3309 = arg0.method5389();
        } else if (arg1 == 8) {
            this.field3321 = arg0.method5389();
        } else if (arg1 == 11) {
            this.field3319 = arg0.method5247();
        } else if (arg1 == 14) {
            this.field3322 = arg0.method5310();
        } else if (arg1 == 15) {
            this.field3323 = arg0.method5310();
        }
    }

    @ObfuscatedName("ix.c(I)Llm;")
    public class336 method4268() {
        if (this.field3309 < 0) {
            return null;
        }
        class336 var1 = (class336) field3312.method3220((long) this.field3309);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field3310, this.field3309, 0);
        if (var2 != null) {
            field3312.method3217(var2, (long) this.field3309);
        }
        return var2;
    }

    @ObfuscatedName("ix.y(I)Llm;")
    public class336 method4266() {
        if (this.field3321 < 0) {
            return null;
        }
        class336 var1 = (class336) field3312.method3220((long) this.field3321);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field3310, this.field3321, 0);
        if (var2 != null) {
            field3312.method3217(var2, (long) this.field3321);
        }
        return var2;
    }

    @ObfuscatedName("es.h(B)V")
    public static void method2792() {
        field3311.method3218();
        field3312.method3218();
    }
}
