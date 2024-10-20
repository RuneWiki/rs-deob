package deob;

@ObfuscatedName("il")
public class class244 extends class176 {

    @ObfuscatedName("il.i")
    public static class146 field3221 = new class146(64);

    @ObfuscatedName("il.k")
    public static class146 field3233 = new class146(30);

    @ObfuscatedName("il.u")
    public int field3223;

    @ObfuscatedName("il.n")
    public int field3224;

    @ObfuscatedName("il.t")
    public int field3229 = -1;

    @ObfuscatedName("il.q")
    public short[] field3219;

    @ObfuscatedName("il.x")
    public short[] field3227;

    @ObfuscatedName("il.d")
    public short[] field3228;

    @ObfuscatedName("il.f")
    public short[] field3226;

    @ObfuscatedName("il.c")
    public int field3230 = 128;

    @ObfuscatedName("il.r")
    public int field3231 = 128;

    @ObfuscatedName("il.y")
    public int field3232 = 0;

    @ObfuscatedName("il.p")
    public int field3222 = 0;

    @ObfuscatedName("il.b")
    public int field3234 = 0;

    @ObfuscatedName("bb.s(II)Lil;")
    public static class244 method1579(int arg0) {
        class244 var1 = (class244) field3221.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3220.method3790(13, arg0);
        class244 var3 = new class244();
        var3.field3223 = arg0;
        if (var2 != null) {
            var3.method4009(new class300(var2));
        }
        field3221.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.j(Lky;I)V")
    public void method4009(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4017(arg0, var2);
        }
    }

    @ObfuscatedName("il.i(Lky;II)V")
    public void method4017(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3224 = arg0.method5054();
        } else if (arg1 == 2) {
            this.field3229 = arg0.method5054();
        } else if (arg1 == 4) {
            this.field3230 = arg0.method5054();
        } else if (arg1 == 5) {
            this.field3231 = arg0.method5054();
        } else if (arg1 == 6) {
            this.field3232 = arg0.method5054();
        } else if (arg1 == 7) {
            this.field3222 = arg0.method5179();
        } else if (arg1 == 8) {
            this.field3234 = arg0.method5179();
        } else if (arg1 == 40) {
            int var3 = arg0.method5179();
            this.field3219 = new short[var3];
            this.field3227 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3219[var4] = (short) arg0.method5054();
                this.field3227[var4] = (short) arg0.method5054();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5179();
            this.field3228 = new short[var5];
            this.field3226 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3228[var6] = (short) arg0.method5054();
                this.field3226[var6] = (short) arg0.method5054();
            }
        }
    }

    @ObfuscatedName("il.k(II)Ldo;")
    public final class128 method4011(int arg0) {
        class128 var2 = (class128) field3233.method3065((long) this.field3223);
        if (var2 == null) {
            class122 var3 = class122.method2521(Statics.field3225, this.field3224, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3219 != null) {
                for (int var4 = 0; var4 < this.field3219.length; var4++) {
                    var3.method2534(this.field3219[var4], this.field3227[var4]);
                }
            }
            if (this.field3228 != null) {
                for (int var5 = 0; var5 < this.field3228.length; var5++) {
                    var3.method2535(this.field3228[var5], this.field3226[var5]);
                }
            }
            var2 = var3.method2542(this.field3222 + 64, this.field3234 + 850, -30, -50, -30);
            field3233.method3067(var2, (long) this.field3223);
        }
        class128 var6;
        if (this.field3229 == -1 || arg0 == -1) {
            var6 = var2.method2624(true);
        } else {
            var6 = Statics.method3725(this.field3229).method4365(var2, arg0);
        }
        if (this.field3230 != 128 || this.field3231 != 128) {
            var6.method2707(this.field3230, this.field3231, this.field3230);
        }
        if (this.field3232 != 0) {
            if (this.field3232 == 90) {
                var6.method2668();
            }
            if (this.field3232 == 180) {
                var6.method2668();
                var6.method2668();
            }
            if (this.field3232 == 270) {
                var6.method2668();
                var6.method2668();
                var6.method2668();
            }
        }
        return var6;
    }

    @ObfuscatedName("cu.u(B)V")
    public static void method1923() {
        field3221.method3068();
        field3233.method3068();
    }
}
