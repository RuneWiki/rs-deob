package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("nz")
public class class342 {

    @ObfuscatedName("nz.aj")
    public final List field4231;

    @ObfuscatedName("nz.al")
    public static Comparator field4227 = new class345();

    @ObfuscatedName("nz.ac")
    public static Comparator field4234;

    @ObfuscatedName("nz.ab")
    public static Comparator field4229;

    @ObfuscatedName("nz.an")
    public static Comparator field4226;

    static {
        new class347();
        field4234 = new class350();
        field4229 = new class344();
        field4226 = new class343();
    }

    public class342(class478 arg0, boolean arg1) {
        int var3 = arg0.method7905();
        boolean var4 = arg0.method7909() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7905();
        this.field4231 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4231.add(new class348(arg0, var5, var3));
        }
    }

    @ObfuscatedName("nz.aj(Ljava/util/Comparator;ZI)V")
    public void method5952(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4231, arg0);
        } else {
            Collections.sort(this.field4231, Collections.reverseOrder(arg0));
        }
    }
}
