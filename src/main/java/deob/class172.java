package deob;

@ObfuscatedName("fk")
public final class class172 {

    @ObfuscatedName("fk.b")
    public class174 field2810 = new class174();

    public class172() {
        this.field2810.field2814 = this.field2810;
        this.field2810.field2813 = this.field2810;
    }

    @ObfuscatedName("fk.b(Lfw;)V")
    public void method3202(class174 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3223();
        }
        arg0.field2813 = this.field2810.field2813;
        arg0.field2814 = this.field2810;
        arg0.field2813.field2814 = arg0;
        arg0.field2814.field2813 = arg0;
    }

    @ObfuscatedName("fk.c(Lfw;)V")
    public void method3203(class174 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3223();
        }
        arg0.field2813 = this.field2810;
        arg0.field2814 = this.field2810.field2814;
        arg0.field2813.field2814 = arg0;
        arg0.field2814.field2813 = arg0;
    }

    @ObfuscatedName("fk.j()Lfw;")
    public class174 method3214() {
        class174 var1 = this.field2810.field2814;
        if (this.field2810 == var1) {
            return null;
        } else {
            var1.method3223();
            return var1;
        }
    }

    @ObfuscatedName("fk.i()Lfw;")
    public class174 method3211() {
        class174 var1 = this.field2810.field2814;
        return this.field2810 == var1 ? null : var1;
    }

    @ObfuscatedName("fk.k()V")
    public void method3209() {
        while (true) {
            class174 var1 = this.field2810.field2814;
            if (this.field2810 == var1) {
                return;
            }
            var1.method3223();
        }
    }
}
