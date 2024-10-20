package deob;

@ObfuscatedName("cm")
public final class class85 extends class77 {

    @ObfuscatedName("cm.w")
    public class259 field1367;

    @ObfuscatedName("cm.w(IBI)V")
    public final void method1578(int arg0, byte arg1) {
        int var3 = this.field1265[0];
        int var4 = this.field1266[0];
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
        if (this.field1242 != -1 && class261.method4424(this.field1242).field3608 == 1) {
            this.field1242 = -1;
        }
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var5 = this.field1264; var5 > 0; var5--) {
            this.field1265[var5] = this.field1265[var5 - 1];
            this.field1266[var5] = this.field1266[var5 - 1];
            this.field1259[var5] = this.field1259[var5 - 1];
        }
        this.field1265[0] = var3;
        this.field1266[0] = var4;
        this.field1259[0] = arg1;
    }

    @ObfuscatedName("cm.s(IIZI)V")
    public final void method1575(int arg0, int arg1, boolean arg2) {
        if (this.field1242 != -1 && class261.method4424(this.field1242).field3608 == 1) {
            this.field1242 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1265[0];
            int var5 = arg1 - this.field1266[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1264 < 9) {
                    this.field1264++;
                }
                for (int var6 = this.field1264; var6 > 0; var6--) {
                    this.field1265[var6] = this.field1265[var6 - 1];
                    this.field1266[var6] = this.field1266[var6 - 1];
                    this.field1259[var6] = this.field1259[var6 - 1];
                }
                this.field1265[0] = arg0;
                this.field1266[0] = arg1;
                this.field1259[0] = 1;
                return;
            }
        }
        this.field1264 = 0;
        this.field1214 = 0;
        this.field1268 = 0;
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        this.field1225 = this.field1265[0] * 128 + this.field1222 * 64;
        this.field1211 = this.field1266[0] * 128 + this.field1222 * 64;
    }

    @ObfuscatedName("cm.q(B)Leh;")
    public final class132 method1030() {
        if (this.field1367 == null) {
            return null;
        }
        class261 var1 = this.field1242 != -1 && this.field1269 == 0 ? class261.method4424(this.field1242) : null;
        class261 var2 = this.field1239 == -1 || this.field1267 == this.field1239 && var1 != null ? null : class261.method4424(this.field1239);
        class132 var3 = this.field1367.method4394(var1, this.field1243, var2, this.field1240);
        if (var3 == null) {
            return null;
        }
        var3.method2358();
        this.field1229 = var3.field2103;
        if (this.field1215 != -1 && this.field1216 != -1) {
            class132 var4 = class246.method4062(this.field1215).method4074(this.field1216);
            if (var4 != null) {
                var4.method2369(0, -this.field1251, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1367.field3556 == 1) {
            var3.field1937 = true;
        }
        return var3;
    }

    @ObfuscatedName("cm.p(I)Z")
    public final boolean method1034() {
        return this.field1367 != null;
    }
}
