package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class203 implements Iterable {

    @ObfuscatedName("gj.e")
    public class196 field2471 = new class196();

    public class203() {
        this.field2471.field2456 = this.field2471;
        this.field2471.field2457 = this.field2471;
    }

    @ObfuscatedName("gj.e()V")
    public void method3418() {
        while (this.field2471.field2456 != this.field2471) {
            this.field2471.field2456.method3380();
        }
    }

    @ObfuscatedName("gj.n(Lgz;)V")
    public void method3420(class196 arg0) {
        if (arg0.field2457 != null) {
            arg0.method3380();
        }
        arg0.field2457 = this.field2471.field2457;
        arg0.field2456 = this.field2471;
        arg0.field2457.field2456 = arg0;
        arg0.field2456.field2457 = arg0;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
