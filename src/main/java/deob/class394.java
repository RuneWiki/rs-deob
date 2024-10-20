package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("pt")
public class class394 {

    @ObfuscatedName("pt.ap")
    public final List field4641;

    @ObfuscatedName("pt.aw")
    public static Comparator field4642 = new class397();

    @ObfuscatedName("pt.ak")
    public static Comparator field4637;

    @ObfuscatedName("pt.aj")
    public static Comparator field4636;

    @ObfuscatedName("pt.ai")
    public static Comparator field4639;

    static {
        new class399();
        field4637 = new class402();
        field4636 = new class396();
        field4639 = new class395();
    }

    public class394(class558 arg0, boolean arg1) {
        int var3 = arg0.method9260();
        boolean var4 = arg0.method9258() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method9260();
        this.field4641 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4641.add(new class400(arg0, var5, var3));
        }
    }

    @ObfuscatedName("pt.ap(Ljava/util/Comparator;ZI)V")
    public void method7108(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4641, arg0);
        } else {
            Collections.sort(this.field4641, Collections.reverseOrder(arg0));
        }
    }
}
