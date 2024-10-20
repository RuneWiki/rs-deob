package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qt")
public class class440 extends class445 {

    @ObfuscatedName("qt.aq")
    public ArrayList field4801;

    public class440(class445 arg0, ArrayList arg1) {
        super(arg0);
        this.field4815 = "ClearRequestTask";
        this.field4801 = arg1;
    }

    @ObfuscatedName("qt.aq(S)Z")
    public boolean method7560() {
        if (this.field4801.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4801.iterator();
        while (var1.hasNext()) {
            class343 var2 = (class343) var1.next();
            try {
                if (class331.field3585.contains(var2)) {
                    if (var2 == null) {
                        class331.field3585.remove(var2);
                    } else {
                        if (var2.field3714.field3628 > 0) {
                            var2.field3714.field3628--;
                        }
                        if (var2.field3714.field3628 == 0) {
                            var2.field3714.method5642();
                            var2.field3714.method5613();
                            var2.field3714.method5609(0);
                        }
                        int var3 = var2.field3717;
                        int var4 = var2.field3706;
                        Iterator var5 = class331.field3589.iterator();
                        while (var5.hasNext()) {
                            class337 var6 = (class337) var5.next();
                            var6.method1181(var3, var4);
                        }
                        class331.field3585.remove(var2);
                    }
                }
            } catch (Exception var8) {
                class572.method7807((String) null, var8);
                this.method7571(var8.getMessage());
                class331.field3585.clear();
                return true;
            }
        }
        return true;
    }
}
