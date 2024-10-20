package deob;

@ObfuscatedName("jc")
public class class264 extends class209 {

    @ObfuscatedName("jc.m")
    public static class203 field3342 = new class203(64);

    @ObfuscatedName("jc.j")
    public static class203 field3343 = new class203(64);

    @ObfuscatedName("jc.g")
    public int field3344;

    @ObfuscatedName("jc.l")
    public int field3347 = 255;

    @ObfuscatedName("jc.d")
    public int field3348 = 255;

    @ObfuscatedName("jc.o")
    public int field3349 = -1;

    @ObfuscatedName("jc.s")
    public int field3350 = 1;

    @ObfuscatedName("jc.k")
    public int field3355 = 70;

    @ObfuscatedName("jc.v")
    public int field3352 = -1;

    @ObfuscatedName("jc.p")
    public int field3353 = -1;

    @ObfuscatedName("jc.n")
    public int field3354 = 30;

    @ObfuscatedName("jc.t")
    public int field3340 = 0;

    @ObfuscatedName("ib.c(Lih;Lih;B)V")
    public static void method4175(class250 arg0, class250 arg1) {
        Statics.field3345 = arg0;
        Statics.field3341 = arg1;
    }

    @ObfuscatedName("jc.q(Lgg;I)V")
    public void method4530(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4531(arg0, var2);
        }
    }

    @ObfuscatedName("jc.m(Lgg;IS)V")
    public void method4531(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3245();
        } else if (arg1 == 2) {
            this.field3347 = arg0.method3243();
        } else if (arg1 == 3) {
            this.field3348 = arg0.method3243();
        } else if (arg1 == 4) {
            this.field3349 = 0;
        } else if (arg1 == 5) {
            this.field3355 = arg0.method3245();
        } else if (arg1 == 6) {
            arg0.method3243();
        } else if (arg1 == 7) {
            this.field3352 = arg0.method3338();
        } else if (arg1 == 8) {
            this.field3353 = arg0.method3338();
        } else if (arg1 == 11) {
            this.field3349 = arg0.method3245();
        } else if (arg1 == 14) {
            this.field3354 = arg0.method3243();
        } else if (arg1 == 15) {
            this.field3340 = arg0.method3243();
        }
    }

    @ObfuscatedName("jc.j(B)Llt;")
    public class324 method4533() {
        if (this.field3352 < 0) {
            return null;
        }
        class324 var1 = (class324) field3343.method3654((long) this.field3352);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3341, this.field3352, 0);
        if (var2 != null) {
            field3343.method3646(var2, (long) this.field3352);
        }
        return var2;
    }

    @ObfuscatedName("jc.g(I)Llt;")
    public class324 method4529() {
        if (this.field3353 < 0) {
            return null;
        }
        class324 var1 = (class324) field3343.method3654((long) this.field3353);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3341, this.field3353, 0);
        if (var2 != null) {
            field3343.method3646(var2, (long) this.field3353);
        }
        return var2;
    }

    @ObfuscatedName("r.i(B)V")
    public static void method192() {
        field3342.method3647();
        field3343.method3647();
    }
}
