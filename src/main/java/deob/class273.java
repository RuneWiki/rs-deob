package deob;

@ObfuscatedName("jw")
public class class273 extends class219 {

    @ObfuscatedName("jw.i")
    public static class213 field3501 = new class213(64);

    @ObfuscatedName("jw.a")
    public static class213 field3492 = new class213(30);

    @ObfuscatedName("jw.l")
    public int field3491;

    @ObfuscatedName("jw.b")
    public int field3494;

    @ObfuscatedName("jw.e")
    public int field3495 = -1;

    @ObfuscatedName("jw.x")
    public short[] field3498;

    @ObfuscatedName("jw.p")
    public short[] field3493;

    @ObfuscatedName("jw.g")
    public short[] field3497;

    @ObfuscatedName("jw.n")
    public short[] field3499;

    @ObfuscatedName("jw.o")
    public int field3500 = 128;

    @ObfuscatedName("jw.c")
    public int field3489 = 128;

    @ObfuscatedName("jw.v")
    public int field3502 = 0;

    @ObfuscatedName("jw.u")
    public int field3503 = 0;

    @ObfuscatedName("jw.j")
    public int field3496 = 0;

    @ObfuscatedName("ah.t(II)Ljw;")
    public static class273 method346(int arg0) {
        class273 var1 = (class273) field3501.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3504.method4265(13, arg0);
        class273 var3 = new class273();
        var3.field3491 = arg0;
        if (var2 != null) {
            var3.method4419(new class195(var2));
        }
        field3501.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.q(Lgb;B)V")
    public void method4419(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4418(arg0, var2);
        }
    }

    @ObfuscatedName("jw.i(Lgb;II)V")
    public void method4418(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3494 = arg0.method3238();
        } else if (arg1 == 2) {
            this.field3495 = arg0.method3238();
        } else if (arg1 == 4) {
            this.field3500 = arg0.method3238();
        } else if (arg1 == 5) {
            this.field3489 = arg0.method3238();
        } else if (arg1 == 6) {
            this.field3502 = arg0.method3238();
        } else if (arg1 == 7) {
            this.field3503 = arg0.method3236();
        } else if (arg1 == 8) {
            this.field3496 = arg0.method3236();
        } else if (arg1 == 40) {
            int var3 = arg0.method3236();
            this.field3498 = new short[var3];
            this.field3493 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3498[var4] = (short) arg0.method3238();
                this.field3493[var4] = (short) arg0.method3238();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3236();
            this.field3497 = new short[var5];
            this.field3499 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3497[var6] = (short) arg0.method3238();
                this.field3499[var6] = (short) arg0.method3238();
            }
        }
    }

    @ObfuscatedName("jw.a(II)Lek;")
    public final class132 method4420(int arg0) {
        class132 var2 = (class132) field3492.method3625((long) this.field3491);
        if (var2 == null) {
            class126 var3 = class126.method2374(Statics.field3490, this.field3494, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3498 != null) {
                for (int var4 = 0; var4 < this.field3498.length; var4++) {
                    var3.method2435(this.field3498[var4], this.field3493[var4]);
                }
            }
            if (this.field3497 != null) {
                for (int var5 = 0; var5 < this.field3497.length; var5++) {
                    var3.method2389(this.field3497[var5], this.field3499[var5]);
                }
            }
            var2 = var3.method2395(this.field3503 + 64, this.field3496 + 850, -30, -50, -30);
            field3492.method3627(var2, (long) this.field3491);
        }
        class132 var6;
        if (this.field3495 == -1 || arg0 == -1) {
            var6 = var2.method2477(true);
        } else {
            var6 = class288.method2932(this.field3495).method4790(var2, arg0);
        }
        if (this.field3500 != 128 || this.field3489 != 128) {
            var6.method2513(this.field3500, this.field3489, this.field3500);
        }
        if (this.field3502 != 0) {
            if (this.field3502 == 90) {
                var6.method2476();
            }
            if (this.field3502 == 180) {
                var6.method2476();
                var6.method2476();
            }
            if (this.field3502 == 270) {
                var6.method2476();
                var6.method2476();
                var6.method2476();
            }
        }
        return var6;
    }
}
