package deob;

import java.util.Iterator;

@ObfuscatedName("tn")
public class class497 implements Iterator {

    // $FF: synthetic field
    public final class498 this$0;

    @ObfuscatedName("tn.au")
    public int field5019;

    public class497(class498 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5019 < this.this$0.method7626();
    }

    public Object next() {
        int var1 = ++this.field5019 - 1;
        class457 var2 = (class457) this.this$0.field5022.method5146((long) var1);
        return var2 == null ? this.this$0.method8143(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
