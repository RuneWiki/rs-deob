package deob;

import java.util.Iterator;

@ObfuscatedName("qa")
public class class423 extends class426 {

    public class423(class426 arg0) {
        super(arg0);
        this.field4628 = "StartSongTask";
    }

    @ObfuscatedName("qa.aq(I)Z")
    public boolean method7266() {
        Iterator var1 = class322.field3475.iterator();
        while (var1.hasNext()) {
            class334 var2 = (class334) var1.next();
            if (var2 != null && !var2.field3597 && var2.field3595 != null) {
                try {
                    var2.field3595.method5547();
                    var2.field3595.method5622(0);
                    if (var2.field3594 != null) {
                        var2.field3595.method5549(var2.field3594, var2.field3599);
                    }
                    var2.field3594 = null;
                    var2.field3601 = null;
                    var2.field3600 = null;
                    var2.field3597 = true;
                } catch (Exception var4) {
                    Statics.method5453((String) null, var4);
                    this.method7280(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4631 = true;
        return true;
    }
}
