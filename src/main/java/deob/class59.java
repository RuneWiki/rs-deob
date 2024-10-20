package deob;

@ObfuscatedName("bd")
public class class59 {

    @ObfuscatedName("bd.f")
    public class72[] field1207 = new class72[10];

    @ObfuscatedName("bd.i")
    public int field1208;

    @ObfuscatedName("bd.d")
    public int field1209;

    @ObfuscatedName("bd.v(Lfh;II)Lbd;")
    public static class59 method1211(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3082(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2400();
            if (var3 != 0) {
                arg0.field1984--;
                this.field1207[var2] = new class72();
                this.field1207[var2].method1468(arg0);
            }
        }
        this.field1208 = arg0.method2334();
        this.field1209 = arg0.method2334();
    }

    @ObfuscatedName("bd.f()Lbu;")
    public class63 method1208() {
        byte[] var1 = this.method1216();
        return new class63(22050, var1, this.field1208 * 22050 / 1000, this.field1209 * 22050 / 1000);
    }

    @ObfuscatedName("bd.i()I")
    public final int method1209() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1207[var2] != null && this.field1207[var2].field1335 / 20 < var1) {
                var1 = this.field1207[var2].field1335 / 20;
            }
        }
        if (this.field1208 < this.field1209 && this.field1208 / 20 < var1) {
            var1 = this.field1208 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1207[var3] != null) {
                this.field1207[var3].field1335 -= var1 * 20;
            }
        }
        if (this.field1208 < this.field1209) {
            this.field1208 -= var1 * 20;
            this.field1209 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.d()[B")
    public final byte[] method1216() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1207[var2] != null && this.field1207[var2].field1335 + this.field1207[var2].field1334 > var1) {
                var1 = this.field1207[var2].field1335 + this.field1207[var2].field1334;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1207[var5] != null) {
                int var6 = this.field1207[var5].field1334 * 22050 / 1000;
                int var7 = this.field1207[var5].field1335 * 22050 / 1000;
                int[] var8 = this.field1207[var5].method1466(var6, this.field1207[var5].field1334);
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
