package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("rl")
public class class443 extends class448 {

    @ObfuscatedName("rl.ac")
    public ArrayList field4831;

    public class443(class448 arg0, ArrayList arg1) {
        super(arg0);
        this.field4844 = "ClearRequestTask";
        this.field4831 = arg1;
    }

    @ObfuscatedName("rl.ac(I)Z")
    public boolean method7804() {
        if (this.field4831.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4831.iterator();
        while (var1.hasNext()) {
            class347 var2 = (class347) var1.next();
            try {
                if (class335.field3627.contains(var2)) {
                    if (var2 == null) {
                        class335.field3627.remove(var2);
                    } else {
                        if (var2.field3733.field3638 > 0) {
                            var2.field3733.field3638--;
                        }
                        if (var2.field3733.field3638 == 0) {
                            var2.field3733.method5924();
                            var2.field3733.method5852();
                            var2.field3733.method5847(0);
                        }
                        class335.method6710(var2.field3727, var2.field3729);
                        class335.field3627.remove(var2);
                    }
                }
            } catch (Exception var4) {
                class577.method3409((String) null, var4);
                this.method7820(var4.getMessage());
                class335.field3627.clear();
                return true;
            }
        }
        return true;
    }
}
