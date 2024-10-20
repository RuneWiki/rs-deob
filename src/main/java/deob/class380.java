package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ov")
public class class380 {

    @ObfuscatedName("ov.aq")
    public final List field4441;

    @ObfuscatedName("ov.aw")
    public static Comparator field4437 = new class383();

    @ObfuscatedName("ov.al")
    public static Comparator field4438;

    @ObfuscatedName("ov.ai")
    public static Comparator field4436;

    @ObfuscatedName("ov.ar")
    public static Comparator field4440;

    static {
        new class385();
        field4438 = new class388();
        field4436 = new class382();
        field4440 = new class381();
    }

    public class380(class534 arg0, boolean arg1) {
        int var3 = arg0.method8593();
        boolean var4 = arg0.method8591() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8593();
        this.field4441 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4441.add(new class386(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ov.aq(Ljava/util/Comparator;ZI)V")
    public void method6545(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4441, arg0);
        } else {
            Collections.sort(this.field4441, Collections.reverseOrder(arg0));
        }
    }
}
