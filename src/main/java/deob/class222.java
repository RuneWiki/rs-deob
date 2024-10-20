package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hg")
public class class222 {

    @ObfuscatedName("hg.e")
    public final List field3177;

    @ObfuscatedName("hg.w")
    public static Comparator field3175 = new class219();

    @ObfuscatedName("hg.f")
    public static Comparator field3176;

    @ObfuscatedName("hg.s")
    public static Comparator field3174;

    @ObfuscatedName("hg.p")
    public static Comparator field3178;

    static {
        new class220();
        field3176 = new class218();
        field3174 = new class214();
        field3178 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2532();
        boolean var4 = arg0.method2355() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2532();
        this.field3177 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3177.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hg.e(Ljava/util/Comparator;ZB)V")
    public void method3717(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3177, arg0);
        } else {
            Collections.sort(this.field3177, Collections.reverseOrder(arg0));
        }
    }
}
