package deob;

@ObfuscatedName("fa")
public class class174 {

    @ObfuscatedName("fa.l")
    public class179 field2821 = new class179();

    @ObfuscatedName("fa.b")
    public class179 field2822;

    public class174() {
        this.field2821.field2833 = this.field2821;
        this.field2821.field2834 = this.field2821;
    }

    @ObfuscatedName("fa.l(Lfp;)V")
    public void method3284(class179 arg0) {
        if (arg0.field2834 != null) {
            arg0.method3355();
        }
        arg0.field2834 = this.field2821.field2834;
        arg0.field2833 = this.field2821;
        arg0.field2834.field2833 = arg0;
        arg0.field2833.field2834 = arg0;
    }

    @ObfuscatedName("fa.b()Lfp;")
    public class179 method3285() {
        class179 var1 = this.field2821.field2833;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2833;
            return var1;
        }
    }

    @ObfuscatedName("fa.o()Lfp;")
    public class179 method3294() {
        class179 var1 = this.field2822;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2833;
            return var1;
        }
    }
}
