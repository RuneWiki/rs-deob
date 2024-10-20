package deob;

@ObfuscatedName("ay")
public class class41 extends class183 {

    @ObfuscatedName("ay.s")
    public static class172 field968 = new class172(64);

    @ObfuscatedName("ay.h")
    public int field957 = 0;

    @ObfuscatedName("ay.m")
    public int field958 = -1;

    @ObfuscatedName("ay.u")
    public boolean field956 = true;

    @ObfuscatedName("ay.j")
    public int field960 = -1;

    @ObfuscatedName("ay.b")
    public int field965;

    @ObfuscatedName("ay.v")
    public int field962;

    @ObfuscatedName("ay.y")
    public int field963;

    @ObfuscatedName("ay.w")
    public int field964;

    @ObfuscatedName("ay.x")
    public int field955;

    @ObfuscatedName("ay.k")
    public int field966;

    @ObfuscatedName("k.g(Leh;I)V")
    public static void method143(class147 arg0) {
        Statics.field970 = arg0;
    }

    @ObfuscatedName("bc.s(II)Lay;")
    public static class41 method1062(int arg0) {
        class41 var1 = (class41) field968.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method2667(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method782(new class107(var2), arg0);
        }
        var3.method781();
        field968.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.h(I)V")
    public void method781() {
        if (this.field960 != -1) {
            this.method784(this.field960);
            this.field964 = this.field965;
            this.field955 = this.field962;
            this.field966 = this.field963;
        }
        this.method784(this.field957);
    }

    @ObfuscatedName("ay.m(Ldi;II)V")
    public void method782(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2101();
            if (var3 == 0) {
                return;
            }
            this.method791(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.u(Ldi;III)V")
    public void method791(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field957 = arg0.method2105();
        } else if (arg1 == 2) {
            this.field958 = arg0.method2101();
        } else if (arg1 == 5) {
            this.field956 = false;
        } else if (arg1 == 7) {
            this.field960 = arg0.method2105();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ay.j(IS)V")
    public void method784(int arg0) {
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
        this.field965 = (int) (var18 * 256.0D);
        this.field962 = (int) (var14 * 256.0D);
        this.field963 = (int) (var16 * 256.0D);
        if (this.field962 < 0) {
            this.field962 = 0;
        } else if (this.field962 > 255) {
            this.field962 = 255;
        }
        if (this.field963 < 0) {
            this.field963 = 0;
        } else if (this.field963 > 255) {
            this.field963 = 255;
        }
    }
}
