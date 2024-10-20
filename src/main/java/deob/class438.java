package deob;

import java.util.Iterator;

@ObfuscatedName("qd")
public class class438 extends class445 {

    public class438(class445 arg0) {
        super(arg0);
        this.field4815 = "AddRequestTask";
    }

    @ObfuscatedName("qd.aq(S)Z")
    public boolean method7560() {
        while (!class331.field3588.isEmpty()) {
            class343 var1 = (class343) class331.field3588.peek();
            if (var1 == null) {
                class331.field3588.pop();
            } else {
                var1.field3714 = this.method7561();
                class331.field3585.add(var1);
                class331.field3588.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qd.ad(B)Lmc;")
    public class332 method7561() {
        class332 var1 = null;
        Iterator var2 = class331.field3583.iterator();
        while (true) {
            class332 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3628++;
                            if (var1.method5610() == 0 && var1.method5615()) {
                                var1.method5642();
                                var1.method5613();
                                var1.method5609(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class332) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3628 <= var3.field3628 && (var3.method5610() != 0 || !var3.method5615()));
            var1 = var3;
        }
    }
}
