package deob;

@ObfuscatedName("ei")
public class class156 extends class142 {

    @ObfuscatedName("ei.i")
    public static class100 field2374 = new class100(64);

    @ObfuscatedName("ei.e")
    public static class100 field2383 = new class100(30);

    @ObfuscatedName("ei.a")
    public int field2373;

    @ObfuscatedName("ei.g")
    public int field2384;

    @ObfuscatedName("ei.w")
    public int field2377 = -1;

    @ObfuscatedName("ei.v")
    public short[] field2379;

    @ObfuscatedName("ei.u")
    public short[] field2380;

    @ObfuscatedName("ei.m")
    public short[] field2381;

    @ObfuscatedName("ei.b")
    public short[] field2382;

    @ObfuscatedName("ei.f")
    public int field2378 = 128;

    @ObfuscatedName("ei.d")
    public int field2376 = 128;

    @ObfuscatedName("ei.x")
    public int field2375 = 0;

    @ObfuscatedName("ei.z")
    public int field2386 = 0;

    @ObfuscatedName("ei.o")
    public int field2387 = 0;

    @ObfuscatedName("cf.i(Lcy;Lcy;I)V")
    public static void method1203(class86 arg0, class86 arg1) {
        Statics.field1096 = arg0;
        Statics.field2385 = arg1;
    }

    @ObfuscatedName("ey.e(II)Lei;")
    public static class156 method1555(int arg0) {
        class156 var1 = (class156) field2374.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1096.method1015(13, arg0);
        class156 var3 = new class156();
        var3.field2373 = arg0;
        if (var2 != null) {
            var3.method2430(new class135(var2));
        }
        field2374.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ei.a(Lec;B)V")
    public void method2430(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2415(arg0, var2);
        }
    }

    @ObfuscatedName("ei.g(Lec;II)V")
    public void method2415(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2384 = arg0.method1725();
        } else if (arg1 == 2) {
            this.field2377 = arg0.method1725();
        } else if (arg1 == 4) {
            this.field2378 = arg0.method1725();
        } else if (arg1 == 5) {
            this.field2376 = arg0.method1725();
        } else if (arg1 == 6) {
            this.field2375 = arg0.method1725();
        } else if (arg1 == 7) {
            this.field2386 = arg0.method1571();
        } else if (arg1 == 8) {
            this.field2387 = arg0.method1571();
        } else if (arg1 == 40) {
            int var3 = arg0.method1571();
            this.field2379 = new short[var3];
            this.field2380 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2379[var4] = (short) arg0.method1725();
                this.field2380[var4] = (short) arg0.method1725();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method1571();
            this.field2381 = new short[var5];
            this.field2382 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2381[var6] = (short) arg0.method1725();
                this.field2382[var6] = (short) arg0.method1725();
            }
        }
    }

    @ObfuscatedName("ei.w(II)Lfr;")
    public final class180 method2416(int arg0) {
        class180 var2 = (class180) field2383.method1231((long) this.field2373);
        if (var2 == null) {
            class179 var3 = class179.method2908(Statics.field2385, this.field2384, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2379 != null) {
                for (int var4 = 0; var4 < this.field2379.length; var4++) {
                    var3.method2920(this.field2379[var4], this.field2380[var4]);
                }
            }
            if (this.field2381 != null) {
                for (int var5 = 0; var5 < this.field2381.length; var5++) {
                    var3.method2921(this.field2381[var5], this.field2382[var5]);
                }
            }
            var2 = var3.method2928(this.field2386 + 64, this.field2387 + 850, -30, -50, -30);
            field2383.method1232(var2, (long) this.field2373);
        }
        class180 var6;
        if (this.field2377 == -1 || arg0 == -1) {
            var6 = var2.method2975(true);
        } else {
            var6 = class155.method2497(this.field2377).method2388(var2, arg0);
        }
        if (this.field2378 != 128 || this.field2376 != 128) {
            var6.method2974(this.field2378, this.field2376, this.field2378);
        }
        if (this.field2375 != 0) {
            if (this.field2375 == 90) {
                var6.method2992();
            }
            if (this.field2375 == 180) {
                var6.method2992();
                var6.method2992();
            }
            if (this.field2375 == 270) {
                var6.method2992();
                var6.method2992();
                var6.method2992();
            }
        }
        return var6;
    }
}
