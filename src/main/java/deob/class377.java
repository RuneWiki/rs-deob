package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("on")
public class class377 {

    @ObfuscatedName("on.am")
    public final List field4405;

    @ObfuscatedName("on.ap")
    public static Comparator field4401 = new class380();

    @ObfuscatedName("on.af")
    public static Comparator field4403;

    @ObfuscatedName("on.aj")
    public static Comparator field4404;

    @ObfuscatedName("on.aq")
    public static Comparator field4402;

    static {
        new class382();
        field4403 = new class385();
        field4404 = new class379();
        field4402 = new class378();
    }

    public class377(class531 arg0, boolean arg1) {
        int var3 = arg0.method8775();
        boolean var4 = arg0.method8561() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8775();
        this.field4405 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4405.add(new class383(arg0, var5, var3));
        }
    }

    @ObfuscatedName("on.am(Ljava/util/Comparator;ZI)V")
    public void method6512(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4405, arg0);
        } else {
            Collections.sort(this.field4405, Collections.reverseOrder(arg0));
        }
    }
}
