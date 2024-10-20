package deob;

import java.util.ArrayList;

@ObfuscatedName("qh")
public class class427 extends class426 {

    @ObfuscatedName("qh.aq")
    public ArrayList field4632;

    public class427(class426 arg0, ArrayList arg1) {
        super(arg0);
        this.field4632 = arg1;
        this.field4628 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("qh.aq(I)Z")
    public boolean method7266() {
        for (int var1 = 0; var1 < this.field4632.size(); var1++) {
            class426 var2 = (class426) this.field4632.get(var1);
            if (var2 == null) {
                this.field4632.remove(var1);
                var1--;
            } else if (var2.method7266()) {
                if (var2.method7277()) {
                    this.method7280(var2.method7278());
                    this.field4632.clear();
                    return true;
                }
                if (var2.method7279() != null) {
                    this.field4632.add(var2.method7279());
                }
                this.field4631 = var2.field4631;
                this.field4632.remove(var1);
                var1--;
            }
        }
        if (this.field4632.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
