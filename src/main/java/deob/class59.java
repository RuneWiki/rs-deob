package deob;

@ObfuscatedName("by")
public class class59 {

    @ObfuscatedName("by.r")
    public class72[] field1209 = new class72[10];

    @ObfuscatedName("by.f")
    public int field1210;

    @ObfuscatedName("by.s")
    public int field1211;

    @ObfuscatedName("by.a(Lfz;II)Lby;")
    public static class59 method1224(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3025(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2412();
            if (var3 != 0) {
                arg0.field1980--;
                this.field1209[var2] = new class72();
                this.field1209[var2].method1489(arg0);
            }
        }
        this.field1210 = arg0.method2347();
        this.field1211 = arg0.method2347();
    }

    @ObfuscatedName("by.r()Lbl;")
    public class63 method1222() {
        byte[] var1 = this.method1218();
        return new class63(22050, var1, this.field1210 * 22050 / 1000, this.field1211 * 22050 / 1000);
    }

    @ObfuscatedName("by.f()I")
    public final int method1217() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1209[var2] != null && this.field1209[var2].field1336 / 20 < var1) {
                var1 = this.field1209[var2].field1336 / 20;
            }
        }
        if (this.field1210 < this.field1211 && this.field1210 / 20 < var1) {
            var1 = this.field1210 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1209[var3] != null) {
                this.field1209[var3].field1336 -= var1 * 20;
            }
        }
        if (this.field1210 < this.field1211) {
            this.field1210 -= var1 * 20;
            this.field1211 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("by.s()[B")
    public final byte[] method1218() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1209[var2] != null && this.field1209[var2].field1337 + this.field1209[var2].field1336 > var1) {
                var1 = this.field1209[var2].field1337 + this.field1209[var2].field1336;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1209[var5] != null) {
                int var6 = this.field1209[var5].field1337 * 22050 / 1000;
                int var7 = this.field1209[var5].field1336 * 22050 / 1000;
                int[] var8 = this.field1209[var5].method1483(var6, this.field1209[var5].field1337);
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
