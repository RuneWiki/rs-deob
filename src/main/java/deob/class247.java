package deob;

@ObfuscatedName("il")
public class class247 extends class176 {

    @ObfuscatedName("il.n")
    public static class146 field3271 = new class146(64);

    @ObfuscatedName("il.q")
    public static class146 field3265 = new class146(64);

    @ObfuscatedName("il.v")
    public int field3266;

    @ObfuscatedName("il.o")
    public int field3268 = 255;

    @ObfuscatedName("il.i")
    public int field3272 = 255;

    @ObfuscatedName("il.d")
    public int field3269 = -1;

    @ObfuscatedName("il.m")
    public int field3270 = 1;

    @ObfuscatedName("il.p")
    public int field3264 = 70;

    @ObfuscatedName("il.h")
    public int field3273 = -1;

    @ObfuscatedName("il.k")
    public int field3274 = -1;

    @ObfuscatedName("il.x")
    public int field3275 = 30;

    @ObfuscatedName("il.j")
    public int field3276 = 0;

    @ObfuscatedName("il.a(Lkc;I)V")
    public void method4173(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4174(arg0, var2);
        }
    }

    @ObfuscatedName("il.t(Lkc;II)V")
    public void method4174(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5166();
        } else if (arg1 == 2) {
            this.field3268 = arg0.method5123();
        } else if (arg1 == 3) {
            this.field3272 = arg0.method5123();
        } else if (arg1 == 4) {
            this.field3269 = 0;
        } else if (arg1 == 5) {
            this.field3264 = arg0.method5166();
        } else if (arg1 == 6) {
            arg0.method5123();
        } else if (arg1 == 7) {
            this.field3273 = arg0.method5152();
        } else if (arg1 == 8) {
            this.field3274 = arg0.method5152();
        } else if (arg1 == 11) {
            this.field3269 = arg0.method5166();
        } else if (arg1 == 14) {
            this.field3275 = arg0.method5123();
        } else if (arg1 == 15) {
            this.field3276 = arg0.method5123();
        }
    }

    @ObfuscatedName("il.n(I)Llx;")
    public class325 method4175() {
        if (this.field3273 < 0) {
            return null;
        }
        class325 var1 = (class325) field3265.method3120((long) this.field3273);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3263, this.field3273, 0);
        if (var2 != null) {
            field3265.method3122(var2, (long) this.field3273);
        }
        return var2;
    }

    @ObfuscatedName("il.q(I)Llx;")
    public class325 method4184() {
        if (this.field3274 < 0) {
            return null;
        }
        class325 var1 = (class325) field3265.method3120((long) this.field3274);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3263, this.field3274, 0);
        if (var2 != null) {
            field3265.method3122(var2, (long) this.field3274);
        }
        return var2;
    }
}
