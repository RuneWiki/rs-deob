package deob;

import java.util.Iterator;

@ObfuscatedName("tt")
public class class498 implements Iterator {

    // $FF: synthetic field
    public final class499 this$0;

    @ObfuscatedName("tt.aw")
    public int field5018;

    public class498(class499 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5018 < this.this$0.method7592();
    }

    public Object next() {
        int var1 = ++this.field5018 - 1;
        class458 var2 = (class458) this.this$0.field5019.method5116((long) var1);
        return var2 == null ? this.this$0.method8075(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
