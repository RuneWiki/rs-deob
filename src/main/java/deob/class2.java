package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("d")
public class class2 {

    @ObfuscatedName("d.n")
    public final List field11;

    @ObfuscatedName("d.d")
    public static Comparator field5 = new class8();

    @ObfuscatedName("d.m")
    public static Comparator field7;

    @ObfuscatedName("d.h")
    public static Comparator field12;

    @ObfuscatedName("d.w")
    public static Comparator field9;

    static {
        new class1();
        field7 = new class6();
        field12 = new class7();
        field9 = new class4();
    }

    public class2(class161 arg0, boolean arg1) {
        int var3 = arg0.method2887();
        boolean var4 = arg0.method2823() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2887();
        this.field11 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field11.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("d.n(Ljava/util/Comparator;ZI)V")
    public void method14(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field11, arg0);
        } else {
            Collections.sort(this.field11, Collections.reverseOrder(arg0));
        }
    }
}
