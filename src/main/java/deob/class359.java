package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("nl")
public class class359 {

    @ObfuscatedName("nl.at")
    public final List field4289;

    @ObfuscatedName("nl.an")
    public static Comparator field4290 = new class362();

    @ObfuscatedName("nl.av")
    public static Comparator field4291;

    @ObfuscatedName("nl.as")
    public static Comparator field4292;

    @ObfuscatedName("nl.ax")
    public static Comparator field4293;

    static {
        new class364();
        field4291 = new class367();
        field4292 = new class361();
        field4293 = new class360();
    }

    public class359(class501 arg0, boolean arg1) {
        int var3 = arg0.method8195();
        boolean var4 = arg0.method8129() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8195();
        this.field4289 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4289.add(new class365(arg0, var5, var3));
        }
    }

    @ObfuscatedName("nl.at(Ljava/util/Comparator;ZI)V")
    public void method6178(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4289, arg0);
        } else {
            Collections.sort(this.field4289, Collections.reverseOrder(arg0));
        }
    }
}
