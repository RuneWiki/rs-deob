package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class190 implements Iterable {

    @ObfuscatedName("gi.e")
    public class194 field2948 = new class194();

    public class190() {
        this.field2948.field2952 = this.field2948;
        this.field2948.field2953 = this.field2948;
    }

    @ObfuscatedName("gi.e()V")
    public void method3405() {
        while (this.field2948.field2952 != this.field2948) {
            this.field2948.field2952.method3440();
        }
    }

    @ObfuscatedName("gi.a(Lgd;)V")
    public void method3407(class194 arg0) {
        if (arg0.field2953 != null) {
            arg0.method3440();
        }
        arg0.field2953 = this.field2948.field2953;
        arg0.field2952 = this.field2948;
        arg0.field2953.field2952 = arg0;
        arg0.field2952.field2953 = arg0;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
