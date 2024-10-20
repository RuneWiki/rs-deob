package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.n")
    public final List field3078;

    @ObfuscatedName("he.w")
    public static Comparator field3076 = new class209();

    @ObfuscatedName("he.i")
    public static Comparator field3075;

    @ObfuscatedName("he.e")
    public static Comparator field3077;

    @ObfuscatedName("he.h")
    public static Comparator field3079;

    static {
        new class210();
        field3075 = new class208();
        field3077 = new class204();
        field3079 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2157();
        boolean var4 = arg0.method2155() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2157();
        this.field3078 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3078.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("he.n(Ljava/util/Comparator;ZI)V")
    public void method3575(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3078, arg0);
        } else {
            Collections.sort(this.field3078, Collections.reverseOrder(arg0));
        }
    }
}
