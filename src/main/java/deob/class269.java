package deob;

@ObfuscatedName("jn")
public class class269 extends class215 {

    @ObfuscatedName("jn.o")
    public static class210 field3456 = new class210(64);

    @ObfuscatedName("jn.p")
    public static class210 field3457 = new class210(64);

    @ObfuscatedName("jn.a")
    public int field3466;

    @ObfuscatedName("jn.y")
    public int field3454 = 255;

    @ObfuscatedName("jn.g")
    public int field3462 = 255;

    @ObfuscatedName("jn.c")
    public int field3463 = -1;

    @ObfuscatedName("jn.u")
    public int field3464 = 1;

    @ObfuscatedName("jn.r")
    public int field3461 = 70;

    @ObfuscatedName("jn.d")
    public int field3458 = -1;

    @ObfuscatedName("jn.v")
    public int field3467 = -1;

    @ObfuscatedName("jn.s")
    public int field3468 = 30;

    @ObfuscatedName("jn.t")
    public int field3465 = 0;

    @ObfuscatedName("jn.b(Lgn;I)V")
    public void method4437(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4438(arg0, var2);
        }
    }

    @ObfuscatedName("jn.q(Lgn;II)V")
    public void method4438(class194 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3249();
        } else if (arg1 == 2) {
            this.field3454 = arg0.method3247();
        } else if (arg1 == 3) {
            this.field3462 = arg0.method3247();
        } else if (arg1 == 4) {
            this.field3463 = 0;
        } else if (arg1 == 5) {
            this.field3461 = arg0.method3249();
        } else if (arg1 == 6) {
            arg0.method3247();
        } else if (arg1 == 7) {
            this.field3458 = arg0.method3432();
        } else if (arg1 == 8) {
            this.field3467 = arg0.method3432();
        } else if (arg1 == 11) {
            this.field3463 = arg0.method3249();
        } else if (arg1 == 14) {
            this.field3468 = arg0.method3247();
        } else if (arg1 == 15) {
            this.field3465 = arg0.method3247();
        }
    }

    @ObfuscatedName("jn.o(B)Llm;")
    public class323 method4444() {
        if (this.field3458 < 0) {
            return null;
        }
        class323 var1 = (class323) field3457.method3658((long) this.field3458);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3455, this.field3458, 0);
        if (var2 != null) {
            field3457.method3659(var2, (long) this.field3458);
        }
        return var2;
    }

    @ObfuscatedName("jn.p(B)Llm;")
    public class323 method4445() {
        if (this.field3467 < 0) {
            return null;
        }
        class323 var1 = (class323) field3457.method3658((long) this.field3467);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3455, this.field3467, 0);
        if (var2 != null) {
            field3457.method3659(var2, (long) this.field3467);
        }
        return var2;
    }
}
