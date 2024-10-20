package deob;

import java.util.Iterator;

@ObfuscatedName("ro")
public class class443 extends class446 {

    public class443(class446 arg0) {
        super(arg0);
        this.field4797 = "StartSongTask";
    }

    @ObfuscatedName("ro.ab(I)Z")
    public boolean method7665() {
        Iterator var1 = class333.field3565.iterator();
        while (var1.hasNext()) {
            class345 var2 = (class345) var1.next();
            if (var2 != null && !var2.field3680 && var2.field3683 != null) {
                try {
                    var2.field3683.method5696();
                    var2.field3683.method5691(0);
                    if (var2.field3685 != null) {
                        var2.field3683.method5698(var2.field3685, var2.field3678);
                    }
                    var2.field3685 = null;
                    var2.field3684 = null;
                    var2.field3686 = null;
                    var2.field3680 = true;
                } catch (Exception var4) {
                    class575.method2216((String) null, var4);
                    this.method7672(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4793 = true;
        return true;
    }
}
