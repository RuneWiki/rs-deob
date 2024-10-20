package deob;

@ObfuscatedName("ae")
public class class41 extends class195 {

    @ObfuscatedName("ae.a")
    public static class184 field950 = new class184(64);

    @ObfuscatedName("ae.k")
    public static class184 field936 = new class184(30);

    @ObfuscatedName("ae.p")
    public int field938;

    @ObfuscatedName("ae.l")
    public int field939;

    @ObfuscatedName("ae.u")
    public int field940 = -1;

    @ObfuscatedName("ae.o")
    public short[] field941;

    @ObfuscatedName("ae.m")
    public short[] field949;

    @ObfuscatedName("ae.q")
    public short[] field942;

    @ObfuscatedName("ae.v")
    public short[] field944;

    @ObfuscatedName("ae.n")
    public int field945 = 128;

    @ObfuscatedName("ae.z")
    public int field946 = 128;

    @ObfuscatedName("ae.r")
    public int field947 = 0;

    @ObfuscatedName("ae.i")
    public int field943 = 0;

    @ObfuscatedName("ae.s")
    public int field934 = 0;

    @ObfuscatedName("cq.b(Lfj;Lfj;I)V")
    public static void method1774(class158 arg0, class158 arg1) {
        Statics.field937 = arg0;
        Statics.field935 = arg1;
    }

    @ObfuscatedName("s.e(II)Lae;")
    public static class41 method174(int arg0) {
        class41 var1 = (class41) field950.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field937.method2819(13, arg0);
        class41 var3 = new class41();
        var3.field938 = arg0;
        if (var2 != null) {
            var3.method768(new class111(var2));
        }
        field950.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.a(Ldj;I)V")
    public void method768(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method763(arg0, var2);
        }
    }

    @ObfuscatedName("ae.k(Ldj;IB)V")
    public void method763(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field939 = arg0.method2129();
        } else if (arg1 == 2) {
            this.field940 = arg0.method2129();
        } else if (arg1 == 4) {
            this.field945 = arg0.method2129();
        } else if (arg1 == 5) {
            this.field946 = arg0.method2129();
        } else if (arg1 == 6) {
            this.field947 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field943 = arg0.method2127();
        } else if (arg1 == 8) {
            this.field934 = arg0.method2127();
        } else if (arg1 == 40) {
            int var3 = arg0.method2127();
            this.field941 = new short[var3];
            this.field949 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field941[var4] = (short) arg0.method2129();
                this.field949[var4] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2127();
            this.field942 = new short[var5];
            this.field944 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field942[var6] = (short) arg0.method2129();
                this.field944[var6] = (short) arg0.method2129();
            }
        }
    }

    @ObfuscatedName("ae.p(II)Lcx;")
    public final class100 method764(int arg0) {
        class100 var2 = (class100) field936.method3254((long) this.field938);
        if (var2 == null) {
            class95 var3 = class95.method1878(Statics.field935, this.field939, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field941 != null) {
                for (int var4 = 0; var4 < this.field941.length; var4++) {
                    var3.method1877(this.field941[var4], this.field949[var4]);
                }
            }
            if (this.field942 != null) {
                for (int var5 = 0; var5 < this.field942.length; var5++) {
                    var3.method1891(this.field942[var5], this.field944[var5]);
                }
            }
            var2 = var3.method1898(this.field943 + 64, this.field934 + 850, -30, -50, -30);
            field936.method3256(var2, (long) this.field938);
        }
        class100 var6;
        if (this.field940 == -1 || arg0 == -1) {
            var6 = var2.method1972(true);
        } else {
            var6 = class40.method512(this.field940).method758(var2, arg0);
        }
        if (this.field945 != 128 || this.field946 != 128) {
            var6.method1985(this.field945, this.field946, this.field945);
        }
        if (this.field947 != 0) {
            if (this.field947 == 90) {
                var6.method2029();
            }
            if (this.field947 == 180) {
                var6.method2029();
                var6.method2029();
            }
            if (this.field947 == 270) {
                var6.method2029();
                var6.method2029();
                var6.method2029();
            }
        }
        return var6;
    }
}
