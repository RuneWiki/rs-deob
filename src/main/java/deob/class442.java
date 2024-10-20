package deob;

import java.util.Iterator;

@ObfuscatedName("qe")
public class class442 extends class449 {

    public class442(class449 arg0) {
        super(arg0);
        this.field4882 = "AddRequestTask";
    }

    @ObfuscatedName("qe.ap(I)Z")
    public boolean method8051() {
        while (!class334.field3626.isEmpty()) {
            class346 var1 = (class346) class334.field3626.peek();
            if (var1 == null) {
                class334.field3626.pop();
            } else {
                var1.field3748 = this.method8055();
                class334.field3630.add(var1);
                class334.field3626.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qe.aw(I)Lmn;")
    public class335 method8055() {
        class335 var1 = null;
        Iterator var2 = class334.field3627.iterator();
        while (true) {
            class335 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3648++;
                            if (var1.method6039() == 0 && var1.method6046()) {
                                var1.method6137();
                                var1.method6043();
                                var1.method6093(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class335) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3648 <= var3.field3648 && (var3.method6039() != 0 || !var3.method6046()));
            var1 = var3;
        }
    }
}
