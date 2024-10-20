package deob;

@ObfuscatedName("it")
public class class249 extends class195 {

    @ObfuscatedName("it.a")
    public static class190 field3376 = new class190(64);

    @ObfuscatedName("it.t")
    public static class190 field3385 = new class190(64);

    @ObfuscatedName("it.s")
    public int field3377;

    @ObfuscatedName("it.y")
    public int field3373 = 255;

    @ObfuscatedName("it.j")
    public int field3380 = 255;

    @ObfuscatedName("it.k")
    public int field3379 = -1;

    @ObfuscatedName("it.e")
    public int field3382 = 1;

    @ObfuscatedName("it.o")
    public int field3383 = 70;

    @ObfuscatedName("it.z")
    public int field3384 = -1;

    @ObfuscatedName("it.l")
    public int field3375 = -1;

    @ObfuscatedName("it.c")
    public int field3386 = 30;

    @ObfuscatedName("it.m")
    public int field3387 = 0;

    @ObfuscatedName("bq.i(Liq;Liq;B)V")
    public static void method1069(class236 arg0, class236 arg1) {
        Statics.field3381 = arg0;
        Statics.field3374 = arg1;
    }

    @ObfuscatedName("it.w(Lfp;I)V")
    public void method4059(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4043(arg0, var2);
        }
    }

    @ObfuscatedName("it.a(Lfp;IS)V")
    public void method4043(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2882();
        } else if (arg1 == 2) {
            this.field3373 = arg0.method3061();
        } else if (arg1 == 3) {
            this.field3380 = arg0.method3061();
        } else if (arg1 == 4) {
            this.field3379 = 0;
        } else if (arg1 == 5) {
            this.field3383 = arg0.method2882();
        } else if (arg1 == 6) {
            arg0.method3061();
        } else if (arg1 == 7) {
            this.field3384 = arg0.method2864();
        } else if (arg1 == 8) {
            this.field3375 = arg0.method2864();
        } else if (arg1 == 11) {
            this.field3379 = arg0.method2882();
        } else if (arg1 == 14) {
            this.field3386 = arg0.method3061();
        } else if (arg1 == 15) {
            this.field3387 = arg0.method3061();
        }
    }

    @ObfuscatedName("it.t(I)Ljk;")
    public class286 method4046() {
        if (this.field3384 < 0) {
            return null;
        }
        class286 var1 = (class286) field3385.method3235((long) this.field3384);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3374, this.field3384, 0);
        if (var2 != null) {
            field3385.method3234(var2, (long) this.field3384);
        }
        return var2;
    }

    @ObfuscatedName("it.s(I)Ljk;")
    public class286 method4051() {
        if (this.field3375 < 0) {
            return null;
        }
        class286 var1 = (class286) field3385.method3235((long) this.field3375);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3374, this.field3375, 0);
        if (var2 != null) {
            field3385.method3234(var2, (long) this.field3375);
        }
        return var2;
    }
}
