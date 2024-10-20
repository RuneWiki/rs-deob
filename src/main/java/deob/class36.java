package deob;

@ObfuscatedName("am")
public class class36 extends class172 {

    @ObfuscatedName("am.h")
    public static class168 field935 = new class168(64);

    @ObfuscatedName("am.c")
    public int field937 = 0;

    @ObfuscatedName("am.p")
    public int field934 = -1;

    @ObfuscatedName("am.i")
    public boolean field939 = true;

    @ObfuscatedName("am.v")
    public int field948 = -1;

    @ObfuscatedName("am.l")
    public int field940;

    @ObfuscatedName("am.m")
    public int field941;

    @ObfuscatedName("am.g")
    public int field942;

    @ObfuscatedName("am.t")
    public int field943;

    @ObfuscatedName("am.o")
    public int field944;

    @ObfuscatedName("am.b")
    public int field945;

    @ObfuscatedName("bf.z(II)Lam;")
    public static class36 method1561(int arg0) {
        class36 var1 = (class36) field935.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method2951(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method789(new class126(var2), arg0);
        }
        var3.method783();
        field935.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.h(I)V")
    public void method783() {
        if (this.field948 != -1) {
            this.method795(this.field948);
            this.field943 = this.field940;
            this.field944 = this.field941;
            this.field945 = this.field942;
        }
        this.method795(this.field937);
    }

    @ObfuscatedName("am.c(Ldq;IB)V")
    public void method789(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2450();
            if (var3 == 0) {
                return;
            }
            this.method803(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.p(Ldq;III)V")
    public void method803(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field937 = arg0.method2454();
        } else if (arg1 == 2) {
            this.field934 = arg0.method2450();
        } else if (arg1 == 5) {
            this.field939 = false;
        } else if (arg1 == 7) {
            this.field948 = arg0.method2454();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("am.i(IB)V")
    public void method795(int arg0) {
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
        this.field940 = (int) (var18 * 256.0D);
        this.field941 = (int) (var14 * 256.0D);
        this.field942 = (int) (var16 * 256.0D);
        if (this.field941 < 0) {
            this.field941 = 0;
        } else if (this.field941 > 255) {
            this.field941 = 255;
        }
        if (this.field942 < 0) {
            this.field942 = 0;
        } else if (this.field942 > 255) {
            this.field942 = 255;
        }
    }

    @ObfuscatedName("ap.v(I)V")
    public static void method823() {
        field935.method3241();
    }
}
