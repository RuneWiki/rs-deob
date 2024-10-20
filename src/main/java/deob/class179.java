package deob;

@ObfuscatedName("fh")
public final class class179 {

    @ObfuscatedName("fh.y")
    public class180 field2821 = new class180();

    public class179() {
        this.field2821.field2822 = this.field2821;
        this.field2821.field2823 = this.field2821;
    }

    @ObfuscatedName("fh.y(Lft;)V")
    public void method3248(class180 arg0) {
        if (arg0.field2823 != null) {
            arg0.method3260();
        }
        arg0.field2823 = this.field2821.field2823;
        arg0.field2822 = this.field2821;
        arg0.field2823.field2822 = arg0;
        arg0.field2822.field2823 = arg0;
    }

    @ObfuscatedName("fh.u(Lft;)V")
    public void method3257(class180 arg0) {
        if (arg0.field2823 != null) {
            arg0.method3260();
        }
        arg0.field2823 = this.field2821;
        arg0.field2822 = this.field2821.field2822;
        arg0.field2823.field2822 = arg0;
        arg0.field2822.field2823 = arg0;
    }

    @ObfuscatedName("fh.k()Lft;")
    public class180 method3250() {
        class180 var1 = this.field2821.field2822;
        if (this.field2821 == var1) {
            return null;
        } else {
            var1.method3260();
            return var1;
        }
    }

    @ObfuscatedName("fh.v()Lft;")
    public class180 method3252() {
        class180 var1 = this.field2821.field2822;
        return this.field2821 == var1 ? null : var1;
    }

    @ObfuscatedName("fh.l()V")
    public void method3251() {
        while (true) {
            class180 var1 = this.field2821.field2822;
            if (this.field2821 == var1) {
                return;
            }
            var1.method3260();
        }
    }
}
