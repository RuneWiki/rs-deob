package deob;

@ObfuscatedName("lh")
public final class class318 {

    @ObfuscatedName("lh.a")
    public int field3821;

    @ObfuscatedName("lh.t")
    public class181[] field3822;

    @ObfuscatedName("lh.n")
    public class181 field3823;

    @ObfuscatedName("lh.q")
    public class181 field3824;

    @ObfuscatedName("lh.v")
    public int field3825 = 0;

    public class318(int arg0) {
        this.field3821 = arg0;
        this.field3822 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3822[var2] = new class181();
            var3.field2090 = var3;
            var3.field2089 = var3;
        }
    }

    @ObfuscatedName("lh.a(J)Lfd;")
    public class181 method5528(long arg0) {
        class181 var3 = this.field3822[(int) (arg0 & (long) (this.field3821 - 1))];
        for (this.field3823 = var3.field2090; this.field3823 != var3; this.field3823 = this.field3823.field2090) {
            if (this.field3823.field2091 == arg0) {
                class181 var4 = this.field3823;
                this.field3823 = this.field3823.field2090;
                return var4;
            }
        }
        this.field3823 = null;
        return null;
    }

    @ObfuscatedName("lh.t(Lfd;J)V")
    public void method5529(class181 arg0, long arg1) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        class181 var4 = this.field3822[(int) (arg1 & (long) (this.field3821 - 1))];
        arg0.field2089 = var4.field2089;
        arg0.field2090 = var4;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
        arg0.field2091 = arg1;
    }

    @ObfuscatedName("lh.n()Lfd;")
    public class181 method5536() {
        this.field3825 = 0;
        return this.method5530();
    }

    @ObfuscatedName("lh.q()Lfd;")
    public class181 method5530() {
        if (this.field3825 > 0 && this.field3822[this.field3825 - 1] != this.field3824) {
            class181 var1 = this.field3824;
            this.field3824 = var1.field2090;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3825 >= this.field3821) {
                return null;
            }
            var2 = this.field3822[this.field3825++].field2090;
        } while (this.field3822[this.field3825 - 1] == var2);
        this.field3824 = var2.field2090;
        return var2;
    }
}
