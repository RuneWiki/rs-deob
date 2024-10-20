package deob;

import java.util.Iterator;

@ObfuscatedName("qw")
public class class419 extends class422 {

    public class419(class422 arg0) {
        super(arg0);
        this.field4573 = "StartSongTask";
    }

    @ObfuscatedName("qw.ac(B)Z")
    public boolean method7059() {
        Iterator var1 = class320.field3434.iterator();
        while (var1.hasNext()) {
            class332 var2 = (class332) var1.next();
            if (var2 != null && !var2.field3546 && var2.field3539 != null) {
                try {
                    var2.field3539.method5415();
                    var2.field3539.method5411(0);
                    if (var2.field3549 != null) {
                        var2.field3539.method5484(var2.field3549, var2.field3544);
                    }
                    var2.field3549 = null;
                    var2.field3550 = null;
                    var2.field3545 = null;
                    var2.field3546 = true;
                } catch (Exception var4) {
                    class556.method3321((String) null, var4);
                    this.method7079(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4574 = true;
        return true;
    }
}
