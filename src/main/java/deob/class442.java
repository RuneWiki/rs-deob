package deob;

import java.util.Iterator;

@ObfuscatedName("qp")
public class class442 extends class445 {

    public class442(class445 arg0) {
        super(arg0);
        this.field4815 = "StartSongTask";
    }

    @ObfuscatedName("qp.aq(S)Z")
    public boolean method7560() {
        Iterator var1 = class331.field3585.iterator();
        while (var1.hasNext()) {
            class343 var2 = (class343) var1.next();
            if (var2 != null && !var2.field3711 && var2.field3714 != null) {
                try {
                    var2.field3714.method5668();
                    var2.field3714.method5609(0);
                    if (var2.field3704 != null) {
                        var2.field3714.method5666(var2.field3704, var2.field3712);
                    }
                    var2.field3704 = null;
                    var2.field3715 = null;
                    var2.field3709 = null;
                    var2.field3711 = true;
                } catch (Exception var4) {
                    class572.method7807((String) null, var4);
                    this.method7571(var4.getMessage());
                    return true;
                }
            }
        }
        this.field4817 = true;
        return true;
    }
}
