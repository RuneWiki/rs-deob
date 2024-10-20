package deob;

@ObfuscatedName("bt")
public class class56 {

    @ObfuscatedName("bt.h")
    public class53[] field1194 = new class53[10];

    @ObfuscatedName("bt.c")
    public int field1196;

    @ObfuscatedName("bt.p")
    public int field1195;

    @ObfuscatedName("bt.z(Len;II)Lbt;")
    public static class56 method1245(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2951(arg1, arg2);
        return var3 == null ? null : new class56(new class126(var3));
    }

    public class56(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2450();
            if (var3 != 0) {
                arg0.field2003--;
                this.field1194[var2] = new class53();
                this.field1194[var2].method1216(arg0);
            }
        }
        this.field1196 = arg0.method2627();
        this.field1195 = arg0.method2627();
    }

    @ObfuscatedName("bt.h()Lbe;")
    public class62 method1250() {
        byte[] var1 = this.method1246();
        return new class62(22050, var1, this.field1196 * 22050 / 1000, this.field1195 * 22050 / 1000);
    }

    @ObfuscatedName("bt.c()I")
    public final int method1247() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1194[var2] != null && this.field1194[var2].field1162 / 20 < var1) {
                var1 = this.field1194[var2].field1162 / 20;
            }
        }
        if (this.field1196 < this.field1195 && this.field1196 / 20 < var1) {
            var1 = this.field1196 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1194[var3] != null) {
                this.field1194[var3].field1162 -= var1 * 20;
            }
        }
        if (this.field1196 < this.field1195) {
            this.field1196 -= var1 * 20;
            this.field1195 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bt.p()[B")
    public final byte[] method1246() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1194[var2] != null && this.field1194[var2].field1162 + this.field1194[var2].field1161 > var1) {
                var1 = this.field1194[var2].field1162 + this.field1194[var2].field1161;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1194[var5] != null) {
                int var6 = this.field1194[var5].field1161 * 22050 / 1000;
                int var7 = this.field1194[var5].field1162 * 22050 / 1000;
                int[] var8 = this.field1194[var5].method1214(var6, this.field1194[var5].field1161);
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
