package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("j")
public class class2 {

    @ObfuscatedName("j.x")
    public final List field22;

    @ObfuscatedName("j.j")
    public static Comparator field12 = new class8();

    @ObfuscatedName("j.c")
    public static Comparator field20;

    @ObfuscatedName("j.d")
    public static Comparator field15;

    @ObfuscatedName("j.w")
    public static Comparator field14;

    static {
        new class1();
        field20 = new class6();
        field15 = new class7();
        field14 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2745();
        boolean var4 = arg0.method2701() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2745();
        this.field22 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field22.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("j.x(Ljava/util/Comparator;ZI)V")
    public void method17(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field22, arg0);
        } else {
            Collections.sort(this.field22, Collections.reverseOrder(arg0));
        }
    }
}
