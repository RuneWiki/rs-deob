package deob;

import java.util.Iterator;

@ObfuscatedName("qx")
public class class420 extends class423 {

    public class420(class423 arg0) {
        super(arg0);
        this.field4598 = "StartSongTask";
    }

    @ObfuscatedName("qx.am(I)Z")
    public boolean method7259() {
        Iterator var1 = class320.field3460.iterator();
        while (var1.hasNext()) {
            class332 var2 = (class332) var1.next();
            if (var2 != null && !var2.field3580 && var2.field3583 != null) {
                try {
                    var2.field3583.method5604();
                    var2.field3583.method5503(0);
                    if (var2.field3585 != null) {
                        var2.field3583.method5593(var2.field3585, var2.field3579);
                    }
                    var2.field3585 = null;
                    var2.field3584 = null;
                    var2.field3573 = null;
                    var2.field3580 = true;
                } catch (Exception var4) {
                    class557.method6332((String) null, var4);
                    this.method7268(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4595 = true;
        return true;
    }
}
