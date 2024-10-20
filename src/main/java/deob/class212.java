package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hk")
public class class212 {

    @ObfuscatedName("hk.n")
    public final List field3079;

    @ObfuscatedName("hk.o")
    public static Comparator field3074 = new class209();

    @ObfuscatedName("hk.a")
    public static Comparator field3076;

    @ObfuscatedName("hk.w")
    public static Comparator field3077;

    @ObfuscatedName("hk.m")
    public static Comparator field3075;

    static {
        new class210();
        field3076 = new class208();
        field3077 = new class204();
        field3075 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2236();
        boolean var4 = arg0.method2234() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2236();
        this.field3079 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3079.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hk.n(Ljava/util/Comparator;ZI)V")
    public void method3628(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3079, arg0);
        } else {
            Collections.sort(this.field3079, Collections.reverseOrder(arg0));
        }
    }
}
