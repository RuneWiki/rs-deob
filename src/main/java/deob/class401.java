package deob;

import java.util.Iterator;

@ObfuscatedName("pe")
public class class401 extends class408 {

    public class401(class408 arg0) {
        super(arg0);
        this.field4529 = "AddRequestTask";
    }

    @ObfuscatedName("pe.aw(II)Z")
    public boolean method6944(int arg0) {
        while (!class307.field3397.isEmpty()) {
            class319 var2 = (class319) class307.field3397.peek();
            if (var2 == null) {
                class307.field3397.pop();
            } else {
                var2.field3517 = this.method6943();
                class307.field3395.add(var2);
                class307.field3397.pop();
            }
        }
        return true;
    }

    @ObfuscatedName("pe.ay(I)Llc;")
    public class308 method6943() {
        class308 var1 = null;
        Iterator var2 = class307.field3396.iterator();
        while (true) {
            class308 var3;
            do {
                do {
                    if (!var2.hasNext()) {
                        if (var1 != null) {
                            var1.field3440++;
                            if (var1.method5257() == 0 && var1.method5264()) {
                                var1.method5263();
                                var1.method5261();
                                var1.method5256(0);
                            }
                        }
                        return var1;
                    }
                    var3 = (class308) var2.next();
                } while (var3 == null);
            } while (var1 != null && var1.field3440 <= var3.field3440 && (var1.field3440 != var3.field3440 || var3.method5257() != 0 || !var3.method5264()));
            var1 = var3;
        }
    }
}
