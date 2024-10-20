package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("nx")
public class class382 implements class381 {

    @ObfuscatedName("nx.i")
    public Map field4223;

    @ObfuscatedName("nx.w")
    public final class408 field4220;

    public class382(class408 arg0) {
        this.field4220 = arg0;
    }

    @ObfuscatedName("nx.i(II)I")
    public int method6039(int arg0) {
        if (this.field4223 != null) {
            class409 var2 = (class409) this.field4223.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4362;
            }
        }
        return (Integer) this.field4220.method5702(arg0);
    }

    @ObfuscatedName("nx.w(ILjava/lang/Object;I)V")
    public void method6038(int arg0, Object arg1) {
        if (this.field4223 == null) {
            this.field4223 = new HashMap();
            this.field4223.put(arg0, new class409(arg0, arg1));
            return;
        }
        class409 var3 = (class409) this.field4223.get(arg0);
        if (var3 == null) {
            this.field4223.put(arg0, new class409(arg0, arg1));
        } else {
            var3.field4362 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4223 == null ? Collections.emptyList().iterator() : this.field4223.values().iterator();
    }
}
