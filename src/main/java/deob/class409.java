package deob;

import java.util.Iterator;

@ObfuscatedName("pp")
public class class409 extends class407 {

    @ObfuscatedName("pp.au")
    public class359 field4528;

    @ObfuscatedName("pp.ae")
    public class359 field4529;

    @ObfuscatedName("pp.ap")
    public class359 field4531;

    public class409(class407 arg0, class359 arg1, class359 arg2, class359 arg3) {
        super(arg0);
        this.field4528 = arg1;
        this.field4529 = arg2;
        this.field4531 = arg3;
        this.field4524 = "LoadSongTask";
    }

    @ObfuscatedName("pp.au(I)Z")
    public boolean method6976() {
        int var1 = 0;
        Iterator var2 = class306.field3405.iterator();
        while (true) {
            while (var2.hasNext()) {
                class318 var3 = (class318) var2.next();
                if (var3 != null && var3.field3518.field3444 > 1 && var3.field3518.method5279()) {
                    this.method6986("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3517) {
                    var1++;
                } else {
                    try {
                        if (var3.field3515 == null || var3.field3512 == -1 || var3.field3513 == -1) {
                            var1++;
                        } else {
                            if (var3.field3523 == null) {
                                var3.field3523 = class315.method5455(var3.field3515, var3.field3512, var3.field3513);
                                if (var3.field3523 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3522 == null) {
                                var3.field3522 = new class46(this.field4531, this.field4529);
                            }
                            if (var3.field3518.method5274(var3.field3523, this.field4528, var3.field3522)) {
                                var1++;
                                var3.field3517 = true;
                                var3.field3518.method5275();
                            }
                        }
                    } catch (Exception var5) {
                        Statics.method2661((String) null, var5);
                        this.method6986(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class306.field3405.size()) {
                return true;
            }
            return false;
        }
    }
}
