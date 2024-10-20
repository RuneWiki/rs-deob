package deob;

import java.util.Iterator;

@ObfuscatedName("fp")
public class class181 implements Iterable {

    @ObfuscatedName("fp.x")
    public class185 field2866 = new class185();

    public class181() {
        this.field2866.field2870 = this.field2866;
        this.field2866.field2871 = this.field2866;
    }

    @ObfuscatedName("fp.x()V")
    public void method3280() {
        while (this.field2866.field2870 != this.field2866) {
            this.field2866.field2870.method3321();
        }
    }

    @ObfuscatedName("fp.v(Lga;)V")
    public void method3279(class185 arg0) {
        if (arg0.field2871 != null) {
            arg0.method3321();
        }
        arg0.field2871 = this.field2866.field2871;
        arg0.field2870 = this.field2866;
        arg0.field2871.field2870 = arg0;
        arg0.field2870.field2871 = arg0;
    }

    public Iterator iterator() {
        return new class187(this);
    }
}
