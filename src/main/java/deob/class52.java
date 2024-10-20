package deob;

@ObfuscatedName("ar")
public class class52 {

    @ObfuscatedName("ar.v")
    public class65[] field1109 = new class65[10];

    @ObfuscatedName("ar.z")
    public int field1108;

    @ObfuscatedName("ar.h")
    public int field1106;

    @ObfuscatedName("ar.g(Lec;II)Lar;")
    public static class52 method1066(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2708(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2139();
            if (var3 != 0) {
                arg0.field1839--;
                this.field1109[var2] = new class65();
                this.field1109[var2].method1321(arg0);
            }
        }
        this.field1108 = arg0.method2141();
        this.field1106 = arg0.method2141();
    }

    @ObfuscatedName("ar.v()Lbq;")
    public class56 method1065() {
        byte[] var1 = this.method1068();
        return new class56(22050, var1, this.field1108 * 22050 / 1000, this.field1106 * 22050 / 1000);
    }

    @ObfuscatedName("ar.z()I")
    public final int method1067() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1109[var2] != null && this.field1109[var2].field1216 / 20 < var1) {
                var1 = this.field1109[var2].field1216 / 20;
            }
        }
        if (this.field1108 < this.field1106 && this.field1108 / 20 < var1) {
            var1 = this.field1108 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1109[var3] != null) {
                this.field1109[var3].field1216 -= var1 * 20;
            }
        }
        if (this.field1108 < this.field1106) {
            this.field1108 -= var1 * 20;
            this.field1106 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ar.h()[B")
    public final byte[] method1068() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1109[var2] != null && this.field1109[var2].field1230 + this.field1109[var2].field1216 > var1) {
                var1 = this.field1109[var2].field1230 + this.field1109[var2].field1216;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1109[var5] != null) {
                int var6 = this.field1109[var5].field1230 * 22050 / 1000;
                int var7 = this.field1109[var5].field1216 * 22050 / 1000;
                int[] var8 = this.field1109[var5].method1315(var6, this.field1109[var5].field1230);
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
