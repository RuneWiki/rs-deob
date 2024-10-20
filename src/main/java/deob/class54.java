package deob;

@ObfuscatedName("bw")
public class class54 {

    @ObfuscatedName("bw.c")
    public class71[] field982 = new class71[10];

    @ObfuscatedName("bw.f")
    public int field983;

    @ObfuscatedName("bw.h")
    public int field984;

    @ObfuscatedName("bw.s(Lgp;II)Lbw;")
    public static class54 method901(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2986(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2545();
            if (var3 != 0) {
                arg0.field2098--;
                this.field982[var2] = new class71();
                this.field982[var2].method1259(arg0);
            }
        }
        this.field983 = arg0.method2541();
        this.field984 = arg0.method2541();
    }

    @ObfuscatedName("bw.c()Lbs;")
    public class56 method898() {
        byte[] var1 = this.method900();
        return new class56(22050, var1, this.field983 * 22050 / 1000, this.field984 * 22050 / 1000);
    }

    @ObfuscatedName("bw.f()I")
    public final int method899() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field982[var2] != null && this.field982[var2].field1151 / 20 < var1) {
                var1 = this.field982[var2].field1151 / 20;
            }
        }
        if (this.field983 < this.field984 && this.field983 / 20 < var1) {
            var1 = this.field983 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field982[var3] != null) {
                this.field982[var3].field1151 -= var1 * 20;
            }
        }
        if (this.field983 < this.field984) {
            this.field983 -= var1 * 20;
            this.field984 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.g()[B")
    public final byte[] method900() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field982[var2] != null && this.field982[var2].field1163 + this.field982[var2].field1151 > var1) {
                var1 = this.field982[var2].field1163 + this.field982[var2].field1151;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field982[var5] != null) {
                int var6 = this.field982[var5].field1163 * 22050 / 1000;
                int var7 = this.field982[var5].field1151 * 22050 / 1000;
                int[] var8 = this.field982[var5].method1260(var6, this.field982[var5].field1163);
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
