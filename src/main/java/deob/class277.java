package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("jm")
public class class277 {

    @ObfuscatedName("jm.v")
    public final List field3624;

    @ObfuscatedName("jm.n")
    public static Comparator field3621 = new class280();

    @ObfuscatedName("jm.f")
    public static Comparator field3620;

    @ObfuscatedName("jm.y")
    public static Comparator field3623;

    @ObfuscatedName("jm.p")
    public static Comparator field3625;

    static {
        new class282();
        field3620 = new class285();
        field3623 = new class279();
        field3625 = new class278();
    }

    public class277(class383 arg0, boolean arg1) {
        int var3 = arg0.method5967();
        boolean var4 = arg0.method5965() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5967();
        this.field3624 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3624.add(new class283(arg0, var5, var3));
        }
    }

    @ObfuscatedName("jm.v(Ljava/util/Comparator;ZI)V")
    public void method4584(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3624, arg0);
        } else {
            Collections.sort(this.field3624, Collections.reverseOrder(arg0));
        }
    }
}
