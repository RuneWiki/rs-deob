package deob;

@ObfuscatedName("ap")
public class class52 {

    @ObfuscatedName("ap.c")
    public class65[] field1118 = new class65[10];

    @ObfuscatedName("ap.h")
    public int field1119;

    @ObfuscatedName("ap.v")
    public int field1117;

    @ObfuscatedName("ap.i(Ler;II)Lap;")
    public static class52 method1049(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2151();
            if (var3 != 0) {
                arg0.field1837--;
                this.field1118[var2] = new class65();
                this.field1118[var2].method1319(arg0);
            }
        }
        this.field1119 = arg0.method2313();
        this.field1117 = arg0.method2313();
    }

    @ObfuscatedName("ap.c()Lbg;")
    public class56 method1045() {
        byte[] var1 = this.method1047();
        return new class56(22050, var1, this.field1119 * 22050 / 1000, this.field1117 * 22050 / 1000);
    }

    @ObfuscatedName("ap.h()I")
    public final int method1046() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1118[var2] != null && this.field1118[var2].field1253 / 20 < var1) {
                var1 = this.field1118[var2].field1253 / 20;
            }
        }
        if (this.field1119 < this.field1117 && this.field1119 / 20 < var1) {
            var1 = this.field1119 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1118[var3] != null) {
                this.field1118[var3].field1253 -= var1 * 20;
            }
        }
        if (this.field1119 < this.field1117) {
            this.field1119 -= var1 * 20;
            this.field1117 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ap.v()[B")
    public final byte[] method1047() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1118[var2] != null && this.field1118[var2].field1253 + this.field1118[var2].field1234 > var1) {
                var1 = this.field1118[var2].field1253 + this.field1118[var2].field1234;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1118[var5] != null) {
                int var6 = this.field1118[var5].field1234 * 22050 / 1000;
                int var7 = this.field1118[var5].field1253 * 22050 / 1000;
                int[] var8 = this.field1118[var5].method1315(var6, this.field1118[var5].field1234);
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
