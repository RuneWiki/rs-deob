package deob;

@ObfuscatedName("bx")
public class class59 {

    @ObfuscatedName("bx.s")
    public class72[] field1216 = new class72[10];

    @ObfuscatedName("bx.q")
    public int field1215;

    @ObfuscatedName("bx.g")
    public int field1218;

    @ObfuscatedName("bx.f(Lfx;II)Lbx;")
    public static class59 method1219(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3038(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2363();
            if (var3 != 0) {
                arg0.field1994--;
                this.field1216[var2] = new class72();
                this.field1216[var2].method1487(arg0);
            }
        }
        this.field1215 = arg0.method2353();
        this.field1218 = arg0.method2353();
    }

    @ObfuscatedName("bx.s()Lbf;")
    public class63 method1213() {
        byte[] var1 = this.method1215();
        return new class63(22050, var1, this.field1215 * 22050 / 1000, this.field1218 * 22050 / 1000);
    }

    @ObfuscatedName("bx.q()I")
    public final int method1214() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1216[var2] != null && this.field1216[var2].field1343 / 20 < var1) {
                var1 = this.field1216[var2].field1343 / 20;
            }
        }
        if (this.field1215 < this.field1218 && this.field1215 / 20 < var1) {
            var1 = this.field1215 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1216[var3] != null) {
                this.field1216[var3].field1343 -= var1 * 20;
            }
        }
        if (this.field1215 < this.field1218) {
            this.field1215 -= var1 * 20;
            this.field1218 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bx.g()[B")
    public final byte[] method1215() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1216[var2] != null && this.field1216[var2].field1343 + this.field1216[var2].field1342 > var1) {
                var1 = this.field1216[var2].field1343 + this.field1216[var2].field1342;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1216[var5] != null) {
                int var6 = this.field1216[var5].field1342 * 22050 / 1000;
                int var7 = this.field1216[var5].field1343 * 22050 / 1000;
                int[] var8 = this.field1216[var5].method1481(var6, this.field1216[var5].field1342);
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
