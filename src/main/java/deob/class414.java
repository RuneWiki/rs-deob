package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("pq")
public class class414 extends class419 {

    @ObfuscatedName("pq.at")
    public ArrayList field4542;

    public class414(class419 arg0, ArrayList arg1) {
        super(arg0);
        this.field4553 = "ClearRequestTask";
        this.field4542 = arg1;
    }

    @ObfuscatedName("pq.at(I)Z")
    public boolean method7116() {
        if (this.field4542.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4542.iterator();
        while (var1.hasNext()) {
            class329 var2 = (class329) var1.next();
            try {
                if (class317.field3423.contains(var2)) {
                    if (var2 == null) {
                        class317.field3423.remove(var2);
                    } else {
                        if (var2.field3523.field3456 > 0) {
                            var2.field3523.field3456--;
                        }
                        if (var2.field3523.field3456 == 0) {
                            var2.field3523.method5413();
                            var2.field3523.method5411();
                            var2.field3523.method5406(0);
                        }
                        int var3 = var2.field3524;
                        int var4 = var2.field3532;
                        Iterator var5 = class317.field3421.iterator();
                        while (var5.hasNext()) {
                            class323 var6 = (class323) var5.next();
                            var6.method1322(var3, var4);
                        }
                        class317.field3423.remove(var2);
                    }
                }
            } catch (Exception var8) {
                class553.method6436((String) null, var8);
                this.method7133(var8.getMessage());
                class317.field3423.clear();
                return true;
            }
        }
        return true;
    }
}
