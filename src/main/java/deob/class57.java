package deob;

@ObfuscatedName("bh")
public class class57 {

    @ObfuscatedName("bh.c")
    public class54[] field1187 = new class54[10];

    @ObfuscatedName("bh.p")
    public int field1188;

    @ObfuscatedName("bh.z")
    public int field1190;

    @ObfuscatedName("bh.q(Ley;II)Lbh;")
    public static class57 method1281(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2952(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2534();
            if (var3 != 0) {
                arg0.field2039--;
                this.field1187[var2] = new class54();
                this.field1187[var2].method1253(arg0);
            }
        }
        this.field1188 = arg0.method2427();
        this.field1190 = arg0.method2427();
    }

    @ObfuscatedName("bh.c()Lby;")
    public class63 method1274() {
        byte[] var1 = this.method1280();
        return new class63(22050, var1, this.field1188 * 22050 / 1000, this.field1190 * 22050 / 1000);
    }

    @ObfuscatedName("bh.p()I")
    public final int method1275() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1187[var2] != null && this.field1187[var2].field1164 / 20 < var1) {
                var1 = this.field1187[var2].field1164 / 20;
            }
        }
        if (this.field1188 < this.field1190 && this.field1188 / 20 < var1) {
            var1 = this.field1188 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1187[var3] != null) {
                this.field1187[var3].field1164 -= var1 * 20;
            }
        }
        if (this.field1188 < this.field1190) {
            this.field1188 -= var1 * 20;
            this.field1190 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.z()[B")
    public final byte[] method1280() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1187[var2] != null && this.field1187[var2].field1164 + this.field1187[var2].field1143 > var1) {
                var1 = this.field1187[var2].field1164 + this.field1187[var2].field1143;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1187[var5] != null) {
                int var6 = this.field1187[var5].field1143 * 22050 / 1000;
                int var7 = this.field1187[var5].field1164 * 22050 / 1000;
                int[] var8 = this.field1187[var5].method1243(var6, this.field1187[var5].field1143);
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
