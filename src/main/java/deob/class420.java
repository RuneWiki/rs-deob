package deob;

import java.util.Iterator;

@ObfuscatedName("qe")
public class class420 extends class427 {

    public class420(class427 arg0) {
        super(arg0);
        this.field4652 = "AddRequestTask";
    }

    @ObfuscatedName("qe.az(I)Z")
    public boolean method7146() {
        while (!class322.field3501.isEmpty()) {
            class334 var1 = (class334) class322.field3501.peek();
            if (var1 == null) {
                class322.field3501.pop();
            } else {
                var1.field3614 = this.method7145();
                class322.field3496.add(var1);
                class322.field3501.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qe.ah(B)Lmx;")
    public class323 method7145() {
        class323 var1 = null;
        Iterator var2 = class322.field3492.iterator();
        while (true) {
            class323 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3535++;
                            if (var1.method5441() == 0 && var1.method5448()) {
                                var1.method5447();
                                var1.method5445();
                                var1.method5440(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class323) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3535 <= var3.field3535 && (var3.method5441() != 0 || !var3.method5448()));
            var1 = var3;
        }
    }
}
