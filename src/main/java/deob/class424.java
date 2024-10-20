package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pd")
public class class424 implements class423 {

    @ObfuscatedName("pd.c")
    public Map field4642;

    @ObfuscatedName("pd.p")
    public final class452 field4641;

    public class424(class452 arg0) {
        this.field4641 = arg0;
    }

    @ObfuscatedName("pd.c(IB)I")
    public int method6956(int arg0) {
        if (this.field4642 != null) {
            class453 var2 = (class453) this.field4642.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4798;
            }
        }
        return (Integer) this.field4641.method6595(arg0);
    }

    @ObfuscatedName("pd.p(ILjava/lang/Object;I)V")
    public void method6955(int arg0, Object arg1) {
        if (this.field4642 == null) {
            this.field4642 = new HashMap();
            this.field4642.put(arg0, new class453(arg0, arg1));
            return;
        }
        class453 var3 = (class453) this.field4642.get(arg0);
        if (var3 == null) {
            this.field4642.put(arg0, new class453(arg0, arg1));
        } else {
            var3.field4798 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4642 == null ? Collections.emptyList().iterator() : this.field4642.values().iterator();
    }
}
