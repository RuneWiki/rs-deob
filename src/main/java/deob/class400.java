package deob;

import java.util.Iterator;

@ObfuscatedName("pf")
public class class400 extends class407 {

    public class400(class407 arg0) {
        super(arg0);
        this.field4524 = "AddRequestTask";
    }

    @ObfuscatedName("pf.au(I)Z")
    public boolean method6976() {
        while (!class306.field3412.isEmpty()) {
            class318 var1 = (class318) class306.field3412.peek();
            if (var1 == null) {
                class306.field3412.pop();
            } else {
                var1.field3518 = this.method6977();
                class306.field3405.add(var1);
                class306.field3412.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("pf.ae(B)Llf;")
    public class307 method6977() {
        class307 var1 = null;
        Iterator var2 = class306.field3403.iterator();
        while (true) {
            class307 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3444++;
                            if (var1.method5309() == 0 && var1.method5334()) {
                                var1.method5374();
                                var1.method5355();
                                var1.method5272(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class307) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3444 <= var3.field3444 && (var3.method5309() != 0 || !var3.method5334()));
            var1 = var3;
        }
    }
}
