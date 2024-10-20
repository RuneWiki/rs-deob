package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("pu")
public class class403 extends class408 {

    @ObfuscatedName("pu.aw")
    public ArrayList field4516;

    public class403(class408 arg0, ArrayList arg1) {
        super(arg0);
        this.field4529 = "ClearRequestTask";
        this.field4516 = arg1;
    }

    @ObfuscatedName("pu.aw(II)Z")
    public boolean method6944(int arg0) {
        if (this.field4516.isEmpty()) {
            return true;
        }
        Iterator var2 = this.field4516.iterator();
        while (var2.hasNext()) {
            class319 var3 = (class319) var2.next();
            try {
                if (class307.field3395.contains(var3)) {
                    if (var3 == null) {
                        class307.field3395.remove(var3);
                    } else {
                        var3.field3517.field3440--;
                        if (var3.field3517.field3440 == 0) {
                            var3.field3517.method5263();
                            var3.field3517.method5261();
                            var3.field3517.method5256(0);
                        }
                        class307.method3726(var3.field3508, var3.field3510);
                        class307.field3395.remove(var3);
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                this.method6959(var5.getMessage());
                class307.field3395.clear();
                return true;
            }
        }
        return true;
    }
}
