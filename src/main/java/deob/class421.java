package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qm")
public class class421 extends class426 {

    @ObfuscatedName("qm.aq")
    public ArrayList field4615;

    public class421(class426 arg0, ArrayList arg1) {
        super(arg0);
        this.field4628 = "ClearRequestTask";
        this.field4615 = arg1;
    }

    @ObfuscatedName("qm.aq(I)Z")
    public boolean method7266() {
        if (this.field4615.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4615.iterator();
        while (var1.hasNext()) {
            class334 var2 = (class334) var1.next();
            try {
                if (class322.field3475.contains(var2)) {
                    if (var2 == null) {
                        class322.field3475.remove(var2);
                    } else {
                        if (var2.field3595.field3519 > 0) {
                            var2.field3595.field3519--;
                        }
                        if (var2.field3595.field3519 == 0) {
                            var2.field3595.method5550();
                            var2.field3595.method5582();
                            var2.field3595.method5622(0);
                        }
                        int var3 = var2.field3591;
                        int var4 = var2.field3592;
                        Iterator var5 = class322.field3483.iterator();
                        while (var5.hasNext()) {
                            class328 var6 = (class328) var5.next();
                            var6.method1275(var3, var4);
                        }
                        class322.field3475.remove(var2);
                    }
                }
            } catch (Exception var8) {
                Statics.method5453((String) null, var8);
                this.method7280(var8.getMessage());
                class322.field3475.clear();
                return true;
            }
        }
        return true;
    }
}
