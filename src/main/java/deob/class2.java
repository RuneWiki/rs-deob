package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("i")
public class class2 {

    @ObfuscatedName("i.f")
    public final List field14;

    @ObfuscatedName("i.i")
    public static Comparator field9 = new class8();

    @ObfuscatedName("i.u")
    public static Comparator field17;

    @ObfuscatedName("i.h")
    public static Comparator field11;

    @ObfuscatedName("i.r")
    public static Comparator field12;

    static {
        new class1();
        field17 = new class6();
        field11 = new class7();
        field12 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2668();
        boolean var4 = arg0.method2666() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2668();
        this.field14 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field14.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("i.f(Ljava/util/Comparator;ZI)V")
    public void method6(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field14, arg0);
        } else {
            Collections.sort(this.field14, Collections.reverseOrder(arg0));
        }
    }
}
