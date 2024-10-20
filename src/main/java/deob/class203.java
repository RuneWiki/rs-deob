package deob;

@ObfuscatedName("gr")
public final class class203 {

    @ObfuscatedName("gr.d")
    public class204 field3094 = new class204();

    public class203() {
        this.field3094.field3096 = this.field3094;
        this.field3094.field3095 = this.field3094;
    }

    @ObfuscatedName("gr.d(Lgt;)V")
    public void method3670(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3680();
        }
        arg0.field3095 = this.field3094.field3095;
        arg0.field3096 = this.field3094;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gr.p(Lgt;)V")
    public void method3666(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3680();
        }
        arg0.field3095 = this.field3094;
        arg0.field3096 = this.field3094.field3096;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    @ObfuscatedName("gr.v()Lgt;")
    public class204 method3667() {
        class204 var1 = this.field3094.field3096;
        if (this.field3094 == var1) {
            return null;
        } else {
            var1.method3680();
            return var1;
        }
    }

    @ObfuscatedName("gr.l()Lgt;")
    public class204 method3668() {
        class204 var1 = this.field3094.field3096;
        return this.field3094 == var1 ? null : var1;
    }

    @ObfuscatedName("gr.y()V")
    public void method3675() {
        while (true) {
            class204 var1 = this.field3094.field3096;
            if (this.field3094 == var1) {
                return;
            }
            var1.method3680();
        }
    }
}
