package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("q")
public class class14 {

    @ObfuscatedName("q.b")
    public final List field261;

    @ObfuscatedName("q.s")
    public static Comparator field260 = new class20();

    @ObfuscatedName("q.r")
    public static Comparator field266;

    @ObfuscatedName("q.g")
    public static Comparator field262;

    @ObfuscatedName("q.x")
    public static Comparator field263;

    static {
        new class13();
        field266 = new class18();
        field262 = new class19();
        field263 = new class16();
    }

    public class14(class181 arg0, boolean arg1) {
        int var3 = arg0.method3081();
        boolean var4 = arg0.method2945() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3081();
        this.field261 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field261.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("q.b(Ljava/util/Comparator;ZI)V")
    public void method69(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field261, arg0);
        } else {
            Collections.sort(this.field261, Collections.reverseOrder(arg0));
        }
    }
}
