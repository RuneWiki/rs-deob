package deob;

@ObfuscatedName("ia")
public class class216 extends class500 {

    @ObfuscatedName("ia.al")
    public static class312 field2210 = new class312(64);

    @ObfuscatedName("ia.aj")
    public int field2212 = 0;

    @ObfuscatedName("ia.az")
    public int field2213;

    @ObfuscatedName("ia.af")
    public int field2209;

    @ObfuscatedName("ia.aa")
    public int field2214;

    @ObfuscatedName("ia.at")
    public int field2215;

    @ObfuscatedName("ik.ak(II)Lia;")
    public static class216 method3871(int arg0) {
        class216 var1 = (class216) field2210.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2211.method6573(1, arg0);
        class216 var3 = new class216();
        if (var2 != null) {
            var3.method3744(new class546(var2), arg0);
        }
        var3.method3743();
        field2210.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.al(I)V")
    public void method3743() {
        this.method3746(this.field2212);
    }

    @ObfuscatedName("ia.aj(Lua;II)V")
    public void method3744(class546 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8796();
            if (var3 == 0) {
                return;
            }
            this.method3745(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ia.az(Lua;III)V")
    public void method3745(class546 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2212 = arg0.method8790();
        }
    }

    @ObfuscatedName("ia.af(II)V")
    public void method3746(int arg0) {
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
        this.field2209 = (int) (var14 * 256.0D);
        this.field2214 = (int) (var16 * 256.0D);
        if (this.field2209 < 0) {
            this.field2209 = 0;
        } else if (this.field2209 > 255) {
            this.field2209 = 255;
        }
        if (this.field2214 < 0) {
            this.field2214 = 0;
        } else if (this.field2214 > 255) {
            this.field2214 = 255;
        }
        if (var16 > 0.5D) {
            this.field2215 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2215 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2215 < 1) {
            this.field2215 = 1;
        }
        this.field2213 = (int) ((double) this.field2215 * var18);
    }

    @ObfuscatedName("hx.aa(B)V")
    public static void method3495() {
        field2210.method5572();
    }
}
