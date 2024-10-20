package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class200 implements Iterable {

    @ObfuscatedName("gt.h")
    public class204 field3079 = new class204();

    public class200() {
        this.field3079.field3084 = this.field3079;
        this.field3079.field3083 = this.field3079;
    }

    @ObfuscatedName("gt.h()V")
    public void method3643() {
        while (this.field3079.field3084 != this.field3079) {
            this.field3079.field3084.method3689();
        }
    }

    @ObfuscatedName("gt.q(Lgo;)V")
    public void method3644(class204 arg0) {
        if (arg0.field3083 != null) {
            arg0.method3689();
        }
        arg0.field3083 = this.field3079.field3083;
        arg0.field3084 = this.field3079;
        arg0.field3083.field3084 = arg0;
        arg0.field3084.field3083 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
