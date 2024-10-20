package deob;

import java.util.Iterator;

@ObfuscatedName("on")
public class class380 implements Iterator {

    @ObfuscatedName("on.aw")
    public class381 field4417;

    @ObfuscatedName("on.ay")
    public class474 field4416;

    @ObfuscatedName("on.ar")
    public class474 field4415 = null;

    public class380(class381 arg0) {
        this.method6400(arg0);
    }

    @ObfuscatedName("on.aw(Lor;)V")
    public void method6400(class381 arg0) {
        this.field4417 = arg0;
        this.method6405();
    }

    @ObfuscatedName("on.ay()V")
    public void method6405() {
        this.field4416 = this.field4417 == null ? null : this.field4417.field4418.field4820;
        this.field4415 = null;
    }

    public Object next() {
        class474 var1 = this.field4416;
        if (this.field4417.field4418 == var1) {
            var1 = null;
            this.field4416 = null;
        } else {
            this.field4416 = var1.field4820;
        }
        this.field4415 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4417.field4418 != this.field4416 && this.field4416 != null;
    }

    public void remove() {
        if (this.field4415 == null) {
            throw new IllegalStateException();
        }
        this.field4415.method7662();
        this.field4415 = null;
    }
}
