package deob;

import java.util.ArrayList;

@ObfuscatedName("rk")
public class class447 extends class446 {

    @ObfuscatedName("rk.ab")
    public ArrayList field4798;

    public class447(class446 arg0, ArrayList arg1) {
        super(arg0);
        this.field4798 = arg1;
        this.field4797 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("rk.ab(I)Z")
    public boolean method7665() {
        for (int var1 = 0; var1 < this.field4798.size(); var1++) {
            class446 var2 = (class446) this.field4798.get(var1);
            if (var2 == null) {
                this.field4798.remove(var1);
                var1--;
            } else if (var2.method7665()) {
                if (var2.method7668()) {
                    this.method7672(var2.method7673());
                    this.field4798.clear();
                    return true;
                }
                if (var2.method7674() != null) {
                    this.field4798.add(var2.method7674());
                }
                this.field4793 = var2.field4793;
                this.field4798.remove(var1);
                var1--;
            }
        }
        if (this.field4798.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
