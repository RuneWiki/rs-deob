package deob;

import java.util.ArrayList;

@ObfuscatedName("qu")
public class class420 extends class419 {

    @ObfuscatedName("qu.at")
    public ArrayList field4560;

    public class420(class419 arg0, ArrayList arg1) {
        super(arg0);
        this.field4560 = arg1;
        this.field4553 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("qu.at(I)Z")
    public boolean method7116() {
        for (int var1 = 0; var1 < this.field4560.size(); var1++) {
            class419 var2 = (class419) this.field4560.get(var1);
            if (var2 == null) {
                this.field4560.remove(var1);
                var1--;
            } else if (var2.method7116()) {
                if (var2.method7135()) {
                    this.method7133(var2.method7128());
                    this.field4560.clear();
                    return true;
                }
                if (var2.method7132() != null) {
                    this.field4560.add(var2.method7132());
                }
                this.field4556 = var2.field4556;
                this.field4560.remove(var1);
                var1--;
            }
        }
        if (this.field4560.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
