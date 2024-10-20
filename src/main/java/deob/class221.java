package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hc")
public class class221 {

    @ObfuscatedName("hc.h")
    public final List field3152;

    @ObfuscatedName("hc.m")
    public static Comparator field3155 = new class218();

    @ObfuscatedName("hc.i")
    public static Comparator field3154;

    @ObfuscatedName("hc.q")
    public static Comparator field3153;

    @ObfuscatedName("hc.p")
    public static Comparator field3156;

    static {
        new class219();
        field3154 = new class217();
        field3153 = new class213();
        field3156 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2322();
        boolean var4 = arg0.method2320() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2322();
        this.field3152 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3152.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hc.h(Ljava/util/Comparator;ZI)V")
    public void method3719(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3152, arg0);
        } else {
            Collections.sort(this.field3152, Collections.reverseOrder(arg0));
        }
    }
}
