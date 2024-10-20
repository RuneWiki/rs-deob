package deob;

@ObfuscatedName("ip")
public class class247 extends class176 {

    @ObfuscatedName("ip.v")
    public static class146 field3255 = new class146(64);

    @ObfuscatedName("ip.u")
    public static class146 field3258 = new class146(64);

    @ObfuscatedName("ip.r")
    public int field3259;

    @ObfuscatedName("ip.m")
    public int field3262 = 255;

    @ObfuscatedName("ip.y")
    public int field3263 = 255;

    @ObfuscatedName("ip.i")
    public int field3256 = -1;

    @ObfuscatedName("ip.c")
    public int field3265 = 1;

    @ObfuscatedName("ip.b")
    public int field3266 = 70;

    @ObfuscatedName("ip.o")
    public int field3267 = -1;

    @ObfuscatedName("ip.a")
    public int field3261 = -1;

    @ObfuscatedName("ip.e")
    public int field3257 = 30;

    @ObfuscatedName("ip.w")
    public int field3270 = 0;

    @ObfuscatedName("bv.z(Lhp;Lhp;I)V")
    public static void method1001(class234 arg0, class234 arg1) {
        Statics.field3268 = arg0;
        Statics.field3269 = arg1;
    }

    @ObfuscatedName("ip.n(Lkl;I)V")
    public void method4029(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4032(arg0, var2);
        }
    }

    @ObfuscatedName("ip.v(Lkl;IB)V")
    public void method4032(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method4992();
        } else if (arg1 == 2) {
            this.field3262 = arg0.method4990();
        } else if (arg1 == 3) {
            this.field3263 = arg0.method4990();
        } else if (arg1 == 4) {
            this.field3256 = 0;
        } else if (arg1 == 5) {
            this.field3266 = arg0.method4992();
        } else if (arg1 == 6) {
            arg0.method4990();
        } else if (arg1 == 7) {
            this.field3267 = arg0.method5001();
        } else if (arg1 == 8) {
            this.field3261 = arg0.method5001();
        } else if (arg1 == 11) {
            this.field3256 = arg0.method4992();
        } else if (arg1 == 14) {
            this.field3257 = arg0.method4990();
        } else if (arg1 == 15) {
            this.field3270 = arg0.method4990();
        }
    }

    @ObfuscatedName("ip.u(I)Llf;")
    public class325 method4031() {
        if (this.field3267 < 0) {
            return null;
        }
        class325 var1 = (class325) field3258.method2992((long) this.field3267);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field3269, this.field3267, 0);
        if (var2 != null) {
            field3258.method2994(var2, (long) this.field3267);
        }
        return var2;
    }

    @ObfuscatedName("ip.r(B)Llf;")
    public class325 method4045() {
        if (this.field3261 < 0) {
            return null;
        }
        class325 var1 = (class325) field3258.method2992((long) this.field3261);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field3269, this.field3261, 0);
        if (var2 != null) {
            field3258.method2994(var2, (long) this.field3261);
        }
        return var2;
    }
}
