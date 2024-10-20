package deob;

@ObfuscatedName("ak")
public class class41 {

    @ObfuscatedName("ak.e")
    public class59[] field293 = new class59[10];

    @ObfuscatedName("ak.v")
    public int field292;

    @ObfuscatedName("ak.x")
    public int field295;

    @ObfuscatedName("ak.h(Lly;II)Lak;")
    public static class41 method747(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5909(arg1, arg2);
        return var3 == null ? null : new class41(new class467(var3));
    }

    public class41(class467 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7792();
            if (var3 != 0) {
                arg0.field4915--;
                this.field293[var2] = new class59();
                this.field293[var2].method1077(arg0);
            }
        }
        this.field292 = arg0.method7794();
        this.field295 = arg0.method7794();
    }

    @ObfuscatedName("ak.e()Laf;")
    public class42 method749() {
        byte[] var1 = this.method751();
        return new class42(22050, var1, this.field292 * 22050 / 1000, this.field295 * 22050 / 1000);
    }

    @ObfuscatedName("ak.v()I")
    public final int method750() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field293[var2] != null && this.field293[var2].field469 / 20 < var1) {
                var1 = this.field293[var2].field469 / 20;
            }
        }
        if (this.field292 < this.field295 && this.field292 / 20 < var1) {
            var1 = this.field292 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field293[var3] != null) {
                this.field293[var3].field469 -= var1 * 20;
            }
        }
        if (this.field292 < this.field295) {
            this.field292 -= var1 * 20;
            this.field295 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ak.x()[B")
    public final byte[] method751() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field293[var2] != null && this.field293[var2].field469 + this.field293[var2].field468 > var1) {
                var1 = this.field293[var2].field469 + this.field293[var2].field468;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field293[var5] != null) {
                int var6 = this.field293[var5].field468 * 22050 / 1000;
                int var7 = this.field293[var5].field469 * 22050 / 1000;
                int[] var8 = this.field293[var5].method1087(var6, this.field293[var5].field468);
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
