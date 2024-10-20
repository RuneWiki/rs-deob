package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class16 {

    @ObfuscatedName("c.z")
    public final List field69;

    @ObfuscatedName("c.k")
    public static Comparator field67 = new class22();

    @ObfuscatedName("c.s")
    public static Comparator field68;

    @ObfuscatedName("c.t")
    public static Comparator field66;

    @ObfuscatedName("c.i")
    public static Comparator field72;

    static {
        new class15();
        field68 = new class20();
        field66 = new class21();
        field72 = new class18();
    }

    public class16(class310 arg0, boolean arg1) {
        int var3 = arg0.method5195();
        boolean var4 = arg0.method5193() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5195();
        this.field69 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field69.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.z(Ljava/util/Comparator;ZS)V")
    public void method112(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field69, arg0);
        } else {
            Collections.sort(this.field69, Collections.reverseOrder(arg0));
        }
    }
}
