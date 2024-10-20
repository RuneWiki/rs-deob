package deob;

import java.util.HashMap;

@ObfuscatedName("tk")
public class class496 {

    @ObfuscatedName("tk.at")
    public class371 field4986;

    @ObfuscatedName("tk.ah")
    public class371 field4987;

    @ObfuscatedName("tk.ar")
    public HashMap field4985;

    public class496(class371 arg0, class371 arg1) {
        this.field4986 = arg0;
        this.field4987 = arg1;
        this.field4985 = new HashMap();
    }

    @ObfuscatedName("tk.at([Lth;I)Ljava/util/HashMap;")
    public HashMap method8107(class497[] arg0) {
        HashMap var2 = new HashMap();
        class497[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class497 var5 = var3[var4];
            if (this.field4985.containsKey(var5)) {
                var2.put(var5, this.field4985.get(var5));
            } else {
                class406 var6 = class542.method104(this.field4986, this.field4987, var5.field4991, "");
                if (var6 != null) {
                    this.field4985.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
