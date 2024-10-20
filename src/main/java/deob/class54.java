package deob;

@ObfuscatedName("bg")
public class class54 {

    @ObfuscatedName("bg.w")
    public class67[] field1139 = new class67[10];

    @ObfuscatedName("bg.i")
    public int field1138;

    @ObfuscatedName("bg.e")
    public int field1141;

    @ObfuscatedName("bg.n(Lfd;II)Lbg;")
    public static class54 method1084(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2859(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2155();
            if (var3 != 0) {
                arg0.field1888--;
                this.field1139[var2] = new class67();
                this.field1139[var2].method1330(arg0);
            }
        }
        this.field1138 = arg0.method2157();
        this.field1141 = arg0.method2157();
    }

    @ObfuscatedName("bg.w()Lbb;")
    public class58 method1080() {
        byte[] var1 = this.method1087();
        return new class58(22050, var1, this.field1138 * 22050 / 1000, this.field1141 * 22050 / 1000);
    }

    @ObfuscatedName("bg.i()I")
    public final int method1081() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1139[var2] != null && this.field1139[var2].field1268 / 20 < var1) {
                var1 = this.field1139[var2].field1268 / 20;
            }
        }
        if (this.field1138 < this.field1141 && this.field1138 / 20 < var1) {
            var1 = this.field1138 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1139[var3] != null) {
                this.field1139[var3].field1268 -= var1 * 20;
            }
        }
        if (this.field1138 < this.field1141) {
            this.field1138 -= var1 * 20;
            this.field1141 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bg.e()[B")
    public final byte[] method1087() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1139[var2] != null && this.field1139[var2].field1268 + this.field1139[var2].field1267 > var1) {
                var1 = this.field1139[var2].field1268 + this.field1139[var2].field1267;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1139[var5] != null) {
                int var6 = this.field1139[var5].field1267 * 22050 / 1000;
                int var7 = this.field1139[var5].field1268 * 22050 / 1000;
                int[] var8 = this.field1139[var5].method1331(var6, this.field1139[var5].field1267);
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
