package deob;

@ObfuscatedName("ap")
public class class40 extends class185 {

    @ObfuscatedName("ap.y")
    public static class174 field939 = new class174(64);

    @ObfuscatedName("ap.e")
    public static class174 field938 = new class174(30);

    @ObfuscatedName("ap.r")
    public int field951;

    @ObfuscatedName("ap.a")
    public int field945;

    @ObfuscatedName("ap.n")
    public int field943 = -1;

    @ObfuscatedName("ap.x")
    public short[] field944;

    @ObfuscatedName("ap.g")
    public short[] field942;

    @ObfuscatedName("ap.o")
    public short[] field937;

    @ObfuscatedName("ap.p")
    public short[] field947;

    @ObfuscatedName("ap.v")
    public int field948 = 128;

    @ObfuscatedName("ap.w")
    public int field941 = 128;

    @ObfuscatedName("ap.t")
    public int field950 = 0;

    @ObfuscatedName("ap.s")
    public int field940 = 0;

    @ObfuscatedName("ap.b")
    public int field952 = 0;

    @ObfuscatedName("f.f(Lev;Lev;I)V")
    public static void method2(class149 arg0, class149 arg1) {
        Statics.field946 = arg0;
        Statics.field949 = arg1;
    }

    @ObfuscatedName("x.k(II)Lap;")
    public static class40 method99(int arg0) {
        class40 var1 = (class40) field939.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field946.method2763(13, arg0);
        class40 var3 = new class40();
        var3.field951 = arg0;
        if (var2 != null) {
            var3.method796(new class108(var2));
        }
        field939.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.y(Ldu;B)V")
    public void method796(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method782(arg0, var2);
        }
    }

    @ObfuscatedName("ap.e(Ldu;II)V")
    public void method782(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = arg0.method2160();
        } else if (arg1 == 2) {
            this.field943 = arg0.method2160();
        } else if (arg1 == 4) {
            this.field948 = arg0.method2160();
        } else if (arg1 == 5) {
            this.field941 = arg0.method2160();
        } else if (arg1 == 6) {
            this.field950 = arg0.method2160();
        } else if (arg1 == 7) {
            this.field940 = arg0.method2158();
        } else if (arg1 == 8) {
            this.field952 = arg0.method2158();
        } else if (arg1 == 40) {
            int var3 = arg0.method2158();
            this.field944 = new short[var3];
            this.field942 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field944[var4] = (short) arg0.method2160();
                this.field942[var4] = (short) arg0.method2160();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2158();
            this.field937 = new short[var5];
            this.field947 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field937[var6] = (short) arg0.method2160();
                this.field947[var6] = (short) arg0.method2160();
            }
        }
    }

    @ObfuscatedName("ap.r(II)Lci;")
    public final class99 method783(int arg0) {
        class99 var2 = (class99) field938.method3207((long) this.field951);
        if (var2 == null) {
            class94 var3 = class94.method1925(Statics.field949, this.field945, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field944 != null) {
                for (int var4 = 0; var4 < this.field944.length; var4++) {
                    var3.method1939(this.field944[var4], this.field942[var4]);
                }
            }
            if (this.field937 != null) {
                for (int var5 = 0; var5 < this.field937.length; var5++) {
                    var3.method1944(this.field937[var5], this.field947[var5]);
                }
            }
            var2 = var3.method1946(this.field940 + 64, this.field952 + 850, -30, -50, -30);
            field938.method3209(var2, (long) this.field951);
        }
        class99 var6;
        if (this.field943 == -1 || arg0 == -1) {
            var6 = var2.method2033(true);
        } else {
            var6 = class39.method547(this.field943).method768(var2, arg0);
        }
        if (this.field948 != 128 || this.field941 != 128) {
            var6.method2035(this.field948, this.field941, this.field948);
        }
        if (this.field950 != 0) {
            if (this.field950 == 90) {
                var6.method2030();
            }
            if (this.field950 == 180) {
                var6.method2030();
                var6.method2030();
            }
            if (this.field950 == 270) {
                var6.method2030();
                var6.method2030();
                var6.method2030();
            }
        }
        return var6;
    }

    @ObfuscatedName("cg.a(S)V")
    public static void method1921() {
        field939.method3223();
        field938.method3223();
    }
}
