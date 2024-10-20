package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("rk")
public class class444 extends class449 {

    @ObfuscatedName("rk.ap")
    public ArrayList field4873;

    public class444(class449 arg0, ArrayList arg1) {
        super(arg0);
        this.field4882 = "ClearRequestTask";
        this.field4873 = arg1;
    }

    @ObfuscatedName("rk.ap(I)Z")
    public boolean method8051() {
        if (this.field4873.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4873.iterator();
        while (var1.hasNext()) {
            class346 var2 = (class346) var1.next();
            try {
                if (class334.field3630.contains(var2)) {
                    if (var2 == null) {
                        class334.field3630.remove(var2);
                    } else {
                        if (var2.field3748.field3648 > 0) {
                            var2.field3748.field3648--;
                        }
                        if (var2.field3748.field3648 == 0) {
                            var2.field3748.method6137();
                            var2.field3748.method6043();
                            var2.field3748.method6093(0);
                        }
                        int var3 = var2.field3745;
                        int var4 = var2.field3746;
                        Iterator var5 = class334.field3628.iterator();
                        while (var5.hasNext()) {
                            class340 var6 = (class340) var5.next();
                            var6.method1254(var3, var4);
                        }
                        class334.field3630.remove(var2);
                    }
                }
            } catch (Exception var8) {
                class584.method8201((String) null, var8);
                this.method8067(var8.getMessage());
                class334.field3630.clear();
                return true;
            }
        }
        return true;
    }
}
