package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("oj")
public class class390 {

    @ObfuscatedName("oj.aq")
    public final List field4578;

    @ObfuscatedName("oj.ad")
    public static Comparator field4574 = new class393();

    @ObfuscatedName("oj.ag")
    public static Comparator field4575;

    @ObfuscatedName("oj.ak")
    public static Comparator field4576;

    @ObfuscatedName("oj.ap")
    public static Comparator field4573;

    static {
        new class395();
        field4575 = new class398();
        field4576 = new class392();
        field4573 = new class391();
    }

    public class390(class547 arg0, boolean arg1) {
        int var3 = arg0.method8899();
        boolean var4 = arg0.method8804() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8899();
        this.field4578 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4578.add(new class396(arg0, var5, var3));
        }
    }

    @ObfuscatedName("oj.aq(Ljava/util/Comparator;ZI)V")
    public void method6659(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4578, arg0);
        } else {
            Collections.sort(this.field4578, Collections.reverseOrder(arg0));
        }
    }
}
