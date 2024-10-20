package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ho")
public class class212 {

    @ObfuscatedName("ho.n")
    public final List field3079;

    @ObfuscatedName("ho.g")
    public static Comparator field3078 = new class209();

    @ObfuscatedName("ho.a")
    public static Comparator field3080;

    @ObfuscatedName("ho.m")
    public static Comparator field3081;

    @ObfuscatedName("ho.s")
    public static Comparator field3083;

    static {
        new class210();
        field3080 = new class208();
        field3081 = new class204();
        field3083 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2395();
        boolean var4 = arg0.method2211() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2395();
        this.field3079 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3079.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ho.n(Ljava/util/Comparator;ZI)V")
    public void method3644(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3079, arg0);
        } else {
            Collections.sort(this.field3079, Collections.reverseOrder(arg0));
        }
    }
}
