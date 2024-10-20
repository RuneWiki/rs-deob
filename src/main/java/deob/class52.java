package deob;

@ObfuscatedName("al")
public class class52 {

    @ObfuscatedName("al.s")
    public class65[] field1106 = new class65[10];

    @ObfuscatedName("al.v")
    public int field1108;

    @ObfuscatedName("al.o")
    public int field1107;

    @ObfuscatedName("al.g(Let;II)Lal;")
    public static class52 method1028(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2703(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2116();
            if (var3 != 0) {
                arg0.field1851--;
                this.field1106[var2] = new class65();
                this.field1106[var2].method1279(arg0);
            }
        }
        this.field1108 = arg0.method2094();
        this.field1107 = arg0.method2094();
    }

    @ObfuscatedName("al.s()Lbk;")
    public class56 method1030() {
        byte[] var1 = this.method1024();
        return new class56(22050, var1, this.field1108 * 22050 / 1000, this.field1107 * 22050 / 1000);
    }

    @ObfuscatedName("al.v()I")
    public final int method1026() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1234 / 20 < var1) {
                var1 = this.field1106[var2].field1234 / 20;
            }
        }
        if (this.field1108 < this.field1107 && this.field1108 / 20 < var1) {
            var1 = this.field1108 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1106[var3] != null) {
                this.field1106[var3].field1234 -= var1 * 20;
            }
        }
        if (this.field1108 < this.field1107) {
            this.field1108 -= var1 * 20;
            this.field1107 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("al.o()[B")
    public final byte[] method1024() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1234 + this.field1106[var2].field1233 > var1) {
                var1 = this.field1106[var2].field1234 + this.field1106[var2].field1233;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1106[var5] != null) {
                int var6 = this.field1106[var5].field1233 * 22050 / 1000;
                int var7 = this.field1106[var5].field1234 * 22050 / 1000;
                int[] var8 = this.field1106[var5].method1282(var6, this.field1106[var5].field1233);
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
