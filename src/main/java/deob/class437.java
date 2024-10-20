package deob;

import java.util.Iterator;

@ObfuscatedName("qh")
public class class437 extends class444 {

    public class437(class444 arg0) {
        super(arg0);
        this.field4794 = "AddRequestTask";
    }

    @ObfuscatedName("qh.ak(I)Z")
    public boolean method7581() {
        while (!class330.field3577.isEmpty()) {
            class342 var1 = (class342) class330.field3577.peek();
            if (var1 == null) {
                class330.field3577.pop();
            } else {
                var1.field3694 = this.method7582();
                class330.field3579.add(var1);
                class330.field3577.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qh.al(I)Lmw;")
    public class331 method7582() {
        class331 var1 = null;
        Iterator var2 = class330.field3578.iterator();
        while (true) {
            class331 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3621++;
                            if (var1.method5766() == 0 && var1.method5673()) {
                                var1.method5672();
                                var1.method5666();
                                var1.method5736(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class331) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3621 <= var3.field3621 && (var3.method5766() != 0 || !var3.method5673()));
            var1 = var3;
        }
    }
}
