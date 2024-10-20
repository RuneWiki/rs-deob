package deob;

@ObfuscatedName("bo")
public class class40 {

    @ObfuscatedName("bo.ah")
    public class62[] field247 = new class62[10];

    @ObfuscatedName("bo.ar")
    public int field249;

    @ObfuscatedName("bo.ao")
    public int field250;

    @ObfuscatedName("bo.at(Lol;II)Lbo;")
    public static class40 method755(class371 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6284(arg1, arg2);
        return var3 == null ? null : new class40(new class527(var3));
    }

    public class40(class527 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8410();
            if (var3 != 0) {
                arg0.field5137--;
                this.field247[var2] = new class62();
                this.field247[var2].method1121(arg0);
            }
        }
        this.field249 = arg0.method8412();
        this.field250 = arg0.method8412();
    }

    @ObfuscatedName("bo.ah()Lbt;")
    public class41 method761() {
        byte[] var1 = this.method763();
        return new class41(22050, var1, this.field249 * 22050 / 1000, this.field250 * 22050 / 1000);
    }

    @ObfuscatedName("bo.ar()I")
    public final int method756() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field247[var2] != null && this.field247[var2].field442 / 20 < var1) {
                var1 = this.field247[var2].field442 / 20;
            }
        }
        if (this.field249 < this.field250 && this.field249 / 20 < var1) {
            var1 = this.field249 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field247[var3] != null) {
                this.field247[var3].field442 -= var1 * 20;
            }
        }
        if (this.field249 < this.field250) {
            this.field249 -= var1 * 20;
            this.field250 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bo.ao()[B")
    public final byte[] method763() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field247[var2] != null && this.field247[var2].field442 + this.field247[var2].field441 > var1) {
                var1 = this.field247[var2].field442 + this.field247[var2].field441;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field247[var5] != null) {
                int var6 = this.field247[var5].field441 * 22050 / 1000;
                int var7 = this.field247[var5].field442 * 22050 / 1000;
                int[] var8 = this.field247[var5].method1122(var6, this.field247[var5].field441);
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
