package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("nt")
public class class382 implements class381 {

    @ObfuscatedName("nt.l")
    public Map field4217;

    @ObfuscatedName("nt.q")
    public final class408 field4216;

    public class382(class408 arg0) {
        this.field4216 = arg0;
    }

    @ObfuscatedName("nt.l(II)I")
    public int method6076(int arg0) {
        if (this.field4217 != null) {
            class409 var2 = (class409) this.field4217.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4354;
            }
        }
        return (Integer) this.field4216.method5720(arg0);
    }

    @ObfuscatedName("nt.q(ILjava/lang/Object;I)V")
    public void method6078(int arg0, Object arg1) {
        if (this.field4217 == null) {
            this.field4217 = new HashMap();
            this.field4217.put(arg0, new class409(arg0, arg1));
            return;
        }
        class409 var3 = (class409) this.field4217.get(arg0);
        if (var3 == null) {
            this.field4217.put(arg0, new class409(arg0, arg1));
        } else {
            var3.field4354 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4217 == null ? Collections.emptyList().iterator() : this.field4217.values().iterator();
    }
}
