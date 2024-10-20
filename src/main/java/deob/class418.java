package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qz")
public class class418 extends class423 {

    @ObfuscatedName("qz.am")
    public ArrayList field4582;

    public class418(class423 arg0, ArrayList arg1) {
        super(arg0);
        this.field4598 = "ClearRequestTask";
        this.field4582 = arg1;
    }

    @ObfuscatedName("qz.am(I)Z")
    public boolean method7259() {
        if (this.field4582.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4582.iterator();
        while (var1.hasNext()) {
            class332 var2 = (class332) var1.next();
            try {
                if (class320.field3460.contains(var2)) {
                    if (var2 == null) {
                        class320.field3460.remove(var2);
                    } else {
                        if (var2.field3583.field3500 > 0) {
                            var2.field3583.field3500--;
                        }
                        if (var2.field3583.field3500 == 0) {
                            var2.field3583.method5510();
                            var2.field3583.method5508();
                            var2.field3583.method5503(0);
                        }
                        class320.method2948(var2.field3574, var2.field3575);
                        class320.field3460.remove(var2);
                    }
                }
            } catch (Exception var4) {
                class557.method6332((String) null, var4);
                this.method7268(var4.getMessage());
                class320.field3460.clear();
                return true;
            }
        }
        return true;
    }
}
