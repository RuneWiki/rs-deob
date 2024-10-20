package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("p")
public class class14 {

    @ObfuscatedName("p.d")
    public final List field271;

    @ObfuscatedName("p.q")
    public static Comparator field266 = new class20();

    @ObfuscatedName("p.x")
    public static Comparator field267;

    @ObfuscatedName("p.y")
    public static Comparator field276;

    @ObfuscatedName("p.e")
    public static Comparator field269;

    static {
        new class13();
        field267 = new class18();
        field276 = new class19();
        field269 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2916();
        boolean var4 = arg0.method2921() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2916();
        this.field271 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field271.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("p.d(Ljava/util/Comparator;ZI)V")
    public void method66(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field271, arg0);
        } else {
            Collections.sort(this.field271, Collections.reverseOrder(arg0));
        }
    }
}
