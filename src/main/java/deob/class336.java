package deob;

import java.util.Iterator;

@ObfuscatedName("ll")
public class class336 implements Iterator {

    @ObfuscatedName("ll.o")
    public class337 field4144;

    @ObfuscatedName("ll.q")
    public class411 field4145;

    @ObfuscatedName("ll.l")
    public class411 field4146 = null;

    public class336(class337 arg0) {
        this.method5449(arg0);
    }

    @ObfuscatedName("ll.o(Llo;)V")
    public void method5449(class337 arg0) {
        this.field4144 = arg0;
        this.method5450();
    }

    @ObfuscatedName("ll.q()V")
    public void method5450() {
        this.field4145 = this.field4144 == null ? null : this.field4144.field4148.field4467;
        this.field4146 = null;
    }

    public Object next() {
        class411 var1 = this.field4145;
        if (this.field4144.field4148 == var1) {
            var1 = null;
            this.field4145 = null;
        } else {
            this.field4145 = var1.field4467;
        }
        this.field4146 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4144.field4148 != this.field4145 && this.field4145 != null;
    }

    public void remove() {
        if (this.field4146 == null) {
            throw new IllegalStateException();
        }
        this.field4146.method6399();
        this.field4146 = null;
    }
}
