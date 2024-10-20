package deob;

@ObfuscatedName("gi")
public class class190 extends class406 {

    @ObfuscatedName("gi.q")
    public static class257 field2194 = new class257(64);

    @ObfuscatedName("gi.l")
    public int field2192 = 0;

    @ObfuscatedName("gi.k")
    public int field2193 = -1;

    @ObfuscatedName("gi.a")
    public boolean field2199 = true;

    @ObfuscatedName("gi.m")
    public int field2195 = -1;

    @ObfuscatedName("gi.p")
    public int field2196;

    @ObfuscatedName("gi.s")
    public int field2197;

    @ObfuscatedName("gi.r")
    public int field2198;

    @ObfuscatedName("gi.v")
    public int field2191;

    @ObfuscatedName("gi.y")
    public int field2200;

    @ObfuscatedName("gi.c")
    public int field2201;

    @ObfuscatedName("hw.o(Llp;B)V")
    public static void method4094(class316 arg0) {
        Statics.field2190 = arg0;
    }

    @ObfuscatedName("bo.q(II)Lgi;")
    public static class190 method1029(int arg0) {
        class190 var1 = (class190) field2194.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2190.method5249(4, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3399(new class440(var2), arg0);
        }
        var3.method3388();
        field2194.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.l(I)V")
    public void method3388() {
        if (this.field2195 != -1) {
            this.method3406(this.field2195);
            this.field2191 = this.field2196;
            this.field2200 = this.field2197;
            this.field2201 = this.field2198;
        }
        this.method3406(this.field2192);
    }

    @ObfuscatedName("gi.k(Lpx;IB)V")
    public void method3399(class440 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7071();
            if (var3 == 0) {
                return;
            }
            this.method3397(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gi.a(Lpx;IIB)V")
    public void method3397(class440 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2192 = arg0.method6897();
        } else if (arg1 == 2) {
            this.field2193 = arg0.method7071();
        } else if (arg1 == 5) {
            this.field2199 = false;
        } else if (arg1 == 7) {
            this.field2195 = arg0.method6897();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gi.m(II)V")
    public void method3406(int arg0) {
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
        this.field2196 = (int) (var18 * 256.0D);
        this.field2197 = (int) (var14 * 256.0D);
        this.field2198 = (int) (var16 * 256.0D);
        if (this.field2197 < 0) {
            this.field2197 = 0;
        } else if (this.field2197 > 255) {
            this.field2197 = 255;
        }
        if (this.field2198 < 0) {
            this.field2198 = 0;
        } else if (this.field2198 > 255) {
            this.field2198 = 255;
        }
    }

    @ObfuscatedName("fc.p(I)V")
    public static void method3111() {
        field2194.method4569();
    }
}
