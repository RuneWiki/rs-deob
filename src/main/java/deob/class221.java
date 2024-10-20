package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hp")
public class class221 {

    @ObfuscatedName("hp.j")
    public final List field3160;

    @ObfuscatedName("hp.m")
    public static Comparator field3161 = new class218();

    @ObfuscatedName("hp.f")
    public static Comparator field3158;

    @ObfuscatedName("hp.l")
    public static Comparator field3159;

    @ObfuscatedName("hp.u")
    public static Comparator field3162;

    static {
        new class219();
        field3158 = new class217();
        field3159 = new class213();
        field3162 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2374();
        boolean var4 = arg0.method2372() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2374();
        this.field3160 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3160.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hp.j(Ljava/util/Comparator;ZB)V")
    public void method3792(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3160, arg0);
        } else {
            Collections.sort(this.field3160, Collections.reverseOrder(arg0));
        }
    }
}
