package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qc")
public class class446 implements class445 {

    @ObfuscatedName("qc.h")
    public Map field4827;

    @ObfuscatedName("qc.e")
    public final class475 field4828;

    public class446(class475 arg0) {
        this.field4828 = arg0;
    }

    @ObfuscatedName("qc.h(IB)I")
    public int method7544(int arg0) {
        if (this.field4827 != null) {
            class476 var2 = (class476) this.field4827.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4982;
            }
        }
        return (Integer) this.field4828.method7165(arg0);
    }

    @ObfuscatedName("qc.e(ILjava/lang/Object;I)V")
    public void method7541(int arg0, Object arg1) {
        if (this.field4827 == null) {
            this.field4827 = new HashMap();
            this.field4827.put(arg0, new class476(arg0, arg1));
            return;
        }
        class476 var3 = (class476) this.field4827.get(arg0);
        if (var3 == null) {
            this.field4827.put(arg0, new class476(arg0, arg1));
        } else {
            var3.field4982 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4827 == null ? Collections.emptyList().iterator() : this.field4827.values().iterator();
    }
}
