package deob;

@ObfuscatedName("bi")
public class class40 {

    @ObfuscatedName("bi.ae")
    public class62[] field244 = new class62[10];

    @ObfuscatedName("bi.ag")
    public int field246;

    @ObfuscatedName("bi.am")
    public int field245;

    @ObfuscatedName("bi.ac(Lpo;II)Lbi;")
    public static class40 method754(class391 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6782(arg1, arg2);
        return var3 == null ? null : new class40(new class551(var3));
    }

    public class40(class551 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8955();
            if (var3 != 0) {
                arg0.field5415--;
                this.field244[var2] = new class62();
                this.field244[var2].method1129(arg0);
            }
        }
        this.field246 = arg0.method9119();
        this.field245 = arg0.method9119();
    }

    @ObfuscatedName("bi.ae()Lbg;")
    public class41 method752() {
        byte[] var1 = this.method751();
        return new class41(22050, var1, this.field246 * 22050 / 1000, this.field245 * 22050 / 1000);
    }

    @ObfuscatedName("bi.ag()I")
    public final int method753() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field244[var2] != null && this.field244[var2].field454 / 20 < var1) {
                var1 = this.field244[var2].field454 / 20;
            }
        }
        if (this.field246 < this.field245 && this.field246 / 20 < var1) {
            var1 = this.field246 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field244[var3] != null) {
                this.field244[var3].field454 -= var1 * 20;
            }
        }
        if (this.field246 < this.field245) {
            this.field246 -= var1 * 20;
            this.field245 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.am()[B")
    public final byte[] method751() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field244[var2] != null && this.field244[var2].field454 + this.field244[var2].field445 > var1) {
                var1 = this.field244[var2].field454 + this.field244[var2].field445;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field244[var5] != null) {
                int var6 = this.field244[var5].field445 * 22050 / 1000;
                int var7 = this.field244[var5].field454 * 22050 / 1000;
                int[] var8 = this.field244[var5].method1128(var6, this.field244[var5].field445);
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
