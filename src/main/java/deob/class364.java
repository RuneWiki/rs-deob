package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mt")
public class class364 implements class363 {

    @ObfuscatedName("mt.v")
    public Map field4083;

    @ObfuscatedName("mt.n")
    public final class390 field4079;

    public class364(class390 arg0) {
        this.field4079 = arg0;
    }

    @ObfuscatedName("mt.v(II)I")
    public int method5790(int arg0) {
        if (this.field4083 != null) {
            class391 var2 = (class391) this.field4083.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4219;
            }
        }
        return (Integer) this.field4079.method5458(arg0);
    }

    @ObfuscatedName("mt.n(ILjava/lang/Object;I)V")
    public void method5791(int arg0, Object arg1) {
        if (this.field4083 == null) {
            this.field4083 = new HashMap();
            this.field4083.put(arg0, new class391(arg0, arg1));
            return;
        }
        class391 var3 = (class391) this.field4083.get(arg0);
        if (var3 == null) {
            this.field4083.put(arg0, new class391(arg0, arg1));
        } else {
            var3.field4219 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4083 == null ? Collections.emptyList().iterator() : this.field4083.values().iterator();
    }
}
