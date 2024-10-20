package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("jf")
public class class279 {

    @ObfuscatedName("jf.s")
    public final List field3617;

    @ObfuscatedName("jf.t")
    public static Comparator field3616 = new class282();

    @ObfuscatedName("jf.v")
    public static Comparator field3618;

    @ObfuscatedName("jf.j")
    public static Comparator field3620;

    @ObfuscatedName("jf.l")
    public static Comparator field3619;

    static {
        new class284();
        field3618 = new class287();
        field3620 = new class281();
        field3619 = new class280();
    }

    public class279(class385 arg0, boolean arg1) {
        int var3 = arg0.method6053();
        boolean var4 = arg0.method5958() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6053();
        this.field3617 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3617.add(new class285(arg0, var5, var3));
        }
    }

    @ObfuscatedName("jf.s(Ljava/util/Comparator;ZI)V")
    public void method4549(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3617, arg0);
        } else {
            Collections.sort(this.field3617, Collections.reverseOrder(arg0));
        }
    }
}
