package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hu")
public class class221 {

    @ObfuscatedName("hu.i")
    public final List field3159;

    @ObfuscatedName("hu.v")
    public static Comparator field3163 = new class218();

    @ObfuscatedName("hu.r")
    public static Comparator field3160;

    @ObfuscatedName("hu.n")
    public static Comparator field3161;

    @ObfuscatedName("hu.x")
    public static Comparator field3162;

    static {
        new class219();
        field3160 = new class217();
        field3161 = new class213();
        field3162 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2347();
        boolean var4 = arg0.method2380() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2347();
        this.field3159 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3159.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hu.i(Ljava/util/Comparator;ZI)V")
    public void method3716(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3159, arg0);
        } else {
            Collections.sort(this.field3159, Collections.reverseOrder(arg0));
        }
    }
}
