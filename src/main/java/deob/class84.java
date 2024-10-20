package deob;

@ObfuscatedName("ch")
public final class class84 extends class75 {

    @ObfuscatedName("ch.p")
    public class270 field1259;

    @ObfuscatedName("ch.p(IBS)V")
    public final void method1699(int arg0, byte arg1) {
        int var3 = this.field1153[0];
        int var4 = this.field1154[0];
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
        if (this.field1130 != -1 && class272.method2308(this.field1130).field3672 == 1) {
            this.field1130 = -1;
        }
        if (this.field1099 < 9) {
            this.field1099++;
        }
        for (int var5 = this.field1099; var5 > 0; var5--) {
            this.field1153[var5] = this.field1153[var5 - 1];
            this.field1154[var5] = this.field1154[var5 - 1];
            this.field1155[var5] = this.field1155[var5 - 1];
        }
        this.field1153[0] = var3;
        this.field1154[0] = var4;
        this.field1155[0] = arg1;
    }

    @ObfuscatedName("ch.i(IIZI)V")
    public final void method1700(int arg0, int arg1, boolean arg2) {
        if (this.field1130 != -1 && class272.method2308(this.field1130).field3672 == 1) {
            this.field1130 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1153[0];
            int var5 = arg1 - this.field1154[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1099 < 9) {
                    this.field1099++;
                }
                for (int var6 = this.field1099; var6 > 0; var6--) {
                    this.field1153[var6] = this.field1153[var6 - 1];
                    this.field1154[var6] = this.field1154[var6 - 1];
                    this.field1155[var6] = this.field1155[var6 - 1];
                }
                this.field1153[0] = arg0;
                this.field1154[0] = arg1;
                this.field1155[0] = 1;
                return;
            }
        }
        this.field1099 = 0;
        this.field1157 = 0;
        this.field1137 = 0;
        this.field1153[0] = arg0;
        this.field1154[0] = arg1;
        this.field1152 = this.field1153[0] * 128 + this.field1128 * 64;
        this.field1117 = this.field1154[0] * 128 + this.field1128 * 64;
    }

    @ObfuscatedName("ch.m(I)Len;")
    public final class131 method1045() {
        if (this.field1259 == null) {
            return null;
        }
        class272 var1 = this.field1130 != -1 && this.field1101 == 0 ? class272.method2308(this.field1130) : null;
        class272 var2 = this.field1127 == -1 || this.field1127 == this.field1103 && var1 != null ? null : class272.method2308(this.field1127);
        class131 var3 = this.field1259.method4574(var1, this.field1098, var2, this.field1118);
        if (var3 == null) {
            return null;
        }
        var3.method2484();
        this.field1148 = var3.field1998;
        if (this.field1135 != -1 && this.field1136 != -1) {
            class131 var4 = class257.method82(this.field1135).method4252(this.field1136);
            if (var4 != null) {
                var4.method2476(0, -this.field1139, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (this.field1259.field3612 == 1) {
            var3.field1826 = true;
        }
        return var3;
    }

    @ObfuscatedName("ch.q(I)Z")
    public final boolean method1048() {
        return this.field1259 != null;
    }
}
