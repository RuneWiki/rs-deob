package deob;

@ObfuscatedName("ff")
public class class157 extends class143 {

    @ObfuscatedName("ff.d")
    public static class101 field2376 = new class101(64);

    @ObfuscatedName("ff.k")
    public static class101 field2389 = new class101(30);

    @ObfuscatedName("ff.u")
    public int field2379;

    @ObfuscatedName("ff.v")
    public int field2380;

    @ObfuscatedName("ff.f")
    public int field2381 = -1;

    @ObfuscatedName("ff.s")
    public short[] field2388;

    @ObfuscatedName("ff.j")
    public short[] field2386;

    @ObfuscatedName("ff.e")
    public short[] field2384;

    @ObfuscatedName("ff.t")
    public short[] field2385;

    @ObfuscatedName("ff.y")
    public int field2378 = 128;

    @ObfuscatedName("ff.b")
    public int field2387 = 128;

    @ObfuscatedName("ff.w")
    public int field2382 = 0;

    @ObfuscatedName("ff.g")
    public int field2377 = 0;

    @ObfuscatedName("ff.p")
    public int field2390 = 0;

    @ObfuscatedName("au.k(II)Lff;")
    public static class157 method404(int arg0) {
        class157 var1 = (class157) field2376.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field845.method1024(13, arg0);
        class157 var3 = new class157();
        var3.field2379 = arg0;
        if (var2 != null) {
            var3.method2451(new class136(var2));
        }
        field2376.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.u(Let;I)V")
    public void method2451(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2459(arg0, var2);
        }
    }

    @ObfuscatedName("ff.v(Let;IB)V")
    public void method2459(class136 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2380 = arg0.method1712();
        } else if (arg1 == 2) {
            this.field2381 = arg0.method1712();
        } else if (arg1 == 4) {
            this.field2378 = arg0.method1712();
        } else if (arg1 == 5) {
            this.field2387 = arg0.method1712();
        } else if (arg1 == 6) {
            this.field2382 = arg0.method1712();
        } else if (arg1 == 7) {
            this.field2377 = arg0.method1602();
        } else if (arg1 == 8) {
            this.field2390 = arg0.method1602();
        } else if (arg1 == 40) {
            int var3 = arg0.method1602();
            this.field2388 = new short[var3];
            this.field2386 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2388[var4] = (short) arg0.method1712();
                this.field2386[var4] = (short) arg0.method1712();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method1602();
            this.field2384 = new short[var5];
            this.field2385 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2384[var6] = (short) arg0.method1712();
                this.field2385[var6] = (short) arg0.method1712();
            }
        }
    }

    @ObfuscatedName("ff.f(IB)Lfb;")
    public final class181 method2453(int arg0) {
        class181 var2 = (class181) field2389.method1236((long) this.field2379);
        if (var2 == null) {
            class180 var3 = class180.method2918(Statics.field2383, this.field2380, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2388 != null) {
                for (int var4 = 0; var4 < this.field2388.length; var4++) {
                    var3.method2930(this.field2388[var4], this.field2386[var4]);
                }
            }
            if (this.field2384 != null) {
                for (int var5 = 0; var5 < this.field2384.length; var5++) {
                    var3.method2991(this.field2384[var5], this.field2385[var5]);
                }
            }
            var2 = var3.method2938(this.field2377 + 64, this.field2390 + 850, -30, -50, -30);
            field2389.method1238(var2, (long) this.field2379);
        }
        class181 var6;
        if (this.field2381 == -1 || arg0 == -1) {
            var6 = var2.method3004(true);
        } else {
            var6 = class156.method482(this.field2381).method2422(var2, arg0);
        }
        if (this.field2378 != 128 || this.field2387 != 128) {
            var6.method3064(this.field2378, this.field2387, this.field2378);
        }
        if (this.field2382 != 0) {
            if (this.field2382 == 90) {
                var6.method3009();
            }
            if (this.field2382 == 180) {
                var6.method3009();
                var6.method3009();
            }
            if (this.field2382 == 270) {
                var6.method3009();
                var6.method3009();
                var6.method3009();
            }
        }
        return var6;
    }
}
