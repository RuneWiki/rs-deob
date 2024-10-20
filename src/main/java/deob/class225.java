package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hk")
public class class225 {

    @ObfuscatedName("hk.a")
    public final List field3228;

    @ObfuscatedName("hk.d")
    public static Comparator field3225 = new class222();

    @ObfuscatedName("hk.v")
    public static Comparator field3227;

    @ObfuscatedName("hk.r")
    public static Comparator field3224;

    @ObfuscatedName("hk.z")
    public static Comparator field3226;

    static {
        new class223();
        field3227 = new class221();
        field3224 = new class217();
        field3226 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2584();
        boolean var4 = arg0.method2395() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2584();
        this.field3228 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3228.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hk.a(Ljava/util/Comparator;ZI)V")
    public void method3819(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3228, arg0);
        } else {
            Collections.sort(this.field3228, Collections.reverseOrder(arg0));
        }
    }
}
