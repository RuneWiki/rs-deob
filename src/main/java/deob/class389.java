package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("oa")
public class class389 {

    @ObfuscatedName("oa.ak")
    public final List field4546;

    @ObfuscatedName("oa.al")
    public static Comparator field4550 = new class392();

    @ObfuscatedName("oa.aj")
    public static Comparator field4548;

    @ObfuscatedName("oa.az")
    public static Comparator field4549;

    @ObfuscatedName("oa.af")
    public static Comparator field4547;

    static {
        new class394();
        field4548 = new class397();
        field4549 = new class391();
        field4547 = new class390();
    }

    public class389(class546 arg0, boolean arg1) {
        int var3 = arg0.method8798();
        boolean var4 = arg0.method8796() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8798();
        this.field4546 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4546.add(new class395(arg0, var5, var3));
        }
    }

    @ObfuscatedName("oa.ak(Ljava/util/Comparator;ZB)V")
    public void method6695(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4546, arg0);
        } else {
            Collections.sort(this.field4546, Collections.reverseOrder(arg0));
        }
    }
}
