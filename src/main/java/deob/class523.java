package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("uj")
public class class523 implements class522 {

    @ObfuscatedName("uj.aq")
    public Map field5243;

    @ObfuscatedName("uj.ad")
    public final class555 field5242;

    public class523(class555 arg0) {
        this.field5242 = arg0;
    }

    @ObfuscatedName("uj.aq(IB)I")
    public int method8490(int arg0) {
        if (this.field5243 != null) {
            class556 var2 = (class556) this.field5243.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5430;
            }
        }
        return (Integer) this.field5242.method8049(arg0);
    }

    @ObfuscatedName("uj.ad(ILjava/lang/Object;I)V")
    public void method8491(int arg0, Object arg1) {
        if (this.field5243 == null) {
            this.field5243 = new HashMap();
            this.field5243.put(arg0, new class556(arg0, arg1));
            return;
        }
        class556 var3 = (class556) this.field5243.get(arg0);
        if (var3 == null) {
            this.field5243.put(arg0, new class556(arg0, arg1));
        } else {
            var3.field5430 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5243 == null ? Collections.emptyList().iterator() : this.field5243.values().iterator();
    }
}
