package deob;

import java.util.Iterator;

@ObfuscatedName("pd")
public class class404 extends class407 {

    public class404(class407 arg0) {
        super(arg0);
        this.field4524 = "StartSongTask";
    }

    @ObfuscatedName("pd.au(I)Z")
    public boolean method6976() {
        Iterator var1 = class306.field3405.iterator();
        while (var1.hasNext()) {
            class318 var2 = (class318) var1.next();
            if (var2 != null && !var2.field3519 && var2.field3518 != null) {
                try {
                    var2.field3518.method5276();
                    var2.field3518.method5272(0);
                    if (var2.field3523 != null) {
                        var2.field3518.method5277(var2.field3523, var2.field3516);
                    }
                    var2.field3523 = null;
                    var2.field3522 = null;
                    var2.field3515 = null;
                    var2.field3519 = true;
                } catch (Exception var4) {
                    Statics.method2661((String) null, var4);
                    this.method6986(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4526 = true;
        return true;
    }
}
