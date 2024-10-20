package deob;

import java.util.ArrayList;

@ObfuscatedName("ql")
public class class428 extends class427 {

    @ObfuscatedName("ql.az")
    public ArrayList field4660;

    public class428(class427 arg0, ArrayList arg1) {
        super(arg0);
        this.field4660 = arg1;
        this.field4652 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("ql.az(I)Z")
    public boolean method7146() {
        for (int var1 = 0; var1 < this.field4660.size(); var1++) {
            class427 var2 = (class427) this.field4660.get(var1);
            if (var2 == null) {
                this.field4660.remove(var1);
                var1--;
            } else if (var2.method7146()) {
                if (var2.method7159()) {
                    this.method7175(var2.method7173());
                    this.field4660.clear();
                    return true;
                }
                if (var2.method7160() != null) {
                    this.field4660.add(var2.method7160());
                }
                this.field4655 = var2.field4655;
                this.field4660.remove(var1);
                var1--;
            }
        }
        if (this.field4660.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
