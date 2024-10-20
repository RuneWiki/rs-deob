package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hj")
public class class225 {

    @ObfuscatedName("hj.x")
    public final List field3227;

    @ObfuscatedName("hj.r")
    public static Comparator field3226 = new class222();

    @ObfuscatedName("hj.j")
    public static Comparator field3225;

    @ObfuscatedName("hj.z")
    public static Comparator field3228;

    @ObfuscatedName("hj.i")
    public static Comparator field3229;

    static {
        new class223();
        field3225 = new class221();
        field3228 = new class217();
        field3229 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2403();
        boolean var4 = arg0.method2408() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2403();
        this.field3227 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3227.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hj.x(Ljava/util/Comparator;ZI)V")
    public void method3781(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3227, arg0);
        } else {
            Collections.sort(this.field3227, Collections.reverseOrder(arg0));
        }
    }
}
