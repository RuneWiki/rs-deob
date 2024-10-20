package deob;

@ObfuscatedName("br")
public class class56 {

    @ObfuscatedName("br.y")
    public class53[] field1178 = new class53[10];

    @ObfuscatedName("br.x")
    public int field1177;

    @ObfuscatedName("br.z")
    public int field1180;

    @ObfuscatedName("br.j(Leh;II)Lbr;")
    public static class56 method1240(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2903(arg1, arg2);
        return var3 == null ? null : new class56(new class126(var3));
    }

    public class56(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2399();
            if (var3 != 0) {
                arg0.field2020--;
                this.field1178[var2] = new class53();
                this.field1178[var2].method1197(arg0);
            }
        }
        this.field1177 = arg0.method2405();
        this.field1180 = arg0.method2405();
    }

    @ObfuscatedName("br.y()Lbb;")
    public class62 method1229() {
        byte[] var1 = this.method1231();
        return new class62(22050, var1, this.field1177 * 22050 / 1000, this.field1180 * 22050 / 1000);
    }

    @ObfuscatedName("br.x()I")
    public final int method1228() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1178[var2] != null && this.field1178[var2].field1136 / 20 < var1) {
                var1 = this.field1178[var2].field1136 / 20;
            }
        }
        if (this.field1177 < this.field1180 && this.field1177 / 20 < var1) {
            var1 = this.field1177 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1178[var3] != null) {
                this.field1178[var3].field1136 -= var1 * 20;
            }
        }
        if (this.field1177 < this.field1180) {
            this.field1177 -= var1 * 20;
            this.field1180 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.z()[B")
    public final byte[] method1231() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1178[var2] != null && this.field1178[var2].field1146 + this.field1178[var2].field1136 > var1) {
                var1 = this.field1178[var2].field1146 + this.field1178[var2].field1136;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1178[var5] != null) {
                int var6 = this.field1178[var5].field1146 * 22050 / 1000;
                int var7 = this.field1178[var5].field1136 * 22050 / 1000;
                int[] var8 = this.field1178[var5].method1195(var6, this.field1178[var5].field1146);
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
