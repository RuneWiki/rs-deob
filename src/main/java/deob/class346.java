package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("nr")
public class class346 {

    @ObfuscatedName("nr.af")
    public final List field4265;

    @ObfuscatedName("nr.an")
    public static Comparator field4264 = new class349();

    @ObfuscatedName("nr.aw")
    public static Comparator field4267;

    @ObfuscatedName("nr.ac")
    public static Comparator field4266;

    @ObfuscatedName("nr.au")
    public static Comparator field4263;

    static {
        new class351();
        field4267 = new class354();
        field4266 = new class348();
        field4263 = new class347();
    }

    public class346(class489 arg0, boolean arg1) {
        int var3 = arg0.method8250();
        boolean var4 = arg0.method8248() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8250();
        this.field4265 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4265.add(new class352(arg0, var5, var3));
        }
    }

    @ObfuscatedName("nr.af(Ljava/util/Comparator;ZI)V")
    public void method6163(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4265, arg0);
        } else {
            Collections.sort(this.field4265, Collections.reverseOrder(arg0));
        }
    }
}
