package deob;

import java.util.Iterator;

@ObfuscatedName("ra")
public class class450 extends class448 {

    @ObfuscatedName("ra.ac")
    public class391 field4850;

    @ObfuscatedName("ra.ae")
    public class391 field4851;

    @ObfuscatedName("ra.at")
    public class391 field4852;

    public class450(class448 arg0, class391 arg1, class391 arg2, class391 arg3) {
        super(arg0);
        this.field4850 = arg1;
        this.field4851 = arg2;
        this.field4852 = arg3;
        this.field4844 = "LoadSongTask";
    }

    @ObfuscatedName("ra.ac(I)Z")
    public boolean method7804() {
        int var1 = 0;
        Iterator var2 = class335.field3627.iterator();
        while (true) {
            while (var2.hasNext()) {
                class347 var3 = (class347) var2.next();
                if (var3 != null && var3.field3733.field3638 > 1 && var3.field3733.method5880()) {
                    this.method7820("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3740) {
                    var1++;
                } else {
                    try {
                        if (var3.field3739 == null || var3.field3727 == -1 || var3.field3729 == -1) {
                            var1++;
                        } else {
                            if (var3.field3732 == null) {
                                var3.field3732 = class344.method6047(var3.field3739, var3.field3727, var3.field3729);
                                if (var3.field3732 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3738 == null) {
                                var3.field3738 = new class46(this.field4852, this.field4851);
                            }
                            if (var3.field3733.method5876(var3.field3732, this.field4850, var3.field3738)) {
                                var1++;
                                var3.field3740 = true;
                                var3.field3733.method5850();
                            }
                        }
                    } catch (Exception var5) {
                        class577.method3409((String) null, var5);
                        this.method7820(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class335.field3627.size()) {
                return true;
            }
            return false;
        }
    }
}
