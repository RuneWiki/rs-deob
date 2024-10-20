package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("no")
public class class361 {

    @ObfuscatedName("no.au")
    public final List field4328;

    @ObfuscatedName("no.ae")
    public static Comparator field4327 = new class364();

    @ObfuscatedName("no.ao")
    public static Comparator field4331;

    @ObfuscatedName("no.at")
    public static Comparator field4329;

    @ObfuscatedName("no.ac")
    public static Comparator field4330;

    static {
        new class366();
        field4331 = new class369();
        field4329 = new class363();
        field4330 = new class362();
    }

    public class361(class515 arg0, boolean arg1) {
        int var3 = arg0.method8448();
        boolean var4 = arg0.method8300() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8448();
        this.field4328 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4328.add(new class367(arg0, var5, var3));
        }
    }

    @ObfuscatedName("no.au(Ljava/util/Comparator;ZI)V")
    public void method6245(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4328, arg0);
        } else {
            Collections.sort(this.field4328, Collections.reverseOrder(arg0));
        }
    }
}
