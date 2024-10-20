package deob;

@ObfuscatedName("hj")
public class class204 extends class485 {

    @ObfuscatedName("hj.ap")
    public static class302 field2206 = new class302(64);

    @ObfuscatedName("hj.af")
    public int field2214 = 0;

    @ObfuscatedName("hj.aj")
    public int field2208 = -1;

    @ObfuscatedName("hj.aq")
    public boolean field2209 = true;

    @ObfuscatedName("hj.ar")
    public int field2210 = -1;

    @ObfuscatedName("hj.ag")
    public int field2211;

    @ObfuscatedName("hj.ao")
    public int field2212;

    @ObfuscatedName("hj.ae")
    public int field2213;

    @ObfuscatedName("hj.aa")
    public int field2216;

    @ObfuscatedName("hj.au")
    public int field2215;

    @ObfuscatedName("hj.an")
    public int field2218;

    @ObfuscatedName("dv.am(Low;I)V")
    public static void method2238(class375 arg0) {
        Statics.field4586 = arg0;
    }

    @ObfuscatedName("hj.ap(I)V")
    public void method3745() {
        if (this.field2210 != -1) {
            this.method3737(this.field2210);
            this.field2216 = this.field2211;
            this.field2215 = this.field2212;
            this.field2218 = this.field2213;
        }
        this.method3737(this.field2214);
    }

    @ObfuscatedName("hj.af(Luk;IB)V")
    public void method3735(class531 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8561();
            if (var3 == 0) {
                return;
            }
            this.method3733(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hj.aj(Luk;III)V")
    public void method3733(class531 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2214 = arg0.method8688();
        } else if (arg1 == 2) {
            this.field2208 = arg0.method8561();
        } else if (arg1 == 5) {
            this.field2209 = false;
        } else if (arg1 == 7) {
            this.field2210 = arg0.method8688();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hj.aq(IB)V")
    public void method3737(int arg0) {
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
        this.field2211 = (int) (var18 * 256.0D);
        this.field2212 = (int) (var14 * 256.0D);
        this.field2213 = (int) (var16 * 256.0D);
        if (this.field2212 < 0) {
            this.field2212 = 0;
        } else if (this.field2212 > 255) {
            this.field2212 = 255;
        }
        if (this.field2213 < 0) {
            this.field2213 = 0;
        } else if (this.field2213 > 255) {
            this.field2213 = 255;
        }
    }
}
