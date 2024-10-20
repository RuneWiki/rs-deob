package deob;

import java.util.Iterator;

@ObfuscatedName("pj")
public class class412 extends class419 {

    public class412(class419 arg0) {
        super(arg0);
        this.field4553 = "AddRequestTask";
    }

    @ObfuscatedName("pj.at(I)Z")
    public boolean method7116() {
        while (!class317.field3417.isEmpty()) {
            class329 var1 = (class329) class317.field3417.peek();
            if (var1 == null) {
                class317.field3417.pop();
            } else {
                var1.field3523 = this.method7117();
                class317.field3423.add(var1);
                class317.field3417.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("pj.ah(I)Lmn;")
    public class318 method7117() {
        class318 var1 = null;
        Iterator var2 = class317.field3416.iterator();
        while (true) {
            class318 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3456++;
                            if (var1.method5407() == 0 && var1.method5487()) {
                                var1.method5413();
                                var1.method5411();
                                var1.method5406(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class318) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3456 <= var3.field3456 && (var3.method5407() != 0 || !var3.method5487()));
            var1 = var3;
        }
    }
}
