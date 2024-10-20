package deob;

@ObfuscatedName("fw")
public class class158 extends class349 {

    @ObfuscatedName("fw.t")
    public static class223 field1843 = new class223(64);

    @ObfuscatedName("fw.v")
    public int field1844 = 0;

    @ObfuscatedName("fw.j")
    public int field1856 = -1;

    @ObfuscatedName("fw.l")
    public boolean field1846 = true;

    @ObfuscatedName("fw.n")
    public int field1848 = -1;

    @ObfuscatedName("fw.w")
    public int field1847;

    @ObfuscatedName("fw.f")
    public int field1849;

    @ObfuscatedName("fw.o")
    public int field1850;

    @ObfuscatedName("fw.x")
    public int field1851;

    @ObfuscatedName("fw.r")
    public int field1852;

    @ObfuscatedName("fw.p")
    public int field1853;

    @ObfuscatedName("fw.s(I)V")
    public void method2800() {
        if (this.field1848 != -1) {
            this.method2803(this.field1848);
            this.field1851 = this.field1847;
            this.field1852 = this.field1849;
            this.field1853 = this.field1850;
        }
        this.method2803(this.field1844);
    }

    @ObfuscatedName("fw.t(Lnv;IB)V")
    public void method2801(class385 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5958();
            if (var3 == 0) {
                return;
            }
            this.method2802(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fw.v(Lnv;III)V")
    public void method2802(class385 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1844 = arg0.method5962();
        } else if (arg1 == 2) {
            this.field1856 = arg0.method5958();
        } else if (arg1 == 5) {
            this.field1846 = false;
        } else if (arg1 == 7) {
            this.field1848 = arg0.method5962();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fw.j(II)V")
    public void method2803(int arg0) {
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
        this.field1847 = (int) (var18 * 256.0D);
        this.field1849 = (int) (var14 * 256.0D);
        this.field1850 = (int) (var16 * 256.0D);
        if (this.field1849 < 0) {
            this.field1849 = 0;
        } else if (this.field1849 > 255) {
            this.field1849 = 255;
        }
        if (this.field1850 < 0) {
            this.field1850 = 0;
        } else if (this.field1850 > 255) {
            this.field1850 = 255;
        }
    }

    @ObfuscatedName("hq.l(I)V")
    public static void method3985() {
        field1843.method3930();
    }
}
