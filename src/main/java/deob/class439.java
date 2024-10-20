package deob;

import java.util.Iterator;

@ObfuscatedName("qj")
public class class439 extends class446 {

    public class439(class446 arg0) {
        super(arg0);
        this.field4797 = "AddRequestTask";
    }

    @ObfuscatedName("qj.ab(I)Z")
    public boolean method7665() {
        while (!class333.field3564.isEmpty()) {
            class345 var1 = (class345) class333.field3564.peek();
            if (var1 == null) {
                class333.field3564.pop();
            } else {
                var1.field3683 = this.method7660();
                class333.field3565.add(var1);
                class333.field3564.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("qj.ay(I)Lmr;")
    public class334 method7660() {
        class334 var1 = null;
        Iterator var2 = class333.field3563.iterator();
        while (true) {
            class334 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3605++;
                            if (var1.method5710() == 0 && var1.method5700()) {
                                var1.method5699();
                                var1.method5697();
                                var1.method5691(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class334) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3605 <= var3.field3605 && (var3.method5710() != 0 || !var3.method5700()));
            var1 = var3;
        }
    }
}
