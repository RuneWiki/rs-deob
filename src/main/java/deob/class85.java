package deob;

@ObfuscatedName("cy")
public final class class85 extends class76 {

    @ObfuscatedName("cy.g")
    public class286 field1297;

    @ObfuscatedName("cy.g(IBI)V")
    public final void method1818(int arg0, byte arg1) {
        int var3 = this.field1196[0];
        int var4 = this.field1197[0];
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
        if (this.field1173 != -1 && class288.method1825(this.field1173).field3774 == 1) {
            this.field1173 = -1;
        }
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var5 = this.field1199; var5 > 0; var5--) {
            this.field1196[var5] = this.field1196[var5 - 1];
            this.field1197[var5] = this.field1197[var5 - 1];
            this.field1198[var5] = this.field1198[var5 - 1];
        }
        this.field1196[0] = var3;
        this.field1197[0] = var4;
        this.field1198[0] = arg1;
    }

    @ObfuscatedName("cy.e(IIZB)V")
    public final void method1819(int arg0, int arg1, boolean arg2) {
        if (this.field1173 != -1 && class288.method1825(this.field1173).field3774 == 1) {
            this.field1173 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1196[0];
            int var5 = arg1 - this.field1197[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1199 < 9) {
                    this.field1199++;
                }
                for (int var6 = this.field1199; var6 > 0; var6--) {
                    this.field1196[var6] = this.field1196[var6 - 1];
                    this.field1197[var6] = this.field1197[var6 - 1];
                    this.field1198[var6] = this.field1198[var6 - 1];
                }
                this.field1196[0] = arg0;
                this.field1197[0] = arg1;
                this.field1198[0] = 1;
                return;
            }
        }
        this.field1199 = 0;
        this.field1179 = 0;
        this.field1193 = 0;
        this.field1196[0] = arg0;
        this.field1197[0] = arg1;
        this.field1154 = this.field1196[0] * 128 + this.field1144 * 64;
        this.field1148 = this.field1197[0] * 128 + this.field1144 * 64;
    }

    @ObfuscatedName("cy.c(I)Lee;")
    public final class132 method1120() {
        if (this.field1297 == null) {
            return null;
        }
        class288 var1 = this.field1173 != -1 && this.field1176 == 0 ? class288.method1825(this.field1173) : null;
        class288 var2 = this.field1170 == -1 || this.field1170 == this.field1146 && var1 != null ? null : class288.method1825(this.field1170);
        class132 var3 = this.field1297.method4797(var1, this.field1174, var2, this.field1200);
        if (var3 == null) {
            return null;
        }
        var3.method2581();
        this.field1191 = var3.field2025;
        if (this.field1142 != -1 && this.field1163 != -1) {
            class132 var4 = class273.method1058(this.field1142).method4518(this.field1163);
            if (var4 != null) {
                var4.method2648(0, -this.field1188, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1297.field3727 == 1) {
            var3.field1848 = true;
        }
        return var3;
    }

    @ObfuscatedName("cy.p(B)Z")
    public final boolean method1123() {
        return this.field1297 != null;
    }
}
