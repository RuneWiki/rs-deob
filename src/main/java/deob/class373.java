package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ov")
public class class373 {

    @ObfuscatedName("ov.at")
    public final List field4351;

    @ObfuscatedName("ov.ah")
    public static Comparator field4346 = new class376();

    @ObfuscatedName("ov.ar")
    public static Comparator field4347;

    @ObfuscatedName("ov.ao")
    public static Comparator field4348;

    @ObfuscatedName("ov.ab")
    public static Comparator field4349;

    static {
        new class378();
        field4347 = new class381();
        field4348 = new class375();
        field4349 = new class374();
    }

    public class373(class527 arg0, boolean arg1) {
        int var3 = arg0.method8412();
        boolean var4 = arg0.method8410() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8412();
        this.field4351 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4351.add(new class379(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ov.at(Ljava/util/Comparator;ZB)V")
    public void method6399(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4351, arg0);
        } else {
            Collections.sort(this.field4351, Collections.reverseOrder(arg0));
        }
    }
}
