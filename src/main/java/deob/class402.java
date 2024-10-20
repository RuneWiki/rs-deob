package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("pv")
public class class402 extends class407 {

    @ObfuscatedName("pv.au")
    public ArrayList field4512;

    public class402(class407 arg0, ArrayList arg1) {
        super(arg0);
        this.field4524 = "ClearRequestTask";
        this.field4512 = arg1;
    }

    @ObfuscatedName("pv.au(I)Z")
    public boolean method6976() {
        if (this.field4512.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4512.iterator();
        while (var1.hasNext()) {
            class318 var2 = (class318) var1.next();
            try {
                if (class306.field3405.contains(var2)) {
                    if (var2 == null) {
                        class306.field3405.remove(var2);
                    } else {
                        if (var2.field3518.field3444 > 0) {
                            var2.field3518.field3444--;
                        }
                        if (var2.field3518.field3444 == 0) {
                            var2.field3518.method5374();
                            var2.field3518.method5355();
                            var2.field3518.method5272(0);
                        }
                        int var3 = var2.field3512;
                        int var4 = var2.field3513;
                        Iterator var5 = class306.field3408.iterator();
                        while (var5.hasNext()) {
                            class312 var6 = (class312) var5.next();
                            var6.method1684(var3, var4);
                        }
                        class306.field3405.remove(var2);
                    }
                }
            } catch (Exception var8) {
                Statics.method2661((String) null, var8);
                this.method6986(var8.getMessage());
                class306.field3405.clear();
                return true;
            }
        }
        return true;
    }
}
