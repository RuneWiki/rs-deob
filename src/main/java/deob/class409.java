package deob;

import java.util.ArrayList;

@ObfuscatedName("pf")
public class class409 extends class408 {

    @ObfuscatedName("pf.aw")
    public ArrayList field4533;

    public class409(class408 arg0, ArrayList arg1) {
        super(arg0);
        this.field4533 = arg1;
        this.field4529 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("pf.aw(II)Z")
    public boolean method6944(int arg0) {
        for (int var2 = 0; var2 < this.field4533.size(); var2++) {
            class408 var3 = (class408) this.field4533.get(var2);
            if (var3 == null) {
                this.field4533.remove(var2);
                var2--;
            } else if (var3.method6944(arg0)) {
                if (var3.method6973()) {
                    this.method6959(var3.method6957());
                    this.field4533.clear();
                    return true;
                }
                if (var3.method6958() != null) {
                    this.field4533.add(var3.method6958());
                }
                this.field4527 = var3.field4527;
                this.field4533.remove(var2);
                var2--;
            }
        }
        if (this.field4533.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
