package deob;

import java.util.ArrayList;

@ObfuscatedName("pe")
public class class408 extends class407 {

    @ObfuscatedName("pe.au")
    public ArrayList field4527;

    public class408(class407 arg0, ArrayList arg1) {
        super(arg0);
        this.field4527 = arg1;
        this.field4524 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("pe.au(I)Z")
    public boolean method6976() {
        for (int var1 = 0; var1 < this.field4527.size(); var1++) {
            class407 var2 = (class407) this.field4527.get(var1);
            if (var2 == null) {
                this.field4527.remove(var1);
                var1--;
            } else if (var2.method6976()) {
                if (var2.method6984()) {
                    this.method6986(var2.method6983());
                    this.field4527.clear();
                    return true;
                }
                if (var2.method6985() != null) {
                    this.field4527.add(var2.method6985());
                }
                this.field4526 = var2.field4526;
                this.field4527.remove(var1);
                var1--;
            }
        }
        if (this.field4527.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
