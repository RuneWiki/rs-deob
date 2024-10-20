package deob;

import java.util.ArrayList;

@ObfuscatedName("qz")
public class class423 extends class422 {

    @ObfuscatedName("qz.ac")
    public ArrayList field4580;

    public class423(class422 arg0, ArrayList arg1) {
        super(arg0);
        this.field4580 = arg1;
        this.field4573 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("qz.ac(B)Z")
    public boolean method7059() {
        for (int var1 = 0; var1 < this.field4580.size(); var1++) {
            class422 var2 = (class422) this.field4580.get(var1);
            if (var2 == null) {
                this.field4580.remove(var1);
                var1--;
            } else if (var2.method7059()) {
                if (var2.method7069()) {
                    this.method7079(var2.method7071());
                    this.field4580.clear();
                    return true;
                }
                if (var2.method7072() != null) {
                    this.field4580.add(var2.method7072());
                }
                this.field4574 = var2.field4574;
                this.field4580.remove(var1);
                var1--;
            }
        }
        if (this.field4580.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
