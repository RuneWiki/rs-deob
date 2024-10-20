package deob;

@ObfuscatedName("bw")
public class class59 {

    @ObfuscatedName("bw.q")
    public class72[] field1204 = new class72[10];

    @ObfuscatedName("bw.c")
    public int field1205;

    @ObfuscatedName("bw.l")
    public int field1203;

    @ObfuscatedName("bw.n(Lfm;II)Lbw;")
    public static class59 method1224(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3094(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2360();
            if (var3 != 0) {
                arg0.field1982--;
                this.field1204[var2] = new class72();
                this.field1204[var2].method1478(arg0);
            }
        }
        this.field1205 = arg0.method2430();
        this.field1203 = arg0.method2430();
    }

    @ObfuscatedName("bw.q()Lbk;")
    public class63 method1225() {
        byte[] var1 = this.method1227();
        return new class63(22050, var1, this.field1205 * 22050 / 1000, this.field1203 * 22050 / 1000);
    }

    @ObfuscatedName("bw.c()I")
    public final int method1226() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1330 / 20 < var1) {
                var1 = this.field1204[var2].field1330 / 20;
            }
        }
        if (this.field1205 < this.field1203 && this.field1205 / 20 < var1) {
            var1 = this.field1205 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1204[var3] != null) {
                this.field1204[var3].field1330 -= var1 * 20;
            }
        }
        if (this.field1205 < this.field1203) {
            this.field1205 -= var1 * 20;
            this.field1203 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.l()[B")
    public final byte[] method1227() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1330 + this.field1204[var2].field1329 > var1) {
                var1 = this.field1204[var2].field1330 + this.field1204[var2].field1329;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1204[var5] != null) {
                int var6 = this.field1204[var5].field1329 * 22050 / 1000;
                int var7 = this.field1204[var5].field1330 * 22050 / 1000;
                int[] var8 = this.field1204[var5].method1475(var6, this.field1204[var5].field1329);
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
