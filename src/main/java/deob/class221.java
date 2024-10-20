package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hf")
public class class221 {

    @ObfuscatedName("hf.j")
    public final List field3171;

    @ObfuscatedName("hf.l")
    public static Comparator field3173 = new class218();

    @ObfuscatedName("hf.a")
    public static Comparator field3172;

    @ObfuscatedName("hf.i")
    public static Comparator field3174;

    @ObfuscatedName("hf.f")
    public static Comparator field3175;

    static {
        new class219();
        field3172 = new class217();
        field3174 = new class213();
        field3175 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2318();
        boolean var4 = arg0.method2316() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2318();
        this.field3171 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3171.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hf.j(Ljava/util/Comparator;ZS)V")
    public void method3700(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3171, arg0);
        } else {
            Collections.sort(this.field3171, Collections.reverseOrder(arg0));
        }
    }
}
