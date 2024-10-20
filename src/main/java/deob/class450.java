package deob;

import java.util.ArrayList;

@ObfuscatedName("rd")
public class class450 extends class449 {

    @ObfuscatedName("rd.ap")
    public ArrayList field4888;

    public class450(class449 arg0, ArrayList arg1) {
        super(arg0);
        this.field4888 = arg1;
        this.field4882 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("rd.ap(I)Z")
    public boolean method8051() {
        for (int var1 = 0; var1 < this.field4888.size(); var1++) {
            class449 var2 = (class449) this.field4888.get(var1);
            if (var2 == null) {
                this.field4888.remove(var1);
                var1--;
            } else if (var2.method8051()) {
                if (var2.method8063()) {
                    this.method8067(var2.method8065());
                    this.field4888.clear();
                    return true;
                }
                if (var2.method8066() != null) {
                    this.field4888.add(var2.method8066());
                }
                this.field4886 = var2.field4886;
                this.field4888.remove(var1);
                var1--;
            }
        }
        if (this.field4888.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
