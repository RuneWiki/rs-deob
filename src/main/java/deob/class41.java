package deob;

@ObfuscatedName("aa")
public class class41 extends class181 {

    @ObfuscatedName("aa.z")
    public static class171 field972 = new class171(64);

    @ObfuscatedName("aa.y")
    public int field959 = 0;

    @ObfuscatedName("aa.h")
    public int field960 = -1;

    @ObfuscatedName("aa.r")
    public boolean field961 = true;

    @ObfuscatedName("aa.e")
    public int field966 = -1;

    @ObfuscatedName("aa.k")
    public int field963;

    @ObfuscatedName("aa.b")
    public int field964;

    @ObfuscatedName("aa.n")
    public int field965;

    @ObfuscatedName("aa.a")
    public int field962;

    @ObfuscatedName("aa.q")
    public int field967;

    @ObfuscatedName("aa.i")
    public int field968;

    @ObfuscatedName("aa.j(I)V")
    public void method789() {
        if (this.field966 != -1) {
            this.method773(this.field966);
            this.field962 = this.field963;
            this.field967 = this.field964;
            this.field968 = this.field965;
        }
        this.method773(this.field959);
    }

    @ObfuscatedName("aa.z(Lde;IB)V")
    public void method770(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2130();
            if (var3 == 0) {
                return;
            }
            this.method772(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.y(Lde;IIB)V")
    public void method772(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field959 = arg0.method2252();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2130();
        } else if (arg1 == 5) {
            this.field961 = false;
        } else if (arg1 == 7) {
            this.field966 = arg0.method2252();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aa.h(II)V")
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
        this.field963 = (int) (var18 * 256.0D);
        this.field964 = (int) (var14 * 256.0D);
        this.field965 = (int) (var16 * 256.0D);
        if (this.field964 < 0) {
            this.field964 = 0;
        } else if (this.field964 > 255) {
            this.field964 = 255;
        }
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
    }
}
