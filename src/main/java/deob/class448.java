package deob;

import java.util.Iterator;

@ObfuscatedName("qz")
public class class448 implements Iterator {

    // $FF: synthetic field
    public final class449 this$0;

    @ObfuscatedName("qz.a")
    public int field4813;

    public class448(class449 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4813 < this.this$0.method7106();
    }

    public Object next() {
        int var1 = ++this.field4813 - 1;
        class414 var2 = (class414) this.this$0.field4819.method4812((long) var1);
        return var2 == null ? this.this$0.method7550(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
