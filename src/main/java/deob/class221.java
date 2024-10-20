package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hx")
public class class221 {

    @ObfuscatedName("hx.l")
    public final List field3162;

    @ObfuscatedName("hx.e")
    public static Comparator field3165 = new class218();

    @ObfuscatedName("hx.q")
    public static Comparator field3164;

    @ObfuscatedName("hx.o")
    public static Comparator field3163;

    @ObfuscatedName("hx.g")
    public static Comparator field3166;

    static {
        new class219();
        field3164 = new class217();
        field3163 = new class213();
        field3166 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2440();
        boolean var4 = arg0.method2388() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2440();
        this.field3162 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3162.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hx.l(Ljava/util/Comparator;ZI)V")
    public void method3718(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3162, arg0);
        } else {
            Collections.sort(this.field3162, Collections.reverseOrder(arg0));
        }
    }
}
