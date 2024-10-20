package deob;

import java.util.Iterator;

@ObfuscatedName("ol")
public class class409 implements Iterator {

    // $FF: synthetic field
    public final class410 this$0;

    @ObfuscatedName("ol.c")
    public int field4481;

    public class409(class410 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4481 < this.this$0.method6119();
    }

    public Object next() {
        int var1 = ++this.field4481 - 1;
        class378 var2 = (class378) this.this$0.field4483.method4441((long) var1);
        return var2 == null ? this.this$0.method6538(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
