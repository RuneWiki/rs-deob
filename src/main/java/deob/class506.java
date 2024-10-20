package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ty")
public class class506 implements class505 {

    @ObfuscatedName("ty.ac")
    public Map field5024;

    @ObfuscatedName("ty.al")
    public final class538 field5023;

    public class506(class538 arg0) {
        this.field5023 = arg0;
    }

    @ObfuscatedName("ty.ac(II)I")
    public int method8109(int arg0) {
        if (this.field5024 != null) {
            class539 var2 = (class539) this.field5024.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5205;
            }
        }
        return (Integer) this.field5023.method7687(arg0);
    }

    @ObfuscatedName("ty.al(ILjava/lang/Object;B)V")
    public void method8110(int arg0, Object arg1) {
        if (this.field5024 == null) {
            this.field5024 = new HashMap();
            this.field5024.put(arg0, new class539(arg0, arg1));
            return;
        }
        class539 var3 = (class539) this.field5024.get(arg0);
        if (var3 == null) {
            this.field5024.put(arg0, new class539(arg0, arg1));
        } else {
            var3.field5205 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5024 == null ? Collections.emptyList().iterator() : this.field5024.values().iterator();
    }
}
