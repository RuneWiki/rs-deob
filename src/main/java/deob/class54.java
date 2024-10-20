package deob;

@ObfuscatedName("bv")
public class class54 {

    @ObfuscatedName("bv.x")
    public class71[] field978 = new class71[10];

    @ObfuscatedName("bv.i")
    public int field979;

    @ObfuscatedName("bv.a")
    public int field980;

    @ObfuscatedName("bv.u(Lgt;II)Lbv;")
    public static class54 method940(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3071(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2708();
            if (var3 != 0) {
                arg0.field2073--;
                this.field978[var2] = new class71();
                this.field978[var2].method1257(arg0);
            }
        }
        this.field979 = arg0.method2581();
        this.field980 = arg0.method2581();
    }

    @ObfuscatedName("bv.x()Lbe;")
    public class56 method938() {
        byte[] var1 = this.method936();
        return new class56(22050, var1, this.field979 * 22050 / 1000, this.field980 * 22050 / 1000);
    }

    @ObfuscatedName("bv.i()I")
    public final int method935() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field978[var2] != null && this.field978[var2].field1158 / 20 < var1) {
                var1 = this.field978[var2].field1158 / 20;
            }
        }
        if (this.field979 < this.field980 && this.field979 / 20 < var1) {
            var1 = this.field979 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field978[var3] != null) {
                this.field978[var3].field1158 -= var1 * 20;
            }
        }
        if (this.field979 < this.field980) {
            this.field979 -= var1 * 20;
            this.field980 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.a()[B")
    public final byte[] method936() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field978[var2] != null && this.field978[var2].field1158 + this.field978[var2].field1157 > var1) {
                var1 = this.field978[var2].field1158 + this.field978[var2].field1157;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field978[var5] != null) {
                int var6 = this.field978[var5].field1157 * 22050 / 1000;
                int var7 = this.field978[var5].field1158 * 22050 / 1000;
                int[] var8 = this.field978[var5].method1255(var6, this.field978[var5].field1157);
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
