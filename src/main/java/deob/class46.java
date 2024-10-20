package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public class class46 extends class33 {

    @ObfuscatedName("an.w")
    public HashSet field573;

    @ObfuscatedName("an.n")
    public HashSet field571;

    @ObfuscatedName("an.l")
    public List field572;

    @ObfuscatedName("an.cw(Lgc;Lgc;Lgc;IZI)V")
    public void method581(class195 arg0, class195 arg1, class195 arg2, int arg3, boolean arg4) {
        this.method279(arg0, arg3);
        int var6 = arg2.method3207();
        this.field573 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method174(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field573.add(var8);
        }
        int var10 = arg2.method3207();
        this.field571 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class47 var12 = new class47();
            try {
                var12.method589(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field571.add(var12);
        }
        this.method586(arg1, arg4);
    }

    @ObfuscatedName("an.ci(Lgc;ZI)V")
    public void method586(class195 arg0, boolean arg1) {
        this.field572 = new LinkedList();
        int var3 = arg0.method3207();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3264();
            class239 var6 = new class239(arg0.method3254());
            boolean var7 = arg0.method3205() == 1;
            if (arg1 || !var7) {
                this.field572.add(new class26(var5, var6));
            }
        }
    }
}
