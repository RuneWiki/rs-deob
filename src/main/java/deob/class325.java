package deob;

import java.util.Iterator;

@ObfuscatedName("lo")
public class class325 implements Iterator {

    @ObfuscatedName("lo.c")
    public class326 field3971;

    @ObfuscatedName("lo.b")
    public class382 field3972;

    @ObfuscatedName("lo.p")
    public class382 field3973 = null;

    public class325(class326 arg0) {
        this.field3971 = arg0;
        this.field3972 = this.field3971.field3975.field4250;
        this.field3973 = null;
    }

    public Object next() {
        class382 var1 = this.field3972;
        if (this.field3971.field3975 == var1) {
            var1 = null;
            this.field3972 = null;
        } else {
            this.field3972 = var1.field4250;
        }
        this.field3973 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3971.field3975 != this.field3972;
    }

    public void remove() {
        if (this.field3973 == null) {
            throw new IllegalStateException();
        }
        this.field3973.method6159();
        this.field3973 = null;
    }
}
