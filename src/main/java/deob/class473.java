package deob;

import java.util.Iterator;

@ObfuscatedName("sn")
public class class473 implements Iterator {

    // $FF: synthetic field
    public final class474 this$0;

    @ObfuscatedName("sn.af")
    public int field4936;

    public class473(class474 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4936 < this.this$0.method7562();
    }

    public Object next() {
        int var1 = ++this.field4936 - 1;
        class432 var2 = (class432) this.this$0.field4937.method5084((long) var1);
        return var2 == null ? this.this$0.method8070(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
