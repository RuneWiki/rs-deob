package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qp")
public class class422 extends class427 {

    @ObfuscatedName("qp.az")
    public ArrayList field4639;

    public class422(class427 arg0, ArrayList arg1) {
        super(arg0);
        this.field4652 = "ClearRequestTask";
        this.field4639 = arg1;
    }

    @ObfuscatedName("qp.az(I)Z")
    public boolean method7146() {
        if (this.field4639.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4639.iterator();
        while (var1.hasNext()) {
            class334 var2 = (class334) var1.next();
            try {
                if (class322.field3496.contains(var2)) {
                    if (var2 == null) {
                        class322.field3496.remove(var2);
                    } else {
                        if (var2.field3614.field3535 > 0) {
                            var2.field3614.field3535--;
                        }
                        if (var2.field3614.field3535 == 0) {
                            var2.field3614.method5447();
                            var2.field3614.method5445();
                            var2.field3614.method5440(0);
                        }
                        int var3 = var2.field3606;
                        int var4 = var2.field3607;
                        Iterator var5 = class322.field3500.iterator();
                        while (var5.hasNext()) {
                            class328 var6 = (class328) var5.next();
                            var6.method1157(var3, var4);
                        }
                        class322.field3496.remove(var2);
                    }
                }
            } catch (Exception var8) {
                class561.method3291((String) null, var8);
                this.method7175(var8.getMessage());
                class322.field3496.clear();
                return true;
            }
        }
        return true;
    }
}
