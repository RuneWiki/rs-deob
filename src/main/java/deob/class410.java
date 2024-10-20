package deob;

import java.util.Iterator;

@ObfuscatedName("ps")
public class class410 extends class408 {

    @ObfuscatedName("ps.aw")
    public class360 field4535;

    @ObfuscatedName("ps.ay")
    public class360 field4536;

    @ObfuscatedName("ps.ar")
    public class360 field4537;

    public class410(class408 arg0, class360 arg1, class360 arg2, class360 arg3) {
        super(arg0);
        this.field4535 = arg1;
        this.field4536 = arg2;
        this.field4537 = arg3;
        this.field4529 = "LoadSongTask";
    }

    @ObfuscatedName("ps.aw(II)Z")
    public boolean method6944(int arg0) {
        int var2 = 0;
        Iterator var3 = class307.field3395.iterator();
        while (true) {
            while (var3.hasNext()) {
                class319 var4 = (class319) var3.next();
                if (var4 != null && var4.field3517.field3440 > 1 && var4.field3517.method5350()) {
                    this.method6959("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var4 == null || var4.field3514) {
                    var2++;
                } else {
                    try {
                        if (var4.field3515 == null || var4.field3508 == -1 || var4.field3510 == -1) {
                            var2++;
                        } else {
                            if (var4.field3519 == null) {
                                var4.field3519 = class316.method5450(var4.field3515, var4.field3508, var4.field3510);
                                if (var4.field3519 == null) {
                                    continue;
                                }
                            }
                            if (var4.field3518 == null) {
                                var4.field3518 = new class46(this.field4537, this.field4536);
                            }
                            if (var4.field3517.method5258(var4.field3519, this.field4535, var4.field3518)) {
                                var2++;
                                var4.field3514 = true;
                                var4.field3517.method5281();
                            }
                        }
                    } catch (Exception var6) {
                        var6.printStackTrace();
                        this.method6959(var6.getMessage());
                        return true;
                    }
                }
            }
            if (var2 == class307.field3395.size()) {
                return true;
            }
            return false;
        }
    }
}
