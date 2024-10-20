package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class191 implements Iterable {

    @ObfuscatedName("gp.n")
    public class195 field2998 = new class195();

    public class191() {
        this.field2998.field3002 = this.field2998;
        this.field2998.field3003 = this.field2998;
    }

    @ObfuscatedName("gp.n()V")
    public void method3424() {
        while (this.field2998.field3002 != this.field2998) {
            this.field2998.field3002.method3450();
        }
    }

    @ObfuscatedName("gp.w(Lgo;)V")
    public void method3415(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3450();
        }
        arg0.field3003 = this.field2998.field3003;
        arg0.field3002 = this.field2998;
        arg0.field3003.field3002 = arg0;
        arg0.field3002.field3003 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
