package deob;

import java.util.ArrayList;

@ObfuscatedName("rq")
public class class446 extends class445 {

    @ObfuscatedName("rq.aq")
    public ArrayList field4818;

    public class446(class445 arg0, ArrayList arg1) {
        super(arg0);
        this.field4818 = arg1;
        this.field4815 = "ConcurrentMidiTask";
    }

    @ObfuscatedName("rq.aq(S)Z")
    public boolean method7560() {
        for (int var1 = 0; var1 < this.field4818.size(); var1++) {
            class445 var2 = (class445) this.field4818.get(var1);
            if (var2 == null) {
                this.field4818.remove(var1);
                var1--;
            } else if (var2.method7560()) {
                if (var2.method7567()) {
                    this.method7571(var2.method7569());
                    this.field4818.clear();
                    return true;
                }
                if (var2.method7572() != null) {
                    this.field4818.add(var2.method7572());
                }
                this.field4817 = var2.field4817;
                this.field4818.remove(var1);
                var1--;
            }
        }
        if (this.field4818.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
