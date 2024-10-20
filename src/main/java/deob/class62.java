package deob;

@ObfuscatedName("bu")
public class class62 {

    @ObfuscatedName("bu.q")
    public class75[] field1271 = new class75[10];

    @ObfuscatedName("bu.f")
    public int field1270;

    @ObfuscatedName("bu.c")
    public int field1272;

    @ObfuscatedName("bu.k(Lfo;II)Lbu;")
    public static class62 method1258(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3097(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2427();
            if (var3 != 0) {
                arg0.field2060--;
                this.field1271[var2] = new class75();
                this.field1271[var2].method1527(arg0);
            }
        }
        this.field1270 = arg0.method2547();
        this.field1272 = arg0.method2547();
    }

    @ObfuscatedName("bu.q()Lbe;")
    public class66 method1250() {
        byte[] var1 = this.method1252();
        return new class66(22050, var1, this.field1270 * 22050 / 1000, this.field1272 * 22050 / 1000);
    }

    @ObfuscatedName("bu.f()I")
    public final int method1251() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1271[var2] != null && this.field1271[var2].field1397 / 20 < var1) {
                var1 = this.field1271[var2].field1397 / 20;
            }
        }
        if (this.field1270 < this.field1272 && this.field1270 / 20 < var1) {
            var1 = this.field1270 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1271[var3] != null) {
                this.field1271[var3].field1397 -= var1 * 20;
            }
        }
        if (this.field1270 < this.field1272) {
            this.field1270 -= var1 * 20;
            this.field1272 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.c()[B")
    public final byte[] method1252() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1271[var2] != null && this.field1271[var2].field1397 + this.field1271[var2].field1395 > var1) {
                var1 = this.field1271[var2].field1397 + this.field1271[var2].field1395;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1271[var5] != null) {
                int var6 = this.field1271[var5].field1395 * 22050 / 1000;
                int var7 = this.field1271[var5].field1397 * 22050 / 1000;
                int[] var8 = this.field1271[var5].method1526(var6, this.field1271[var5].field1395);
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
