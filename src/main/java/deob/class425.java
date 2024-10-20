package deob;

import java.util.Iterator;

@ObfuscatedName("qk")
public class class425 extends class423 {

    @ObfuscatedName("qk.am")
    public class375 field4605;

    @ObfuscatedName("qk.ap")
    public class375 field4603;

    @ObfuscatedName("qk.ao")
    public class375 field4602;

    public class425(class423 arg0, class375 arg1, class375 arg2, class375 arg3) {
        super(arg0);
        this.field4605 = arg1;
        this.field4603 = arg2;
        this.field4602 = arg3;
        this.field4598 = "LoadSongTask";
    }

    @ObfuscatedName("qk.am(I)Z")
    public boolean method7259() {
        int var1 = 0;
        Iterator var2 = class320.field3460.iterator();
        while (true) {
            while (var2.hasNext()) {
                class332 var3 = (class332) var2.next();
                if (var3 != null && var3.field3583.field3500 > 1 && var3.field3583.method5512()) {
                    this.method7268("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3576) {
                    var1++;
                } else {
                    try {
                        if (var3.field3573 == null || var3.field3574 == -1 || var3.field3575 == -1) {
                            var1++;
                        } else {
                            if (var3.field3585 == null) {
                                var3.field3585 = class329.method5680(var3.field3573, var3.field3574, var3.field3575);
                                if (var3.field3585 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3584 == null) {
                                var3.field3584 = new class46(this.field4602, this.field4603);
                            }
                            if (var3.field3583.method5505(var3.field3585, this.field4605, var3.field3584)) {
                                var1++;
                                var3.field3576 = true;
                                var3.field3583.method5506();
                            }
                        }
                    } catch (Exception var5) {
                        class557.method6332((String) null, var5);
                        this.method7268(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class320.field3460.size()) {
                return true;
            }
            return false;
        }
    }
}
