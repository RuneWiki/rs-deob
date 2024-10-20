package deob;

@ObfuscatedName("bd")
public class class59 {

    @ObfuscatedName("bd.q")
    public class72[] field1210 = new class72[10];

    @ObfuscatedName("bd.v")
    public int field1211;

    @ObfuscatedName("bd.n")
    public int field1212;

    @ObfuscatedName("bd.h(Lfv;II)Lbd;")
    public static class59 method1226(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3073(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2383();
            if (var3 != 0) {
                arg0.field1973--;
                this.field1210[var2] = new class72();
                this.field1210[var2].method1478(arg0);
            }
        }
        this.field1211 = arg0.method2385();
        this.field1212 = arg0.method2385();
    }

    @ObfuscatedName("bd.q()Lbl;")
    public class63 method1214() {
        byte[] var1 = this.method1216();
        return new class63(22050, var1, this.field1211 * 22050 / 1000, this.field1212 * 22050 / 1000);
    }

    @ObfuscatedName("bd.v()I")
    public final int method1225() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1210[var2] != null && this.field1210[var2].field1345 / 20 < var1) {
                var1 = this.field1210[var2].field1345 / 20;
            }
        }
        if (this.field1211 < this.field1212 && this.field1211 / 20 < var1) {
            var1 = this.field1211 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1210[var3] != null) {
                this.field1210[var3].field1345 -= var1 * 20;
            }
        }
        if (this.field1211 < this.field1212) {
            this.field1211 -= var1 * 20;
            this.field1212 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.n()[B")
    public final byte[] method1216() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1210[var2] != null && this.field1210[var2].field1345 + this.field1210[var2].field1342 > var1) {
                var1 = this.field1210[var2].field1345 + this.field1210[var2].field1342;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1210[var5] != null) {
                int var6 = this.field1210[var5].field1342 * 22050 / 1000;
                int var7 = this.field1210[var5].field1345 * 22050 / 1000;
                int[] var8 = this.field1210[var5].method1482(var6, this.field1210[var5].field1342);
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
