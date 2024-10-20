package deob;

import java.util.Iterator;

@ObfuscatedName("fc")
public class class177 implements Iterable {

    @ObfuscatedName("fc.y")
    public class180 field2819 = new class180();

    public class177() {
        this.field2819.field2822 = this.field2819;
        this.field2819.field2823 = this.field2819;
    }

    @ObfuscatedName("fc.y()V")
    public void method3240() {
        while (this.field2819.field2822 != this.field2819) {
            this.field2819.field2822.method3260();
        }
    }

    @ObfuscatedName("fc.u(Lft;)V")
    public void method3237(class180 arg0) {
        if (arg0.field2823 != null) {
            arg0.method3260();
        }
        arg0.field2823 = this.field2819.field2823;
        arg0.field2822 = this.field2819;
        arg0.field2823.field2822 = arg0;
        arg0.field2822.field2823 = arg0;
    }

    public Iterator iterator() {
        return new class181(this);
    }
}
