package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class205 implements Iterable {

    @ObfuscatedName("gg.s")
    public class198 field2506 = new class198();

    public class205() {
        this.field2506.field2492 = this.field2506;
        this.field2506.field2491 = this.field2506;
    }

    @ObfuscatedName("gg.s()V")
    public void method3459() {
        while (this.field2506.field2492 != this.field2506) {
            this.field2506.field2492.method3413();
        }
    }

    @ObfuscatedName("gg.c(Lgf;)V")
    public void method3450(class198 arg0) {
        if (arg0.field2491 != null) {
            arg0.method3413();
        }
        arg0.field2491 = this.field2506.field2491;
        arg0.field2492 = this.field2506;
        arg0.field2491.field2492 = arg0;
        arg0.field2492.field2491 = arg0;
    }

    public Iterator iterator() {
        return new class204(this);
    }
}
