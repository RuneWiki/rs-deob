package deob;

@ObfuscatedName("bu")
public class class57 {

    @ObfuscatedName("bu.h")
    public class54[] field1199 = new class54[10];

    @ObfuscatedName("bu.s")
    public int field1201;

    @ObfuscatedName("bu.o")
    public int field1200;

    @ObfuscatedName("bu.g(Leu;II)Lbu;")
    public static class57 method1276(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2499();
            if (var3 != 0) {
                arg0.field2027--;
                this.field1199[var2] = new class54();
                this.field1199[var2].method1247(arg0);
            }
        }
        this.field1201 = arg0.method2501();
        this.field1200 = arg0.method2501();
    }

    @ObfuscatedName("bu.h()Lbk;")
    public class63 method1274() {
        byte[] var1 = this.method1281();
        return new class63(22050, var1, this.field1201 * 22050 / 1000, this.field1200 * 22050 / 1000);
    }

    @ObfuscatedName("bu.s()I")
    public final int method1275() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field1165 / 20 < var1) {
                var1 = this.field1199[var2].field1165 / 20;
            }
        }
        if (this.field1201 < this.field1200 && this.field1201 / 20 < var1) {
            var1 = this.field1201 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1199[var3] != null) {
                this.field1199[var3].field1165 -= var1 * 20;
            }
        }
        if (this.field1201 < this.field1200) {
            this.field1201 -= var1 * 20;
            this.field1200 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.o()[B")
    public final byte[] method1281() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field1165 + this.field1199[var2].field1164 > var1) {
                var1 = this.field1199[var2].field1165 + this.field1199[var2].field1164;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1199[var5] != null) {
                int var6 = this.field1199[var5].field1164 * 22050 / 1000;
                int var7 = this.field1199[var5].field1165 * 22050 / 1000;
                int[] var8 = this.field1199[var5].method1245(var6, this.field1199[var5].field1164);
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
