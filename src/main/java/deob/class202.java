package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class202 implements Iterable {

    @ObfuscatedName("gu.d")
    public class195 field2505 = new class195();

    public class202() {
        this.field2505.field2491 = this.field2505;
        this.field2505.field2490 = this.field2505;
    }

    @ObfuscatedName("gu.d()V")
    public void method3482() {
        while (this.field2505.field2491 != this.field2505) {
            this.field2505.field2491.method3449();
        }
    }

    @ObfuscatedName("gu.k(Lgg;)V")
    public void method3486(class195 arg0) {
        if (arg0.field2490 != null) {
            arg0.method3449();
        }
        arg0.field2490 = this.field2505.field2490;
        arg0.field2491 = this.field2505;
        arg0.field2490.field2491 = arg0;
        arg0.field2491.field2490 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
