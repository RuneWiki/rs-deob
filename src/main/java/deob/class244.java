package deob;

@ObfuscatedName("ik")
public class class244 extends class176 {

    @ObfuscatedName("ik.v")
    public static class146 field3220 = new class146(64);

    @ObfuscatedName("ik.u")
    public static class146 field3219 = new class146(30);

    @ObfuscatedName("ik.r")
    public int field3228;

    @ObfuscatedName("ik.p")
    public int field3221;

    @ObfuscatedName("ik.q")
    public int field3224 = -1;

    @ObfuscatedName("ik.m")
    public short[] field3223;

    @ObfuscatedName("ik.y")
    public short[] field3226;

    @ObfuscatedName("ik.i")
    public short[] field3217;

    @ObfuscatedName("ik.c")
    public short[] field3230;

    @ObfuscatedName("ik.b")
    public int field3227 = 128;

    @ObfuscatedName("ik.o")
    public int field3225 = 128;

    @ObfuscatedName("ik.a")
    public int field3229 = 0;

    @ObfuscatedName("ik.e")
    public int field3218 = 0;

    @ObfuscatedName("ik.w")
    public int field3231 = 0;

    @ObfuscatedName("bk.z(II)Lik;")
    public static class244 method1038(int arg0) {
        class244 var1 = (class244) field3220.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field88.method3726(13, arg0);
        class244 var3 = new class244();
        var3.field3228 = arg0;
        if (var2 != null) {
            var3.method3977(new class300(var2));
        }
        field3220.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.n(Lkl;I)V")
    public void method3977(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method3983(arg0, var2);
        }
    }

    @ObfuscatedName("ik.v(Lkl;IB)V")
    public void method3983(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3221 = arg0.method4992();
        } else if (arg1 == 2) {
            this.field3224 = arg0.method4992();
        } else if (arg1 == 4) {
            this.field3227 = arg0.method4992();
        } else if (arg1 == 5) {
            this.field3225 = arg0.method4992();
        } else if (arg1 == 6) {
            this.field3229 = arg0.method4992();
        } else if (arg1 == 7) {
            this.field3218 = arg0.method4990();
        } else if (arg1 == 8) {
            this.field3231 = arg0.method4990();
        } else if (arg1 == 40) {
            int var3 = arg0.method4990();
            this.field3223 = new short[var3];
            this.field3226 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3223[var4] = (short) arg0.method4992();
                this.field3226[var4] = (short) arg0.method4992();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method4990();
            this.field3217 = new short[var5];
            this.field3230 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3217[var6] = (short) arg0.method4992();
                this.field3230[var6] = (short) arg0.method4992();
            }
        }
    }

    @ObfuscatedName("ik.u(II)Ldh;")
    public final class128 method3979(int arg0) {
        class128 var2 = (class128) field3219.method2992((long) this.field3228);
        if (var2 == null) {
            class122 var3 = class122.method2560(Statics.field3222, this.field3221, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3223 != null) {
                for (int var4 = 0; var4 < this.field3223.length; var4++) {
                    var3.method2507(this.field3223[var4], this.field3226[var4]);
                }
            }
            if (this.field3217 != null) {
                for (int var5 = 0; var5 < this.field3217.length; var5++) {
                    var3.method2568(this.field3217[var5], this.field3230[var5]);
                }
            }
            var2 = var3.method2515(this.field3218 + 64, this.field3231 + 850, -30, -50, -30);
            field3219.method2994(var2, (long) this.field3228);
        }
        class128 var6;
        if (this.field3224 == -1 || arg0 == -1) {
            var6 = var2.method2595(true);
        } else {
            var6 = class259.method122(this.field3224).method4320(var2, arg0);
        }
        if (this.field3227 != 128 || this.field3225 != 128) {
            var6.method2635(this.field3227, this.field3225, this.field3227);
        }
        if (this.field3229 != 0) {
            if (this.field3229 == 90) {
                var6.method2599();
            }
            if (this.field3229 == 180) {
                var6.method2599();
                var6.method2599();
            }
            if (this.field3229 == 270) {
                var6.method2599();
                var6.method2599();
                var6.method2599();
            }
        }
        return var6;
    }

    @ObfuscatedName("hg.r(I)V")
    public static void method3701() {
        field3220.method2995();
        field3219.method2995();
    }
}
