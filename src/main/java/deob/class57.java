package deob;

@ObfuscatedName("bn")
public class class57 {

    @ObfuscatedName("bn.m")
    public class54[] field1187 = new class54[10];

    @ObfuscatedName("bn.v")
    public int field1189;

    @ObfuscatedName("bn.r")
    public int field1190;

    @ObfuscatedName("bn.g(Leo;II)Lbn;")
    public static class57 method1266(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2968(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2414();
            if (var3 != 0) {
                arg0.field2023--;
                this.field1187[var2] = new class54();
                this.field1187[var2].method1236(arg0);
            }
        }
        this.field1189 = arg0.method2416();
        this.field1190 = arg0.method2416();
    }

    @ObfuscatedName("bn.m()Lbd;")
    public class63 method1259() {
        byte[] var1 = this.method1263();
        return new class63(22050, var1, this.field1189 * 22050 / 1000, this.field1190 * 22050 / 1000);
    }

    @ObfuscatedName("bn.v()I")
    public final int method1262() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1187[var2] != null && this.field1187[var2].field1156 / 20 < var1) {
                var1 = this.field1187[var2].field1156 / 20;
            }
        }
        if (this.field1189 < this.field1190 && this.field1189 / 20 < var1) {
            var1 = this.field1189 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1187[var3] != null) {
                this.field1187[var3].field1156 -= var1 * 20;
            }
        }
        if (this.field1189 < this.field1190) {
            this.field1189 -= var1 * 20;
            this.field1190 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bn.r()[B")
    public final byte[] method1263() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1187[var2] != null && this.field1187[var2].field1156 + this.field1187[var2].field1155 > var1) {
                var1 = this.field1187[var2].field1156 + this.field1187[var2].field1155;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1187[var5] != null) {
                int var6 = this.field1187[var5].field1155 * 22050 / 1000;
                int var7 = this.field1187[var5].field1156 * 22050 / 1000;
                int[] var8 = this.field1187[var5].method1237(var6, this.field1187[var5].field1155);
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
