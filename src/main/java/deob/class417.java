package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("qi")
public class class417 extends class422 {

    @ObfuscatedName("qi.ac")
    public ArrayList field4564;

    public class417(class422 arg0, ArrayList arg1) {
        super(arg0);
        this.field4573 = "ClearRequestTask";
        this.field4564 = arg1;
    }

    @ObfuscatedName("qi.ac(B)Z")
    public boolean method7059() {
        if (this.field4564.isEmpty()) {
            return true;
        }
        Iterator var1 = this.field4564.iterator();
        while (var1.hasNext()) {
            class332 var2 = (class332) var1.next();
            try {
                if (class320.field3434.contains(var2)) {
                    if (var2 == null) {
                        class320.field3434.remove(var2);
                    } else {
                        if (var2.field3539.field3451 > 0) {
                            var2.field3539.field3451--;
                        }
                        if (var2.field3539.field3451 == 0) {
                            var2.field3539.method5417();
                            var2.field3539.method5470();
                            var2.field3539.method5411(0);
                        }
                        class320.method6172(var2.field3540, var2.field3541);
                        class320.field3434.remove(var2);
                    }
                }
            } catch (Exception var4) {
                class556.method3321((String) null, var4);
                this.method7079(var4.getMessage());
                class320.field3434.clear();
                return true;
            }
        }
        return true;
    }
}
