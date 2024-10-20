package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ng")
public class class362 {

    @ObfuscatedName("ng.aw")
    public final List field4327;

    @ObfuscatedName("ng.ay")
    public static Comparator field4322 = new class365();

    @ObfuscatedName("ng.ar")
    public static Comparator field4324;

    @ObfuscatedName("ng.am")
    public static Comparator field4325;

    @ObfuscatedName("ng.as")
    public static Comparator field4326;

    static {
        new class367();
        field4324 = new class370();
        field4325 = new class364();
        field4326 = new class363();
    }

    public class362(class514 arg0, boolean arg1) {
        int var3 = arg0.method8246();
        boolean var4 = arg0.method8244() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8246();
        this.field4327 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4327.add(new class368(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ng.aw(Ljava/util/Comparator;ZI)V")
    public void method6238(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4327, arg0);
        } else {
            Collections.sort(this.field4327, Collections.reverseOrder(arg0));
        }
    }
}
