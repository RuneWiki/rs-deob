package deob;

@ObfuscatedName("ai")
public class class42 extends class205 {

    @ObfuscatedName("ai.h")
    public static class194 field959 = new class194(64);

    @ObfuscatedName("ai.m")
    public int field962 = 0;

    @ObfuscatedName("ai.z")
    public int field961;

    @ObfuscatedName("ai.x")
    public int field958;

    @ObfuscatedName("ai.e")
    public int field963;

    @ObfuscatedName("ai.i")
    public int field964;

    @ObfuscatedName("ab.j(Lfy;I)V")
    public static void method642(class168 arg0) {
        Statics.field960 = arg0;
    }

    @ObfuscatedName("ag.h(II)Lai;")
    public static class42 method709(int arg0) {
        class42 var1 = (class42) field959.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field960.method3011(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method823(new class120(var2), arg0);
        }
        var3.method814();
        field959.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.m(I)V")
    public void method814() {
        this.method817(this.field962);
    }

    @ObfuscatedName("ai.z(Ldx;IB)V")
    public void method823(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2361();
            if (var3 == 0) {
                return;
            }
            this.method816(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.x(Ldx;IIB)V")
    public void method816(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field962 = arg0.method2523();
        }
    }

    @ObfuscatedName("ai.e(II)V")
    public void method817(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field958 = (int) (var14 * 256.0D);
        this.field963 = (int) (var16 * 256.0D);
        if (this.field958 < 0) {
            this.field958 = 0;
        } else if (this.field958 > 255) {
            this.field958 = 255;
        }
        if (this.field963 < 0) {
            this.field963 = 0;
        } else if (this.field963 > 255) {
            this.field963 = 255;
        }
        if (var16 > 0.5D) {
            this.field964 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field964 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field964 < 1) {
            this.field964 = 1;
        }
        this.field961 = (int) ((double) this.field964 * var18);
    }
}
