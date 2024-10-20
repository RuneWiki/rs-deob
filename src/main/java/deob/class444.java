package deob;

@ObfuscatedName("qp")
public final class class444 {

    @ObfuscatedName("qp.h")
    public int field4825;

    @ObfuscatedName("qp.e")
    public class433[] field4823;

    @ObfuscatedName("qp.v")
    public class433 field4824;

    @ObfuscatedName("qp.x")
    public class433 field4826;

    @ObfuscatedName("qp.m")
    public int field4822 = 0;

    public class444(int arg0) {
        this.field4825 = arg0;
        this.field4823 = new class433[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class433 var3 = this.field4823[var2] = new class433();
            var3.field4684 = var3;
            var3.field4685 = var3;
        }
    }

    @ObfuscatedName("qp.h(J)Lpl;")
    public class433 method7535(long arg0) {
        class433 var3 = this.field4823[(int) (arg0 & (long) (this.field4825 - 1))];
        for (this.field4824 = var3.field4684; this.field4824 != var3; this.field4824 = this.field4824.field4684) {
            if (this.field4824.field4686 == arg0) {
                class433 var4 = this.field4824;
                this.field4824 = this.field4824.field4684;
                return var4;
            }
        }
        this.field4824 = null;
        return null;
    }

    @ObfuscatedName("qp.e(Lpl;J)V")
    public void method7528(class433 arg0, long arg1) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        class433 var4 = this.field4823[(int) (arg1 & (long) (this.field4825 - 1))];
        arg0.field4685 = var4.field4685;
        arg0.field4684 = var4;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
        arg0.field4686 = arg1;
    }

    @ObfuscatedName("qp.v()Lpl;")
    public class433 method7530() {
        this.field4822 = 0;
        return this.method7531();
    }

    @ObfuscatedName("qp.x()Lpl;")
    public class433 method7531() {
        if (this.field4822 > 0 && this.field4823[this.field4822 - 1] != this.field4826) {
            class433 var1 = this.field4826;
            this.field4826 = var1.field4684;
            return var1;
        }
        class433 var2;
        do {
            if (this.field4822 >= this.field4825) {
                return null;
            }
            var2 = this.field4823[this.field4822++].field4684;
        } while (this.field4823[this.field4822 - 1] == var2);
        this.field4826 = var2.field4684;
        return var2;
    }
}
