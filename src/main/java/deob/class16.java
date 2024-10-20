package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("f")
public class class16 {

    @ObfuscatedName("f.h")
    public final List field61;

    @ObfuscatedName("f.v")
    public static Comparator field58 = new class22();

    @ObfuscatedName("f.x")
    public static Comparator field59;

    @ObfuscatedName("f.w")
    public static Comparator field57;

    @ObfuscatedName("f.t")
    public static Comparator field60;

    static {
        new class15();
        field59 = new class20();
        field57 = new class21();
        field60 = new class18();
    }

    public class16(class311 arg0, boolean arg1) {
        int var3 = arg0.method5342();
        boolean var4 = arg0.method5274() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5342();
        this.field61 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field61.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("f.h(Ljava/util/Comparator;ZI)V")
    public void method118(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field61, arg0);
        } else {
            Collections.sort(this.field61, Collections.reverseOrder(arg0));
        }
    }
}
