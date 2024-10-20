package deob;

@ObfuscatedName("bc")
public class class59 {

    @ObfuscatedName("bc.q")
    public class72[] field1210 = new class72[10];

    @ObfuscatedName("bc.k")
    public int field1211;

    @ObfuscatedName("bc.f")
    public int field1212;

    @ObfuscatedName("bc.z(Lfl;II)Lbc;")
    public static class59 method1181(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2986(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2457();
            if (var3 != 0) {
                arg0.field1986--;
                this.field1210[var2] = new class72();
                this.field1210[var2].method1432(arg0);
            }
        }
        this.field1211 = arg0.method2415();
        this.field1212 = arg0.method2415();
    }

    @ObfuscatedName("bc.q()Lba;")
    public class63 method1182() {
        byte[] var1 = this.method1174();
        return new class63(22050, var1, this.field1211 * 22050 / 1000, this.field1212 * 22050 / 1000);
    }

    @ObfuscatedName("bc.k()I")
    public final int method1173() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1210[var2] != null && this.field1210[var2].field1334 / 20 < var1) {
                var1 = this.field1210[var2].field1334 / 20;
            }
        }
        if (this.field1211 < this.field1212 && this.field1211 / 20 < var1) {
            var1 = this.field1211 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1210[var3] != null) {
                this.field1210[var3].field1334 -= var1 * 20;
            }
        }
        if (this.field1211 < this.field1212) {
            this.field1211 -= var1 * 20;
            this.field1212 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bc.f()[B")
    public final byte[] method1174() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1210[var2] != null && this.field1210[var2].field1334 + this.field1210[var2].field1333 > var1) {
                var1 = this.field1210[var2].field1334 + this.field1210[var2].field1333;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1210[var5] != null) {
                int var6 = this.field1210[var5].field1333 * 22050 / 1000;
                int var7 = this.field1210[var5].field1334 * 22050 / 1000;
                int[] var8 = this.field1210[var5].method1437(var6, this.field1210[var5].field1333);
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
