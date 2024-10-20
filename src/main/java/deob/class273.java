package deob;

@ObfuscatedName("jq")
public class class273 extends class219 {

    @ObfuscatedName("jq.n")
    public static class213 field3488 = new class213(64);

    @ObfuscatedName("jq.r")
    public static class213 field3482 = new class213(30);

    @ObfuscatedName("jq.e")
    public int field3483;

    @ObfuscatedName("jq.y")
    public int field3484;

    @ObfuscatedName("jq.k")
    public int field3485 = -1;

    @ObfuscatedName("jq.s")
    public short[] field3479;

    @ObfuscatedName("jq.p")
    public short[] field3487;

    @ObfuscatedName("jq.x")
    public short[] field3480;

    @ObfuscatedName("jq.m")
    public short[] field3489;

    @ObfuscatedName("jq.h")
    public int field3490 = 128;

    @ObfuscatedName("jq.t")
    public int field3491 = 128;

    @ObfuscatedName("jq.i")
    public int field3492 = 0;

    @ObfuscatedName("jq.u")
    public int field3493 = 0;

    @ObfuscatedName("jq.q")
    public int field3486 = 0;

    @ObfuscatedName("bl.d(IB)Ljq;")
    public static class273 method698(int arg0) {
        class273 var1 = (class273) field3488.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3494.method4273(13, arg0);
        class273 var3 = new class273();
        var3.field3483 = arg0;
        if (var2 != null) {
            var3.method4520(new class195(var2));
        }
        field3488.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.z(Lgy;I)V")
    public void method4520(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4522(arg0, var2);
        }
    }

    @ObfuscatedName("jq.n(Lgy;II)V")
    public void method4522(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3484 = arg0.method3269();
        } else if (arg1 == 2) {
            this.field3485 = arg0.method3269();
        } else if (arg1 == 4) {
            this.field3490 = arg0.method3269();
        } else if (arg1 == 5) {
            this.field3491 = arg0.method3269();
        } else if (arg1 == 6) {
            this.field3492 = arg0.method3269();
        } else if (arg1 == 7) {
            this.field3493 = arg0.method3330();
        } else if (arg1 == 8) {
            this.field3486 = arg0.method3330();
        } else if (arg1 == 40) {
            int var3 = arg0.method3330();
            this.field3479 = new short[var3];
            this.field3487 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3479[var4] = (short) arg0.method3269();
                this.field3487[var4] = (short) arg0.method3269();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3330();
            this.field3480 = new short[var5];
            this.field3489 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3480[var6] = (short) arg0.method3269();
                this.field3489[var6] = (short) arg0.method3269();
            }
        }
    }

    @ObfuscatedName("jq.r(II)Lel;")
    public final class132 method4528(int arg0) {
        class132 var2 = (class132) field3482.method3707((long) this.field3483);
        if (var2 == null) {
            class126 var3 = class126.method2428(Statics.field3481, this.field3484, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3479 != null) {
                for (int var4 = 0; var4 < this.field3479.length; var4++) {
                    var3.method2441(this.field3479[var4], this.field3487[var4]);
                }
            }
            if (this.field3480 != null) {
                for (int var5 = 0; var5 < this.field3480.length; var5++) {
                    var3.method2442(this.field3480[var5], this.field3489[var5]);
                }
            }
            var2 = var3.method2449(this.field3493 + 64, this.field3486 + 850, -30, -50, -30);
            field3482.method3697(var2, (long) this.field3483);
        }
        class132 var6;
        if (this.field3485 == -1 || arg0 == -1) {
            var6 = var2.method2549(true);
        } else {
            var6 = class288.method4510(this.field3485).method4895(var2, arg0);
        }
        if (this.field3490 != 128 || this.field3491 != 128) {
            var6.method2540(this.field3490, this.field3491, this.field3490);
        }
        if (this.field3492 != 0) {
            if (this.field3492 == 90) {
                var6.method2559();
            }
            if (this.field3492 == 180) {
                var6.method2559();
                var6.method2559();
            }
            if (this.field3492 == 270) {
                var6.method2559();
                var6.method2559();
                var6.method2559();
            }
        }
        return var6;
    }

    @ObfuscatedName("gq.e(I)V")
    public static void method3509() {
        field3488.method3700();
        field3482.method3700();
    }
}
