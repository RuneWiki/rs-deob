package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class191 implements Iterable {

    @ObfuscatedName("gx.n")
    public class195 field3003 = new class195();

    public class191() {
        this.field3003.field3008 = this.field3003;
        this.field3003.field3007 = this.field3003;
    }

    @ObfuscatedName("gx.n()V")
    public void method3500() {
        while (this.field3003.field3008 != this.field3003) {
            this.field3003.field3008.method3527();
        }
    }

    @ObfuscatedName("gx.g(Lge;)V")
    public void method3496(class195 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3527();
        }
        arg0.field3007 = this.field3003.field3007;
        arg0.field3008 = this.field3003;
        arg0.field3007.field3008 = arg0;
        arg0.field3008.field3007 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
