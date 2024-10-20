package deob;

@ObfuscatedName("ip")
public class class247 extends class176 {

    @ObfuscatedName("ip.e")
    public static class146 field3279 = new class146(64);

    @ObfuscatedName("ip.p")
    public static class146 field3277 = new class146(64);

    @ObfuscatedName("ip.k")
    public int field3280;

    @ObfuscatedName("ip.i")
    public int field3276 = 255;

    @ObfuscatedName("ip.c")
    public int field3283 = 255;

    @ObfuscatedName("ip.f")
    public int field3284 = -1;

    @ObfuscatedName("ip.m")
    public int field3278 = 1;

    @ObfuscatedName("ip.u")
    public int field3286 = 70;

    @ObfuscatedName("ip.x")
    public int field3287 = -1;

    @ObfuscatedName("ip.r")
    public int field3288 = -1;

    @ObfuscatedName("ip.v")
    public int field3289 = 30;

    @ObfuscatedName("ip.y")
    public int field3290 = 0;

    @ObfuscatedName("ab.q(II)Lip;")
    public static class247 method716(int arg0) {
        class247 var1 = (class247) field3279.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3282.method3775(33, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4090(new class301(var2));
        }
        field3279.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.w(Lkf;B)V")
    public void method4090(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4081(arg0, var2);
        }
    }

    @ObfuscatedName("ip.e(Lkf;IB)V")
    public void method4081(class301 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5069();
        } else if (arg1 == 2) {
            this.field3276 = arg0.method5077();
        } else if (arg1 == 3) {
            this.field3283 = arg0.method5077();
        } else if (arg1 == 4) {
            this.field3284 = 0;
        } else if (arg1 == 5) {
            this.field3286 = arg0.method5069();
        } else if (arg1 == 6) {
            arg0.method5077();
        } else if (arg1 == 7) {
            this.field3287 = arg0.method5084();
        } else if (arg1 == 8) {
            this.field3288 = arg0.method5084();
        } else if (arg1 == 11) {
            this.field3284 = arg0.method5069();
        } else if (arg1 == 14) {
            this.field3289 = arg0.method5077();
        } else if (arg1 == 15) {
            this.field3290 = arg0.method5077();
        }
    }

    @ObfuscatedName("ip.p(B)Lly;")
    public class326 method4082() {
        if (this.field3287 < 0) {
            return null;
        }
        class326 var1 = (class326) field3277.method3039((long) this.field3287);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3281, this.field3287, 0);
        if (var2 != null) {
            field3277.method3041(var2, (long) this.field3287);
        }
        return var2;
    }

    @ObfuscatedName("ip.k(I)Lly;")
    public class326 method4083() {
        if (this.field3288 < 0) {
            return null;
        }
        class326 var1 = (class326) field3277.method3039((long) this.field3288);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3281, this.field3288, 0);
        if (var2 != null) {
            field3277.method3041(var2, (long) this.field3288);
        }
        return var2;
    }
}
