package deob;

@ObfuscatedName("gz")
public final class class196 {

    @ObfuscatedName("gz.p")
    public class206 field2538 = new class206();

    public class196() {
        this.field2538.field2566 = this.field2538;
        this.field2538.field2567 = this.field2538;
    }

    @ObfuscatedName("gz.p(Lgf;)V")
    public void method3455(class206 arg0) {
        if (arg0.field2567 != null) {
            arg0.method3604();
        }
        arg0.field2567 = this.field2538.field2567;
        arg0.field2566 = this.field2538;
        arg0.field2567.field2566 = arg0;
        arg0.field2566.field2567 = arg0;
    }

    @ObfuscatedName("gz.i(Lgf;)V")
    public void method3456(class206 arg0) {
        if (arg0.field2567 != null) {
            arg0.method3604();
        }
        arg0.field2567 = this.field2538;
        arg0.field2566 = this.field2538.field2566;
        arg0.field2567.field2566 = arg0;
        arg0.field2566.field2567 = arg0;
    }

    @ObfuscatedName("gz.w()Lgf;")
    public class206 method3454() {
        class206 var1 = this.field2538.field2566;
        if (this.field2538 == var1) {
            return null;
        } else {
            var1.method3604();
            return var1;
        }
    }

    @ObfuscatedName("gz.s()Lgf;")
    public class206 method3457() {
        class206 var1 = this.field2538.field2566;
        return this.field2538 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.j()V")
    public void method3461() {
        while (true) {
            class206 var1 = this.field2538.field2566;
            if (this.field2538 == var1) {
                return;
            }
            var1.method3604();
        }
    }
}
