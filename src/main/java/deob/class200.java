package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class200 implements Iterable {

    @ObfuscatedName("gn.v")
    public class204 field3100 = new class204();

    public class200() {
        this.field3100.field3105 = this.field3100;
        this.field3100.field3104 = this.field3100;
    }

    @ObfuscatedName("gn.v()V")
    public void method3589() {
        while (this.field3100.field3105 != this.field3100) {
            this.field3100.field3105.method3623();
        }
    }

    @ObfuscatedName("gn.f(Lgk;)V")
    public void method3587(class204 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3623();
        }
        arg0.field3104 = this.field3100.field3104;
        arg0.field3105 = this.field3100;
        arg0.field3104.field3105 = arg0;
        arg0.field3105.field3104 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
