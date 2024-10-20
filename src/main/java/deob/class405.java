package deob;

import java.util.Iterator;

@ObfuscatedName("pi")
public class class405 extends class408 {

    public class405(class408 arg0) {
        super(arg0);
        this.field4529 = "StartSongTask";
    }

    @ObfuscatedName("pi.aw(II)Z")
    public boolean method6944(int arg0) {
        Iterator var2 = class307.field3395.iterator();
        while (var2.hasNext()) {
            class319 var3 = (class319) var2.next();
            if (var3 != null && !var3.field3509 && var3.field3517 != null) {
                try {
                    var3.field3517.method5260();
                    var3.field3517.method5256(0);
                    if (var3.field3519 != null) {
                        var3.field3517.method5293(var3.field3519, var3.field3513);
                    }
                    var3.field3519 = null;
                    var3.field3518 = null;
                    var3.field3515 = null;
                    var3.field3509 = true;
                } catch (Exception var5) {
                    var5.printStackTrace();
                    this.method6959(var5.getMessage());
                    return true;
                }
            }
        }
        this.field4527 = true;
        return true;
    }
}
