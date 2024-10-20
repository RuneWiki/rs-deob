package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class204 implements Iterable {

    @ObfuscatedName("gy.l")
    public class208 field3159 = new class208();

    public class204() {
        this.field3159.field3165 = this.field3159;
        this.field3159.field3164 = this.field3159;
    }

    @ObfuscatedName("gy.l()V")
    public void method3750() {
        while (this.field3159.field3165 != this.field3159) {
            this.field3159.field3165.method3793();
        }
    }

    @ObfuscatedName("gy.g(Lgm;)V")
    public void method3749(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3793();
        }
        arg0.field3164 = this.field3159.field3164;
        arg0.field3165 = this.field3159;
        arg0.field3164.field3165 = arg0;
        arg0.field3165.field3164 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
