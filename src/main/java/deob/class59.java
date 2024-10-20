package deob;

@ObfuscatedName("bi")
public class class59 {

    @ObfuscatedName("bi.j")
    public class72[] field1220 = new class72[10];

    @ObfuscatedName("bi.p")
    public int field1217;

    @ObfuscatedName("bi.x")
    public int field1219;

    @ObfuscatedName("bi.s(Lfa;II)Lbi;")
    public static class59 method1187(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3014(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2338();
            if (var3 != 0) {
                arg0.field2006--;
                this.field1220[var2] = new class72();
                this.field1220[var2].method1443(arg0);
            }
        }
        this.field1217 = arg0.method2430();
        this.field1219 = arg0.method2430();
    }

    @ObfuscatedName("bi.j()Lba;")
    public class63 method1181() {
        byte[] var1 = this.method1185();
        return new class63(22050, var1, this.field1217 * 22050 / 1000, this.field1219 * 22050 / 1000);
    }

    @ObfuscatedName("bi.p()I")
    public final int method1184() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1220[var2] != null && this.field1220[var2].field1344 / 20 < var1) {
                var1 = this.field1220[var2].field1344 / 20;
            }
        }
        if (this.field1217 < this.field1219 && this.field1217 / 20 < var1) {
            var1 = this.field1217 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1220[var3] != null) {
                this.field1220[var3].field1344 -= var1 * 20;
            }
        }
        if (this.field1217 < this.field1219) {
            this.field1217 -= var1 * 20;
            this.field1219 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.x()[B")
    public final byte[] method1185() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1220[var2] != null && this.field1220[var2].field1344 + this.field1220[var2].field1343 > var1) {
                var1 = this.field1220[var2].field1344 + this.field1220[var2].field1343;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1220[var5] != null) {
                int var6 = this.field1220[var5].field1343 * 22050 / 1000;
                int var7 = this.field1220[var5].field1344 * 22050 / 1000;
                int[] var8 = this.field1220[var5].method1442(var6, this.field1220[var5].field1343);
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
