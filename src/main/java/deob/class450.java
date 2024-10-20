package deob;

import java.util.HashMap;

@ObfuscatedName("rs")
public class class450 {

    @ObfuscatedName("rs.aj")
    public class340 field4789;

    @ObfuscatedName("rs.al")
    public class340 field4787;

    @ObfuscatedName("rs.ac")
    public HashMap field4788;

    public class450(class340 arg0, class340 arg1) {
        this.field4789 = arg0;
        this.field4787 = arg1;
        this.field4788 = new HashMap();
    }

    @ObfuscatedName("rs.aj([Lry;I)Ljava/util/HashMap;")
    public HashMap method7563(class451[] arg0) {
        HashMap var2 = new HashMap();
        class451[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class451 var5 = var3[var4];
            if (this.field4788.containsKey(var5)) {
                var2.put(var5, this.field4788.get(var5));
            } else {
                class375 var6 = class493.method8178(this.field4789, this.field4787, var5.field4797, "");
                if (var6 != null) {
                    this.field4788.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
