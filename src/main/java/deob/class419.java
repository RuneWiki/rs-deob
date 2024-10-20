package deob;

import java.util.Iterator;

@ObfuscatedName("ql")
public class class419 extends class426 {

    public class419(class426 arg0) {
        super(arg0);
        this.field4628 = "AddRequestTask";
    }

    @ObfuscatedName("ql.aq(I)Z")
    public boolean method7266() {
        while (!class322.field3479.isEmpty()) {
            class334 var1 = (class334) class322.field3479.peek();
            if (var1 == null) {
                class322.field3479.pop();
            } else {
                var1.field3595 = this.method7267();
                class322.field3475.add(var1);
                class322.field3479.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("ql.aw(I)Lmo;")
    public class323 method7267() {
        class323 var1 = null;
        Iterator var2 = class322.field3480.iterator();
        while (true) {
            class323 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3519++;
                            if (var1.method5544() == 0 && var1.method5551()) {
                                var1.method5550();
                                var1.method5582();
                                var1.method5622(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class323) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3519 <= var3.field3519 && (var3.method5544() != 0 || !var3.method5551()));
            var1 = var3;
        }
    }
}
