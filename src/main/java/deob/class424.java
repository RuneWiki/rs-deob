package deob;

import java.util.Iterator;

@ObfuscatedName("qw")
public class class424 extends class427 {

    public class424(class427 arg0) {
        super(arg0);
        this.field4652 = "StartSongTask";
    }

    @ObfuscatedName("qw.az(I)Z")
    public boolean method7146() {
        Iterator var1 = class322.field3496.iterator();
        while (var1.hasNext()) {
            class334 var2 = (class334) var1.next();
            if (var2 != null && !var2.field3618 && var2.field3614 != null) {
                try {
                    var2.field3614.method5519();
                    var2.field3614.method5440(0);
                    if (var2.field3617 != null) {
                        var2.field3614.method5472(var2.field3617, var2.field3610);
                    }
                    var2.field3617 = null;
                    var2.field3616 = null;
                    var2.field3615 = null;
                    var2.field3618 = true;
                } catch (Exception var4) {
                    class561.method3291((String) null, var4);
                    this.method7175(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4655 = true;
        return true;
    }
}
