package deob;

@ObfuscatedName("ba")
public class class59 {

    @ObfuscatedName("ba.v")
    public class72[] field1214 = new class72[10];

    @ObfuscatedName("ba.r")
    public int field1215;

    @ObfuscatedName("ba.n")
    public int field1216;

    @ObfuscatedName("ba.i(Lfe;II)Lba;")
    public static class59 method1240(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3035(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2380();
            if (var3 != 0) {
                arg0.field1980--;
                this.field1214[var2] = new class72();
                this.field1214[var2].method1493(arg0);
            }
        }
        this.field1215 = arg0.method2347();
        this.field1216 = arg0.method2347();
    }

    @ObfuscatedName("ba.v()Lbx;")
    public class63 method1235() {
        byte[] var1 = this.method1237();
        return new class63(22050, var1, this.field1215 * 22050 / 1000, this.field1216 * 22050 / 1000);
    }

    @ObfuscatedName("ba.r()I")
    public final int method1236() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field1348 / 20 < var1) {
                var1 = this.field1214[var2].field1348 / 20;
            }
        }
        if (this.field1215 < this.field1216 && this.field1215 / 20 < var1) {
            var1 = this.field1215 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1214[var3] != null) {
                this.field1214[var3].field1348 -= var1 * 20;
            }
        }
        if (this.field1215 < this.field1216) {
            this.field1215 -= var1 * 20;
            this.field1216 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ba.n()[B")
    public final byte[] method1237() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field1348 + this.field1214[var2].field1340 > var1) {
                var1 = this.field1214[var2].field1348 + this.field1214[var2].field1340;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1214[var5] != null) {
                int var6 = this.field1214[var5].field1340 * 22050 / 1000;
                int var7 = this.field1214[var5].field1348 * 22050 / 1000;
                int[] var8 = this.field1214[var5].method1486(var6, this.field1214[var5].field1340);
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
