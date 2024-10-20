package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hf")
public class class221 {

    @ObfuscatedName("hf.d")
    public final List field3162;

    @ObfuscatedName("hf.p")
    public static Comparator field3159 = new class218();

    @ObfuscatedName("hf.v")
    public static Comparator field3160;

    @ObfuscatedName("hf.l")
    public static Comparator field3161;

    @ObfuscatedName("hf.y")
    public static Comparator field3163;

    static {
        new class219();
        field3160 = new class217();
        field3161 = new class213();
        field3163 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2359();
        boolean var4 = arg0.method2357() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2359();
        this.field3162 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3162.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hf.d(Ljava/util/Comparator;ZI)V")
    public void method3810(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3162, arg0);
        } else {
            Collections.sort(this.field3162, Collections.reverseOrder(arg0));
        }
    }
}
