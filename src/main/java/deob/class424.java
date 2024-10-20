package deob;

import java.util.ArrayList;

@ObfuscatedName("qy")
public class class424 extends class423 {

    @ObfuscatedName("qy.am")
    public ArrayList field4601;

    public class424(class423 arg0, ArrayList arg1) {
        super(arg0);
        this.field4601 = arg1;
        this.field4598 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("qy.am(I)Z")
    public boolean method7259() {
        for (int var1 = 0; var1 < this.field4601.size(); var1++) {
            class423 var2 = (class423) this.field4601.get(var1);
            if (var2 == null) {
                this.field4601.remove(var1);
                var1--;
            } else if (var2.method7259()) {
                if (var2.method7264()) {
                    this.method7268(var2.method7266());
                    this.field4601.clear();
                    return true;
                }
                if (var2.method7267() != null) {
                    this.field4601.add(var2.method7267());
                }
                this.field4595 = var2.field4595;
                this.field4601.remove(var1);
                var1--;
            }
        }
        if (this.field4601.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
