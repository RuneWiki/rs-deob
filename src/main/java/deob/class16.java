package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("r")
public class class16 {

    @ObfuscatedName("r.f")
    public final List field68;

    @ObfuscatedName("r.b")
    public static Comparator field63 = new class22();

    @ObfuscatedName("r.l")
    public static Comparator field67;

    @ObfuscatedName("r.m")
    public static Comparator field66;

    @ObfuscatedName("r.z")
    public static Comparator field64;

    static {
        new class15();
        field67 = new class20();
        field66 = new class21();
        field64 = new class18();
    }

    public class16(class311 arg0, boolean arg1) {
        int var3 = arg0.method5163();
        boolean var4 = arg0.method5276() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5163();
        this.field68 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field68.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("r.f(Ljava/util/Comparator;ZI)V")
    public void method130(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field68, arg0);
        } else {
            Collections.sort(this.field68, Collections.reverseOrder(arg0));
        }
    }
}
