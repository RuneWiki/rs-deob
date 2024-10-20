package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("om")
public class class399 implements class398 {

    @ObfuscatedName("om.c")
    public Map field4397;

    @ObfuscatedName("om.b")
    public final class426 field4395;

    public class399(class426 arg0) {
        this.field4395 = arg0;
    }

    @ObfuscatedName("om.c(II)I")
    public int method6469(int arg0) {
        if (this.field4397 != null) {
            class427 var2 = (class427) this.field4397.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4538;
            }
        }
        return (Integer) this.field4395.method6112(arg0);
    }

    @ObfuscatedName("om.b(ILjava/lang/Object;I)V")
    public void method6464(int arg0, Object arg1) {
        if (this.field4397 == null) {
            this.field4397 = new HashMap();
            this.field4397.put(arg0, new class427(arg0, arg1));
            return;
        }
        class427 var3 = (class427) this.field4397.get(arg0);
        if (var3 == null) {
            this.field4397.put(arg0, new class427(arg0, arg1));
        } else {
            var3.field4538 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4397 == null ? Collections.emptyList().iterator() : this.field4397.values().iterator();
    }
}
