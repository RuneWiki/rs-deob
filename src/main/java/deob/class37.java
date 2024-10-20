package deob;

@ObfuscatedName("ac")
public class class37 {

    @ObfuscatedName("ac.l")
    public class55[] field268 = new class55[10];

    @ObfuscatedName("ac.s")
    public int field267;

    @ObfuscatedName("ac.e")
    public int field270;

    @ObfuscatedName("ac.c(Lkq;II)Lac;")
    public static class37 method668(class307 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5066(arg1, arg2);
        return var3 == null ? null : new class37(new class421(var3));
    }

    public class37(class421 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6686();
            if (var3 != 0) {
                arg0.field4512--;
                this.field268[var2] = new class55();
                this.field268[var2].method998(arg0);
            }
        }
        this.field267 = arg0.method6666();
        this.field270 = arg0.method6666();
    }

    @ObfuscatedName("ac.l()Lab;")
    public class38 method672() {
        byte[] var1 = this.method671();
        return new class38(22050, var1, this.field267 * 22050 / 1000, this.field270 * 22050 / 1000);
    }

    @ObfuscatedName("ac.s()I")
    public final int method670() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field268[var2] != null && this.field268[var2].field447 / 20 < var1) {
                var1 = this.field268[var2].field447 / 20;
            }
        }
        if (this.field267 < this.field270 && this.field267 / 20 < var1) {
            var1 = this.field267 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field268[var3] != null) {
                this.field268[var3].field447 -= var1 * 20;
            }
        }
        if (this.field267 < this.field270) {
            this.field267 -= var1 * 20;
            this.field270 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ac.e()[B")
    public final byte[] method671() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field268[var2] != null && this.field268[var2].field449 + this.field268[var2].field447 > var1) {
                var1 = this.field268[var2].field449 + this.field268[var2].field447;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field268[var5] != null) {
                int var6 = this.field268[var5].field449 * 22050 / 1000;
                int var7 = this.field268[var5].field447 * 22050 / 1000;
                int[] var8 = this.field268[var5].method996(var6, this.field268[var5].field449);
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
