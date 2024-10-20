package deob;

@ObfuscatedName("bp")
public class class40 {

    @ObfuscatedName("bp.ae")
    public class62[] field276 = new class62[10];

    @ObfuscatedName("bp.ao")
    public int field278;

    @ObfuscatedName("bp.at")
    public int field279;

    @ObfuscatedName("bp.au(Lnu;II)Lbp;")
    public static class40 method751(class359 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6128(arg1, arg2);
        return var3 == null ? null : new class40(new class515(var3));
    }

    public class40(class515 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8300();
            if (var3 != 0) {
                arg0.field5111--;
                this.field276[var2] = new class62();
                this.field276[var2].method1115(arg0);
            }
        }
        this.field278 = arg0.method8448();
        this.field279 = arg0.method8448();
    }

    @ObfuscatedName("bp.ae()Lbu;")
    public class41 method749() {
        byte[] var1 = this.method765();
        return new class41(22050, var1, this.field278 * 22050 / 1000, this.field279 * 22050 / 1000);
    }

    @ObfuscatedName("bp.ao()I")
    public final int method750() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field276[var2] != null && this.field276[var2].field481 / 20 < var1) {
                var1 = this.field276[var2].field481 / 20;
            }
        }
        if (this.field278 < this.field279 && this.field278 / 20 < var1) {
            var1 = this.field278 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field276[var3] != null) {
                this.field276[var3].field481 -= var1 * 20;
            }
        }
        if (this.field278 < this.field279) {
            this.field278 -= var1 * 20;
            this.field279 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bp.at()[B")
    public final byte[] method765() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field276[var2] != null && this.field276[var2].field481 + this.field276[var2].field473 > var1) {
                var1 = this.field276[var2].field481 + this.field276[var2].field473;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field276[var5] != null) {
                int var6 = this.field276[var5].field473 * 22050 / 1000;
                int var7 = this.field276[var5].field481 * 22050 / 1000;
                int[] var8 = this.field276[var5].method1113(var6, this.field276[var5].field473);
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
