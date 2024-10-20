package deob;

import java.util.ArrayList;

@ObfuscatedName("rs")
public class class445 extends class444 {

    @ObfuscatedName("rs.ak")
    public ArrayList field4800;

    public class445(class444 arg0, ArrayList arg1) {
        super(arg0);
        this.field4800 = arg1;
        this.field4794 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("rs.ak(I)Z")
    public boolean method7581() {
        for (int var1 = 0; var1 < this.field4800.size(); var1++) {
            class444 var2 = (class444) this.field4800.get(var1);
            if (var2 == null) {
                this.field4800.remove(var1);
                var1--;
            } else if (var2.method7581()) {
                if (var2.method7596()) {
                    this.method7599(var2.method7611());
                    this.field4800.clear();
                    return true;
                }
                if (var2.method7598() != null) {
                    this.field4800.add(var2.method7598());
                }
                this.field4799 = var2.field4799;
                this.field4800.remove(var1);
                var1--;
            }
        }
        if (this.field4800.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
