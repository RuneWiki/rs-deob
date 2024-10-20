package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qk")
public class class441 extends class446 {

    @ObfuscatedName("qk.ab")
    public ArrayList field4779;

    public class441(class446 arg0, ArrayList arg1) {
        super(arg0);
        this.field4797 = "ClearRequestTask";
        this.field4779 = arg1;
    }

    @ObfuscatedName("qk.ab(I)Z")
    public boolean method7665() {
        if (this.field4779.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4779.iterator();
        while (var1.hasNext()) {
            class345 var2 = (class345) var1.next();
            try {
                if (class333.field3565.contains(var2)) {
                    if (var2 == null) {
                        class333.field3565.remove(var2);
                    } else {
                        if (var2.field3683.field3605 > 0) {
                            var2.field3683.field3605--;
                        }
                        if (var2.field3683.field3605 == 0) {
                            var2.field3683.method5699();
                            var2.field3683.method5697();
                            var2.field3683.method5691(0);
                        }
                        int var3 = var2.field3675;
                        int var4 = var2.field3673;
                        Iterator var5 = class333.field3570.iterator();
                        while (var5.hasNext()) {
                            class339 var6 = (class339) var5.next();
                            var6.method1175(var3, var4);
                        }
                        class333.field3565.remove(var2);
                    }
                }
            } catch (Exception var8) {
                class575.method2216((String) null, var8);
                this.method7672(var8.getMessage());
                class333.field3565.clear();
                return true;
            }
        }
        return true;
    }
}
