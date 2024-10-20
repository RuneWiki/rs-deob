package deob;

import java.util.Iterator;

@ObfuscatedName("hd")
public class class209 implements Iterable {

    @ObfuscatedName("hd.b")
    public class202 field2575 = new class202();

    public class209() {
        this.field2575.field2561 = this.field2575;
        this.field2575.field2560 = this.field2575;
    }

    @ObfuscatedName("hd.b()V")
    public void method3464() {
        while (this.field2575.field2561 != this.field2575) {
            this.field2575.field2561.method3428();
        }
    }

    @ObfuscatedName("hd.s(Lgh;)V")
    public void method3460(class202 arg0) {
        if (arg0.field2560 != null) {
            arg0.method3428();
        }
        arg0.field2560 = this.field2575.field2560;
        arg0.field2561 = this.field2575;
        arg0.field2560.field2561 = arg0;
        arg0.field2561.field2560 = arg0;
    }

    public Iterator iterator() {
        return new class208(this);
    }
}
