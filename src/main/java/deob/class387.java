package deob;

import java.util.Iterator;

@ObfuscatedName("nk")
public class class387 implements Iterator {

    // $FF: synthetic field
    public final class388 this$0;

    @ObfuscatedName("nk.i")
    public int field4257;

    public class387(class388 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4257 < this.this$0.method5701();
    }

    public Object next() {
        int var1 = ++this.field4257 - 1;
        class356 var2 = (class356) this.this$0.field4261.method4179((long) var1);
        return var2 == null ? this.this$0.method6119(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
