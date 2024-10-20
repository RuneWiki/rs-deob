package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class200 implements Iterable {

    @ObfuscatedName("gc.m")
    public class204 field3079 = new class204();

    public class200() {
        this.field3079.field3083 = this.field3079;
        this.field3079.field3084 = this.field3079;
    }

    @ObfuscatedName("gc.m()V")
    public void method3642() {
        while (this.field3079.field3083 != this.field3079) {
            this.field3079.field3083.method3685();
        }
    }

    @ObfuscatedName("gc.l(Lgb;)V")
    public void method3647(class204 arg0) {
        if (arg0.field3084 != null) {
            arg0.method3685();
        }
        arg0.field3084 = this.field3079.field3084;
        arg0.field3083 = this.field3079;
        arg0.field3084.field3083 = arg0;
        arg0.field3083.field3084 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
