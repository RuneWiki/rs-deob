package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pi")
public class class423 implements class422 {

    @ObfuscatedName("pi.s")
    public Map field4607;

    @ObfuscatedName("pi.h")
    public final class451 field4606;

    public class423(class451 arg0) {
        this.field4606 = arg0;
    }

    @ObfuscatedName("pi.s(IB)I")
    public int method6699(int arg0) {
        if (this.field4607 != null) {
            class452 var2 = (class452) this.field4607.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4769;
            }
        }
        return (Integer) this.field4606.method6347(arg0);
    }

    @ObfuscatedName("pi.h(ILjava/lang/Object;B)V")
    public void method6701(int arg0, Object arg1) {
        if (this.field4607 == null) {
            this.field4607 = new HashMap();
            this.field4607.put(arg0, new class452(arg0, arg1));
            return;
        }
        class452 var3 = (class452) this.field4607.get(arg0);
        if (var3 == null) {
            this.field4607.put(arg0, new class452(arg0, arg1));
        } else {
            var3.field4769 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4607 == null ? Collections.emptyList().iterator() : this.field4607.values().iterator();
    }
}
