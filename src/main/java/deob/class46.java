package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public class class46 extends class33 {

    @ObfuscatedName("at.d")
    public HashSet field572;

    @ObfuscatedName("at.r")
    public HashSet field571;

    @ObfuscatedName("at.p")
    public List field570;

    @ObfuscatedName("at.cm(Lgg;Lgg;Lgg;IZI)V")
    public void method602(class195 arg0, class195 arg1, class195 arg2, int arg3, boolean arg4) {
        this.method245(arg0, arg3);
        int var6 = arg2.method3310();
        this.field572 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method159(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field572.add(var8);
        }
        int var10 = arg2.method3310();
        this.field571 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class47 var12 = new class47();
            try {
                var12.method635(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field571.add(var12);
        }
        this.method599(arg1, arg4);
    }

    @ObfuscatedName("at.cg(Lgg;ZI)V")
    public void method599(class195 arg0, boolean arg1) {
        this.field570 = new LinkedList();
        int var3 = arg0.method3310();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3324();
            class239 var6 = new class239(arg0.method3472());
            boolean var7 = arg0.method3332() == 1;
            if (arg1 || !var7) {
                this.field570.add(new class26(var5, var6));
            }
        }
    }
}
