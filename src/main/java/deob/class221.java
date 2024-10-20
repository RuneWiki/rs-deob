package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hd")
public class class221 {

    @ObfuscatedName("hd.z")
    public final List field3161;

    @ObfuscatedName("hd.q")
    public static Comparator field3162 = new class218();

    @ObfuscatedName("hd.k")
    public static Comparator field3160;

    @ObfuscatedName("hd.f")
    public static Comparator field3163;

    @ObfuscatedName("hd.d")
    public static Comparator field3164;

    static {
        new class219();
        field3160 = new class217();
        field3163 = new class213();
        field3164 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2415();
        boolean var4 = arg0.method2457() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2415();
        this.field3161 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3161.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hd.z(Ljava/util/Comparator;ZI)V")
    public void method3665(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3161, arg0);
        } else {
            Collections.sort(this.field3161, Collections.reverseOrder(arg0));
        }
    }
}
