package deob;

@ObfuscatedName("ba")
public class class59 {

    @ObfuscatedName("ba.u")
    public class72[] field1222 = new class72[10];

    @ObfuscatedName("ba.x")
    public int field1224;

    @ObfuscatedName("ba.b")
    public int field1223;

    @ObfuscatedName("ba.f(Lfl;II)Lba;")
    public static class59 method1263(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3061(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2385();
            if (var3 != 0) {
                arg0.field1999--;
                this.field1222[var2] = new class72();
                this.field1222[var2].method1509(arg0);
            }
        }
        this.field1224 = arg0.method2387();
        this.field1223 = arg0.method2387();
    }

    @ObfuscatedName("ba.u()Lbe;")
    public class63 method1257() {
        byte[] var1 = this.method1259();
        return new class63(22050, var1, this.field1224 * 22050 / 1000, this.field1223 * 22050 / 1000);
    }

    @ObfuscatedName("ba.x()I")
    public final int method1258() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1222[var2] != null && this.field1222[var2].field1354 / 20 < var1) {
                var1 = this.field1222[var2].field1354 / 20;
            }
        }
        if (this.field1224 < this.field1223 && this.field1224 / 20 < var1) {
            var1 = this.field1224 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1222[var3] != null) {
                this.field1222[var3].field1354 -= var1 * 20;
            }
        }
        if (this.field1224 < this.field1223) {
            this.field1224 -= var1 * 20;
            this.field1223 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ba.b()[B")
    public final byte[] method1259() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1222[var2] != null && this.field1222[var2].field1358 + this.field1222[var2].field1354 > var1) {
                var1 = this.field1222[var2].field1358 + this.field1222[var2].field1354;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1222[var5] != null) {
                int var6 = this.field1222[var5].field1358 * 22050 / 1000;
                int var7 = this.field1222[var5].field1354 * 22050 / 1000;
                int[] var8 = this.field1222[var5].method1516(var6, this.field1222[var5].field1358);
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
