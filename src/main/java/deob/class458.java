package deob;

import java.util.Iterator;

@ObfuscatedName("qb")
public class class458 implements Iterator {

    // $FF: synthetic field
    public final class459 this$0;

    @ObfuscatedName("qb.f")
    public int field4885;

    public class458(class459 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4885 < this.this$0.method7371();
    }

    public Object next() {
        int var1 = ++this.field4885 - 1;
        class424 var2 = (class424) this.this$0.field4889.method4996((long) var1);
        return var2 == null ? this.this$0.method7807(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
