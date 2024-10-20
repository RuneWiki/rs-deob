package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class190 implements Iterable {

    @ObfuscatedName("gx.q")
    public class194 field2943 = new class194();

    public class190() {
        this.field2943.field2947 = this.field2943;
        this.field2943.field2948 = this.field2943;
    }

    @ObfuscatedName("gx.q()V")
    public void method3343() {
        while (this.field2943.field2947 != this.field2943) {
            this.field2943.field2947.method3386();
        }
    }

    @ObfuscatedName("gx.s(Lgb;)V")
    public void method3352(class194 arg0) {
        if (arg0.field2948 != null) {
            arg0.method3386();
        }
        arg0.field2948 = this.field2943.field2948;
        arg0.field2947 = this.field2943;
        arg0.field2948.field2947 = arg0;
        arg0.field2947.field2948 = arg0;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
