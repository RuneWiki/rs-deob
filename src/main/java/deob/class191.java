package deob;

@ObfuscatedName("gl")
public class class191 extends class130 {

    @ObfuscatedName("gl.i")
    public static class125 field2769 = new class125(64);

    @ObfuscatedName("gl.a")
    public static class125 field2770 = new class125(30);

    @ObfuscatedName("gl.f")
    public int field2771;

    @ObfuscatedName("gl.c")
    public int field2772;

    @ObfuscatedName("gl.d")
    public int field2773 = -1;

    @ObfuscatedName("gl.l")
    public short[] field2774;

    @ObfuscatedName("gl.g")
    public short[] field2778;

    @ObfuscatedName("gl.z")
    public short[] field2768;

    @ObfuscatedName("gl.t")
    public short[] field2781;

    @ObfuscatedName("gl.m")
    public int field2777 = 128;

    @ObfuscatedName("gl.q")
    public int field2776 = 128;

    @ObfuscatedName("gl.e")
    public int field2780 = 0;

    @ObfuscatedName("gl.v")
    public int field2767 = 0;

    @ObfuscatedName("gl.j")
    public int field2775 = 0;

    @ObfuscatedName("gk.u(II)Lgl;")
    public static class191 method3182(int arg0) {
        class191 var1 = (class191) field2769.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2779.method3071(13, arg0);
        class191 var3 = new class191();
        var3.field2771 = arg0;
        if (var2 != null) {
            var3.method3240(new class154(var2));
        }
        field2769.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.x(Len;I)V")
    public void method3240(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3249(arg0, var2);
        }
    }

    @ObfuscatedName("gl.i(Len;II)V")
    public void method3249(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2772 = arg0.method2581();
        } else if (arg1 == 2) {
            this.field2773 = arg0.method2581();
        } else if (arg1 == 4) {
            this.field2777 = arg0.method2581();
        } else if (arg1 == 5) {
            this.field2776 = arg0.method2581();
        } else if (arg1 == 6) {
            this.field2780 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field2767 = arg0.method2708();
        } else if (arg1 == 8) {
            this.field2775 = arg0.method2708();
        } else if (arg1 == 40) {
            int var3 = arg0.method2708();
            this.field2774 = new short[var3];
            this.field2778 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2774[var4] = (short) arg0.method2581();
                this.field2778[var4] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2708();
            this.field2768 = new short[var5];
            this.field2781 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2768[var6] = (short) arg0.method2581();
                this.field2781[var6] = (short) arg0.method2581();
            }
        }
    }

    @ObfuscatedName("gl.a(IB)Lcs;")
    public final class83 method3239(int arg0) {
        class83 var2 = (class83) field2770.method2186((long) this.field2771);
        if (var2 == null) {
            class77 var3 = class77.method1393(Statics.field2782, this.field2772, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2774 != null) {
                for (int var4 = 0; var4 < this.field2774.length; var4++) {
                    var3.method1357(this.field2774[var4], this.field2778[var4]);
                }
            }
            if (this.field2768 != null) {
                for (int var5 = 0; var5 < this.field2768.length; var5++) {
                    var3.method1399(this.field2768[var5], this.field2781[var5]);
                }
            }
            var2 = var3.method1416(this.field2767 + 64, this.field2775 + 850, -30, -50, -30);
            field2770.method2179(var2, (long) this.field2771);
        }
        class83 var6;
        if (this.field2773 == -1 || arg0 == -1) {
            var6 = var2.method1447(true);
        } else {
            var6 = class202.method3327(this.field2773).method3547(var2, arg0);
        }
        if (this.field2777 != 128 || this.field2776 != 128) {
            var6.method1444(this.field2777, this.field2776, this.field2777);
        }
        if (this.field2780 != 0) {
            if (this.field2780 == 90) {
                var6.method1455();
            }
            if (this.field2780 == 180) {
                var6.method1455();
                var6.method1455();
            }
            if (this.field2780 == 270) {
                var6.method1455();
                var6.method1455();
                var6.method1455();
            }
        }
        return var6;
    }
}
