package deob;

@ObfuscatedName("ac")
public class class37 {

    @ObfuscatedName("ac.b")
    public class55[] field261 = new class55[10];

    @ObfuscatedName("ac.p")
    public int field260;

    @ObfuscatedName("ac.m")
    public int field263;

    @ObfuscatedName("ac.c(Lku;II)Lac;")
    public static class37 method695(class302 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5053(arg1, arg2);
        return var3 == null ? null : new class37(new class419(var3));
    }

    public class37(class419 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6781();
            if (var3 != 0) {
                arg0.field4475--;
                this.field261[var2] = new class55();
                this.field261[var2].method1038(arg0);
            }
        }
        this.field260 = arg0.method6672();
        this.field263 = arg0.method6672();
    }

    @ObfuscatedName("ac.b()Laj;")
    public class38 method696() {
        byte[] var1 = this.method697();
        return new class38(22050, var1, this.field260 * 22050 / 1000, this.field263 * 22050 / 1000);
    }

    @ObfuscatedName("ac.p()I")
    public final int method703() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field261[var2] != null && this.field261[var2].field431 / 20 < var1) {
                var1 = this.field261[var2].field431 / 20;
            }
        }
        if (this.field260 < this.field263 && this.field260 / 20 < var1) {
            var1 = this.field260 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field261[var3] != null) {
                this.field261[var3].field431 -= var1 * 20;
            }
        }
        if (this.field260 < this.field263) {
            this.field260 -= var1 * 20;
            this.field263 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ac.m()[B")
    public final byte[] method697() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field261[var2] != null && this.field261[var2].field431 + this.field261[var2].field430 > var1) {
                var1 = this.field261[var2].field431 + this.field261[var2].field430;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field261[var5] != null) {
                int var6 = this.field261[var5].field430 * 22050 / 1000;
                int var7 = this.field261[var5].field431 * 22050 / 1000;
                int[] var8 = this.field261[var5].method1036(var6, this.field261[var5].field430);
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
