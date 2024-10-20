package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("w")
public class class2 {

    @ObfuscatedName("w.z")
    public final List field11;

    @ObfuscatedName("w.w")
    public static Comparator field10 = new class8();

    @ObfuscatedName("w.s")
    public static Comparator field14;

    @ObfuscatedName("w.l")
    public static Comparator field12;

    @ObfuscatedName("w.u")
    public static Comparator field17;

    static {
        new class1();
        field14 = new class6();
        field12 = new class7();
        field17 = new class4();
    }

    public class2(class183 arg0, boolean arg1) {
        int var3 = arg0.method3253();
        boolean var4 = arg0.method3247() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3253();
        this.field11 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field11.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("w.z(Ljava/util/Comparator;ZB)V")
    public void method10(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field11, arg0);
        } else {
            Collections.sort(this.field11, Collections.reverseOrder(arg0));
        }
    }
}
