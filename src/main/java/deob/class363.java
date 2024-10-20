package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mu")
public class class363 implements class362 {

    @ObfuscatedName("mu.f")
    public Map field4081;

    @ObfuscatedName("mu.o")
    public final class389 field4083;

    public class363(class389 arg0) {
        this.field4083 = arg0;
    }

    @ObfuscatedName("mu.f(II)I")
    public int method5656(int arg0) {
        if (this.field4081 != null) {
            class390 var2 = (class390) this.field4081.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4217;
            }
        }
        return (Integer) this.field4083.method5324(arg0);
    }

    @ObfuscatedName("mu.o(ILjava/lang/Object;B)V")
    public void method5651(int arg0, Object arg1) {
        if (this.field4081 == null) {
            this.field4081 = new HashMap();
            this.field4081.put(arg0, new class390(arg0, arg1));
            return;
        }
        class390 var3 = (class390) this.field4081.get(arg0);
        if (var3 == null) {
            this.field4081.put(arg0, new class390(arg0, arg1));
        } else {
            var3.field4217 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4081 == null ? Collections.emptyList().iterator() : this.field4081.values().iterator();
    }
}
