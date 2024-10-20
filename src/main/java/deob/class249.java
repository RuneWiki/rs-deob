package deob;

@ObfuscatedName("it")
public class class249 extends class195 {

    @ObfuscatedName("it.e")
    public static class190 field3363 = new class190(64);

    @ObfuscatedName("it.v")
    public static class190 field3364 = new class190(64);

    @ObfuscatedName("it.b")
    public int field3365;

    @ObfuscatedName("it.x")
    public int field3367 = 255;

    @ObfuscatedName("it.f")
    public int field3368 = 255;

    @ObfuscatedName("it.n")
    public int field3369 = -1;

    @ObfuscatedName("it.a")
    public int field3370 = 1;

    @ObfuscatedName("it.o")
    public int field3371 = 70;

    @ObfuscatedName("it.z")
    public int field3362 = -1;

    @ObfuscatedName("it.q")
    public int field3372 = -1;

    @ObfuscatedName("it.j")
    public int field3374 = 30;

    @ObfuscatedName("it.k")
    public int field3373 = 0;

    @ObfuscatedName("cd.i(II)Lit;")
    public static class249 method1688(int arg0) {
        class249 var1 = (class249) field3363.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3375.method3769(33, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4046(new class174(var2));
        }
        field3363.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.c(Lfx;I)V")
    public void method4046(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4057(arg0, var2);
        }
    }

    @ObfuscatedName("it.e(Lfx;IS)V")
    public void method4057(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2872();
        } else if (arg1 == 2) {
            this.field3367 = arg0.method2870();
        } else if (arg1 == 3) {
            this.field3368 = arg0.method2870();
        } else if (arg1 == 4) {
            this.field3369 = 0;
        } else if (arg1 == 5) {
            this.field3371 = arg0.method2872();
        } else if (arg1 == 6) {
            arg0.method2870();
        } else if (arg1 == 7) {
            this.field3362 = arg0.method2885();
        } else if (arg1 == 8) {
            this.field3372 = arg0.method2885();
        } else if (arg1 == 11) {
            this.field3369 = arg0.method2872();
        } else if (arg1 == 14) {
            this.field3374 = arg0.method2870();
        } else if (arg1 == 15) {
            this.field3373 = arg0.method2870();
        }
    }

    @ObfuscatedName("it.v(B)Ljs;")
    public class286 method4048() {
        if (this.field3362 < 0) {
            return null;
        }
        class286 var1 = (class286) field3364.method3220((long) this.field3362);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3366, this.field3362, 0);
        if (var2 != null) {
            field3364.method3222(var2, (long) this.field3362);
        }
        return var2;
    }

    @ObfuscatedName("it.b(B)Ljs;")
    public class286 method4052() {
        if (this.field3372 < 0) {
            return null;
        }
        class286 var1 = (class286) field3364.method3220((long) this.field3372);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3366, this.field3372, 0);
        if (var2 != null) {
            field3364.method3222(var2, (long) this.field3372);
        }
        return var2;
    }
}
