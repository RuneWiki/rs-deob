package deob;

@ObfuscatedName("ak")
public class class41 extends class195 {

    @ObfuscatedName("ak.p")
    public static class184 field937 = new class184(64);

    @ObfuscatedName("ak.e")
    public static class184 field951 = new class184(30);

    @ObfuscatedName("ak.i")
    public int field953;

    @ObfuscatedName("ak.o")
    public int field948;

    @ObfuscatedName("ak.f")
    public int field941 = -1;

    @ObfuscatedName("ak.d")
    public short[] field942;

    @ObfuscatedName("ak.j")
    public short[] field943;

    @ObfuscatedName("ak.x")
    public short[] field940;

    @ObfuscatedName("ak.v")
    public short[] field945;

    @ObfuscatedName("ak.a")
    public int field946 = 128;

    @ObfuscatedName("ak.l")
    public int field947 = 128;

    @ObfuscatedName("ak.h")
    public int field939 = 0;

    @ObfuscatedName("ak.c")
    public int field949 = 0;

    @ObfuscatedName("ak.u")
    public int field950 = 0;

    @ObfuscatedName("j.t(IB)Lak;")
    public static class41 method113(int arg0) {
        class41 var1 = (class41) field937.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field944.method2881(13, arg0);
        class41 var3 = new class41();
        var3.field953 = arg0;
        if (var2 != null) {
            var3.method826(new class111(var2));
        }
        field937.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.b(Ldc;I)V")
    public void method826(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method832(arg0, var2);
        }
    }

    @ObfuscatedName("ak.p(Ldc;II)V")
    public void method832(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field948 = arg0.method2255();
        } else if (arg1 == 2) {
            this.field941 = arg0.method2255();
        } else if (arg1 == 4) {
            this.field946 = arg0.method2255();
        } else if (arg1 == 5) {
            this.field947 = arg0.method2255();
        } else if (arg1 == 6) {
            this.field939 = arg0.method2255();
        } else if (arg1 == 7) {
            this.field949 = arg0.method2172();
        } else if (arg1 == 8) {
            this.field950 = arg0.method2172();
        } else if (arg1 == 40) {
            int var3 = arg0.method2172();
            this.field942 = new short[var3];
            this.field943 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field942[var4] = (short) arg0.method2255();
                this.field943[var4] = (short) arg0.method2255();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2172();
            this.field940 = new short[var5];
            this.field945 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field940[var6] = (short) arg0.method2255();
                this.field945[var6] = (short) arg0.method2255();
            }
        }
    }

    @ObfuscatedName("ak.e(IB)Lcs;")
    public final class100 method827(int arg0) {
        class100 var2 = (class100) field951.method3339((long) this.field953);
        if (var2 == null) {
            class95 var3 = class95.method1964(Statics.field3017, this.field948, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field942 != null) {
                for (int var4 = 0; var4 < this.field942.length; var4++) {
                    var3.method1995(this.field942[var4], this.field943[var4]);
                }
            }
            if (this.field940 != null) {
                for (int var5 = 0; var5 < this.field940.length; var5++) {
                    var3.method1943(this.field940[var5], this.field945[var5]);
                }
            }
            var2 = var3.method1950(this.field949 + 64, this.field950 + 850, -30, -50, -30);
            field951.method3341(var2, (long) this.field953);
        }
        class100 var6;
        if (this.field941 == -1 || arg0 == -1) {
            var6 = var2.method2018(true);
        } else {
            var6 = class40.method168(this.field941).method786(var2, arg0);
        }
        if (this.field946 != 128 || this.field947 != 128) {
            var6.method2023(this.field946, this.field947, this.field946);
        }
        if (this.field939 != 0) {
            if (this.field939 == 90) {
                var6.method2038();
            }
            if (this.field939 == 180) {
                var6.method2038();
                var6.method2038();
            }
            if (this.field939 == 270) {
                var6.method2038();
                var6.method2038();
                var6.method2038();
            }
        }
        return var6;
    }
}
