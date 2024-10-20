package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hm")
public class class212 {

    @ObfuscatedName("hm.t")
    public final List field3074;

    @ObfuscatedName("hm.b")
    public static Comparator field3075 = new class209();

    @ObfuscatedName("hm.p")
    public static Comparator field3073;

    @ObfuscatedName("hm.e")
    public static Comparator field3076;

    @ObfuscatedName("hm.i")
    public static Comparator field3077;

    static {
        new class210();
        field3073 = new class208();
        field3076 = new class204();
        field3077 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2255();
        boolean var4 = arg0.method2172() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2255();
        this.field3074 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3074.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hm.t(Ljava/util/Comparator;ZI)V")
    public void method3593(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3074, arg0);
        } else {
            Collections.sort(this.field3074, Collections.reverseOrder(arg0));
        }
    }
}
