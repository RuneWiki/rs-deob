package deob;

@ObfuscatedName("au")
public class class35 {

    @ObfuscatedName("au.q")
    public class53[] field245 = new class53[10];

    @ObfuscatedName("au.f")
    public int field242;

    @ObfuscatedName("au.j")
    public int field244;

    @ObfuscatedName("au.l(Lkl;II)Lau;")
    public static class35 method653(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4756(arg1, arg2);
        return var3 == null ? null : new class35(new class401(var3));
    }

    public class35(class401 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6272();
            if (var3 != 0) {
                arg0.field4292--;
                this.field245[var2] = new class53();
                this.field245[var2].method985(arg0);
            }
        }
        this.field242 = arg0.method6284();
        this.field244 = arg0.method6284();
    }

    @ObfuscatedName("au.q()Laa;")
    public class36 method651() {
        byte[] var1 = this.method647();
        return new class36(22050, var1, this.field242 * 22050 / 1000, this.field244 * 22050 / 1000);
    }

    @ObfuscatedName("au.f()I")
    public final int method646() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field245[var2] != null && this.field245[var2].field415 / 20 < var1) {
                var1 = this.field245[var2].field415 / 20;
            }
        }
        if (this.field242 < this.field244 && this.field242 / 20 < var1) {
            var1 = this.field242 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field245[var3] != null) {
                this.field245[var3].field415 -= var1 * 20;
            }
        }
        if (this.field242 < this.field244) {
            this.field242 -= var1 * 20;
            this.field244 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("au.j()[B")
    public final byte[] method647() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field245[var2] != null && this.field245[var2].field420 + this.field245[var2].field415 > var1) {
                var1 = this.field245[var2].field420 + this.field245[var2].field415;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field245[var5] != null) {
                int var6 = this.field245[var5].field420 * 22050 / 1000;
                int var7 = this.field245[var5].field415 * 22050 / 1000;
                int[] var8 = this.field245[var5].method984(var6, this.field245[var5].field420);
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
