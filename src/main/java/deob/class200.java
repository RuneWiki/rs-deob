package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class200 implements Iterable {

    @ObfuscatedName("gh.y")
    public class204 field3077 = new class204();

    public class200() {
        this.field3077.field3081 = this.field3077;
        this.field3077.field3082 = this.field3077;
    }

    @ObfuscatedName("gh.y()V")
    public void method3527() {
        while (this.field3077.field3081 != this.field3077) {
            this.field3077.field3081.method3561();
        }
    }

    @ObfuscatedName("gh.d(Lgt;)V")
    public void method3525(class204 arg0) {
        if (arg0.field3082 != null) {
            arg0.method3561();
        }
        arg0.field3082 = this.field3077.field3082;
        arg0.field3081 = this.field3077;
        arg0.field3082.field3081 = arg0;
        arg0.field3081.field3082 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
