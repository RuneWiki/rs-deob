package deob;

@ObfuscatedName("ai")
public class class173 extends class7 {

    @ObfuscatedName("ai.g")
    public short[] field2658;

    @ObfuscatedName("ai.d")
    public short[] field2656;

    @ObfuscatedName("ai.e")
    public int field2662 = 0;

    @ObfuscatedName("ai.b")
    public static class75 field2657 = new class75(64);

    @ObfuscatedName("ai.a")
    public int field2660 = 128;

    @ObfuscatedName("ai.m")
    public int field2653;

    @ObfuscatedName("ai.j")
    public short[] field2663;

    @ObfuscatedName("ai.k")
    public int field2667 = 0;

    @ObfuscatedName("ai.i")
    public static class75 field2652 = new class75(30);

    @ObfuscatedName("ai.u")
    public int field2651 = 128;

    @ObfuscatedName("ai.p")
    public int field2664 = 0;

    @ObfuscatedName("ai.z")
    public int field2649;

    @ObfuscatedName("ai.y")
    public short[] field2659;

    @ObfuscatedName("ai.x")
    public int field2661 = -1;

    @ObfuscatedName("ai.b(Ldv;IS)V")
    public void method3133(class28 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2649 = arg0.method349();
        } else if (arg1 == 2) {
            this.field2661 = arg0.method349();
        } else if (arg1 == 4) {
            this.field2660 = arg0.method349();
        } else if (arg1 == 5) {
            this.field2651 = arg0.method349();
        } else if (arg1 == 6) {
            this.field2667 = arg0.method349();
        } else if (arg1 == 7) {
            this.field2662 = arg0.method450();
        } else if (arg1 == 8) {
            this.field2664 = arg0.method450();
        } else if (arg1 == 40) {
            int var3 = arg0.method450();
            this.field2656 = new short[var3];
            this.field2663 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2656[var4] = (short) arg0.method349();
                this.field2663[var4] = (short) arg0.method349();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method450();
            this.field2658 = new short[var5];
            this.field2659 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2658[var6] = (short) arg0.method349();
                this.field2659[var6] = (short) arg0.method349();
            }
        }
    }

    @ObfuscatedName("ai.i(II)Ldk;")
    public final class43 method3134(int arg0) {
        class43 var2 = (class43) field2652.method1196((long) this.field2653);
        if (var2 == null) {
            class151 var3 = class151.method2655(Statics.field2650, this.field2649, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2656 != null) {
                for (int var4 = 0; var4 < this.field2656.length; var4++) {
                    var3.method2668(this.field2656[var4], this.field2663[var4]);
                }
            }
            if (this.field2658 != null) {
                for (int var5 = 0; var5 < this.field2658.length; var5++) {
                    var3.method2657(this.field2658[var5], this.field2659[var5]);
                }
            }
            var2 = var3.method2675(this.field2662 + 64, this.field2664 + 850, -30, -50, -30);
            field2652.method1184(var2, (long) this.field2653);
        }
        class43 var6;
        if (this.field2661 == -1 || arg0 == -1) {
            var6 = var2.method775(true);
        } else {
            var6 = class165.method3233(this.field2661).method3005(var2, arg0);
        }
        if (this.field2660 != 128 || this.field2651 != 128) {
            var6.method829(this.field2660, this.field2651, this.field2660);
        }
        if (this.field2667 != 0) {
            if (this.field2667 == 90) {
                var6.method782();
            }
            if (this.field2667 == 180) {
                var6.method782();
                var6.method782();
            }
            if (this.field2667 == 270) {
                var6.method782();
                var6.method782();
                var6.method782();
            }
        }
        return var6;
    }

    @ObfuscatedName("ai.c(Ldv;I)V")
    public void method3136(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3133(arg0, var2);
        }
    }

    @ObfuscatedName("v.v(II)Lai;")
    public static class173 method1223(int arg0) {
        class173 var1 = (class173) field2657.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2654.method1298(13, arg0);
        class173 var3 = new class173();
        var3.field2653 = arg0;
        if (var2 != null) {
            var3.method3136(new class28(var2));
        }
        field2657.method1184(var3, (long) arg0);
        return var3;
    }
}
