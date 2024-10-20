package deob;

import java.util.Iterator;

@ObfuscatedName("qk")
public class class428 extends class426 {

    @ObfuscatedName("qk.aq")
    public class378 field4637;

    @ObfuscatedName("qk.aw")
    public class378 field4634;

    @ObfuscatedName("qk.az")
    public class378 field4636;

    public class428(class426 arg0, class378 arg1, class378 arg2, class378 arg3) {
        super(arg0);
        this.field4637 = arg1;
        this.field4634 = arg2;
        this.field4636 = arg3;
        this.field4628 = "LoadSongTask";
    }

    @ObfuscatedName("qk.aq(I)Z")
    public boolean method7266() {
        int var1 = 0;
        Iterator var2 = class322.field3475.iterator();
        while (true) {
            while (var2.hasNext()) {
                class334 var3 = (class334) var2.next();
                if (var3 != null && var3.field3595.field3519 > 1 && var3.field3595.method5608()) {
                    this.method7280("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3590) {
                    var1++;
                } else {
                    try {
                        if (var3.field3600 == null || var3.field3591 == -1 || var3.field3592 == -1) {
                            var1++;
                        } else {
                            if (var3.field3594 == null) {
                                var3.field3594 = class331.method5728(var3.field3600, var3.field3591, var3.field3592);
                                if (var3.field3594 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3601 == null) {
                                var3.field3601 = new class46(this.field4636, this.field4634);
                            }
                            if (var3.field3595.method5545(var3.field3594, this.field4637, var3.field3601)) {
                                var1++;
                                var3.field3590 = true;
                                var3.field3595.method5546();
                            }
                        }
                    } catch (Exception var5) {
                        Statics.method5453((String) null, var5);
                        this.method7280(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class322.field3475.size()) {
                return true;
            }
            return false;
        }
    }
}
