package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class201 implements Iterable {

    @ObfuscatedName("gq.b")
    public class205 field3100 = new class205();

    public class201() {
        this.field3100.field3104 = this.field3100;
        this.field3100.field3105 = this.field3100;
    }

    @ObfuscatedName("gq.b()V")
    public void method3592() {
        while (this.field3100.field3104 != this.field3100) {
            this.field3100.field3104.method3620();
        }
    }

    @ObfuscatedName("gq.g(Lgl;)V")
    public void method3589(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = this.field3100.field3105;
        arg0.field3104 = this.field3100;
        arg0.field3105.field3104 = arg0;
        arg0.field3104.field3105 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
