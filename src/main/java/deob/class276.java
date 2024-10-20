package deob;

@ObfuscatedName("jb")
public class class276 extends class219 {

    @ObfuscatedName("jb.i")
    public static class213 field3528 = new class213(64);

    @ObfuscatedName("jb.a")
    public static class213 field3527 = new class213(64);

    @ObfuscatedName("jb.l")
    public int field3537;

    @ObfuscatedName("jb.x")
    public int field3529 = 255;

    @ObfuscatedName("jb.p")
    public int field3530 = 255;

    @ObfuscatedName("jb.g")
    public int field3531 = -1;

    @ObfuscatedName("jb.n")
    public int field3525 = 1;

    @ObfuscatedName("jb.o")
    public int field3533 = 70;

    @ObfuscatedName("jb.c")
    public int field3534 = -1;

    @ObfuscatedName("jb.v")
    public int field3535 = -1;

    @ObfuscatedName("jb.u")
    public int field3536 = 30;

    @ObfuscatedName("jb.j")
    public int field3532 = 0;

    @ObfuscatedName("iz.t(Ljc;Ljc;B)V")
    public static void method4180(class262 arg0, class262 arg1) {
        Statics.field3526 = arg0;
        Statics.field2679 = arg1;
    }

    @ObfuscatedName("jb.q(Lgb;I)V")
    public void method4469(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4470(arg0, var2);
        }
    }

    @ObfuscatedName("jb.i(Lgb;IB)V")
    public void method4470(class195 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3238();
        } else if (arg1 == 2) {
            this.field3529 = arg0.method3236();
        } else if (arg1 == 3) {
            this.field3530 = arg0.method3236();
        } else if (arg1 == 4) {
            this.field3531 = 0;
        } else if (arg1 == 5) {
            this.field3533 = arg0.method3238();
        } else if (arg1 == 6) {
            arg0.method3236();
        } else if (arg1 == 7) {
            this.field3534 = arg0.method3252();
        } else if (arg1 == 8) {
            this.field3535 = arg0.method3252();
        } else if (arg1 == 11) {
            this.field3531 = arg0.method3238();
        } else if (arg1 == 14) {
            this.field3536 = arg0.method3236();
        } else if (arg1 == 15) {
            this.field3532 = arg0.method3236();
        }
    }

    @ObfuscatedName("jb.a(I)Lla;")
    public class332 method4471() {
        if (this.field3534 < 0) {
            return null;
        }
        class332 var1 = (class332) field3527.method3625((long) this.field3534);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field2679, this.field3534, 0);
        if (var2 != null) {
            field3527.method3627(var2, (long) this.field3534);
        }
        return var2;
    }

    @ObfuscatedName("jb.l(B)Lla;")
    public class332 method4480() {
        if (this.field3535 < 0) {
            return null;
        }
        class332 var1 = (class332) field3527.method3625((long) this.field3535);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field2679, this.field3535, 0);
        if (var2 != null) {
            field3527.method3627(var2, (long) this.field3535);
        }
        return var2;
    }
}
