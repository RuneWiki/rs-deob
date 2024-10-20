package deob;

import java.util.ArrayList;

@ObfuscatedName("ru")
public class class449 extends class448 {

    @ObfuscatedName("ru.ac")
    public ArrayList field4847;

    public class449(class448 arg0, ArrayList arg1) {
        super(arg0);
        this.field4847 = arg1;
        this.field4844 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("ru.ac(I)Z")
    public boolean method7804() {
        for (int var1 = 0; var1 < this.field4847.size(); var1++) {
            class448 var2 = (class448) this.field4847.get(var1);
            if (var2 == null) {
                this.field4847.remove(var1);
                var1--;
            } else if (var2.method7804()) {
                if (var2.method7811()) {
                    this.method7820(var2.method7813());
                    this.field4847.clear();
                    return true;
                }
                if (var2.method7809() != null) {
                    this.field4847.add(var2.method7809());
                }
                this.field4842 = var2.field4842;
                this.field4847.remove(var1);
                var1--;
            }
        }
        if (this.field4847.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
