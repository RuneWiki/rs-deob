package deob;

import java.util.Iterator;

@ObfuscatedName("rk")
public class class447 extends class445 {

    @ObfuscatedName("rk.aq")
    public class388 field4819;

    @ObfuscatedName("rk.ad")
    public class388 field4820;

    @ObfuscatedName("rk.av")
    public class388 field4821;

    public class447(class445 arg0, class388 arg1, class388 arg2, class388 arg3) {
        super(arg0);
        this.field4819 = arg1;
        this.field4820 = arg2;
        this.field4821 = arg3;
        this.field4815 = "LoadSongTask";
    }

    @ObfuscatedName("rk.aq(S)Z")
    public boolean method7560() {
        int var1 = 0;
        Iterator var2 = class331.field3585.iterator();
        while (true) {
            while (var2.hasNext()) {
                class343 var3 = (class343) var2.next();
                if (var3 != null && var3.field3714.field3628 > 1 && var3.field3714.method5616()) {
                    this.method7571("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3710) {
                    var1++;
                } else {
                    try {
                        if (var3.field3709 == null || var3.field3717 == -1 || var3.field3706 == -1) {
                            var1++;
                        } else {
                            if (var3.field3704 == null) {
                                var3.field3704 = class340.method5800(var3.field3709, var3.field3717, var3.field3706);
                                if (var3.field3704 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3715 == null) {
                                var3.field3715 = new class46(this.field4821, this.field4820);
                            }
                            if (var3.field3714.method5611(var3.field3704, this.field4819, var3.field3715)) {
                                var1++;
                                var3.field3710 = true;
                                var3.field3714.method5612();
                            }
                        }
                    } catch (Exception var5) {
                        class572.method7807((String) null, var5);
                        this.method7571(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class331.field3585.size()) {
                return true;
            }
            return false;
        }
    }
}
