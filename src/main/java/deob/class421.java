package deob;

import java.util.Iterator;

@ObfuscatedName("qo")
public class class421 extends class419 {

    @ObfuscatedName("qo.at")
    public class371 field4565;

    @ObfuscatedName("qo.ah")
    public class371 field4562;

    @ObfuscatedName("qo.ac")
    public class371 field4563;

    public class421(class419 arg0, class371 arg1, class371 arg2, class371 arg3) {
        super(arg0);
        this.field4565 = arg1;
        this.field4562 = arg2;
        this.field4563 = arg3;
        this.field4553 = "LoadSongTask";
    }

    @ObfuscatedName("qo.at(I)Z")
    public boolean method7116() {
        int var1 = 0;
        Iterator var2 = class317.field3423.iterator();
        while (true) {
            while (var2.hasNext()) {
                class329 var3 = (class329) var2.next();
                if (var3 != null && var3.field3523.field3456 > 1 && var3.field3523.method5415()) {
                    this.method7133("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3537) {
                    var1++;
                } else {
                    try {
                        if (var3.field3536 == null || var3.field3524 == -1 || var3.field3532 == -1) {
                            var1++;
                        } else {
                            if (var3.field3535 == null) {
                                var3.field3535 = class326.method5593(var3.field3536, var3.field3524, var3.field3532);
                                if (var3.field3535 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3534 == null) {
                                var3.field3534 = new class46(this.field4563, this.field4562);
                            }
                            if (var3.field3523.method5408(var3.field3535, this.field4565, var3.field3534)) {
                                var1++;
                                var3.field3537 = true;
                                var3.field3523.method5409();
                            }
                        }
                    } catch (Exception var5) {
                        class553.method6436((String) null, var5);
                        this.method7133(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class317.field3423.size()) {
                return true;
            }
            return false;
        }
    }
}
