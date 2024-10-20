package deob;

import java.util.Iterator;

@ObfuscatedName("op")
public class class377 implements Iterator {

    @ObfuscatedName("op.at")
    public class378 field4379;

    @ObfuscatedName("op.an")
    public class461 field4377;

    @ObfuscatedName("op.av")
    public class461 field4378 = null;

    public class377(class378 arg0) {
        this.method6347(arg0);
    }

    @ObfuscatedName("op.at(Lom;)V")
    public void method6347(class378 arg0) {
        this.field4379 = arg0;
        this.method6348();
    }

    @ObfuscatedName("op.an()V")
    public void method6348() {
        this.field4377 = this.field4379 == null ? null : this.field4379.field4381.field4756;
        this.field4378 = null;
    }

    public Object next() {
        class461 var1 = this.field4377;
        if (this.field4379.field4381 == var1) {
            var1 = null;
            this.field4377 = null;
        } else {
            this.field4377 = var1.field4756;
        }
        this.field4378 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4379.field4381 != this.field4377 && this.field4377 != null;
    }

    public void remove() {
        if (this.field4378 == null) {
            throw new IllegalStateException();
        }
        this.field4378.method7560();
        this.field4378 = null;
    }
}
