package deob;

import java.util.Iterator;

@ObfuscatedName("rq")
public class class446 extends class449 {

    public class446(class449 arg0) {
        super(arg0);
        this.field4882 = "StartSongTask";
    }

    @ObfuscatedName("rq.ap(I)Z")
    public boolean method8051() {
        Iterator var1 = class334.field3630.iterator();
        while (var1.hasNext()) {
            class346 var2 = (class346) var1.next();
            if (var2 != null && !var2.field3751 && var2.field3748 != null) {
                try {
                    var2.field3748.method6042();
                    var2.field3748.method6093(0);
                    if (var2.field3754 != null) {
                        var2.field3748.method6044(var2.field3754, var2.field3749);
                    }
                    var2.field3754 = null;
                    var2.field3755 = null;
                    var2.field3744 = null;
                    var2.field3751 = true;
                } catch (Exception var4) {
                    class584.method8201((String) null, var4);
                    this.method8067(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4886 = true;
        return true;
    }
}
