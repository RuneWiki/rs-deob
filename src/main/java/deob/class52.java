package deob;

@ObfuscatedName("ap")
public class class52 {

    @ObfuscatedName("ap.t")
    public int field1101;

    @ObfuscatedName("ap.f")
    public class65[] field1102 = new class65[10];

    @ObfuscatedName("ap.e")
    public int field1099;

    @ObfuscatedName("ap.t(Leg;II)Lap;")
    public static class52 method1014(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2709(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2101();
            if (var3 != 0) {
                arg0.field1830--;
                this.field1102[var2] = new class65();
                this.field1102[var2].method1288(arg0);
            }
        }
        this.field1101 = arg0.method2103();
        this.field1099 = arg0.method2103();
    }

    @ObfuscatedName("ap.s()Lba;")
    public class56 method1010() {
        byte[] var1 = this.method1012();
        return new class56(22050, var1, this.field1101 * 22050 / 1000, this.field1099 * 22050 / 1000);
    }

    @ObfuscatedName("ap.f()I")
    public final int method1011() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1102[var2] != null && this.field1102[var2].field1220 / 20 < var1) {
                var1 = this.field1102[var2].field1220 / 20;
            }
        }
        if (this.field1101 < this.field1099 && this.field1101 / 20 < var1) {
            var1 = this.field1101 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1102[var3] != null) {
                this.field1102[var3].field1220 -= var1 * 20;
            }
        }
        if (this.field1101 < this.field1099) {
            this.field1101 -= var1 * 20;
            this.field1099 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ap.e()[B")
    public final byte[] method1012() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1102[var2] != null && this.field1102[var2].field1228 + this.field1102[var2].field1220 > var1) {
                var1 = this.field1102[var2].field1228 + this.field1102[var2].field1220;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1102[var5] != null) {
                int var6 = this.field1102[var5].field1228 * 22050 / 1000;
                int var7 = this.field1102[var5].field1220 * 22050 / 1000;
                int[] var8 = this.field1102[var5].method1285(var6, this.field1102[var5].field1228);
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
