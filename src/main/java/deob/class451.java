package deob;

import java.util.Iterator;

@ObfuscatedName("qv")
public class class451 implements Iterator {

    // $FF: synthetic field
    public final class452 this$0;

    @ObfuscatedName("qv.h")
    public int field4862;

    public class451(class452 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4862 < this.this$0.method7164();
    }

    public Object next() {
        int var1 = ++this.field4862 - 1;
        class417 var2 = (class417) this.this$0.field4865.method4881((long) var1);
        return var2 == null ? this.this$0.method7626(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
