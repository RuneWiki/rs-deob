package deob;

import java.util.Iterator;

@ObfuscatedName("md")
public class class340 implements Iterator {

    @ObfuscatedName("md.c")
    public class341 field4177;

    @ObfuscatedName("md.p")
    public class407 field4178;

    @ObfuscatedName("md.f")
    public class407 field4176 = null;

    public class340(class341 arg0) {
        this.field4177 = arg0;
        this.field4178 = this.field4177.field4180.field4498;
        this.field4176 = null;
    }

    public Object next() {
        class407 var1 = this.field4178;
        if (this.field4177.field4180 == var1) {
            var1 = null;
            this.field4178 = null;
        } else {
            this.field4178 = var1.field4498;
        }
        this.field4176 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4177.field4180 != this.field4178;
    }

    public void remove() {
        if (this.field4176 == null) {
            throw new IllegalStateException();
        }
        this.field4176.method6653();
        this.field4176 = null;
    }
}
