package deob;

@ObfuscatedName("fh")
public final class class170 {

    @ObfuscatedName("fh.j")
    public class172 field2743 = new class172();

    public class170() {
        this.field2743.field2747 = this.field2743;
        this.field2743.field2746 = this.field2743;
    }

    @ObfuscatedName("fh.j(Lfr;)V")
    public void method3196(class172 arg0) {
        if (arg0.field2746 != null) {
            arg0.method3219();
        }
        arg0.field2746 = this.field2743.field2746;
        arg0.field2747 = this.field2743;
        arg0.field2746.field2747 = arg0;
        arg0.field2747.field2746 = arg0;
    }

    @ObfuscatedName("fh.y(Lfr;)V")
    public void method3202(class172 arg0) {
        if (arg0.field2746 != null) {
            arg0.method3219();
        }
        arg0.field2746 = this.field2743;
        arg0.field2747 = this.field2743.field2747;
        arg0.field2746.field2747 = arg0;
        arg0.field2747.field2746 = arg0;
    }

    @ObfuscatedName("fh.x()Lfr;")
    public class172 method3198() {
        class172 var1 = this.field2743.field2747;
        if (this.field2743 == var1) {
            return null;
        } else {
            var1.method3219();
            return var1;
        }
    }

    @ObfuscatedName("fh.z()Lfr;")
    public class172 method3199() {
        class172 var1 = this.field2743.field2747;
        return this.field2743 == var1 ? null : var1;
    }

    @ObfuscatedName("fh.c()V")
    public void method3195() {
        while (true) {
            class172 var1 = this.field2743.field2747;
            if (this.field2743 == var1) {
                return;
            }
            var1.method3219();
        }
    }
}
