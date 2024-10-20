package deob;

@ObfuscatedName("ab")
public class class41 extends class194 {

    @ObfuscatedName("ab.h")
    public static class183 field935 = new class183(64);

    @ObfuscatedName("ab.e")
    public static class183 field943 = new class183(30);

    @ObfuscatedName("ab.n")
    public int field937;

    @ObfuscatedName("ab.t")
    public int field947;

    @ObfuscatedName("ab.l")
    public int field950 = -1;

    @ObfuscatedName("ab.m")
    public short[] field940;

    @ObfuscatedName("ab.o")
    public short[] field941;

    @ObfuscatedName("ab.k")
    public short[] field942;

    @ObfuscatedName("ab.p")
    public short[] field939;

    @ObfuscatedName("ab.u")
    public int field936 = 128;

    @ObfuscatedName("ab.g")
    public int field945 = 128;

    @ObfuscatedName("ab.a")
    public int field938 = 0;

    @ObfuscatedName("ab.y")
    public int field944 = 0;

    @ObfuscatedName("ab.d")
    public int field948 = 0;

    @ObfuscatedName("an.q(II)Lab;")
    public static class41 method535(int arg0) {
        class41 var1 = (class41) field935.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field946.method2811(13, arg0);
        class41 var3 = new class41();
        var3.field937 = arg0;
        if (var2 != null) {
            var3.method754(new class111(var2));
        }
        field935.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.s(Ldx;I)V")
    public void method754(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method756(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldx;II)V")
    public void method756(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field947 = arg0.method2307();
        } else if (arg1 == 2) {
            this.field950 = arg0.method2307();
        } else if (arg1 == 4) {
            this.field936 = arg0.method2307();
        } else if (arg1 == 5) {
            this.field945 = arg0.method2307();
        } else if (arg1 == 6) {
            this.field938 = arg0.method2307();
        } else if (arg1 == 7) {
            this.field944 = arg0.method2231();
        } else if (arg1 == 8) {
            this.field948 = arg0.method2231();
        } else if (arg1 == 40) {
            int var3 = arg0.method2231();
            this.field940 = new short[var3];
            this.field941 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field940[var4] = (short) arg0.method2307();
                this.field941[var4] = (short) arg0.method2307();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2231();
            this.field942 = new short[var5];
            this.field939 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field942[var6] = (short) arg0.method2307();
                this.field939[var6] = (short) arg0.method2307();
            }
        }
    }

    @ObfuscatedName("ab.e(II)Lch;")
    public final class100 method755(int arg0) {
        class100 var2 = (class100) field943.method3243((long) this.field937);
        if (var2 == null) {
            class95 var3 = class95.method1899(Statics.field934, this.field947, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field940 != null) {
                for (int var4 = 0; var4 < this.field940.length; var4++) {
                    var3.method1912(this.field940[var4], this.field941[var4]);
                }
            }
            if (this.field942 != null) {
                for (int var5 = 0; var5 < this.field942.length; var5++) {
                    var3.method1913(this.field942[var5], this.field939[var5]);
                }
            }
            var2 = var3.method1965(this.field944 + 64, this.field948 + 850, -30, -50, -30);
            field943.method3253(var2, (long) this.field937);
        }
        class100 var6;
        if (this.field950 == -1 || arg0 == -1) {
            var6 = var2.method2059(true);
        } else {
            var6 = class40.method575(this.field950).method727(var2, arg0);
        }
        if (this.field936 != 128 || this.field945 != 128) {
            var6.method2006(this.field936, this.field945, this.field936);
        }
        if (this.field938 != 0) {
            if (this.field938 == 90) {
                var6.method2011();
            }
            if (this.field938 == 180) {
                var6.method2011();
                var6.method2011();
            }
            if (this.field938 == 270) {
                var6.method2011();
                var6.method2011();
                var6.method2011();
            }
        }
        return var6;
    }

    @ObfuscatedName("dz.n(I)V")
    public static void method2458() {
        field935.method3246();
        field943.method3246();
    }
}
