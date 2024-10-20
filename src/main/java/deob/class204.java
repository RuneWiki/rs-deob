package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class204 implements Iterable {

    @ObfuscatedName("ge.i")
    public class208 field3159 = new class208();

    public class204() {
        this.field3159.field3164 = this.field3159;
        this.field3159.field3165 = this.field3159;
    }

    @ObfuscatedName("ge.i()V")
    public void method3621() {
        while (this.field3159.field3164 != this.field3159) {
            this.field3159.field3164.method3676();
        }
    }

    @ObfuscatedName("ge.h(Lgw;)V")
    public void method3628(class208 arg0) {
        if (arg0.field3165 != null) {
            arg0.method3676();
        }
        arg0.field3165 = this.field3159.field3165;
        arg0.field3164 = this.field3159;
        arg0.field3165.field3164 = arg0;
        arg0.field3164.field3165 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
