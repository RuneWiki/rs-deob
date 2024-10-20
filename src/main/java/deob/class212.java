package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hq")
public class class212 {

    @ObfuscatedName("hq.n")
    public final List field3072;

    @ObfuscatedName("hq.d")
    public static Comparator field3076 = new class209();

    @ObfuscatedName("hq.z")
    public static Comparator field3074;

    @ObfuscatedName("hq.y")
    public static Comparator field3075;

    @ObfuscatedName("hq.e")
    public static Comparator field3073;

    static {
        new class210();
        field3074 = new class208();
        field3075 = new class204();
        field3073 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2231();
        boolean var4 = arg0.method2228() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2231();
        this.field3072 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3072.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hq.n(Ljava/util/Comparator;ZI)V")
    public void method3645(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3072, arg0);
        } else {
            Collections.sort(this.field3072, Collections.reverseOrder(arg0));
        }
    }
}
