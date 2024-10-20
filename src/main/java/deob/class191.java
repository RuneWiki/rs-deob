package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class191 implements Iterable {

    @ObfuscatedName("gq.p")
    public class195 field3000 = new class195();

    public class191() {
        this.field3000.field3005 = this.field3000;
        this.field3000.field3004 = this.field3000;
    }

    @ObfuscatedName("gq.p()V")
    public void method3479() {
        while (this.field3000.field3005 != this.field3000) {
            this.field3000.field3005.method3519();
        }
    }

    @ObfuscatedName("gq.k(Lgk;)V")
    public void method3474(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3519();
        }
        arg0.field3004 = this.field3000.field3004;
        arg0.field3005 = this.field3000;
        arg0.field3004.field3005 = arg0;
        arg0.field3005.field3004 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
