package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class200 implements Iterable {

    @ObfuscatedName("gs.i")
    public class204 field3084 = new class204();

    public class200() {
        this.field3084.field3088 = this.field3084;
        this.field3084.field3089 = this.field3084;
    }

    @ObfuscatedName("gs.i()V")
    public void method3562() {
        while (this.field3084.field3088 != this.field3084) {
            this.field3084.field3088.method3605();
        }
    }

    @ObfuscatedName("gs.v(Lgr;)V")
    public void method3563(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3605();
        }
        arg0.field3089 = this.field3084.field3089;
        arg0.field3088 = this.field3084;
        arg0.field3089.field3088 = arg0;
        arg0.field3088.field3089 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
