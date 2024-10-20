package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("is")
public class class255 {

    @ObfuscatedName("is.f")
    public final List field3308;

    @ObfuscatedName("is.o")
    public static Comparator field3305 = new class258();

    @ObfuscatedName("is.u")
    public static Comparator field3306;

    @ObfuscatedName("is.p")
    public static Comparator field3307;

    @ObfuscatedName("is.b")
    public static Comparator field3304;

    static {
        new class260();
        field3306 = new class263();
        field3307 = new class257();
        field3304 = new class256();
    }

    public class255(class382 arg0, boolean arg1) {
        int var3 = arg0.method5858();
        boolean var4 = arg0.method5856() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5858();
        this.field3308 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3308.add(new class261(arg0, var5, var3));
        }
    }

    @ObfuscatedName("is.f(Ljava/util/Comparator;ZI)V")
    public void method4029(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3308, arg0);
        } else {
            Collections.sort(this.field3308, Collections.reverseOrder(arg0));
        }
    }
}
