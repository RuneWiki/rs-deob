package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("kg")
public class class292 {

    @ObfuscatedName("kg.l")
    public final List field3736;

    @ObfuscatedName("kg.q")
    public static Comparator field3735 = new class295();

    @ObfuscatedName("kg.f")
    public static Comparator field3737;

    @ObfuscatedName("kg.j")
    public static Comparator field3738;

    @ObfuscatedName("kg.m")
    public static Comparator field3739;

    static {
        new class297();
        field3737 = new class300();
        field3738 = new class294();
        field3739 = new class293();
    }

    public class292(class401 arg0, boolean arg1) {
        int var3 = arg0.method6284();
        boolean var4 = arg0.method6272() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6284();
        this.field3736 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3736.add(new class298(arg0, var5, var3));
        }
    }

    @ObfuscatedName("kg.l(Ljava/util/Comparator;ZI)V")
    public void method4871(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3736, arg0);
        } else {
            Collections.sort(this.field3736, Collections.reverseOrder(arg0));
        }
    }
}
