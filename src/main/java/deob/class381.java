package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ou")
public class class381 {

    @ObfuscatedName("ou.az")
    public final List field4464;

    @ObfuscatedName("ou.ah")
    public static Comparator field4461 = new class384();

    @ObfuscatedName("ou.af")
    public static Comparator field4462;

    @ObfuscatedName("ou.at")
    public static Comparator field4460;

    @ObfuscatedName("ou.an")
    public static Comparator field4463;

    static {
        new class386();
        field4462 = new class389();
        field4460 = new class383();
        field4463 = new class382();
    }

    public class381(class535 arg0, boolean arg1) {
        int var3 = arg0.method8670();
        boolean var4 = arg0.method8462() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8670();
        this.field4464 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4464.add(new class387(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ou.az(Ljava/util/Comparator;ZI)V")
    public void method6447(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4464, arg0);
        } else {
            Collections.sort(this.field4464, Collections.reverseOrder(arg0));
        }
    }
}
