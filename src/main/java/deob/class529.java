package deob;

import java.util.Iterator;

@ObfuscatedName("un")
public class class529 implements Iterator {

    // $FF: synthetic field
    public final class530 this$0;

    @ObfuscatedName("un.aq")
    public int field5278;

    public class529(class530 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5278 < this.this$0.method8041();
    }

    public Object next() {
        int var1 = ++this.field5278 - 1;
        class489 var2 = (class489) this.this$0.field5279.method5473((long) var1);
        return var2 == null ? this.this$0.method8559(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
