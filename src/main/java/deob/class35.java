package deob;

@ObfuscatedName("ai")
public class class35 extends class174 {

    @ObfuscatedName("ai.d")
    public static class170 field889 = new class170(64);

    @ObfuscatedName("ai.x")
    public static class170 field890 = new class170(30);

    @ObfuscatedName("ai.o")
    public int field891;

    @ObfuscatedName("ai.a")
    public int field892;

    @ObfuscatedName("ai.w")
    public int field893 = -1;

    @ObfuscatedName("ai.i")
    public short[] field903;

    @ObfuscatedName("ai.y")
    public short[] field895;

    @ObfuscatedName("ai.m")
    public short[] field896;

    @ObfuscatedName("ai.u")
    public short[] field894;

    @ObfuscatedName("ai.s")
    public int field897 = 128;

    @ObfuscatedName("ai.e")
    public int field909 = 128;

    @ObfuscatedName("ai.r")
    public int field900 = 0;

    @ObfuscatedName("ai.n")
    public int field901 = 0;

    @ObfuscatedName("ai.g")
    public int field902 = 0;

    @ObfuscatedName("c.p(IB)Lai;")
    public static class35 method144(int arg0) {
        class35 var1 = (class35) field889.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field904.method3078(13, arg0);
        class35 var3 = new class35();
        var3.field891 = arg0;
        if (var2 != null) {
            var3.method741(new class127(var2));
        }
        field889.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.l(Lds;I)V")
    public void method741(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ai.d(Lds;II)V")
    public void method742(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field892 = arg0.method2581();
        } else if (arg1 == 2) {
            this.field893 = arg0.method2581();
        } else if (arg1 == 4) {
            this.field897 = arg0.method2581();
        } else if (arg1 == 5) {
            this.field909 = arg0.method2581();
        } else if (arg1 == 6) {
            this.field900 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field901 = arg0.method2498();
        } else if (arg1 == 8) {
            this.field902 = arg0.method2498();
        } else if (arg1 == 40) {
            int var3 = arg0.method2498();
            this.field903 = new short[var3];
            this.field895 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field903[var4] = (short) arg0.method2581();
                this.field895[var4] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2498();
            this.field896 = new short[var5];
            this.field894 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field896[var6] = (short) arg0.method2581();
                this.field894[var6] = (short) arg0.method2581();
            }
        }
    }

    @ObfuscatedName("ai.x(II)Ldl;")
    public final class112 method747(int arg0) {
        class112 var2 = (class112) field890.method3357((long) this.field891);
        if (var2 == null) {
            class101 var3 = class101.method2098(Statics.field2822, this.field892, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field903 != null) {
                for (int var4 = 0; var4 < this.field903.length; var4++) {
                    var3.method2097(this.field903[var4], this.field895[var4]);
                }
            }
            if (this.field896 != null) {
                for (int var5 = 0; var5 < this.field896.length; var5++) {
                    var3.method2138(this.field896[var5], this.field894[var5]);
                }
            }
            var2 = var3.method2084(this.field901 + 64, this.field902 + 850, -30, -50, -30);
            field890.method3364(var2, (long) this.field891);
        }
        class112 var6;
        if (this.field893 == -1 || arg0 == -1) {
            var6 = var2.method2272(true);
        } else {
            var6 = class34.method93(this.field893).method728(var2, arg0);
        }
        if (this.field897 != 128 || this.field909 != 128) {
            var6.method2284(this.field897, this.field909, this.field897);
        }
        if (this.field900 != 0) {
            if (this.field900 == 90) {
                var6.method2279();
            }
            if (this.field900 == 180) {
                var6.method2279();
                var6.method2279();
            }
            if (this.field900 == 270) {
                var6.method2279();
                var6.method2279();
                var6.method2279();
            }
        }
        return var6;
    }

    @ObfuscatedName("m.o(B)V")
    public static void method98() {
        field889.method3360();
        field890.method3360();
    }
}
