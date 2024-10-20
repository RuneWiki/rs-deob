package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class200 implements Iterable {

    @ObfuscatedName("gp.i")
    public class204 field3085 = new class204();

    public class200() {
        this.field3085.field3090 = this.field3085;
        this.field3085.field3089 = this.field3085;
    }

    @ObfuscatedName("gp.i()V")
    public void method3562() {
        while (this.field3085.field3090 != this.field3085) {
            this.field3085.field3090.method3602();
        }
    }

    @ObfuscatedName("gp.v(Lgn;)V")
    public void method3559(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3602();
        }
        arg0.field3089 = this.field3085.field3089;
        arg0.field3090 = this.field3085;
        arg0.field3089.field3090 = arg0;
        arg0.field3090.field3089 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
