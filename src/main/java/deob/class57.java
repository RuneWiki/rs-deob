package deob;

@ObfuscatedName("bk")
public class class57 {

    @ObfuscatedName("bk.r")
    public class54[] field1194 = new class54[10];

    @ObfuscatedName("bk.v")
    public int field1193;

    @ObfuscatedName("bk.p")
    public int field1192;

    @ObfuscatedName("bk.j(Lez;II)Lbk;")
    public static class57 method1254(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3016(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2441();
            if (var3 != 0) {
                arg0.field2022--;
                this.field1194[var2] = new class54();
                this.field1194[var2].method1231(arg0);
            }
        }
        this.field1193 = arg0.method2609();
        this.field1192 = arg0.method2609();
    }

    @ObfuscatedName("bk.r()Lbx;")
    public class63 method1260() {
        byte[] var1 = this.method1256();
        return new class63(22050, var1, this.field1193 * 22050 / 1000, this.field1192 * 22050 / 1000);
    }

    @ObfuscatedName("bk.v()I")
    public final int method1255() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1194[var2] != null && this.field1194[var2].field1160 / 20 < var1) {
                var1 = this.field1194[var2].field1160 / 20;
            }
        }
        if (this.field1193 < this.field1192 && this.field1193 / 20 < var1) {
            var1 = this.field1193 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1194[var3] != null) {
                this.field1194[var3].field1160 -= var1 * 20;
            }
        }
        if (this.field1193 < this.field1192) {
            this.field1193 -= var1 * 20;
            this.field1192 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bk.p()[B")
    public final byte[] method1256() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1194[var2] != null && this.field1194[var2].field1160 + this.field1194[var2].field1158 > var1) {
                var1 = this.field1194[var2].field1160 + this.field1194[var2].field1158;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1194[var5] != null) {
                int var6 = this.field1194[var5].field1158 * 22050 / 1000;
                int var7 = this.field1194[var5].field1160 * 22050 / 1000;
                int[] var8 = this.field1194[var5].method1224(var6, this.field1194[var5].field1158);
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
