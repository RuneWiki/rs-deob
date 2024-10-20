package deob;

@ObfuscatedName("fr")
public final class class182 {

    @ObfuscatedName("fr.g")
    public class183 field2861 = new class183();

    public class182() {
        this.field2861.field2863 = this.field2861;
        this.field2861.field2862 = this.field2861;
    }

    @ObfuscatedName("fr.g(Lgc;)V")
    public void method3241(class183 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = this.field2861.field2862;
        arg0.field2863 = this.field2861;
        arg0.field2862.field2863 = arg0;
        arg0.field2863.field2862 = arg0;
    }

    @ObfuscatedName("fr.s(Lgc;)V")
    public void method3255(class183 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = this.field2861;
        arg0.field2863 = this.field2861.field2863;
        arg0.field2862.field2863 = arg0;
        arg0.field2863.field2862 = arg0;
    }

    @ObfuscatedName("fr.h()Lgc;")
    public class183 method3243() {
        class183 var1 = this.field2861.field2863;
        if (this.field2861 == var1) {
            return null;
        } else {
            var1.method3260();
            return var1;
        }
    }

    @ObfuscatedName("fr.m()Lgc;")
    public class183 method3244() {
        class183 var1 = this.field2861.field2863;
        return this.field2861 == var1 ? null : var1;
    }

    @ObfuscatedName("fr.u()V")
    public void method3245() {
        while (true) {
            class183 var1 = this.field2861.field2863;
            if (this.field2861 == var1) {
                return;
            }
            var1.method3260();
        }
    }
}
