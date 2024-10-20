package deob;

import java.util.Iterator;

@ObfuscatedName("tx")
public class class509 implements Iterator {

    // $FF: synthetic field
    public final class510 this$0;

    @ObfuscatedName("tx.at")
    public int field5051;

    public class509(class510 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5051 < this.this$0.method7758();
    }

    public Object next() {
        int var1 = ++this.field5051 - 1;
        class469 var2 = (class469) this.this$0.field5055.method5254((long) var1);
        return var2 == null ? this.this$0.method8250(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
