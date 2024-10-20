package deob;

@ObfuscatedName("bf")
public class class40 {

    @ObfuscatedName("bf.ay")
    public class62[] field239 = new class62[10];

    @ObfuscatedName("bf.an")
    public int field240;

    @ObfuscatedName("bf.au")
    public int field238;

    @ObfuscatedName("bf.ab(Lob;II)Lbf;")
    public static class40 method723(class389 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6670(arg1, arg2);
        return var3 == null ? null : new class40(new class549(var3));
    }

    public class40(class549 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method9025();
            if (var3 != 0) {
                arg0.field5378--;
                this.field239[var2] = new class62();
                this.field239[var2].method1100(arg0);
            }
        }
        this.field240 = arg0.method8968();
        this.field238 = arg0.method8968();
    }

    @ObfuscatedName("bf.ay()Lbq;")
    public class41 method712() {
        byte[] var1 = this.method713();
        return new class41(22050, var1, this.field240 * 22050 / 1000, this.field238 * 22050 / 1000);
    }

    @ObfuscatedName("bf.an()I")
    public final int method720() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field239[var2] != null && this.field239[var2].field434 / 20 < var1) {
                var1 = this.field239[var2].field434 / 20;
            }
        }
        if (this.field240 < this.field238 && this.field240 / 20 < var1) {
            var1 = this.field240 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field239[var3] != null) {
                this.field239[var3].field434 -= var1 * 20;
            }
        }
        if (this.field240 < this.field238) {
            this.field240 -= var1 * 20;
            this.field238 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.au()[B")
    public final byte[] method713() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field239[var2] != null && this.field239[var2].field434 + this.field239[var2].field433 > var1) {
                var1 = this.field239[var2].field434 + this.field239[var2].field433;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field239[var5] != null) {
                int var6 = this.field239[var5].field433 * 22050 / 1000;
                int var7 = this.field239[var5].field434 * 22050 / 1000;
                int[] var8 = this.field239[var5].method1093(var6, this.field239[var5].field433);
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
