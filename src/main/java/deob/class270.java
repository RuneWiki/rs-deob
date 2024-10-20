package deob;

import java.util.HashMap;

@ObfuscatedName("jz")
public class class270 {

    @ObfuscatedName("jz.b")
    public class243 field3682;

    @ObfuscatedName("jz.s")
    public class243 field3683;

    @ObfuscatedName("jz.r")
    public HashMap field3684;

    public class270(class243 arg0, class243 arg1) {
        this.field3682 = arg0;
        this.field3683 = arg1;
        this.field3684 = new HashMap();
    }

    @ObfuscatedName("jz.b([Lju;B)Ljava/util/HashMap;")
    public HashMap method4443(class269[] arg0) {
        HashMap var2 = new HashMap();
        class269[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class269 var5 = var3[var4];
            if (this.field3684.containsKey(var5)) {
                var2.put(var5, this.field3684.get(var5));
            } else {
                class271 var6 = class296.method535(this.field3682, this.field3683, var5.field3676, "");
                if (var6 != null) {
                    this.field3684.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
