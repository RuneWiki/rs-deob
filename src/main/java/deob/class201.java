package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class201 implements Iterable {

    @ObfuscatedName("gy.e")
    public class205 field3101 = new class205();

    public class201() {
        this.field3101.field3106 = this.field3101;
        this.field3101.field3105 = this.field3101;
    }

    @ObfuscatedName("gy.e()V")
    public void method3575() {
        while (this.field3101.field3106 != this.field3101) {
            this.field3101.field3106.method3610();
        }
    }

    @ObfuscatedName("gy.w(Lgh;)V")
    public void method3573(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3610();
        }
        arg0.field3105 = this.field3101.field3105;
        arg0.field3106 = this.field3101;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
