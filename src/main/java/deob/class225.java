package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hv")
public class class225 {

    @ObfuscatedName("hv.f")
    public final List field3229;

    @ObfuscatedName("hv.e")
    public static Comparator field3226 = new class222();

    @ObfuscatedName("hv.n")
    public static Comparator field3227;

    @ObfuscatedName("hv.t")
    public static Comparator field3228;

    @ObfuscatedName("hv.v")
    public static Comparator field3230;

    static {
        new class223();
        field3227 = new class221();
        field3228 = new class217();
        field3230 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2401();
        boolean var4 = arg0.method2522() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2401();
        this.field3229 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3229.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hv.f(Ljava/util/Comparator;ZI)V")
    public void method3836(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3229, arg0);
        } else {
            Collections.sort(this.field3229, Collections.reverseOrder(arg0));
        }
    }
}
