package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class201 implements Iterable {

    @ObfuscatedName("gz.t")
    public class205 field3111 = new class205();

    public class201() {
        this.field3111.field3115 = this.field3111;
        this.field3111.field3116 = this.field3111;
    }

    @ObfuscatedName("gz.t()V")
    public void method3543() {
        while (this.field3111.field3115 != this.field3111) {
            this.field3111.field3115.method3581();
        }
    }

    @ObfuscatedName("gz.i(Lgn;)V")
    public void method3545(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3581();
        }
        arg0.field3116 = this.field3111.field3116;
        arg0.field3115 = this.field3111;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
