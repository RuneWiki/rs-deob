package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class200 implements Iterable {

    @ObfuscatedName("gf.a")
    public class204 field3096 = new class204();

    public class200() {
        this.field3096.field3101 = this.field3096;
        this.field3096.field3100 = this.field3096;
    }

    @ObfuscatedName("gf.a()V")
    public void method3598() {
        while (this.field3096.field3101 != this.field3096) {
            this.field3096.field3101.method3635();
        }
    }

    @ObfuscatedName("gf.r(Lgq;)V")
    public void method3597(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3635();
        }
        arg0.field3100 = this.field3096.field3100;
        arg0.field3101 = this.field3096;
        arg0.field3100.field3101 = arg0;
        arg0.field3101.field3100 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
