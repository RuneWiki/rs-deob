package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("sj")
public class class492 implements class491 {

    @ObfuscatedName("sj.aw")
    public Map field4980;

    @ObfuscatedName("sj.ay")
    public final class522 field4981;

    public class492(class522 arg0) {
        this.field4981 = arg0;
    }

    @ObfuscatedName("sj.aw(II)I")
    public int method7999(int arg0) {
        if (this.field4980 != null) {
            class523 var2 = (class523) this.field4980.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5135;
            }
        }
        return (Integer) this.field4981.method7591(arg0);
    }

    @ObfuscatedName("sj.ay(ILjava/lang/Object;I)V")
    public void method7995(int arg0, Object arg1) {
        if (this.field4980 == null) {
            this.field4980 = new HashMap();
            this.field4980.put(arg0, new class523(arg0, arg1));
            return;
        }
        class523 var3 = (class523) this.field4980.get(arg0);
        if (var3 == null) {
            this.field4980.put(arg0, new class523(arg0, arg1));
        } else {
            var3.field5135 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4980 == null ? Collections.emptyList().iterator() : this.field4980.values().iterator();
    }
}
