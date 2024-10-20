package deob;

import java.util.Iterator;

@ObfuscatedName("ul")
public class class532 implements Iterator {

    // $FF: synthetic field
    public final class533 this$0;

    @ObfuscatedName("ul.ac")
    public int field5319;

    public class532(class533 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5319 < this.this$0.method8281();
    }

    public Object next() {
        int var1 = ++this.field5319 - 1;
        class492 var2 = (class492) this.this$0.field5321.method5703((long) var1);
        return var2 == null ? this.this$0.method8788(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
