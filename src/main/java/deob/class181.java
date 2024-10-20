package deob;

import java.util.Iterator;

@ObfuscatedName("fv")
public class class181 implements Iterable {

    @ObfuscatedName("fv.e")
    public class185 field2880 = new class185();

    public class181() {
        this.field2880.field2884 = this.field2880;
        this.field2880.field2885 = this.field2880;
    }

    @ObfuscatedName("fv.e()V")
    public void method3261() {
        while (this.field2880.field2884 != this.field2880) {
            this.field2880.field2884.method3299();
        }
    }

    @ObfuscatedName("fv.v(Lgr;)V")
    public void method3256(class185 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3299();
        }
        arg0.field2885 = this.field2880.field2885;
        arg0.field2884 = this.field2880;
        arg0.field2885.field2884 = arg0;
        arg0.field2884.field2885 = arg0;
    }

    public Iterator iterator() {
        return new class187(this);
    }
}
