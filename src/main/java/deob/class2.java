package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("q")
public class class2 {

    @ObfuscatedName("q.c")
    public final List field14;

    @ObfuscatedName("q.q")
    public static Comparator field9 = new class8();

    @ObfuscatedName("q.m")
    public static Comparator field10;

    @ObfuscatedName("q.j")
    public static Comparator field11;

    @ObfuscatedName("q.g")
    public static Comparator field12;

    static {
        new class1();
        field10 = new class6();
        field11 = new class7();
        field12 = new class4();
    }

    public class2(class185 arg0, boolean arg1) {
        int var3 = arg0.method3245();
        boolean var4 = arg0.method3243() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3245();
        this.field14 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field14.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("q.c(Ljava/util/Comparator;ZB)V")
    public void method12(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field14, arg0);
        } else {
            Collections.sort(this.field14, Collections.reverseOrder(arg0));
        }
    }
}
