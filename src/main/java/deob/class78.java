package deob;

@ObfuscatedName("be")
public final class class78 extends class72 {

    @ObfuscatedName("be.s")
    public class148 field1132;

    @ObfuscatedName("be.s(IBB)V")
    public final void method1856(int arg0, byte arg1) {
        int var3 = this.field1076[0];
        int var4 = this.field1077[0];
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
        if (this.field1053 != -1 && class159.method1334(this.field1053).field1860 == 1) {
            this.field1053 = -1;
        }
        if (this.field1027 < 9) {
            this.field1027++;
        }
        for (int var5 = this.field1027; var5 > 0; var5--) {
            this.field1076[var5] = this.field1076[var5 - 1];
            this.field1077[var5] = this.field1077[var5 - 1];
            this.field1031[var5] = this.field1031[var5 - 1];
        }
        this.field1076[0] = var3;
        this.field1077[0] = var4;
        this.field1031[0] = arg1;
    }

    @ObfuscatedName("be.v(IIZI)V")
    public final void method1857(int arg0, int arg1, boolean arg2) {
        if (this.field1053 != -1 && class159.method1334(this.field1053).field1860 == 1) {
            this.field1053 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1076[0];
            int var5 = arg1 - this.field1077[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1027 < 9) {
                    this.field1027++;
                }
                for (int var6 = this.field1027; var6 > 0; var6--) {
                    this.field1076[var6] = this.field1076[var6 - 1];
                    this.field1077[var6] = this.field1077[var6 - 1];
                    this.field1031[var6] = this.field1031[var6 - 1];
                }
                this.field1076[0] = arg0;
                this.field1077[0] = arg1;
                this.field1031[0] = 1;
                return;
            }
        }
        this.field1027 = 0;
        this.field1067 = 0;
        this.field1079 = 0;
        this.field1076[0] = arg0;
        this.field1077[0] = arg1;
        this.field1069 = this.field1076[0] * 128 + this.field1024 * 64;
        this.field1059 = this.field1077[0] * 128 + this.field1024 * 64;
    }

    @ObfuscatedName("be.t(I)Lgl;")
    public final class207 method1550() {
        if (this.field1132 == null) {
            return null;
        }
        class159 var1 = this.field1053 != -1 && this.field1056 == 0 ? class159.method1334(this.field1053) : null;
        class159 var2 = this.field1050 == -1 || this.field1050 == this.field1030 && var1 != null ? null : class159.method1334(this.field1050);
        class207 var3 = this.field1132.method2534(var1, this.field1054, var2, this.field1042);
        if (var3 == null) {
            return null;
        }
        var3.method3772();
        this.field1071 = var3.field2346;
        if (this.field1058 != -1 && this.field1028 != -1) {
            class207 var4 = class150.method455(this.field1058).method2541(this.field1028);
            if (var4 != null) {
                var4.method3782(0, -this.field1062, 0);
                class207[] var5 = new class207[] { var3, var4 };
                var3 = new class207(var5, 2);
            }
        }
        if (this.field1132.field1622 == 1) {
            var3.field2430 = true;
        }
        return var3;
    }

    @ObfuscatedName("be.u(B)Z")
    public final boolean method1738() {
        return this.field1132 != null;
    }
}
