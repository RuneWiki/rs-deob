package deob;

@ObfuscatedName("al")
public class class43 extends class195 {

    @ObfuscatedName("al.k")
    public static class184 field1000 = new class184(64);

    @ObfuscatedName("al.g")
    public int field994 = 0;

    @ObfuscatedName("al.n")
    public int field995 = -1;

    @ObfuscatedName("al.t")
    public boolean field992 = true;

    @ObfuscatedName("al.e")
    public int field997 = -1;

    @ObfuscatedName("al.q")
    public int field998;

    @ObfuscatedName("al.z")
    public int field996;

    @ObfuscatedName("al.v")
    public int field1003;

    @ObfuscatedName("al.b")
    public int field1001;

    @ObfuscatedName("al.f")
    public int field1002;

    @ObfuscatedName("al.i")
    public int field999;

    @ObfuscatedName("y.y(II)Lal;")
    public static class43 method3(int arg0) {
        class43 var1 = (class43) field1000.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field993.method2874(4, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method841(new class111(var2), arg0);
        }
        var3.method850();
        field1000.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.k(B)V")
    public void method850() {
        if (this.field997 != -1) {
            this.method852(this.field997);
            this.field1001 = this.field998;
            this.field1002 = this.field996;
            this.field999 = this.field1003;
        }
        this.method852(this.field994);
    }

    @ObfuscatedName("al.g(Ldw;II)V")
    public void method841(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2205();
            if (var3 == 0) {
                return;
            }
            this.method842(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.n(Ldw;III)V")
    public void method842(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field994 = arg0.method2164();
        } else if (arg1 == 2) {
            this.field995 = arg0.method2205();
        } else if (arg1 == 5) {
            this.field992 = false;
        } else if (arg1 == 7) {
            this.field997 = arg0.method2164();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("al.t(II)V")
    public void method852(int arg0) {
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
        this.field998 = (int) (var18 * 256.0D);
        this.field996 = (int) (var14 * 256.0D);
        this.field1003 = (int) (var16 * 256.0D);
        if (this.field996 < 0) {
            this.field996 = 0;
        } else if (this.field996 > 255) {
            this.field996 = 255;
        }
        if (this.field1003 < 0) {
            this.field1003 = 0;
        } else if (this.field1003 > 255) {
            this.field1003 = 255;
        }
    }
}
