package deob;

@ObfuscatedName("an")
public class class37 {

    @ObfuscatedName("an.v")
    public class55[] field255 = new class55[10];

    @ObfuscatedName("an.q")
    public int field256;

    @ObfuscatedName("an.f")
    public int field257;

    @ObfuscatedName("an.c(Llh;II)Lan;")
    public static class37 method625(class315 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5305(arg1, arg2);
        return var3 == null ? null : new class37(new class443(var3));
    }

    public class37(class443 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7047();
            if (var3 != 0) {
                arg0.field4700--;
                this.field255[var2] = new class55();
                this.field255[var2].method973(arg0);
            }
        }
        this.field256 = arg0.method7049();
        this.field257 = arg0.method7049();
    }

    @ObfuscatedName("an.v()Laf;")
    public class38 method616() {
        byte[] var1 = this.method618();
        return new class38(22050, var1, this.field256 * 22050 / 1000, this.field257 * 22050 / 1000);
    }

    @ObfuscatedName("an.q()I")
    public final int method617() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field255[var2] != null && this.field255[var2].field433 / 20 < var1) {
                var1 = this.field255[var2].field433 / 20;
            }
        }
        if (this.field256 < this.field257 && this.field256 / 20 < var1) {
            var1 = this.field256 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field255[var3] != null) {
                this.field255[var3].field433 -= var1 * 20;
            }
        }
        if (this.field256 < this.field257) {
            this.field256 -= var1 * 20;
            this.field257 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("an.f()[B")
    public final byte[] method618() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field255[var2] != null && this.field255[var2].field433 + this.field255[var2].field431 > var1) {
                var1 = this.field255[var2].field433 + this.field255[var2].field431;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field255[var5] != null) {
                int var6 = this.field255[var5].field431 * 22050 / 1000;
                int var7 = this.field255[var5].field433 * 22050 / 1000;
                int[] var8 = this.field255[var5].method974(var6, this.field255[var5].field431);
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
