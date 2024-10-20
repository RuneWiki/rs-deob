package deob;

import java.util.Iterator;

@ObfuscatedName("py")
public class class416 extends class419 {

    public class416(class419 arg0) {
        super(arg0);
        this.field4553 = "StartSongTask";
    }

    @ObfuscatedName("py.at(I)Z")
    public boolean method7116() {
        Iterator var1 = class317.field3423.iterator();
        while (var1.hasNext()) {
            class329 var2 = (class329) var1.next();
            if (var2 != null && !var2.field3525 && var2.field3523 != null) {
                try {
                    var2.field3523.method5445();
                    var2.field3523.method5406(0);
                    if (var2.field3535 != null) {
                        var2.field3523.method5443(var2.field3535, var2.field3528);
                    }
                    var2.field3535 = null;
                    var2.field3534 = null;
                    var2.field3536 = null;
                    var2.field3525 = true;
                } catch (Exception var4) {
                    class553.method6436((String) null, var4);
                    this.method7133(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4556 = true;
        return true;
    }
}
