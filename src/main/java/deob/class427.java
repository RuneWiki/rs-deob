package deob;

import java.util.Iterator;

@ObfuscatedName("ph")
public class class427 implements Iterator {

    // $FF: synthetic field
    public final class428 this$0;

    @ObfuscatedName("ph.c")
    public int field4645;

    public class427(class428 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4645 < this.this$0.method6427();
    }

    public Object next() {
        int var1 = ++this.field4645 - 1;
        class394 var2 = (class394) this.this$0.field4649.method4664((long) var1);
        return var2 == null ? this.this$0.method6861(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
