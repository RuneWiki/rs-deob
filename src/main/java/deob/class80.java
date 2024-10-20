package deob;

@ObfuscatedName("ck")
public final class class80 extends class70 {

    @ObfuscatedName("ck.z")
    public class257 field1114;

    @ObfuscatedName("ck.z(IBB)V")
    public final void method1855(int arg0, byte arg1) {
        int var3 = this.field985[0];
        int var4 = this.field960[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field936 != -1 && class259.method122(this.field936).field3511 == 1) {
            this.field936 = -1;
        }
        if (this.field984 < 9) {
            this.field984++;
        }
        for (int var5 = this.field984; var5 > 0; var5--) {
            this.field985[var5] = this.field985[var5 - 1];
            this.field960[var5] = this.field960[var5 - 1];
            this.field987[var5] = this.field987[var5 - 1];
        }
        this.field985[0] = var3;
        this.field960[0] = var4;
        this.field987[0] = arg1;
    }

    @ObfuscatedName("ck.n(IIZB)V")
    public final void method1854(int arg0, int arg1, boolean arg2) {
        if (this.field936 != -1 && class259.method122(this.field936).field3511 == 1) {
            this.field936 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field985[0];
            int var5 = arg1 - this.field960[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field984 < 9) {
                    this.field984++;
                }
                for (int var6 = this.field984; var6 > 0; var6--) {
                    this.field985[var6] = this.field985[var6 - 1];
                    this.field960[var6] = this.field960[var6 - 1];
                    this.field987[var6] = this.field987[var6 - 1];
                }
                this.field985[0] = arg0;
                this.field960[0] = arg1;
                this.field987[0] = 1;
                return;
            }
        }
        this.field984 = 0;
        this.field989 = 0;
        this.field950 = 0;
        this.field985[0] = arg0;
        this.field960[0] = arg1;
        this.field986 = this.field985[0] * 128 + this.field933 * 64;
        this.field930 = this.field960[0] * 128 + this.field933 * 64;
    }

    @ObfuscatedName("ck.y(I)Ldh;")
    public final class128 method1115() {
        if (this.field1114 == null) {
            return null;
        }
        class259 var1 = this.field936 != -1 && this.field937 == 0 ? class259.method122(this.field936) : null;
        class259 var2 = this.field980 == -1 || this.field980 == this.field935 && var1 != null ? null : class259.method122(this.field980);
        class128 var3 = this.field1114.method4271(var1, this.field961, var2, this.field965);
        if (var3 == null) {
            return null;
        }
        var3.method2592();
        this.field943 = var3.field1843;
        if (this.field967 != -1 && this.field968 != -1) {
            class128 var4 = class244.method1038(this.field967).method3979(this.field968);
            if (var4 != null) {
                var4.method2656(0, -this.field971, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1114.field3474 == 1) {
            var3.field1697 = true;
        }
        return var3;
    }

    @ObfuscatedName("ck.o(S)Z")
    public final boolean method1108() {
        return this.field1114 != null;
    }
}
