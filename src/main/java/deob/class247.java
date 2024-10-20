package deob;

@ObfuscatedName("ig")
public class class247 extends class176 {

    @ObfuscatedName("ig.i")
    public static class146 field3259 = new class146(64);

    @ObfuscatedName("ig.k")
    public static class146 field3263 = new class146(64);

    @ObfuscatedName("ig.u")
    public int field3265;

    @ObfuscatedName("ig.q")
    public int field3261 = 255;

    @ObfuscatedName("ig.x")
    public int field3271 = 255;

    @ObfuscatedName("ig.d")
    public int field3262 = -1;

    @ObfuscatedName("ig.f")
    public int field3266 = 1;

    @ObfuscatedName("ig.c")
    public int field3264 = 70;

    @ObfuscatedName("ig.r")
    public int field3268 = -1;

    @ObfuscatedName("ig.y")
    public int field3269 = -1;

    @ObfuscatedName("ig.p")
    public int field3270 = 30;

    @ObfuscatedName("ig.b")
    public int field3267 = 0;

    @ObfuscatedName("f.s(II)Lig;")
    public static class247 method115(int arg0) {
        class247 var1 = (class247) field3259.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3260.method3790(33, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4066(new class300(var2));
        }
        field3259.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.j(Lky;I)V")
    public void method4066(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4074(arg0, var2);
        }
    }

    @ObfuscatedName("ig.i(Lky;II)V")
    public void method4074(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5054();
        } else if (arg1 == 2) {
            this.field3261 = arg0.method5179();
        } else if (arg1 == 3) {
            this.field3271 = arg0.method5179();
        } else if (arg1 == 4) {
            this.field3262 = 0;
        } else if (arg1 == 5) {
            this.field3264 = arg0.method5054();
        } else if (arg1 == 6) {
            arg0.method5179();
        } else if (arg1 == 7) {
            this.field3268 = arg0.method5246();
        } else if (arg1 == 8) {
            this.field3269 = arg0.method5246();
        } else if (arg1 == 11) {
            this.field3262 = arg0.method5054();
        } else if (arg1 == 14) {
            this.field3270 = arg0.method5179();
        } else if (arg1 == 15) {
            this.field3267 = arg0.method5179();
        }
    }

    @ObfuscatedName("ig.k(I)Lls;")
    public class325 method4061() {
        if (this.field3268 < 0) {
            return null;
        }
        class325 var1 = (class325) field3263.method3065((long) this.field3268);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field3258, this.field3268, 0);
        if (var2 != null) {
            field3263.method3067(var2, (long) this.field3268);
        }
        return var2;
    }

    @ObfuscatedName("ig.u(I)Lls;")
    public class325 method4063() {
        if (this.field3269 < 0) {
            return null;
        }
        class325 var1 = (class325) field3263.method3065((long) this.field3269);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field3258, this.field3269, 0);
        if (var2 != null) {
            field3263.method3067(var2, (long) this.field3269);
        }
        return var2;
    }

    @ObfuscatedName("iz.n(I)V")
    public static void method3948() {
        field3259.method3068();
        field3263.method3068();
    }
}
