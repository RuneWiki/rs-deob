package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.b")
    public final List field3074;

    @ObfuscatedName("he.e")
    public static Comparator field3072 = new class209();

    @ObfuscatedName("he.a")
    public static Comparator field3073;

    @ObfuscatedName("he.k")
    public static Comparator field3075;

    @ObfuscatedName("he.p")
    public static Comparator field3071;

    static {
        new class210();
        field3073 = new class208();
        field3075 = new class204();
        field3071 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2129();
        boolean var4 = arg0.method2127() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2129();
        this.field3074 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3074.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("he.b(Ljava/util/Comparator;ZI)V")
    public void method3521(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3074, arg0);
        } else {
            Collections.sort(this.field3074, Collections.reverseOrder(arg0));
        }
    }
}
