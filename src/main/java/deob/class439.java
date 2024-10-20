package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qy")
public class class439 extends class444 {

    @ObfuscatedName("qy.ak")
    public ArrayList field4784;

    public class439(class444 arg0, ArrayList arg1) {
        super(arg0);
        this.field4794 = "ClearRequestTask";
        this.field4784 = arg1;
    }

    @ObfuscatedName("qy.ak(I)Z")
    public boolean method7581() {
        if (this.field4784.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4784.iterator();
        while (var1.hasNext()) {
            class342 var2 = (class342) var1.next();
            try {
                if (class330.field3579.contains(var2)) {
                    if (var2 == null) {
                        class330.field3579.remove(var2);
                    } else {
                        if (var2.field3694.field3621 > 0) {
                            var2.field3694.field3621--;
                        }
                        if (var2.field3694.field3621 == 0) {
                            var2.field3694.method5672();
                            var2.field3694.method5666();
                            var2.field3694.method5736(0);
                        }
                        class330.method4153(var2.field3691, var2.field3687);
                        class330.field3579.remove(var2);
                    }
                }
            } catch (Exception var4) {
                class571.method8083((String) null, var4);
                this.method7599(var4.getMessage());
                class330.field3579.clear();
                return true;
            }
        }
        return true;
    }
}
