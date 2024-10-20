package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ox")
public class class376 {

    @ObfuscatedName("ox.ac")
    public final List field4369;

    @ObfuscatedName("ox.al")
    public static Comparator field4368 = new class379();

    @ObfuscatedName("ox.ak")
    public static Comparator field4367;

    @ObfuscatedName("ox.ax")
    public static Comparator field4370;

    @ObfuscatedName("ox.ao")
    public static Comparator field4371;

    static {
        new class381();
        field4367 = new class384();
        field4370 = new class378();
        field4371 = new class377();
    }

    public class376(class530 arg0, boolean arg1) {
        int var3 = arg0.method8598();
        boolean var4 = arg0.method8365() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8598();
        this.field4369 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4369.add(new class382(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ox.ac(Ljava/util/Comparator;ZB)V")
    public void method6389(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4369, arg0);
        } else {
            Collections.sort(this.field4369, Collections.reverseOrder(arg0));
        }
    }
}
