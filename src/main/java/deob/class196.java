package deob;

@ObfuscatedName("gu")
public final class class196 {

    @ObfuscatedName("gu.f")
    public int field3080;

    @ObfuscatedName("gu.s")
    public class208[] field3081;

    @ObfuscatedName("gu.q")
    public class208 field3082;

    @ObfuscatedName("gu.g")
    public class208 field3083;

    @ObfuscatedName("gu.m")
    public int field3084 = 0;

    public class196(int arg0) {
        this.field3080 = arg0;
        this.field3081 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3081[var2] = new class208();
            var3.field3106 = var3;
            var3.field3107 = var3;
        }
    }

    @ObfuscatedName("gu.f(J)Lgm;")
    public class208 method3532(long arg0) {
        class208 var3 = this.field3081[(int) (arg0 & (long) (this.field3080 - 1))];
        for (this.field3082 = var3.field3106; this.field3082 != var3; this.field3082 = this.field3082.field3106) {
            if (this.field3082.field3105 == arg0) {
                class208 var4 = this.field3082;
                this.field3082 = this.field3082.field3106;
                return var4;
            }
        }
        this.field3082 = null;
        return null;
    }

    @ObfuscatedName("gu.s(Lgm;J)V")
    public void method3534(class208 arg0, long arg1) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        class208 var4 = this.field3081[(int) (arg1 & (long) (this.field3080 - 1))];
        arg0.field3107 = var4.field3107;
        arg0.field3106 = var4;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
        arg0.field3105 = arg1;
    }

    @ObfuscatedName("gu.q()V")
    public void method3535() {
        for (int var1 = 0; var1 < this.field3080; var1++) {
            class208 var2 = this.field3081[var1];
            while (true) {
                class208 var3 = var2.field3106;
                if (var2 == var3) {
                    break;
                }
                var3.method3665();
            }
        }
        this.field3082 = null;
        this.field3083 = null;
    }

    @ObfuscatedName("gu.g()Lgm;")
    public class208 method3543() {
        this.field3084 = 0;
        return this.method3537();
    }

    @ObfuscatedName("gu.m()Lgm;")
    public class208 method3537() {
        if (this.field3084 > 0 && this.field3081[this.field3084 - 1] != this.field3083) {
            class208 var1 = this.field3083;
            this.field3083 = var1.field3106;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3084 >= this.field3080) {
                return null;
            }
            var2 = this.field3081[this.field3084++].field3106;
        } while (this.field3081[this.field3084 - 1] == var2);
        this.field3083 = var2.field3106;
        return var2;
    }
}
