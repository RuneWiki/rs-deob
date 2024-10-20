package deob;

@ObfuscatedName("bh")
public class class40 {

    @ObfuscatedName("bh.an")
    public class62[] field260 = new class62[10];

    @ObfuscatedName("bh.av")
    public int field262;

    @ObfuscatedName("bh.as")
    public int field261;

    @ObfuscatedName("bh.at(Lnq;II)Lbh;")
    public static class40 method710(class357 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6080(arg1, arg2);
        return var3 == null ? null : new class40(new class501(var3));
    }

    public class40(class501 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8129();
            if (var3 != 0) {
                arg0.field5017--;
                this.field260[var2] = new class62();
                this.field260[var2].method1072(arg0);
            }
        }
        this.field262 = arg0.method8195();
        this.field261 = arg0.method8195();
    }

    @ObfuscatedName("bh.an()Lbp;")
    public class41 method711() {
        byte[] var1 = this.method709();
        return new class41(22050, var1, this.field262 * 22050 / 1000, this.field261 * 22050 / 1000);
    }

    @ObfuscatedName("bh.av()I")
    public final int method712() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field260[var2] != null && this.field260[var2].field463 / 20 < var1) {
                var1 = this.field260[var2].field463 / 20;
            }
        }
        if (this.field262 < this.field261 && this.field262 / 20 < var1) {
            var1 = this.field262 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field260[var3] != null) {
                this.field260[var3].field463 -= var1 * 20;
            }
        }
        if (this.field262 < this.field261) {
            this.field262 -= var1 * 20;
            this.field261 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.as()[B")
    public final byte[] method709() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field260[var2] != null && this.field260[var2].field463 + this.field260[var2].field462 > var1) {
                var1 = this.field260[var2].field463 + this.field260[var2].field462;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field260[var5] != null) {
                int var6 = this.field260[var5].field462 * 22050 / 1000;
                int var7 = this.field260[var5].field463 * 22050 / 1000;
                int[] var8 = this.field260[var5].method1069(var6, this.field260[var5].field462);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
