package deob;

@ObfuscatedName("ab")
public class class46 extends class208 {

    @ObfuscatedName("ab.c")
    public static class197 field1044 = new class197(64);

    @ObfuscatedName("ab.h")
    public static class197 field1055 = new class197(30);

    @ObfuscatedName("ab.r")
    public int field1046;

    @ObfuscatedName("ab.a")
    public int field1054;

    @ObfuscatedName("ab.b")
    public int field1048 = -1;

    @ObfuscatedName("ab.u")
    public short[] field1049;

    @ObfuscatedName("ab.o")
    public short[] field1050;

    @ObfuscatedName("ab.p")
    public short[] field1051;

    @ObfuscatedName("ab.i")
    public short[] field1047;

    @ObfuscatedName("ab.q")
    public int field1053 = 128;

    @ObfuscatedName("ab.g")
    public int field1052 = 128;

    @ObfuscatedName("ab.j")
    public int field1043 = 0;

    @ObfuscatedName("ab.w")
    public int field1045 = 0;

    @ObfuscatedName("ab.x")
    public int field1056 = 0;

    @ObfuscatedName("an.e(Lfe;Lfe;I)V")
    public static void method715(class171 arg0, class171 arg1) {
        Statics.field1057 = arg0;
        Statics.field1847 = arg1;
    }

    @ObfuscatedName("ev.l(IS)Lab;")
    public static class46 method3025(int arg0) {
        class46 var1 = (class46) field1044.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1057.method3130(13, arg0);
        class46 var3 = new class46();
        var3.field1046 = arg0;
        if (var2 != null) {
            var3.method930(new class123(var2));
        }
        field1044.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.c(Ldd;I)V")
    public void method930(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method931(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldd;II)V")
    public void method931(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1054 = arg0.method2466();
        } else if (arg1 == 2) {
            this.field1048 = arg0.method2466();
        } else if (arg1 == 4) {
            this.field1053 = arg0.method2466();
        } else if (arg1 == 5) {
            this.field1052 = arg0.method2466();
        } else if (arg1 == 6) {
            this.field1043 = arg0.method2466();
        } else if (arg1 == 7) {
            this.field1045 = arg0.method2464();
        } else if (arg1 == 8) {
            this.field1056 = arg0.method2464();
        } else if (arg1 == 40) {
            int var3 = arg0.method2464();
            this.field1049 = new short[var3];
            this.field1050 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1049[var4] = (short) arg0.method2466();
                this.field1050[var4] = (short) arg0.method2466();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2464();
            this.field1051 = new short[var5];
            this.field1047 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1051[var6] = (short) arg0.method2466();
                this.field1047[var6] = (short) arg0.method2466();
            }
        }
    }

    @ObfuscatedName("ab.r(IB)Lds;")
    public final class109 method932(int arg0) {
        class109 var2 = (class109) field1055.method3589((long) this.field1046);
        if (var2 == null) {
            class104 var3 = class104.method2178(Statics.field1847, this.field1054, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1049 != null) {
                for (int var4 = 0; var4 < this.field1049.length; var4++) {
                    var3.method2217(this.field1049[var4], this.field1050[var4]);
                }
            }
            if (this.field1051 != null) {
                for (int var5 = 0; var5 < this.field1051.length; var5++) {
                    var3.method2168(this.field1051[var5], this.field1047[var5]);
                }
            }
            var2 = var3.method2175(this.field1045 + 64, this.field1056 + 850, -30, -50, -30);
            field1055.method3591(var2, (long) this.field1046);
        }
        class109 var6;
        if (this.field1048 == -1 || arg0 == -1) {
            var6 = var2.method2310(true);
        } else {
            var6 = Statics.method144(this.field1048).method889(var2, arg0);
        }
        if (this.field1053 != 128 || this.field1052 != 128) {
            var6.method2268(this.field1053, this.field1052, this.field1053);
        }
        if (this.field1043 != 0) {
            if (this.field1043 == 90) {
                var6.method2254();
            }
            if (this.field1043 == 180) {
                var6.method2254();
                var6.method2254();
            }
            if (this.field1043 == 270) {
                var6.method2254();
                var6.method2254();
                var6.method2254();
            }
        }
        return var6;
    }

    @ObfuscatedName("bp.a(I)V")
    public static void method1188() {
        field1044.method3590();
        field1055.method3590();
    }
}
