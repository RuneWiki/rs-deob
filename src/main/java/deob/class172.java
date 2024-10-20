package deob;

@ObfuscatedName("fq")
public final class class172 {

    @ObfuscatedName("fq.j")
    public class174 field2796 = new class174();

    public class172() {
        this.field2796.field2800 = this.field2796;
        this.field2796.field2799 = this.field2796;
    }

    @ObfuscatedName("fq.j(Lfa;)V")
    public void method3268(class174 arg0) {
        if (arg0.field2799 != null) {
            arg0.method3294();
        }
        arg0.field2799 = this.field2796.field2799;
        arg0.field2800 = this.field2796;
        arg0.field2799.field2800 = arg0;
        arg0.field2800.field2799 = arg0;
    }

    @ObfuscatedName("fq.f(Lfa;)V")
    public void method3273(class174 arg0) {
        if (arg0.field2799 != null) {
            arg0.method3294();
        }
        arg0.field2799 = this.field2796;
        arg0.field2800 = this.field2796.field2800;
        arg0.field2799.field2800 = arg0;
        arg0.field2800.field2799 = arg0;
    }

    @ObfuscatedName("fq.o()Lfa;")
    public class174 method3269() {
        class174 var1 = this.field2796.field2800;
        if (this.field2796 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("fq.h()Lfa;")
    public class174 method3270() {
        class174 var1 = this.field2796.field2800;
        return this.field2796 == var1 ? null : var1;
    }

    @ObfuscatedName("fq.u()V")
    public void method3271() {
        while (true) {
            class174 var1 = this.field2796.field2800;
            if (this.field2796 == var1) {
                return;
            }
            var1.method3294();
        }
    }
}
