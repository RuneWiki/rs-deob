package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("nv")
public class class365 implements class364 {

    @ObfuscatedName("nv.f")
    public Map field4080;

    @ObfuscatedName("nv.e")
    public final class391 field4081;

    public class365(class391 arg0) {
        this.field4081 = arg0;
    }

    @ObfuscatedName("nv.f(II)I")
    public int method5704(int arg0) {
        if (this.field4080 != null) {
            class392 var2 = (class392) this.field4080.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4228;
            }
        }
        return (Integer) this.field4081.method5376(arg0);
    }

    @ObfuscatedName("nv.e(ILjava/lang/Object;I)V")
    public void method5705(int arg0, Object arg1) {
        if (this.field4080 == null) {
            this.field4080 = new HashMap();
            this.field4080.put(arg0, new class392(arg0, arg1));
            return;
        }
        class392 var3 = (class392) this.field4080.get(arg0);
        if (var3 == null) {
            this.field4080.put(arg0, new class392(arg0, arg1));
        } else {
            var3.field4228 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4080 == null ? Collections.emptyList().iterator() : this.field4080.values().iterator();
    }
}
