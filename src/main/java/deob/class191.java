package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class191 implements Iterable {

    @ObfuscatedName("gk.o")
    public class195 field2999 = new class195();

    public class191() {
        this.field2999.field3004 = this.field2999;
        this.field2999.field3003 = this.field2999;
    }

    @ObfuscatedName("gk.o()V")
    public void method3505() {
        while (this.field2999.field3004 != this.field2999) {
            this.field2999.field3004.method3545();
        }
    }

    @ObfuscatedName("gk.l(Lgg;)V")
    public void method3507(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3545();
        }
        arg0.field3003 = this.field2999.field3003;
        arg0.field3004 = this.field2999;
        arg0.field3003.field3004 = arg0;
        arg0.field3004.field3003 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
