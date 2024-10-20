package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class191 implements Iterable {

    @ObfuscatedName("gm.t")
    public class195 field3000 = new class195();

    public class191() {
        this.field3000.field3005 = this.field3000;
        this.field3000.field3004 = this.field3000;
    }

    @ObfuscatedName("gm.t()V")
    public void method3450() {
        while (this.field3000.field3005 != this.field3000) {
            this.field3000.field3005.method3484();
        }
    }

    @ObfuscatedName("gm.b(Lgl;)V")
    public void method3447(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3484();
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
