package deob;

@ObfuscatedName("an")
public class class52 {

    @ObfuscatedName("an.o")
    public class65[] field1117 = new class65[10];

    @ObfuscatedName("an.y")
    public int field1116;

    @ObfuscatedName("an.b")
    public int field1119;

    @ObfuscatedName("an.e(Lez;II)Lan;")
    public static class52 method1017(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2709(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2123();
            if (var3 != 0) {
                arg0.field1841--;
                this.field1117[var2] = new class65();
                this.field1117[var2].method1285(arg0);
            }
        }
        this.field1116 = arg0.method2232();
        this.field1119 = arg0.method2232();
    }

    @ObfuscatedName("an.o()Lbt;")
    public class56 method1019() {
        byte[] var1 = this.method1029();
        return new class56(22050, var1, this.field1116 * 22050 / 1000, this.field1119 * 22050 / 1000);
    }

    @ObfuscatedName("an.y()I")
    public final int method1020() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1117[var2] != null && this.field1117[var2].field1235 / 20 < var1) {
                var1 = this.field1117[var2].field1235 / 20;
            }
        }
        if (this.field1116 < this.field1119 && this.field1116 / 20 < var1) {
            var1 = this.field1116 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1117[var3] != null) {
                this.field1117[var3].field1235 -= var1 * 20;
            }
        }
        if (this.field1116 < this.field1119) {
            this.field1116 -= var1 * 20;
            this.field1119 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("an.b()[B")
    public final byte[] method1029() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1117[var2] != null && this.field1117[var2].field1244 + this.field1117[var2].field1235 > var1) {
                var1 = this.field1117[var2].field1244 + this.field1117[var2].field1235;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1117[var5] != null) {
                int var6 = this.field1117[var5].field1244 * 22050 / 1000;
                int var7 = this.field1117[var5].field1235 * 22050 / 1000;
                int[] var8 = this.field1117[var5].method1292(var6, this.field1117[var5].field1244);
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
