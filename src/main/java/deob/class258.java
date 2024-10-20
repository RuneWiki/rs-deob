package deob;

@ObfuscatedName("ie")
public class class258 extends class185 {

    @ObfuscatedName("ie.x")
    public static class155 field3309 = new class155(64);

    @ObfuscatedName("ie.w")
    public static class155 field3310 = new class155(64);

    @ObfuscatedName("ie.t")
    public int field3314;

    @ObfuscatedName("ie.p")
    public int field3313 = 255;

    @ObfuscatedName("ie.l")
    public int field3321 = 255;

    @ObfuscatedName("ie.z")
    public int field3315 = -1;

    @ObfuscatedName("ie.u")
    public int field3308 = 1;

    @ObfuscatedName("ie.e")
    public int field3317 = 70;

    @ObfuscatedName("ie.m")
    public int field3318 = -1;

    @ObfuscatedName("ie.c")
    public int field3319 = -1;

    @ObfuscatedName("ie.i")
    public int field3320 = 30;

    @ObfuscatedName("ie.f")
    public int field3311 = 0;

    @ObfuscatedName("gt.h(Lib;Lib;I)V")
    public static void method3371(class245 arg0, class245 arg1) {
        Statics.field2574 = arg0;
        Statics.field3316 = arg1;
    }

    @ObfuscatedName("ci.v(IB)Lie;")
    public static class258 method1678(int arg0) {
        class258 var1 = (class258) field3309.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2574.method3834(33, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4127(new class311(var2));
        }
        field3309.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.x(Lkj;B)V")
    public void method4127(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4142(arg0, var2);
        }
    }

    @ObfuscatedName("ie.w(Lkj;IB)V")
    public void method4142(class311 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5342();
        } else if (arg1 == 2) {
            this.field3313 = arg0.method5274();
        } else if (arg1 == 3) {
            this.field3321 = arg0.method5274();
        } else if (arg1 == 4) {
            this.field3315 = 0;
        } else if (arg1 == 5) {
            this.field3317 = arg0.method5342();
        } else if (arg1 == 6) {
            arg0.method5274();
        } else if (arg1 == 7) {
            this.field3318 = arg0.method5132();
        } else if (arg1 == 8) {
            this.field3319 = arg0.method5132();
        } else if (arg1 == 11) {
            this.field3315 = arg0.method5342();
        } else if (arg1 == 14) {
            this.field3320 = arg0.method5274();
        } else if (arg1 == 15) {
            this.field3311 = arg0.method5274();
        }
    }

    @ObfuscatedName("ie.t(I)Llm;")
    public class336 method4126() {
        if (this.field3318 < 0) {
            return null;
        }
        class336 var1 = (class336) field3310.method3147((long) this.field3318);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3316, this.field3318, 0);
        if (var2 != null) {
            field3310.method3145(var2, (long) this.field3318);
        }
        return var2;
    }

    @ObfuscatedName("ie.j(S)Llm;")
    public class336 method4123() {
        if (this.field3319 < 0) {
            return null;
        }
        class336 var1 = (class336) field3310.method3147((long) this.field3319);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3316, this.field3319, 0);
        if (var2 != null) {
            field3310.method3145(var2, (long) this.field3319);
        }
        return var2;
    }

    @ObfuscatedName("ir.n(I)V")
    public static void method4057() {
        field3309.method3146();
        field3310.method3146();
    }
}
