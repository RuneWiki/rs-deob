package deob;

@ObfuscatedName("ja")
public class class262 extends class207 {

    @ObfuscatedName("ja.s")
    public static class201 field3306 = new class201(64);

    @ObfuscatedName("ja.l")
    public static class201 field3307 = new class201(64);

    @ObfuscatedName("ja.u")
    public int field3318;

    @ObfuscatedName("ja.i")
    public int field3311 = 255;

    @ObfuscatedName("ja.x")
    public int field3308 = 255;

    @ObfuscatedName("ja.e")
    public int field3313 = -1;

    @ObfuscatedName("ja.p")
    public int field3309 = 1;

    @ObfuscatedName("ja.b")
    public int field3314 = 70;

    @ObfuscatedName("ja.n")
    public int field3316 = -1;

    @ObfuscatedName("ja.f")
    public int field3317 = -1;

    @ObfuscatedName("ja.g")
    public int field3312 = 30;

    @ObfuscatedName("ja.m")
    public int field3319 = 0;

    @ObfuscatedName("eg.z(Lir;Lir;B)V")
    public static void method2951(class248 arg0, class248 arg1) {
        Statics.field3305 = arg0;
        Statics.field3315 = arg1;
    }

    @ObfuscatedName("ja.w(Lgk;I)V")
    public void method4524(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4525(arg0, var2);
        }
    }

    @ObfuscatedName("ja.s(Lgk;II)V")
    public void method4525(class183 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3253();
        } else if (arg1 == 2) {
            this.field3311 = arg0.method3247();
        } else if (arg1 == 3) {
            this.field3308 = arg0.method3247();
        } else if (arg1 == 4) {
            this.field3313 = 0;
        } else if (arg1 == 5) {
            this.field3314 = arg0.method3253();
        } else if (arg1 == 6) {
            arg0.method3247();
        } else if (arg1 == 7) {
            this.field3316 = arg0.method3249();
        } else if (arg1 == 8) {
            this.field3317 = arg0.method3249();
        } else if (arg1 == 11) {
            this.field3313 = arg0.method3253();
        } else if (arg1 == 14) {
            this.field3312 = arg0.method3247();
        } else if (arg1 == 15) {
            this.field3319 = arg0.method3247();
        }
    }

    @ObfuscatedName("ja.l(I)Lll;")
    public class319 method4526() {
        if (this.field3316 < 0) {
            return null;
        }
        class319 var1 = (class319) field3307.method3681((long) this.field3316);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3315, this.field3316, 0);
        if (var2 != null) {
            field3307.method3675(var2, (long) this.field3316);
        }
        return var2;
    }

    @ObfuscatedName("ja.u(I)Lll;")
    public class319 method4527() {
        if (this.field3317 < 0) {
            return null;
        }
        class319 var1 = (class319) field3307.method3681((long) this.field3317);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3315, this.field3317, 0);
        if (var2 != null) {
            field3307.method3675(var2, (long) this.field3317);
        }
        return var2;
    }
}
