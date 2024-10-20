package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("pp")
public class class393 {

    @ObfuscatedName("pp.ac")
    public final List field4597;

    @ObfuscatedName("pp.ae")
    public static Comparator field4596 = new class396();

    @ObfuscatedName("pp.ag")
    public static Comparator field4600;

    @ObfuscatedName("pp.am")
    public static Comparator field4595;

    @ObfuscatedName("pp.ax")
    public static Comparator field4599;

    static {
        new class398();
        field4600 = new class401();
        field4595 = new class395();
        field4599 = new class394();
    }

    public class393(class551 arg0, boolean arg1) {
        int var3 = arg0.method9119();
        boolean var4 = arg0.method8955() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method9119();
        this.field4597 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4597.add(new class399(arg0, var5, var3));
        }
    }

    @ObfuscatedName("pp.ac(Ljava/util/Comparator;ZB)V")
    public void method6896(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4597, arg0);
        } else {
            Collections.sort(this.field4597, Collections.reverseOrder(arg0));
        }
    }
}
