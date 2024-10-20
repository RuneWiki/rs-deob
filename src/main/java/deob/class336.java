package deob;

import java.util.Iterator;

@ObfuscatedName("lt")
public class class336 implements Iterator {

    @ObfuscatedName("lt.v")
    public class337 field4086;

    @ObfuscatedName("lt.c")
    public class409 field4084;

    @ObfuscatedName("lt.i")
    public class409 field4085 = null;

    public class336(class337 arg0) {
        this.method5558(arg0);
    }

    @ObfuscatedName("lt.v(Llk;)V")
    public void method5558(class337 arg0) {
        this.field4086 = arg0;
        this.method5554();
    }

    @ObfuscatedName("lt.c()V")
    public void method5554() {
        this.field4084 = this.field4086 == null ? null : this.field4086.field4088.field4411;
        this.field4085 = null;
    }

    public Object next() {
        class409 var1 = this.field4084;
        if (this.field4086.field4088 == var1) {
            var1 = null;
            this.field4084 = null;
        } else {
            this.field4084 = var1.field4411;
        }
        this.field4085 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4086.field4088 != this.field4084 && this.field4084 != null;
    }

    public void remove() {
        if (this.field4085 == null) {
            throw new IllegalStateException();
        }
        this.field4085.method6503();
        this.field4085 = null;
    }
}
