package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("nb")
public class class381 implements class380 {

    @ObfuscatedName("nb.n")
    public Map field4197;

    @ObfuscatedName("nb.c")
    public final class407 field4196;

    public class381(class407 arg0) {
        this.field4196 = arg0;
    }

    @ObfuscatedName("nb.n(II)I")
    public int method6037(int arg0) {
        if (this.field4197 != null) {
            class408 var2 = (class408) this.field4197.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4341;
            }
        }
        return (Integer) this.field4196.method5688(arg0);
    }

    @ObfuscatedName("nb.c(ILjava/lang/Object;I)V")
    public void method6036(int arg0, Object arg1) {
        if (this.field4197 == null) {
            this.field4197 = new HashMap();
            this.field4197.put(arg0, new class408(arg0, arg1));
            return;
        }
        class408 var3 = (class408) this.field4197.get(arg0);
        if (var3 == null) {
            this.field4197.put(arg0, new class408(arg0, arg1));
        } else {
            var3.field4341 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4197 == null ? Collections.emptyList().iterator() : this.field4197.values().iterator();
    }
}
