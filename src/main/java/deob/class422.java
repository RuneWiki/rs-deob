package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pl")
public class class422 implements class421 {

    @ObfuscatedName("pl.c")
    public Map field4607;

    @ObfuscatedName("pl.v")
    public final class450 field4606;

    public class422(class450 arg0) {
        this.field4606 = arg0;
    }

    @ObfuscatedName("pl.c(II)I")
    public int method6785(int arg0) {
        if (this.field4607 != null) {
            class451 var2 = (class451) this.field4607.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4767;
            }
        }
        return (Integer) this.field4606.method6428(arg0);
    }

    @ObfuscatedName("pl.v(ILjava/lang/Object;S)V")
    public void method6789(int arg0, Object arg1) {
        if (this.field4607 == null) {
            this.field4607 = new HashMap();
            this.field4607.put(arg0, new class451(arg0, arg1));
            return;
        }
        class451 var3 = (class451) this.field4607.get(arg0);
        if (var3 == null) {
            this.field4607.put(arg0, new class451(arg0, arg1));
        } else {
            var3.field4767 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4607 == null ? Collections.emptyList().iterator() : this.field4607.values().iterator();
    }
}
