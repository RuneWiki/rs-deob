package deob;

@ObfuscatedName("bc")
public class class40 {

    @ObfuscatedName("bc.ay")
    public class62[] field280 = new class62[10];

    @ObfuscatedName("bc.ar")
    public int field279;

    @ObfuscatedName("bc.am")
    public int field282;

    @ObfuscatedName("bc.aw(Lnd;II)Lbc;")
    public static class40 method746(class360 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6117(arg1, arg2);
        return var3 == null ? null : new class40(new class514(var3));
    }

    public class40(class514 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8244();
            if (var3 != 0) {
                arg0.field5072--;
                this.field280[var2] = new class62();
                this.field280[var2].method1132(arg0);
            }
        }
        this.field279 = arg0.method8246();
        this.field282 = arg0.method8246();
    }

    @ObfuscatedName("bc.ay()Lbi;")
    public class41 method742() {
        byte[] var1 = this.method744();
        return new class41(22050, var1, this.field279 * 22050 / 1000, this.field282 * 22050 / 1000);
    }

    @ObfuscatedName("bc.ar()I")
    public final int method741() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field280[var2] != null && this.field280[var2].field477 / 20 < var1) {
                var1 = this.field280[var2].field477 / 20;
            }
        }
        if (this.field279 < this.field282 && this.field279 / 20 < var1) {
            var1 = this.field279 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field280[var3] != null) {
                this.field280[var3].field477 -= var1 * 20;
            }
        }
        if (this.field279 < this.field282) {
            this.field279 -= var1 * 20;
            this.field282 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bc.am()[B")
    public final byte[] method744() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field280[var2] != null && this.field280[var2].field477 + this.field280[var2].field464 > var1) {
                var1 = this.field280[var2].field477 + this.field280[var2].field464;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field280[var5] != null) {
                int var6 = this.field280[var5].field464 * 22050 / 1000;
                int var7 = this.field280[var5].field477 * 22050 / 1000;
                int[] var8 = this.field280[var5].method1127(var6, this.field280[var5].field464);
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
