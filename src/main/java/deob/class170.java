package deob;

@ObfuscatedName("fz")
public final class class170 {

    @ObfuscatedName("fz.c")
    public class172 field2743 = new class172();

    public class170() {
        this.field2743.field2746 = this.field2743;
        this.field2743.field2747 = this.field2743;
    }

    @ObfuscatedName("fz.c(Lfa;)V")
    public void method3108(class172 arg0) {
        if (arg0.field2747 != null) {
            arg0.method3127();
        }
        arg0.field2747 = this.field2743.field2747;
        arg0.field2746 = this.field2743;
        arg0.field2747.field2746 = arg0;
        arg0.field2746.field2747 = arg0;
    }

    @ObfuscatedName("fz.j(Lfa;)V")
    public void method3103(class172 arg0) {
        if (arg0.field2747 != null) {
            arg0.method3127();
        }
        arg0.field2747 = this.field2743;
        arg0.field2746 = this.field2743.field2746;
        arg0.field2747.field2746 = arg0;
        arg0.field2746.field2747 = arg0;
    }

    @ObfuscatedName("fz.f()Lfa;")
    public class172 method3101() {
        class172 var1 = this.field2743.field2746;
        if (this.field2743 == var1) {
            return null;
        } else {
            var1.method3127();
            return var1;
        }
    }

    @ObfuscatedName("fz.y()Lfa;")
    public class172 method3105() {
        class172 var1 = this.field2743.field2746;
        return this.field2743 == var1 ? null : var1;
    }

    @ObfuscatedName("fz.x()V")
    public void method3106() {
        while (true) {
            class172 var1 = this.field2743.field2746;
            if (this.field2743 == var1) {
                return;
            }
            var1.method3127();
        }
    }
}
