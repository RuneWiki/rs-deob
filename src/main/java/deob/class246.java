package deob;

@ObfuscatedName("im")
public class class246 extends class195 {

    @ObfuscatedName("im.u")
    public static class190 field3313 = new class190(64);

    @ObfuscatedName("im.q")
    public static class190 field3329 = new class190(30);

    @ObfuscatedName("im.g")
    public int field3311;

    @ObfuscatedName("im.v")
    public int field3316;

    @ObfuscatedName("im.t")
    public int field3320 = -1;

    @ObfuscatedName("im.p")
    public short[] field3318;

    @ObfuscatedName("im.l")
    public short[] field3319;

    @ObfuscatedName("im.a")
    public short[] field3317;

    @ObfuscatedName("im.k")
    public short[] field3321;

    @ObfuscatedName("im.r")
    public int field3322 = 128;

    @ObfuscatedName("im.b")
    public int field3323 = 128;

    @ObfuscatedName("im.x")
    public int field3315 = 0;

    @ObfuscatedName("im.o")
    public int field3325 = 0;

    @ObfuscatedName("im.j")
    public int field3326 = 0;

    @ObfuscatedName("gr.i(II)Lim;")
    public static class246 method3468(int arg0) {
        class246 var1 = (class246) field3313.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3324.method3836(13, arg0);
        class246 var3 = new class246();
        var3.field3311 = arg0;
        if (var2 != null) {
            var3.method4049(new class174(var2));
        }
        field3313.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.h(Lfv;I)V")
    public void method4049(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4050(arg0, var2);
        }
    }

    @ObfuscatedName("im.u(Lfv;IS)V")
    public void method4050(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3316 = arg0.method2932();
        } else if (arg1 == 2) {
            this.field3320 = arg0.method2932();
        } else if (arg1 == 4) {
            this.field3322 = arg0.method2932();
        } else if (arg1 == 5) {
            this.field3323 = arg0.method2932();
        } else if (arg1 == 6) {
            this.field3315 = arg0.method2932();
        } else if (arg1 == 7) {
            this.field3325 = arg0.method2930();
        } else if (arg1 == 8) {
            this.field3326 = arg0.method2930();
        } else if (arg1 == 40) {
            int var3 = arg0.method2930();
            this.field3318 = new short[var3];
            this.field3319 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3318[var4] = (short) arg0.method2932();
                this.field3319[var4] = (short) arg0.method2932();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2930();
            this.field3317 = new short[var5];
            this.field3321 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3317[var6] = (short) arg0.method2932();
                this.field3321[var6] = (short) arg0.method2932();
            }
        }
    }

    @ObfuscatedName("im.q(II)Lew;")
    public final class134 method4051(int arg0) {
        class134 var2 = (class134) field3329.method3308((long) this.field3311);
        if (var2 == null) {
            class128 var3 = class128.method2227(Statics.field3312, this.field3316, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3318 != null) {
                for (int var4 = 0; var4 < this.field3318.length; var4++) {
                    var3.method2289(this.field3318[var4], this.field3319[var4]);
                }
            }
            if (this.field3317 != null) {
                for (int var5 = 0; var5 < this.field3317.length; var5++) {
                    var3.method2295(this.field3317[var5], this.field3321[var5]);
                }
            }
            var2 = var3.method2271(this.field3325 + 64, this.field3326 + 850, -30, -50, -30);
            field3329.method3316(var2, (long) this.field3311);
        }
        class134 var6;
        if (this.field3320 == -1 || arg0 == -1) {
            var6 = var2.method2342(true);
        } else {
            var6 = class261.method2856(this.field3320).method4397(var2, arg0);
        }
        if (this.field3322 != 128 || this.field3323 != 128) {
            var6.method2317(this.field3322, this.field3323, this.field3322);
        }
        if (this.field3315 != 0) {
            if (this.field3315 == 90) {
                var6.method2330();
            }
            if (this.field3315 == 180) {
                var6.method2330();
                var6.method2330();
            }
            if (this.field3315 == 270) {
                var6.method2330();
                var6.method2330();
                var6.method2330();
            }
        }
        return var6;
    }
}
