package deob;

import java.util.Iterator;

@ObfuscatedName("ng")
public class class386 implements Iterator {

    // $FF: synthetic field
    public final class387 this$0;

    @ObfuscatedName("ng.n")
    public int field4229;

    public class386(class387 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4229 < this.this$0.method5679();
    }

    public Object next() {
        int var1 = ++this.field4229 - 1;
        class355 var2 = (class355) this.this$0.field4231.method4136((long) var1);
        return var2 == null ? this.this$0.method6102(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
