package deob;

@ObfuscatedName("aw")
public class class41 extends class195 {

    @ObfuscatedName("aw.z")
    public static class184 field956 = new class184(64);

    @ObfuscatedName("aw.y")
    public static class184 field957 = new class184(30);

    @ObfuscatedName("aw.e")
    public int field951;

    @ObfuscatedName("aw.g")
    public int field962;

    @ObfuscatedName("aw.f")
    public int field955 = -1;

    @ObfuscatedName("aw.m")
    public short[] field970;

    @ObfuscatedName("aw.a")
    public short[] field949;

    @ObfuscatedName("aw.h")
    public short[] field958;

    @ObfuscatedName("aw.l")
    public short[] field959;

    @ObfuscatedName("aw.u")
    public int field960 = 128;

    @ObfuscatedName("aw.q")
    public int field961 = 128;

    @ObfuscatedName("aw.k")
    public int field953 = 0;

    @ObfuscatedName("aw.x")
    public int field963 = 0;

    @ObfuscatedName("aw.r")
    public int field964 = 0;

    @ObfuscatedName("l.n(II)Law;")
    public static class41 method116(int arg0) {
        class41 var1 = (class41) field956.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field952.method2948(13, arg0);
        class41 var3 = new class41();
        var3.field951 = arg0;
        if (var2 != null) {
            var3.method806(new class111(var2));
        }
        field956.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.d(Ldl;I)V")
    public void method806(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method807(arg0, var2);
        }
    }

    @ObfuscatedName("aw.z(Ldl;II)V")
    public void method807(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field962 = arg0.method2231();
        } else if (arg1 == 2) {
            this.field955 = arg0.method2231();
        } else if (arg1 == 4) {
            this.field960 = arg0.method2231();
        } else if (arg1 == 5) {
            this.field961 = arg0.method2231();
        } else if (arg1 == 6) {
            this.field953 = arg0.method2231();
        } else if (arg1 == 7) {
            this.field963 = arg0.method2228();
        } else if (arg1 == 8) {
            this.field964 = arg0.method2228();
        } else if (arg1 == 40) {
            int var3 = arg0.method2228();
            this.field970 = new short[var3];
            this.field949 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field970[var4] = (short) arg0.method2231();
                this.field949[var4] = (short) arg0.method2231();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2228();
            this.field958 = new short[var5];
            this.field959 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field958[var6] = (short) arg0.method2231();
                this.field959[var6] = (short) arg0.method2231();
            }
        }
    }

    @ObfuscatedName("aw.y(II)Lcg;")
    public final class100 method808(int arg0) {
        class100 var2 = (class100) field957.method3411((long) this.field951);
        if (var2 == null) {
            class95 var3 = class95.method1969(Statics.field950, this.field962, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field970 != null) {
                for (int var4 = 0; var4 < this.field970.length; var4++) {
                    var3.method2001(this.field970[var4], this.field949[var4]);
                }
            }
            if (this.field958 != null) {
                for (int var5 = 0; var5 < this.field958.length; var5++) {
                    var3.method2000(this.field958[var5], this.field959[var5]);
                }
            }
            var2 = var3.method1994(this.field963 + 64, this.field964 + 850, -30, -50, -30);
            field957.method3420(var2, (long) this.field951);
        }
        class100 var6;
        if (this.field955 == -1 || arg0 == -1) {
            var6 = var2.method2124(true);
        } else {
            var6 = class40.method3092(this.field955).method786(var2, arg0);
        }
        if (this.field960 != 128 || this.field961 != 128) {
            var6.method2083(this.field960, this.field961, this.field960);
        }
        if (this.field953 != 0) {
            if (this.field953 == 90) {
                var6.method2078();
            }
            if (this.field953 == 180) {
                var6.method2078();
                var6.method2078();
            }
            if (this.field953 == 270) {
                var6.method2078();
                var6.method2078();
                var6.method2078();
            }
        }
        return var6;
    }
}
