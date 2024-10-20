package deob;

@ObfuscatedName("bg")
public class class59 {

    @ObfuscatedName("bg.x")
    public class72[] field1217 = new class72[10];

    @ObfuscatedName("bg.t")
    public int field1219;

    @ObfuscatedName("bg.p")
    public int field1218;

    @ObfuscatedName("bg.w(Lfx;II)Lbg;")
    public static class59 method1216(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3127(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2363();
            if (var3 != 0) {
                arg0.field2012--;
                this.field1217[var2] = new class72();
                this.field1217[var2].method1469(arg0);
            }
        }
        this.field1219 = arg0.method2365();
        this.field1218 = arg0.method2365();
    }

    @ObfuscatedName("bg.x()Lbm;")
    public class63 method1226() {
        byte[] var1 = this.method1219();
        return new class63(22050, var1, this.field1219 * 22050 / 1000, this.field1218 * 22050 / 1000);
    }

    @ObfuscatedName("bg.t()I")
    public final int method1227() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1217[var2] != null && this.field1217[var2].field1330 / 20 < var1) {
                var1 = this.field1217[var2].field1330 / 20;
            }
        }
        if (this.field1219 < this.field1218 && this.field1219 / 20 < var1) {
            var1 = this.field1219 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1217[var3] != null) {
                this.field1217[var3].field1330 -= var1 * 20;
            }
        }
        if (this.field1219 < this.field1218) {
            this.field1219 -= var1 * 20;
            this.field1218 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bg.p()[B")
    public final byte[] method1219() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1217[var2] != null && this.field1217[var2].field1343 + this.field1217[var2].field1330 > var1) {
                var1 = this.field1217[var2].field1343 + this.field1217[var2].field1330;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1217[var5] != null) {
                int var6 = this.field1217[var5].field1343 * 22050 / 1000;
                int var7 = this.field1217[var5].field1330 * 22050 / 1000;
                int[] var8 = this.field1217[var5].method1470(var6, this.field1217[var5].field1343);
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
