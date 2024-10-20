package deob;

@ObfuscatedName("cf")
public final class class89 extends class79 {

    @ObfuscatedName("cf.h")
    public class268 field1136;

    @ObfuscatedName("cf.h(IBI)V")
    public final void method1951(int arg0, byte arg1) {
        int var3 = this.field994[0];
        int var4 = this.field969[0];
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
        if (this.field971 != -1 && class270.method4174(this.field971).field3556 == 1) {
            this.field971 = -1;
        }
        if (this.field986 < 9) {
            this.field986++;
        }
        for (int var5 = this.field986; var5 > 0; var5--) {
            this.field994[var5] = this.field994[var5 - 1];
            this.field969[var5] = this.field969[var5 - 1];
            this.field996[var5] = this.field996[var5 - 1];
        }
        this.field994[0] = var3;
        this.field969[0] = var4;
        this.field996[0] = arg1;
    }

    @ObfuscatedName("cf.v(IIZI)V")
    public final void method1952(int arg0, int arg1, boolean arg2) {
        if (this.field971 != -1 && class270.method4174(this.field971).field3556 == 1) {
            this.field971 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field994[0];
            int var5 = arg1 - this.field969[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field986 < 9) {
                    this.field986++;
                }
                for (int var6 = this.field986; var6 > 0; var6--) {
                    this.field994[var6] = this.field994[var6 - 1];
                    this.field969[var6] = this.field969[var6 - 1];
                    this.field996[var6] = this.field996[var6 - 1];
                }
                this.field994[0] = arg0;
                this.field969[0] = arg1;
                this.field996[0] = 1;
                return;
            }
        }
        this.field986 = 0;
        this.field997 = 0;
        this.field964 = 0;
        this.field994[0] = arg0;
        this.field969[0] = arg1;
        this.field991 = this.field994[0] * 128 + this.field942 * 64;
        this.field939 = this.field969[0] * 128 + this.field942 * 64;
    }

    @ObfuscatedName("cf.l(I)Leh;")
    public final class137 method1198() {
        if (this.field1136 == null) {
            return null;
        }
        class270 var1 = this.field971 != -1 && this.field938 == 0 ? class270.method4174(this.field971) : null;
        class270 var2 = this.field968 == -1 || this.field968 == this.field944 && var1 != null ? null : class270.method4174(this.field968);
        class137 var3 = this.field1136.method4365(var1, this.field972, var2, this.field965);
        if (var3 == null) {
            return null;
        }
        var3.method2744();
        this.field989 = var3.field1895;
        if (this.field976 != -1 && this.field977 != -1) {
            class137 var4 = class255.method2025(this.field976).method4075(this.field977);
            if (var4 != null) {
                var4.method2721(0, -this.field980, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1136.field3501 == 1) {
            var3.field1711 = true;
        }
        return var3;
    }

    @ObfuscatedName("cf.m(I)Z")
    public final boolean method1195() {
        return this.field1136 != null;
    }
}
