package deob;

@ObfuscatedName("bk")
public class class53 {

    @ObfuscatedName("bk.v")
    public class66[] field1117 = new class66[10];

    @ObfuscatedName("bk.m")
    public int field1115;

    @ObfuscatedName("bk.e")
    public int field1118;

    @ObfuscatedName("bk.x(Ley;II)Lbk;")
    public static class53 method1075(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2751(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2299();
            if (var3 != 0) {
                arg0.field1841--;
                this.field1117[var2] = new class66();
                this.field1117[var2].method1319(arg0);
            }
        }
        this.field1115 = arg0.method2129();
        this.field1118 = arg0.method2129();
    }

    @ObfuscatedName("bk.v()Lbn;")
    public class57 method1068() {
        byte[] var1 = this.method1070();
        return new class57(22050, var1, this.field1115 * 22050 / 1000, this.field1118 * 22050 / 1000);
    }

    @ObfuscatedName("bk.m()I")
    public final int method1069() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1117[var2] != null && this.field1117[var2].field1251 / 20 < var1) {
                var1 = this.field1117[var2].field1251 / 20;
            }
        }
        if (this.field1115 < this.field1118 && this.field1115 / 20 < var1) {
            var1 = this.field1115 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1117[var3] != null) {
                this.field1117[var3].field1251 -= var1 * 20;
            }
        }
        if (this.field1115 < this.field1118) {
            this.field1115 -= var1 * 20;
            this.field1118 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bk.e()[B")
    public final byte[] method1070() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1117[var2] != null && this.field1117[var2].field1251 + this.field1117[var2].field1244 > var1) {
                var1 = this.field1117[var2].field1251 + this.field1117[var2].field1244;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1117[var5] != null) {
                int var6 = this.field1117[var5].field1244 * 22050 / 1000;
                int var7 = this.field1117[var5].field1251 * 22050 / 1000;
                int[] var8 = this.field1117[var5].method1326(var6, this.field1117[var5].field1244);
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
