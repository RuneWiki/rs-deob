package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class191 implements Iterable {

    @ObfuscatedName("gw.y")
    public class195 field3010 = new class195();

    public class191() {
        this.field3010.field3014 = this.field3010;
        this.field3010.field3015 = this.field3010;
    }

    @ObfuscatedName("gw.y()V")
    public void method3424() {
        while (this.field3010.field3014 != this.field3010) {
            this.field3010.field3014.method3461();
        }
    }

    @ObfuscatedName("gw.k(Lgp;)V")
    public void method3426(class195 arg0) {
        if (arg0.field3015 != null) {
            arg0.method3461();
        }
        arg0.field3015 = this.field3010.field3015;
        arg0.field3014 = this.field3010;
        arg0.field3015.field3014 = arg0;
        arg0.field3014.field3015 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
