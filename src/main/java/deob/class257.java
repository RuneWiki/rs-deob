package deob;

@ObfuscatedName("id")
public class class257 extends class185 {

    @ObfuscatedName("id.k")
    public static class155 field3280 = new class155(64);

    @ObfuscatedName("id.d")
    public static class155 field3275 = new class155(64);

    @ObfuscatedName("id.w")
    public int field3277;

    @ObfuscatedName("id.z")
    public int field3278 = 255;

    @ObfuscatedName("id.t")
    public int field3279 = 255;

    @ObfuscatedName("id.e")
    public int field3284 = -1;

    @ObfuscatedName("id.s")
    public int field3273 = 1;

    @ObfuscatedName("id.p")
    public int field3276 = 70;

    @ObfuscatedName("id.n")
    public int field3283 = -1;

    @ObfuscatedName("id.u")
    public int field3281 = -1;

    @ObfuscatedName("id.h")
    public int field3285 = 30;

    @ObfuscatedName("id.g")
    public int field3286 = 0;

    @ObfuscatedName("id.x(Lkb;I)V")
    public void method4153(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4154(arg0, var2);
        }
    }

    @ObfuscatedName("id.m(Lkb;II)V")
    public void method4154(class310 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5139();
        } else if (arg1 == 2) {
            this.field3278 = arg0.method5137();
        } else if (arg1 == 3) {
            this.field3279 = arg0.method5137();
        } else if (arg1 == 4) {
            this.field3284 = 0;
        } else if (arg1 == 5) {
            this.field3276 = arg0.method5139();
        } else if (arg1 == 6) {
            arg0.method5137();
        } else if (arg1 == 7) {
            this.field3283 = arg0.method5154();
        } else if (arg1 == 8) {
            this.field3281 = arg0.method5154();
        } else if (arg1 == 11) {
            this.field3284 = arg0.method5139();
        } else if (arg1 == 14) {
            this.field3285 = arg0.method5137();
        } else if (arg1 == 15) {
            this.field3286 = arg0.method5137();
        }
    }

    @ObfuscatedName("id.k(S)Lla;")
    public class335 method4155() {
        if (this.field3283 < 0) {
            return null;
        }
        class335 var1 = (class335) field3275.method3146((long) this.field3283);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3837, this.field3283, 0);
        if (var2 != null) {
            field3275.method3152(var2, (long) this.field3283);
        }
        return var2;
    }

    @ObfuscatedName("id.d(I)Lla;")
    public class335 method4156() {
        if (this.field3281 < 0) {
            return null;
        }
        class335 var1 = (class335) field3275.method3146((long) this.field3281);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3837, this.field3281, 0);
        if (var2 != null) {
            field3275.method3152(var2, (long) this.field3281);
        }
        return var2;
    }
}
