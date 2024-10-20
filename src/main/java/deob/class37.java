package deob;

@ObfuscatedName("al")
public class class37 extends class174 {

    @ObfuscatedName("al.p")
    public static class170 field959 = new class170(64);

    @ObfuscatedName("al.a")
    public int field946 = 0;

    @ObfuscatedName("al.l")
    public int field947 = -1;

    @ObfuscatedName("al.q")
    public boolean field957 = true;

    @ObfuscatedName("al.b")
    public int field949 = -1;

    @ObfuscatedName("al.u")
    public int field948;

    @ObfuscatedName("al.d")
    public int field951;

    @ObfuscatedName("al.m")
    public int field952;

    @ObfuscatedName("al.v")
    public int field953;

    @ObfuscatedName("al.j")
    public int field954;

    @ObfuscatedName("al.f")
    public int field955;

    @ObfuscatedName("by.i(II)Lal;")
    public static class37 method1384(int arg0) {
        class37 var1 = (class37) field959.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field945.method2932(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method771(new class127(var2), arg0);
        }
        var3.method774();
        field959.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.p(I)V")
    public void method774() {
        if (this.field949 != -1) {
            this.method773(this.field949);
            this.field953 = this.field948;
            this.field954 = this.field951;
            this.field955 = this.field952;
        }
        this.method773(this.field946);
    }

    @ObfuscatedName("al.a(Ldn;IB)V")
    public void method771(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2411();
            if (var3 == 0) {
                return;
            }
            this.method779(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.l(Ldn;III)V")
    public void method779(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field946 = arg0.method2415();
        } else if (arg1 == 2) {
            this.field947 = arg0.method2411();
        } else if (arg1 == 5) {
            this.field957 = false;
        } else if (arg1 == 7) {
            this.field949 = arg0.method2415();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("al.q(II)V")
    public void method773(int arg0) {
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
        this.field948 = (int) (var18 * 256.0D);
        this.field951 = (int) (var14 * 256.0D);
        this.field952 = (int) (var16 * 256.0D);
        if (this.field951 < 0) {
            this.field951 = 0;
        } else if (this.field951 > 255) {
            this.field951 = 255;
        }
        if (this.field952 < 0) {
            this.field952 = 0;
        } else if (this.field952 > 255) {
            this.field952 = 255;
        }
    }

    @ObfuscatedName("bg.b(I)V")
    public static void method1304() {
        field959.method3226();
    }
}
