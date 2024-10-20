package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hr")
public class class225 {

    @ObfuscatedName("hr.s")
    public final List field3230;

    @ObfuscatedName("hr.z")
    public static Comparator field3227 = new class222();

    @ObfuscatedName("hr.t")
    public static Comparator field3228;

    @ObfuscatedName("hr.y")
    public static Comparator field3229;

    @ObfuscatedName("hr.p")
    public static Comparator field3226;

    static {
        new class223();
        field3228 = new class221();
        field3229 = new class217();
        field3226 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2550();
        boolean var4 = arg0.method2363() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2550();
        this.field3230 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3230.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hr.s(Ljava/util/Comparator;ZI)V")
    public void method3791(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3230, arg0);
        } else {
            Collections.sort(this.field3230, Collections.reverseOrder(arg0));
        }
    }
}
