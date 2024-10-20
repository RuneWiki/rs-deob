package deob;

@ObfuscatedName("cw")
public final class class91 extends class85 {

    @ObfuscatedName("cw.l")
    public class161 field1219;

    @ObfuscatedName("cw.l(IBB)V")
    public final void method2126(int arg0, byte arg1) {
        int var3 = this.field1162[0];
        int var4 = this.field1163[0];
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
        if (this.field1139 != -1 && class172.method2708(this.field1139).field1961 == 1) {
            this.field1139 = -1;
        }
        if (this.field1161 < 9) {
            this.field1161++;
        }
        for (int var5 = this.field1161; var5 > 0; var5--) {
            this.field1162[var5] = this.field1162[var5 - 1];
            this.field1163[var5] = this.field1163[var5 - 1];
            this.field1114[var5] = this.field1114[var5 - 1];
        }
        this.field1162[0] = var3;
        this.field1163[0] = var4;
        this.field1114[0] = arg1;
    }

    @ObfuscatedName("cw.f(IIZB)V")
    public final void method2133(int arg0, int arg1, boolean arg2) {
        if (this.field1139 != -1 && class172.method2708(this.field1139).field1961 == 1) {
            this.field1139 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1162[0];
            int var5 = arg1 - this.field1163[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1161 < 9) {
                    this.field1161++;
                }
                for (int var6 = this.field1161; var6 > 0; var6--) {
                    this.field1162[var6] = this.field1162[var6 - 1];
                    this.field1163[var6] = this.field1163[var6 - 1];
                    this.field1114[var6] = this.field1114[var6 - 1];
                }
                this.field1162[0] = arg0;
                this.field1163[0] = arg1;
                this.field1114[0] = 1;
                return;
            }
        }
        this.field1161 = 0;
        this.field1130 = 0;
        this.field1165 = 0;
        this.field1162[0] = arg0;
        this.field1163[0] = arg1;
        this.field1140 = this.field1162[0] * 128 + this.field1110 * 64;
        this.field1124 = this.field1163[0] * 128 + this.field1110 * 64;
    }

    @ObfuscatedName("cw.q(B)Lhl;")
    public final class220 method1785() {
        if (this.field1219 == null) {
            return null;
        }
        class172 var1 = this.field1139 != -1 && this.field1142 == 0 ? class172.method2708(this.field1139) : null;
        class172 var2 = this.field1136 == -1 || this.field1136 == this.field1112 && var1 != null ? null : class172.method2708(this.field1136);
        class220 var3 = this.field1219.method2769(var1, this.field1164, var2, this.field1132);
        if (var3 == null) {
            return null;
        }
        var3.method4076();
        this.field1157 = var3.field2449;
        if (this.field1125 != -1 && this.field1145 != -1) {
            class220 var4 = Statics.method304(this.field1125).method2814(this.field1145);
            if (var4 != null) {
                var4.method4119(0, -this.field1148, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (this.field1219.field1717 == 1) {
            var3.field2531 = true;
        }
        return var3;
    }

    @ObfuscatedName("cw.b(I)Z")
    public final boolean method1999() {
        return this.field1219 != null;
    }
}
