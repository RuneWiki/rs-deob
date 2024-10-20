package deob;

@ObfuscatedName("ca")
public final class class89 extends class79 {

    @ObfuscatedName("ca.f")
    public class268 field1158;

    @ObfuscatedName("ca.f(IBI)V")
    public final void method1959(int arg0, byte arg1) {
        int var3 = this.field1031[0];
        int var4 = this.field1032[0];
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
        if (this.field1008 != -1 && class270.method2219(this.field1008).field3551 == 1) {
            this.field1008 = -1;
        }
        if (this.field999 < 9) {
            this.field999++;
        }
        for (int var5 = this.field999; var5 > 0; var5--) {
            this.field1031[var5] = this.field1031[var5 - 1];
            this.field1032[var5] = this.field1032[var5 - 1];
            this.field1033[var5] = this.field1033[var5 - 1];
        }
        this.field1031[0] = var3;
        this.field1032[0] = var4;
        this.field1033[0] = arg1;
    }

    @ObfuscatedName("ca.b(IIZB)V")
    public final void method1957(int arg0, int arg1, boolean arg2) {
        if (this.field1008 != -1 && class270.method2219(this.field1008).field3551 == 1) {
            this.field1008 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1031[0];
            int var5 = arg1 - this.field1032[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field999 < 9) {
                    this.field999++;
                }
                for (int var6 = this.field999; var6 > 0; var6--) {
                    this.field1031[var6] = this.field1031[var6 - 1];
                    this.field1032[var6] = this.field1032[var6 - 1];
                    this.field1033[var6] = this.field1033[var6 - 1];
                }
                this.field1031[0] = arg0;
                this.field1032[0] = arg1;
                this.field1033[0] = 1;
                return;
            }
        }
        this.field999 = 0;
        this.field1035 = 0;
        this.field979 = 0;
        this.field1031[0] = arg0;
        this.field1032[0] = arg1;
        this.field1000 = this.field1031[0] * 128 + this.field1012 * 64;
        this.field976 = this.field1032[0] * 128 + this.field1012 * 64;
    }

    @ObfuscatedName("ca.u(I)Leh;")
    public final class137 method1175() {
        if (this.field1158 == null) {
            return null;
        }
        class270 var1 = this.field1008 != -1 && this.field981 == 0 ? class270.method2219(this.field1008) : null;
        class270 var2 = this.field1005 == -1 || this.field998 == this.field1005 && var1 != null ? null : class270.method2219(this.field1005);
        class137 var3 = this.field1158.method4486(var1, this.field1007, var2, this.field1006);
        if (var3 == null) {
            return null;
        }
        var3.method2746();
        this.field1026 = var3.field1900;
        if (this.field1013 != -1 && this.field1014 != -1) {
            class137 var4 = class255.method1685(this.field1013).method4158(this.field1014);
            if (var4 != null) {
                var4.method2757(0, -this.field1017, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1158.field3485 == 1) {
            var3.field1726 = true;
        }
        return var3;
    }

    @ObfuscatedName("ca.n(I)Z")
    public final boolean method1179() {
        return this.field1158 != null;
    }
}
