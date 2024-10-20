package deob;

@ObfuscatedName("bf")
public class class57 {

    @ObfuscatedName("bf.l")
    public class54[] field1196 = new class54[10];

    @ObfuscatedName("bf.d")
    public int field1197;

    @ObfuscatedName("bf.x")
    public int field1195;

    @ObfuscatedName("bf.p(Leh;II)Lbf;")
    public static class57 method1299(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3078(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2498();
            if (var3 != 0) {
                arg0.field2030--;
                this.field1196[var2] = new class54();
                this.field1196[var2].method1275(arg0);
            }
        }
        this.field1197 = arg0.method2581();
        this.field1195 = arg0.method2581();
    }

    @ObfuscatedName("bf.l()Lbx;")
    public class63 method1304() {
        byte[] var1 = this.method1302();
        return new class63(22050, var1, this.field1197 * 22050 / 1000, this.field1195 * 22050 / 1000);
    }

    @ObfuscatedName("bf.d()I")
    public final int method1301() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1196[var2] != null && this.field1196[var2].field1167 / 20 < var1) {
                var1 = this.field1196[var2].field1167 / 20;
            }
        }
        if (this.field1197 < this.field1195 && this.field1197 / 20 < var1) {
            var1 = this.field1197 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1196[var3] != null) {
                this.field1196[var3].field1167 -= var1 * 20;
            }
        }
        if (this.field1197 < this.field1195) {
            this.field1197 -= var1 * 20;
            this.field1195 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.x()[B")
    public final byte[] method1302() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1196[var2] != null && this.field1196[var2].field1167 + this.field1196[var2].field1162 > var1) {
                var1 = this.field1196[var2].field1167 + this.field1196[var2].field1162;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1196[var5] != null) {
                int var6 = this.field1196[var5].field1162 * 22050 / 1000;
                int var7 = this.field1196[var5].field1167 * 22050 / 1000;
                int[] var8 = this.field1196[var5].method1274(var6, this.field1196[var5].field1162);
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
