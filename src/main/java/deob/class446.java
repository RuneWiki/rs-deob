package deob;

import java.util.Iterator;

@ObfuscatedName("rz")
public class class446 extends class444 {

    @ObfuscatedName("rz.ak")
    public class387 field4803;

    @ObfuscatedName("rz.al")
    public class387 field4802;

    @ObfuscatedName("rz.ab")
    public class387 field4804;

    public class446(class444 arg0, class387 arg1, class387 arg2, class387 arg3) {
        super(arg0);
        this.field4803 = arg1;
        this.field4802 = arg2;
        this.field4804 = arg3;
        this.field4794 = "LoadSongTask";
    }

    @ObfuscatedName("rz.ak(I)Z")
    public boolean method7581() {
        int var1 = 0;
        Iterator var2 = class330.field3579.iterator();
        while (true) {
            while (var2.hasNext()) {
                class342 var3 = (class342) var2.next();
                if (var3 != null && var3.field3694.field3621 > 1 && var3.field3694.method5674()) {
                    this.method7599("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3688) {
                    var1++;
                } else {
                    try {
                        if (var3.field3692 == null || var3.field3691 == -1 || var3.field3687 == -1) {
                            var1++;
                        } else {
                            if (var3.field3686 == null) {
                                var3.field3686 = class339.method5846(var3.field3692, var3.field3691, var3.field3687);
                                if (var3.field3686 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3696 == null) {
                                var3.field3696 = new class46(this.field4804, this.field4802);
                            }
                            if (var3.field3694.method5757(var3.field3686, this.field4803, var3.field3696)) {
                                var1++;
                                var3.field3688 = true;
                                var3.field3694.method5677();
                            }
                        }
                    } catch (Exception var5) {
                        class571.method8083((String) null, var5);
                        this.method7599(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class330.field3579.size()) {
                return true;
            }
            return false;
        }
    }
}
