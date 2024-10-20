package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qn")
public class class443 implements class442 {

    @ObfuscatedName("qn.a")
    public Map field4781;

    @ObfuscatedName("qn.f")
    public final class471 field4782;

    public class443(class471 arg0) {
        this.field4782 = arg0;
    }

    @ObfuscatedName("qn.a(IB)I")
    public int method7486(int arg0) {
        if (this.field4781 != null) {
            class472 var2 = (class472) this.field4781.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4931;
            }
        }
        return (Integer) this.field4782.method7107(arg0);
    }

    @ObfuscatedName("qn.f(ILjava/lang/Object;B)V")
    public void method7483(int arg0, Object arg1) {
        if (this.field4781 == null) {
            this.field4781 = new HashMap();
            this.field4781.put(arg0, new class472(arg0, arg1));
            return;
        }
        class472 var3 = (class472) this.field4781.get(arg0);
        if (var3 == null) {
            this.field4781.put(arg0, new class472(arg0, arg1));
        } else {
            var3.field4931 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4781 == null ? Collections.emptyList().iterator() : this.field4781.values().iterator();
    }
}
