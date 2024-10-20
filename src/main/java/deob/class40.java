package deob;

@ObfuscatedName("bu")
public class class40 {

    @ObfuscatedName("bu.ah")
    public class62[] field252 = new class62[10];

    @ObfuscatedName("bu.af")
    public int field253;

    @ObfuscatedName("bu.at")
    public int field251;

    @ObfuscatedName("bu.az(Loc;II)Lbu;")
    public static class40 method710(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        return var3 == null ? null : new class40(new class535(var3));
    }

    public class40(class535 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8462();
            if (var3 != 0) {
                arg0.field5233--;
                this.field252[var2] = new class62();
                this.field252[var2].method1075(arg0);
            }
        }
        this.field253 = arg0.method8670();
        this.field251 = arg0.method8670();
    }

    @ObfuscatedName("bu.ah()Lbr;")
    public class41 method720() {
        byte[] var1 = this.method713();
        return new class41(22050, var1, this.field253 * 22050 / 1000, this.field251 * 22050 / 1000);
    }

    @ObfuscatedName("bu.af()I")
    public final int method712() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field252[var2] != null && this.field252[var2].field447 / 20 < var1) {
                var1 = this.field252[var2].field447 / 20;
            }
        }
        if (this.field253 < this.field251 && this.field253 / 20 < var1) {
            var1 = this.field253 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field252[var3] != null) {
                this.field252[var3].field447 -= var1 * 20;
            }
        }
        if (this.field253 < this.field251) {
            this.field253 -= var1 * 20;
            this.field251 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.at()[B")
    public final byte[] method713() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field252[var2] != null && this.field252[var2].field447 + this.field252[var2].field446 > var1) {
                var1 = this.field252[var2].field447 + this.field252[var2].field446;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field252[var5] != null) {
                int var6 = this.field252[var5].field446 * 22050 / 1000;
                int var7 = this.field252[var5].field447 * 22050 / 1000;
                int[] var8 = this.field252[var5].method1073(var6, this.field252[var5].field446);
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
