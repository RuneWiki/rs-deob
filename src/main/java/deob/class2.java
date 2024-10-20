package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class2 {

    @ObfuscatedName("c.y")
    public final List field8;

    @ObfuscatedName("c.c")
    public static Comparator field11 = new class8();

    @ObfuscatedName("c.n")
    public static Comparator field9;

    @ObfuscatedName("c.u")
    public static Comparator field10;

    @ObfuscatedName("c.i")
    public static Comparator field7;

    static {
        new class1();
        field9 = new class6();
        field10 = new class7();
        field7 = new class4();
    }

    public class2(class185 arg0, boolean arg1) {
        int var3 = arg0.method3280();
        boolean var4 = arg0.method3299() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3280();
        this.field8 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field8.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.y(Ljava/util/Comparator;ZI)V")
    public void method13(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field8, arg0);
        } else {
            Collections.sort(this.field8, Collections.reverseOrder(arg0));
        }
    }
}
