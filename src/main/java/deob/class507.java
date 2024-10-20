package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ty")
public class class507 implements class506 {

    @ObfuscatedName("ty.am")
    public Map field5060;

    @ObfuscatedName("ty.ap")
    public final class539 field5059;

    public class507(class539 arg0) {
        this.field5059 = arg0;
    }

    @ObfuscatedName("ty.am(II)I")
    public int method8317(int arg0) {
        if (this.field5060 != null) {
            class540 var2 = (class540) this.field5060.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5245;
            }
        }
        return (Integer) this.field5059.method7916(arg0);
    }

    @ObfuscatedName("ty.ap(ILjava/lang/Object;I)V")
    public void method8318(int arg0, Object arg1) {
        if (this.field5060 == null) {
            this.field5060 = new HashMap();
            this.field5060.put(arg0, new class540(arg0, arg1));
            return;
        }
        class540 var3 = (class540) this.field5060.get(arg0);
        if (var3 == null) {
            this.field5060.put(arg0, new class540(arg0, arg1));
        } else {
            var3.field5245 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5060 == null ? Collections.emptyList().iterator() : this.field5060.values().iterator();
    }
}
