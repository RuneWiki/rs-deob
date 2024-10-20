package deob;

import java.util.Iterator;

@ObfuscatedName("pb")
public class class416 extends class423 {

    public class416(class423 arg0) {
        super(arg0);
        this.field4598 = "AddRequestTask";
    }

    @ObfuscatedName("pb.am(I)Z")
    public boolean method7259() {
        while (!class320.field3462.isEmpty()) {
            class332 var1 = (class332) class320.field3462.peek();
            if (var1 == null) {
                class320.field3462.pop();
            } else {
                var1.field3583 = this.method7253();
                class320.field3460.add(var1);
                class320.field3462.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("pb.ap(I)Lmk;")
    public class321 method7253() {
        class321 var1 = null;
        Iterator var2 = class320.field3458.iterator();
        while (true) {
            class321 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3500++;
                            if (var1.method5504() == 0 && var1.method5511()) {
                                var1.method5510();
                                var1.method5508();
                                var1.method5503(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class321) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3500 <= var3.field3500 && (var3.method5504() != 0 || !var3.method5511()));
            var1 = var3;
        }
    }
}
