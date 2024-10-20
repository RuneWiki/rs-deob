package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("he")
public class class225 {

    @ObfuscatedName("he.m")
    public final List field3225;

    @ObfuscatedName("he.w")
    public static Comparator field3228 = new class222();

    @ObfuscatedName("he.e")
    public static Comparator field3226;

    @ObfuscatedName("he.o")
    public static Comparator field3227;

    @ObfuscatedName("he.g")
    public static Comparator field3224;

    static {
        new class223();
        field3226 = new class221();
        field3227 = new class217();
        field3224 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2548();
        boolean var4 = arg0.method2398() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2548();
        this.field3225 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3225.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("he.m(Ljava/util/Comparator;ZI)V")
    public void method3821(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3225, arg0);
        } else {
            Collections.sort(this.field3225, Collections.reverseOrder(arg0));
        }
    }
}
