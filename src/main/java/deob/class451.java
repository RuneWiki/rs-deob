package deob;

import java.util.Iterator;

@ObfuscatedName("rc")
public class class451 extends class449 {

    @ObfuscatedName("rc.ap")
    public class392 field4892;

    @ObfuscatedName("rc.aw")
    public class392 field4890;

    @ObfuscatedName("rc.ae")
    public class392 field4891;

    public class451(class449 arg0, class392 arg1, class392 arg2, class392 arg3) {
        super(arg0);
        this.field4892 = arg1;
        this.field4890 = arg2;
        this.field4891 = arg3;
        this.field4882 = "LoadSongTask";
    }

    @ObfuscatedName("rc.ap(I)Z")
    public boolean method8051() {
        int var1 = 0;
        Iterator var2 = class334.field3630.iterator();
        while (true) {
            while (var2.hasNext()) {
                class346 var3 = (class346) var2.next();
                if (var3 != null && var3.field3748.field3648 > 1 && var3.field3748.method6052()) {
                    this.method8067("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3758) {
                    var1++;
                } else {
                    try {
                        if (var3.field3744 == null || var3.field3745 == -1 || var3.field3746 == -1) {
                            var1++;
                        } else {
                            if (var3.field3754 == null) {
                                var3.field3754 = class343.method6221(var3.field3744, var3.field3745, var3.field3746);
                                if (var3.field3754 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3755 == null) {
                                var3.field3755 = new class46(this.field4891, this.field4890);
                            }
                            if (var3.field3748.method6040(var3.field3754, this.field4892, var3.field3755)) {
                                var1++;
                                var3.field3758 = true;
                                var3.field3748.method6041();
                            }
                        }
                    } catch (Exception var5) {
                        class584.method8201((String) null, var5);
                        this.method8067(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class334.field3630.size()) {
                return true;
            }
            return false;
        }
    }
}
