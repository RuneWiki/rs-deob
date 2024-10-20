package deob;

@ObfuscatedName("fr")
public final class class172 {

    @ObfuscatedName("fr.q")
    public class174 field2814 = new class174();

    public class172() {
        this.field2814.field2818 = this.field2814;
        this.field2814.field2817 = this.field2814;
    }

    @ObfuscatedName("fr.q(Lfa;)V")
    public void method3227(class174 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3255();
        }
        arg0.field2817 = this.field2814.field2817;
        arg0.field2818 = this.field2814;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fr.c(Lfa;)V")
    public void method3228(class174 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3255();
        }
        arg0.field2817 = this.field2814;
        arg0.field2818 = this.field2814.field2818;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fr.p()Lfa;")
    public class174 method3234() {
        class174 var1 = this.field2814.field2818;
        if (this.field2814 == var1) {
            return null;
        } else {
            var1.method3255();
            return var1;
        }
    }

    @ObfuscatedName("fr.z()Lfa;")
    public class174 method3229() {
        class174 var1 = this.field2814.field2818;
        return this.field2814 == var1 ? null : var1;
    }

    @ObfuscatedName("fr.m()V")
    public void method3231() {
        while (true) {
            class174 var1 = this.field2814.field2818;
            if (this.field2814 == var1) {
                return;
            }
            var1.method3255();
        }
    }
}
