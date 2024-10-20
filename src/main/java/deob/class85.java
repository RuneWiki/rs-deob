package deob;

@ObfuscatedName("cv")
public final class class85 extends class76 {

    @ObfuscatedName("cv.o")
    public class286 field1317;

    @ObfuscatedName("cv.o(IBB)V")
    public final void method1724(int arg0, byte arg1) {
        int var3 = this.field1213[0];
        int var4 = this.field1214[0];
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
        if (this.field1190 != -1 && class288.method1535(this.field1190).field3770 == 1) {
            this.field1190 = -1;
        }
        if (this.field1212 < 9) {
            this.field1212++;
        }
        for (int var5 = this.field1212; var5 > 0; var5--) {
            this.field1213[var5] = this.field1213[var5 - 1];
            this.field1214[var5] = this.field1214[var5 - 1];
            this.field1215[var5] = this.field1215[var5 - 1];
        }
        this.field1213[0] = var3;
        this.field1214[0] = var4;
        this.field1215[0] = arg1;
    }

    @ObfuscatedName("cv.k(IIZB)V")
    public final void method1725(int arg0, int arg1, boolean arg2) {
        if (this.field1190 != -1 && class288.method1535(this.field1190).field3770 == 1) {
            this.field1190 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1213[0];
            int var5 = arg1 - this.field1214[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1212 < 9) {
                    this.field1212++;
                }
                for (int var6 = this.field1212; var6 > 0; var6--) {
                    this.field1213[var6] = this.field1213[var6 - 1];
                    this.field1214[var6] = this.field1214[var6 - 1];
                    this.field1215[var6] = this.field1215[var6 - 1];
                }
                this.field1213[0] = arg0;
                this.field1214[0] = arg1;
                this.field1215[0] = 1;
                return;
            }
        }
        this.field1212 = 0;
        this.field1217 = 0;
        this.field1159 = 0;
        this.field1213[0] = arg0;
        this.field1214[0] = arg1;
        this.field1211 = this.field1213[0] * 128 + this.field1173 * 64;
        this.field1188 = this.field1214[0] * 128 + this.field1173 * 64;
    }

    @ObfuscatedName("cv.u(I)Lei;")
    public final class132 method1081() {
        if (this.field1317 == null) {
            return null;
        }
        class288 var1 = this.field1190 != -1 && this.field1192 == 0 ? class288.method1535(this.field1190) : null;
        class288 var2 = this.field1187 == -1 || this.field1202 == this.field1187 && var1 != null ? null : class288.method1535(this.field1187);
        class132 var3 = this.field1317.method4732(var1, this.field1191, var2, this.field1163);
        if (var3 == null) {
            return null;
        }
        var3.method2512();
        this.field1208 = var3.field2054;
        if (this.field1195 != -1 && this.field1196 != -1) {
            class132 var4 = class273.method1734(this.field1195).method4416(this.field1196);
            if (var4 != null) {
                var4.method2475(0, -this.field1199, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1317.field3721 == 1) {
            var3.field1875 = true;
        }
        return var3;
    }

    @ObfuscatedName("cv.v(I)Z")
    public final boolean method1084() {
        return this.field1317 != null;
    }
}
