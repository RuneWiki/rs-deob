package deob;

@ObfuscatedName("fq")
public class class157 extends class348 {

    @ObfuscatedName("fq.e")
    public static class222 field1876 = new class222(64);

    @ObfuscatedName("fq.v")
    public int field1874 = 0;

    @ObfuscatedName("fq.y")
    public int field1872 = -1;

    @ObfuscatedName("fq.j")
    public boolean field1869 = true;

    @ObfuscatedName("fq.o")
    public int field1870 = -1;

    @ObfuscatedName("fq.m")
    public int field1871;

    @ObfuscatedName("fq.r")
    public int field1867;

    @ObfuscatedName("fq.h")
    public int field1873;

    @ObfuscatedName("fq.d")
    public int field1866;

    @ObfuscatedName("fq.z")
    public int field1875;

    @ObfuscatedName("fq.b")
    public int field1868;

    @ObfuscatedName("gy.f(Ljp;I)V")
    public static void method3792(class276 arg0) {
        Statics.field3662 = arg0;
    }

    @ObfuscatedName("fj.e(II)Lfq;")
    public static class157 method3287(int arg0) {
        class157 var1 = (class157) field1876.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3662.method4504(4, arg0);
        class157 var3 = new class157();
        if (var2 != null) {
            var3.method2833(new class384(var2), arg0);
        }
        var3.method2852();
        field1876.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.v(I)V")
    public void method2852() {
        if (this.field1870 != -1) {
            this.method2837(this.field1870);
            this.field1866 = this.field1871;
            this.field1875 = this.field1867;
            this.field1868 = this.field1873;
        }
        this.method2837(this.field1874);
    }

    @ObfuscatedName("fq.y(Lnt;IB)V")
    public void method2833(class384 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5902();
            if (var3 == 0) {
                return;
            }
            this.method2836(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fq.j(Lnt;III)V")
    public void method2836(class384 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1874 = arg0.method5901();
        } else if (arg1 == 2) {
            this.field1872 = arg0.method5902();
        } else if (arg1 == 5) {
            this.field1869 = false;
        } else if (arg1 == 7) {
            this.field1870 = arg0.method5901();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fq.o(II)V")
    public void method2837(int arg0) {
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
        this.field1871 = (int) (var18 * 256.0D);
        this.field1867 = (int) (var14 * 256.0D);
        this.field1873 = (int) (var16 * 256.0D);
        if (this.field1867 < 0) {
            this.field1867 = 0;
        } else if (this.field1867 > 255) {
            this.field1867 = 255;
        }
        if (this.field1873 < 0) {
            this.field1873 = 0;
        } else if (this.field1873 > 255) {
            this.field1873 = 255;
        }
    }

    @ObfuscatedName("co.m(I)V")
    public static void method1941() {
        field1876.method3989();
    }
}
