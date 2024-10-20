package deob;

@ObfuscatedName("gx")
public class class191 extends class130 {

    @ObfuscatedName("gx.c")
    public static class125 field2800 = new class125(64);

    @ObfuscatedName("gx.d")
    public static class125 field2788 = new class125(30);

    @ObfuscatedName("gx.w")
    public int field2789;

    @ObfuscatedName("gx.h")
    public int field2790;

    @ObfuscatedName("gx.u")
    public int field2793 = -1;

    @ObfuscatedName("gx.k")
    public short[] field2792;

    @ObfuscatedName("gx.g")
    public short[] field2796;

    @ObfuscatedName("gx.y")
    public short[] field2794;

    @ObfuscatedName("gx.e")
    public short[] field2786;

    @ObfuscatedName("gx.q")
    public int field2787 = 128;

    @ObfuscatedName("gx.v")
    public int field2797 = 128;

    @ObfuscatedName("gx.l")
    public int field2798 = 0;

    @ObfuscatedName("gx.s")
    public int field2799 = 0;

    @ObfuscatedName("gx.r")
    public int field2795 = 0;

    @ObfuscatedName("gw.x(Lgk;Lgk;I)V")
    public static void method3529(class183 arg0, class183 arg1) {
        Statics.field1551 = arg0;
        Statics.field2791 = arg1;
    }

    @ObfuscatedName("fy.j(IS)Lgx;")
    public static class191 method3043(int arg0) {
        class191 var1 = (class191) field2800.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1551.method3121(13, arg0);
        class191 var3 = new class191();
        var3.field2789 = arg0;
        if (var2 != null) {
            var3.method3259(new class154(var2));
        }
        field2800.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.c(Lek;I)V")
    public void method3259(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3264(arg0, var2);
        }
    }

    @ObfuscatedName("gx.d(Lek;II)V")
    public void method3264(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2790 = arg0.method2745();
        } else if (arg1 == 2) {
            this.field2793 = arg0.method2745();
        } else if (arg1 == 4) {
            this.field2787 = arg0.method2745();
        } else if (arg1 == 5) {
            this.field2797 = arg0.method2745();
        } else if (arg1 == 6) {
            this.field2798 = arg0.method2745();
        } else if (arg1 == 7) {
            this.field2799 = arg0.method2701();
        } else if (arg1 == 8) {
            this.field2795 = arg0.method2701();
        } else if (arg1 == 40) {
            int var3 = arg0.method2701();
            this.field2792 = new short[var3];
            this.field2796 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2792[var4] = (short) arg0.method2745();
                this.field2796[var4] = (short) arg0.method2745();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2701();
            this.field2794 = new short[var5];
            this.field2786 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2794[var6] = (short) arg0.method2745();
                this.field2786[var6] = (short) arg0.method2745();
            }
        }
    }

    @ObfuscatedName("gx.w(IB)Lcj;")
    public final class83 method3261(int arg0) {
        class83 var2 = (class83) field2788.method2221((long) this.field2789);
        if (var2 == null) {
            class77 var3 = class77.method1437(Statics.field2791, this.field2790, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2792 != null) {
                for (int var4 = 0; var4 < this.field2792.length; var4++) {
                    var3.method1470(this.field2792[var4], this.field2796[var4]);
                }
            }
            if (this.field2794 != null) {
                for (int var5 = 0; var5 < this.field2794.length; var5++) {
                    var3.method1451(this.field2794[var5], this.field2786[var5]);
                }
            }
            var2 = var3.method1458(this.field2799 + 64, this.field2795 + 850, -30, -50, -30);
            field2788.method2223(var2, (long) this.field2789);
        }
        class83 var6;
        if (this.field2793 == -1 || arg0 == -1) {
            var6 = var2.method1530(true);
        } else {
            var6 = class202.method2997(this.field2793).method3552(var2, arg0);
        }
        if (this.field2787 != 128 || this.field2797 != 128) {
            var6.method1542(this.field2787, this.field2797, this.field2787);
        }
        if (this.field2798 != 0) {
            if (this.field2798 == 90) {
                var6.method1562();
            }
            if (this.field2798 == 180) {
                var6.method1562();
                var6.method1562();
            }
            if (this.field2798 == 270) {
                var6.method1562();
                var6.method1562();
                var6.method1562();
            }
        }
        return var6;
    }
}
