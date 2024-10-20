package deob;

import java.util.Iterator;

@ObfuscatedName("rb")
public class class445 extends class448 {

    public class445(class448 arg0) {
        super(arg0);
        this.field4844 = "StartSongTask";
    }

    @ObfuscatedName("rb.ac(I)Z")
    public boolean method7804() {
        Iterator var1 = class335.field3627.iterator();
        while (var1.hasNext()) {
            class347 var2 = (class347) var1.next();
            if (var2 != null && !var2.field3734 && var2.field3733 != null) {
                try {
                    var2.field3733.method5851();
                    var2.field3733.method5847(0);
                    if (var2.field3732 != null) {
                        var2.field3733.method5853(var2.field3732, var2.field3728);
                    }
                    var2.field3732 = null;
                    var2.field3738 = null;
                    var2.field3739 = null;
                    var2.field3734 = true;
                } catch (Exception var4) {
                    class577.method3409((String) null, var4);
                    this.method7820(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4842 = true;
        return true;
    }
}
