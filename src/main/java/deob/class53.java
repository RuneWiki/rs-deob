package deob;

@ObfuscatedName("bw")
public class class53 {

    @ObfuscatedName("bw.v")
    public class66[] field1131 = new class66[10];

    @ObfuscatedName("bw.k")
    public int field1130;

    @ObfuscatedName("bw.g")
    public int field1133;

    @ObfuscatedName("bw.e(Lep;II)Lbw;")
    public static class53 method1048(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2721(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2122();
            if (var3 != 0) {
                arg0.field1841--;
                this.field1131[var2] = new class66();
                this.field1131[var2].method1318(arg0);
            }
        }
        this.field1130 = arg0.method2124();
        this.field1133 = arg0.method2124();
    }

    @ObfuscatedName("bw.v()Lbr;")
    public class57 method1045() {
        byte[] var1 = this.method1047();
        return new class57(22050, var1, this.field1130 * 22050 / 1000, this.field1133 * 22050 / 1000);
    }

    @ObfuscatedName("bw.k()I")
    public final int method1046() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1131[var2] != null && this.field1131[var2].field1260 / 20 < var1) {
                var1 = this.field1131[var2].field1260 / 20;
            }
        }
        if (this.field1130 < this.field1133 && this.field1130 / 20 < var1) {
            var1 = this.field1130 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1131[var3] != null) {
                this.field1131[var3].field1260 -= var1 * 20;
            }
        }
        if (this.field1130 < this.field1133) {
            this.field1130 -= var1 * 20;
            this.field1133 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.g()[B")
    public final byte[] method1047() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1131[var2] != null && this.field1131[var2].field1260 + this.field1131[var2].field1259 > var1) {
                var1 = this.field1131[var2].field1260 + this.field1131[var2].field1259;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1131[var5] != null) {
                int var6 = this.field1131[var5].field1259 * 22050 / 1000;
                int var7 = this.field1131[var5].field1260 * 22050 / 1000;
                int[] var8 = this.field1131[var5].method1316(var6, this.field1131[var5].field1259);
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
