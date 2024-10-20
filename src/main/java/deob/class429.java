package deob;

import java.util.Iterator;

@ObfuscatedName("qk")
public class class429 extends class427 {

    @ObfuscatedName("qk.az")
    public class379 field4663;

    @ObfuscatedName("qk.ah")
    public class379 field4661;

    @ObfuscatedName("qk.aw")
    public class379 field4662;

    public class429(class427 arg0, class379 arg1, class379 arg2, class379 arg3) {
        super(arg0);
        this.field4663 = arg1;
        this.field4661 = arg2;
        this.field4662 = arg3;
        this.field4652 = "LoadSongTask";
    }

    @ObfuscatedName("qk.az(I)Z")
    public boolean method7146() {
        int var1 = 0;
        Iterator var2 = class322.field3496.iterator();
        while (true) {
            while (var2.hasNext()) {
                class334 var3 = (class334) var2.next();
                if (var3 != null && var3.field3614.field3535 > 1 && var3.field3614.method5538()) {
                    this.method7175("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3611) {
                    var1++;
                } else {
                    try {
                        if (var3.field3615 == null || var3.field3606 == -1 || var3.field3607 == -1) {
                            var1++;
                        } else {
                            if (var3.field3617 == null) {
                                var3.field3617 = class331.method5626(var3.field3615, var3.field3606, var3.field3607);
                                if (var3.field3617 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3616 == null) {
                                var3.field3616 = new class46(this.field4662, this.field4661);
                            }
                            if (var3.field3614.method5512(var3.field3617, this.field4663, var3.field3616)) {
                                var1++;
                                var3.field3611 = true;
                                var3.field3614.method5443();
                            }
                        }
                    } catch (Exception var5) {
                        class561.method3291((String) null, var5);
                        this.method7175(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class322.field3496.size()) {
                return true;
            }
            return false;
        }
    }
}
