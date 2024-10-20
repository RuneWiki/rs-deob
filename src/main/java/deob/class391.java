package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("pb")
public class class391 {

    @ObfuscatedName("pb.ab")
    public final List field4542;

    @ObfuscatedName("pb.ay")
    public static Comparator field4539 = new class394();

    @ObfuscatedName("pb.an")
    public static Comparator field4541;

    @ObfuscatedName("pb.au")
    public static Comparator field4540;

    @ObfuscatedName("pb.ax")
    public static Comparator field4543;

    static {
        new class396();
        field4541 = new class399();
        field4540 = new class393();
        field4543 = new class392();
    }

    public class391(class549 arg0, boolean arg1) {
        int var3 = arg0.method8968();
        boolean var4 = arg0.method9025() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8968();
        this.field4542 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4542.add(new class397(arg0, var5, var3));
        }
    }

    @ObfuscatedName("pb.ab(Ljava/util/Comparator;ZI)V")
    public void method6768(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4542, arg0);
        } else {
            Collections.sort(this.field4542, Collections.reverseOrder(arg0));
        }
    }
}
