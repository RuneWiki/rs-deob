package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class200 implements Iterable {

    @ObfuscatedName("gi.j")
    public class204 field3097 = new class204();

    public class200() {
        this.field3097.field3101 = this.field3097;
        this.field3097.field3102 = this.field3097;
    }

    @ObfuscatedName("gi.j()V")
    public void method3553() {
        while (this.field3097.field3101 != this.field3097) {
            this.field3097.field3101.method3590();
        }
    }

    @ObfuscatedName("gi.l(Lgj;)V")
    public void method3554(class204 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3590();
        }
        arg0.field3102 = this.field3097.field3102;
        arg0.field3101 = this.field3097;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
