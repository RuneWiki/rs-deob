package deob;

import java.util.Iterator;

@ObfuscatedName("pu")
public class class409 implements Iterator {

    @ObfuscatedName("pu.ab")
    public class410 field4627;

    @ObfuscatedName("pu.ay")
    public class506 field4628;

    @ObfuscatedName("pu.an")
    public class506 field4629 = null;

    public class409(class410 arg0) {
        this.method6928(arg0);
    }

    @ObfuscatedName("pu.ab(Lpf;)V")
    public void method6928(class410 arg0) {
        this.field4627 = arg0;
        this.method6929();
    }

    @ObfuscatedName("pu.ay()V")
    public void method6929() {
        this.field4628 = this.field4627 == null ? null : this.field4627.field4631.field5074;
        this.field4629 = null;
    }

    public Object next() {
        class506 var1 = this.field4628;
        if (this.field4627.field4631 == var1) {
            var1 = null;
            this.field4628 = null;
        } else {
            this.field4628 = var1.field5074;
        }
        this.field4629 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4627.field4631 != this.field4628 && this.field4628 != null;
    }

    public void remove() {
        if (this.field4629 == null) {
            throw new IllegalStateException();
        }
        this.field4629.method8218();
        this.field4629 = null;
    }
}
