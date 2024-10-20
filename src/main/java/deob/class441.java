package deob;

import java.util.Iterator;

@ObfuscatedName("qm")
public class class441 extends class448 {

    public class441(class448 arg0) {
        super(arg0);
        this.field4844 = "AddRequestTask";
    }

    @ObfuscatedName("qm.ac(I)Z")
    public boolean method7804() {
        while (!class335.field3622.isEmpty()) {
            class347 var1 = (class347) class335.field3622.peek();
            if (var1 == null) {
                class335.field3622.pop();
            } else {
                var1.field3733 = this.method7801();
                class335.field3627.add(var1);
                class335.field3622.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qm.ae(I)Lms;")
    public class336 method7801() {
        class336 var1 = null;
        Iterator var2 = class335.field3617.iterator();
        while (true) {
            class336 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3638++;
                            if (var1.method5848() == 0 && var1.method5854()) {
                                var1.method5924();
                                var1.method5852();
                                var1.method5847(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class336) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3638 <= var3.field3638 && (var3.method5848() != 0 || !var3.method5854()));
            var1 = var3;
        }
    }
}
