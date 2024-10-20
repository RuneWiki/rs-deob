package deob;

import java.util.Iterator;

@ObfuscatedName("qu")
public class class441 extends class444 {

    public class441(class444 arg0) {
        super(arg0);
        this.field4794 = "StartSongTask";
    }

    @ObfuscatedName("qu.ak(I)Z")
    public boolean method7581() {
        Iterator var1 = class330.field3579.iterator();
        while (var1.hasNext()) {
            class342 var2 = (class342) var1.next();
            if (var2 != null && !var2.field3695 && var2.field3694 != null) {
                try {
                    var2.field3694.method5669();
                    var2.field3694.method5736(0);
                    if (var2.field3686 != null) {
                        var2.field3694.method5671(var2.field3686, var2.field3690);
                    }
                    var2.field3686 = null;
                    var2.field3696 = null;
                    var2.field3692 = null;
                    var2.field3695 = true;
                } catch (Exception var4) {
                    class571.method8083((String) null, var4);
                    this.method7599(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4799 = true;
        return true;
    }
}
