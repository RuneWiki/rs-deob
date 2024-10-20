package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class202 implements Iterable {

    @ObfuscatedName("gm.c")
    public class195 field2457 = new class195();

    public class202() {
        this.field2457.field2442 = this.field2457;
        this.field2457.field2443 = this.field2457;
    }

    @ObfuscatedName("gm.c()V")
    public void method3362() {
        while (this.field2457.field2442 != this.field2457) {
            this.field2457.field2442.method3320();
        }
    }

    @ObfuscatedName("gm.o(Lgc;)V")
    public void method3365(class195 arg0) {
        if (arg0.field2443 != null) {
            arg0.method3320();
        }
        arg0.field2443 = this.field2457.field2443;
        arg0.field2442 = this.field2457;
        arg0.field2443.field2442 = arg0;
        arg0.field2442.field2443 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
