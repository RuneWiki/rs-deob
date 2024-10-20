package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("n")
public class class2 {

    @ObfuscatedName("n.x")
    public final List field10;

    @ObfuscatedName("n.n")
    public static Comparator field5 = new class8();

    @ObfuscatedName("n.g")
    public static Comparator field11;

    @ObfuscatedName("n.v")
    public static Comparator field7;

    @ObfuscatedName("n.y")
    public static Comparator field8;

    static {
        new class1();
        field11 = new class6();
        field7 = new class7();
        field8 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2833();
        boolean var4 = arg0.method2878() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2833();
        this.field10 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field10.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("n.x(Ljava/util/Comparator;ZI)V")
    public void method16(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field10, arg0);
        } else {
            Collections.sort(this.field10, Collections.reverseOrder(arg0));
        }
    }
}
