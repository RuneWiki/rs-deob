package deob;

import java.util.Iterator;

@ObfuscatedName("ss")
public class class485 implements Iterator {

    // $FF: synthetic field
    public final class486 this$0;

    @ObfuscatedName("ss.at")
    public int field4959;

    public class485(class486 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4959 < this.this$0.method7491();
    }

    public Object next() {
        int var1 = ++this.field4959 - 1;
        class445 var2 = (class445) this.this$0.field4962.method5091((long) var1);
        return var2 == null ? this.this$0.method7964(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
