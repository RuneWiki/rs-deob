package deob;

import java.util.Iterator;

@ObfuscatedName("pi")
public class class415 extends class422 {

    public class415(class422 arg0) {
        super(arg0);
        this.field4573 = "AddRequestTask";
    }

    @ObfuscatedName("pi.ac(B)Z")
    public boolean method7059() {
        while (!class320.field3429.isEmpty()) {
            class332 var1 = (class332) class320.field3429.peek();
            if (var1 == null) {
                class320.field3429.pop();
            } else {
                var1.field3539 = this.method7060();
                class320.field3434.add(var1);
                class320.field3429.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("pi.al(B)Lmt;")
    public class321 method7060() {
        class321 var1 = null;
        Iterator var2 = class320.field3432.iterator();
        while (true) {
            class321 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3451++;
                            if (var1.method5412() == 0 && var1.method5418()) {
                                var1.method5417();
                                var1.method5470();
                                var1.method5411(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class321) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3451 <= var3.field3451 && (var3.method5412() != 0 || !var3.method5418()));
            var1 = var3;
        }
    }
}
