package deob;

@ObfuscatedName("ai")
public class class173 extends class77 {

    @ObfuscatedName("ai.f")
    public short[] field2608;

    @ObfuscatedName("ai.g")
    public short[] field2606;

    @ObfuscatedName("ai.e")
    public short[] field2607;

    @ObfuscatedName("ai.n")
    public int field2605 = -1;

    @ObfuscatedName("ai.o")
    public static class67 field2601 = new class67(64);

    @ObfuscatedName("ai.l")
    public int field2611 = 128;

    @ObfuscatedName("ai.h")
    public int field2610;

    @ObfuscatedName("ai.i")
    public int field2613 = 0;

    @ObfuscatedName("ai.w")
    public int field2599 = 0;

    @ObfuscatedName("ai.t")
    public static class67 field2602 = new class67(30);

    @ObfuscatedName("ai.s")
    public int field2603 = 0;

    @ObfuscatedName("ai.r")
    public int field2604;

    @ObfuscatedName("ai.z")
    public int field2614 = 128;

    @ObfuscatedName("ai.x")
    public short[] field2618;

    @ObfuscatedName("ai.o(Ldy;B)V")
    public void method3333(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3334(arg0, var2);
        }
    }

    @ObfuscatedName("ai.t(Ldy;II)V")
    public void method3334(class31 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2604 = arg0.method373();
        } else if (arg1 == 2) {
            this.field2605 = arg0.method373();
        } else if (arg1 == 4) {
            this.field2614 = arg0.method373();
        } else if (arg1 == 5) {
            this.field2611 = arg0.method373();
        } else if (arg1 == 6) {
            this.field2599 = arg0.method373();
        } else if (arg1 == 7) {
            this.field2613 = arg0.method512();
        } else if (arg1 == 8) {
            this.field2603 = arg0.method512();
        } else if (arg1 == 40) {
            int var3 = arg0.method512();
            this.field2606 = new short[var3];
            this.field2607 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2606[var4] = (short) arg0.method373();
                this.field2607[var4] = (short) arg0.method373();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method512();
            this.field2608 = new short[var5];
            this.field2618 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2608[var6] = (short) arg0.method373();
                this.field2618[var6] = (short) arg0.method373();
            }
        }
    }

    @ObfuscatedName("ai.h(II)Ldi;")
    public final class41 method3335(int arg0) {
        class41 var2 = (class41) field2602.method908((long) this.field2610);
        if (var2 == null) {
            class142 var3 = class142.method2529(Statics.field2600, this.field2604, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2606 != null) {
                for (int var4 = 0; var4 < this.field2606.length; var4++) {
                    var3.method2542(this.field2606[var4], this.field2607[var4]);
                }
            }
            if (this.field2608 != null) {
                for (int var5 = 0; var5 < this.field2608.length; var5++) {
                    var3.method2555(this.field2608[var5], this.field2618[var5]);
                }
            }
            var2 = var3.method2603(this.field2613 + 64, this.field2603 + 850, -30, -50, -30);
            field2602.method907(var2, (long) this.field2610);
        }
        class41 var6;
        if (this.field2605 == -1 || arg0 == -1) {
            var6 = var2.method654(true);
        } else {
            var6 = class166.method274(this.field2605).method3177(var2, arg0);
        }
        if (this.field2614 != 128 || this.field2611 != 128) {
            var6.method702(this.field2614, this.field2611, this.field2614);
        }
        if (this.field2599 != 0) {
            if (this.field2599 == 90) {
                var6.method683();
            }
            if (this.field2599 == 180) {
                var6.method683();
                var6.method683();
            }
            if (this.field2599 == 270) {
                var6.method683();
                var6.method683();
                var6.method683();
            }
        }
        return var6;
    }

    @ObfuscatedName("s.r(I)V")
    public static void method1307() {
        field2601.method910();
        field2602.method910();
    }

    @ObfuscatedName("bd.p(II)Lai;")
    public static class173 method2209(int arg0) {
        class173 var1 = (class173) field2601.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2616.method1083(13, arg0);
        class173 var3 = new class173();
        var3.field2610 = arg0;
        if (var2 != null) {
            var3.method3333(new class31(var2));
        }
        field2601.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.j(Leg;Leg;I)V")
    public static void method3488(class81 arg0, class81 arg1) {
        Statics.field2616 = arg0;
        Statics.field2600 = arg1;
    }
}
