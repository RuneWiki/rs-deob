package deob;

@ObfuscatedName("aq")
public class class41 extends class195 {

    @ObfuscatedName("aq.g")
    public static class184 field971 = new class184(64);

    @ObfuscatedName("aq.n")
    public static class184 field963 = new class184(30);

    @ObfuscatedName("aq.t")
    public int field972;

    @ObfuscatedName("aq.e")
    public int field962;

    @ObfuscatedName("aq.q")
    public int field968 = -1;

    @ObfuscatedName("aq.z")
    public short[] field959;

    @ObfuscatedName("aq.v")
    public short[] field965;

    @ObfuscatedName("aq.b")
    public short[] field957;

    @ObfuscatedName("aq.f")
    public short[] field967;

    @ObfuscatedName("aq.i")
    public int field966 = 128;

    @ObfuscatedName("aq.w")
    public int field969 = 128;

    @ObfuscatedName("aq.l")
    public int field960 = 0;

    @ObfuscatedName("aq.j")
    public int field961 = 0;

    @ObfuscatedName("aq.s")
    public int field964 = 0;

    @ObfuscatedName("ca.y(II)Laq;")
    public static class41 method2077(int arg0) {
        class41 var1 = (class41) field971.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method2874(13, arg0);
        class41 var3 = new class41();
        var3.field972 = arg0;
        if (var2 != null) {
            var3.method813(new class111(var2));
        }
        field971.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.k(Ldw;S)V")
    public void method813(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("aq.g(Ldw;II)V")
    public void method798(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field962 = arg0.method2339();
        } else if (arg1 == 2) {
            this.field968 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field966 = arg0.method2339();
        } else if (arg1 == 5) {
            this.field969 = arg0.method2339();
        } else if (arg1 == 6) {
            this.field960 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field961 = arg0.method2205();
        } else if (arg1 == 8) {
            this.field964 = arg0.method2205();
        } else if (arg1 == 40) {
            int var3 = arg0.method2205();
            this.field959 = new short[var3];
            this.field965 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field959[var4] = (short) arg0.method2339();
                this.field965[var4] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2205();
            this.field957 = new short[var5];
            this.field967 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field957[var6] = (short) arg0.method2339();
                this.field967[var6] = (short) arg0.method2339();
            }
        }
    }

    @ObfuscatedName("aq.n(II)Lch;")
    public final class100 method799(int arg0) {
        class100 var2 = (class100) field963.method3327((long) this.field972);
        if (var2 == null) {
            class95 var3 = class95.method1900(Statics.field958, this.field962, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field959 != null) {
                for (int var4 = 0; var4 < this.field959.length; var4++) {
                    var3.method1922(this.field959[var4], this.field965[var4]);
                }
            }
            if (this.field957 != null) {
                for (int var5 = 0; var5 < this.field957.length; var5++) {
                    var3.method1915(this.field957[var5], this.field967[var5]);
                }
            }
            var2 = var3.method1953(this.field961 + 64, this.field964 + 850, -30, -50, -30);
            field963.method3340(var2, (long) this.field972);
        }
        class100 var6;
        if (this.field968 == -1 || arg0 == -1) {
            var6 = var2.method1998(true);
        } else {
            var6 = class40.method547(this.field968).method774(var2, arg0);
        }
        if (this.field966 != 128 || this.field969 != 128) {
            var6.method2011(this.field966, this.field969, this.field966);
        }
        if (this.field960 != 0) {
            if (this.field960 == 90) {
                var6.method2057();
            }
            if (this.field960 == 180) {
                var6.method2057();
                var6.method2057();
            }
            if (this.field960 == 270) {
                var6.method2057();
                var6.method2057();
                var6.method2057();
            }
        }
        return var6;
    }
}
