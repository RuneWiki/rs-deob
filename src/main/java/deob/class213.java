package deob;

import java.util.Iterator;

@ObfuscatedName("hh")
public class class213 implements Iterable {

    @ObfuscatedName("hh.a")
    public class206 field2609 = new class206();

    public class213() {
        this.field2609.field2595 = this.field2609;
        this.field2609.field2594 = this.field2609;
    }

    @ObfuscatedName("hh.a()V")
    public void method3516() {
        while (this.field2609.field2595 != this.field2609) {
            this.field2609.field2595.method3474();
        }
    }

    @ObfuscatedName("hh.w(Lgi;)V")
    public void method3520(class206 arg0) {
        if (arg0.field2594 != null) {
            arg0.method3474();
        }
        arg0.field2594 = this.field2609.field2594;
        arg0.field2595 = this.field2609;
        arg0.field2594.field2595 = arg0;
        arg0.field2595.field2594 = arg0;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
