package deob;

@ObfuscatedName("ag")
public class class41 {

    @ObfuscatedName("ag.f")
    public class59[] field278 = new class59[10];

    @ObfuscatedName("ag.c")
    public int field277;

    @ObfuscatedName("ag.x")
    public int field280;

    @ObfuscatedName("ag.a(Llg;II)Lag;")
    public static class41 method753(class330 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5859(arg1, arg2);
        return var3 == null ? null : new class41(new class464(var3));
    }

    public class41(class464 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7735();
            if (var3 != 0) {
                arg0.field4864--;
                this.field278[var2] = new class59();
                this.field278[var2].method1071(arg0);
            }
        }
        this.field277 = arg0.method7716();
        this.field280 = arg0.method7716();
    }

    @ObfuscatedName("ag.f()Lam;")
    public class42 method748() {
        byte[] var1 = this.method750();
        return new class42(22050, var1, this.field277 * 22050 / 1000, this.field280 * 22050 / 1000);
    }

    @ObfuscatedName("ag.c()I")
    public final int method749() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field278[var2] != null && this.field278[var2].field441 / 20 < var1) {
                var1 = this.field278[var2].field441 / 20;
            }
        }
        if (this.field277 < this.field280 && this.field277 / 20 < var1) {
            var1 = this.field277 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field278[var3] != null) {
                this.field278[var3].field441 -= var1 * 20;
            }
        }
        if (this.field277 < this.field280) {
            this.field277 -= var1 * 20;
            this.field280 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ag.x()[B")
    public final byte[] method750() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field278[var2] != null && this.field278[var2].field449 + this.field278[var2].field441 > var1) {
                var1 = this.field278[var2].field449 + this.field278[var2].field441;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field278[var5] != null) {
                int var6 = this.field278[var5].field449 * 22050 / 1000;
                int var7 = this.field278[var5].field441 * 22050 / 1000;
                int[] var8 = this.field278[var5].method1069(var6, this.field278[var5].field449);
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
