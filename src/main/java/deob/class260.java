package deob;

@ObfuscatedName("iu")
public class class260 extends class206 {

    @ObfuscatedName("iu.y")
    public static class201 field3453 = new class201(64);

    @ObfuscatedName("iu.r")
    public static class201 field3460 = new class201(64);

    @ObfuscatedName("iu.h")
    public int field3457;

    @ObfuscatedName("iu.b")
    public int field3459 = 255;

    @ObfuscatedName("iu.e")
    public int field3455 = 255;

    @ObfuscatedName("iu.f")
    public int field3461 = -1;

    @ObfuscatedName("iu.z")
    public int field3462 = 1;

    @ObfuscatedName("iu.u")
    public int field3463 = 70;

    @ObfuscatedName("iu.p")
    public int field3464 = -1;

    @ObfuscatedName("iu.w")
    public int field3465 = -1;

    @ObfuscatedName("iu.t")
    public int field3466 = 30;

    @ObfuscatedName("iu.o")
    public int field3467 = 0;

    @ObfuscatedName("iw.n(Lil;Lil;I)V")
    public static void method4060(class247 arg0, class247 arg1) {
        Statics.field3456 = arg0;
        Statics.field3454 = arg1;
    }

    @ObfuscatedName("iu.v(Lgv;S)V")
    public void method4193(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4182(arg0, var2);
        }
    }

    @ObfuscatedName("iu.y(Lgv;IB)V")
    public void method4182(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3015();
        } else if (arg1 == 2) {
            this.field3459 = arg0.method3021();
        } else if (arg1 == 3) {
            this.field3455 = arg0.method3021();
        } else if (arg1 == 4) {
            this.field3461 = 0;
        } else if (arg1 == 5) {
            this.field3463 = arg0.method3015();
        } else if (arg1 == 6) {
            arg0.method3021();
        } else if (arg1 == 7) {
            this.field3464 = arg0.method3200();
        } else if (arg1 == 8) {
            this.field3465 = arg0.method3200();
        } else if (arg1 == 11) {
            this.field3461 = arg0.method3015();
        } else if (arg1 == 14) {
            this.field3466 = arg0.method3021();
        } else if (arg1 == 15) {
            this.field3467 = arg0.method3021();
        }
    }

    @ObfuscatedName("iu.r(I)Lkg;")
    public class299 method4185() {
        if (this.field3464 < 0) {
            return null;
        }
        class299 var1 = (class299) field3460.method3407((long) this.field3464);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field3454, this.field3464, 0);
        if (var2 != null) {
            field3460.method3408(var2, (long) this.field3464);
        }
        return var2;
    }

    @ObfuscatedName("iu.h(I)Lkg;")
    public class299 method4186() {
        if (this.field3465 < 0) {
            return null;
        }
        class299 var1 = (class299) field3460.method3407((long) this.field3465);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field3454, this.field3465, 0);
        if (var2 != null) {
            field3460.method3408(var2, (long) this.field3465);
        }
        return var2;
    }
}
