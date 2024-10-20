package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("d")
public class class2 {

    @ObfuscatedName("d.q")
    public final List field10;

    @ObfuscatedName("d.d")
    public static Comparator field11 = new class8();

    @ObfuscatedName("d.h")
    public static Comparator field12;

    @ObfuscatedName("d.p")
    public static Comparator field21;

    @ObfuscatedName("d.j")
    public static Comparator field14;

    static {
        new class1();
        field12 = new class6();
        field21 = new class7();
        field14 = new class4();
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
        this.field10 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field10.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("d.q(Ljava/util/Comparator;ZI)V")
    public void method15(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field10, arg0);
        } else {
            Collections.sort(this.field10, Collections.reverseOrder(arg0));
        }
    }
}
