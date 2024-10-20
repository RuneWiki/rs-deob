package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ai")
public class class45 extends class33 {

    @ObfuscatedName("ai.v")
    public HashSet field578;

    @ObfuscatedName("ai.h")
    public HashSet field581;

    @ObfuscatedName("ai.t")
    public List field579;

    @ObfuscatedName("ai.cw(Lfp;Lfp;Lfp;IZI)V")
    public void method525(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method284(arg0, arg3);
        int var6 = arg2.method2861();
        this.field578 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method158(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field578.add(var8);
        }
        int var10 = arg2.method2861();
        this.field581 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method546(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field581.add(var12);
        }
        this.method534(arg1, arg4);
    }

    @ObfuscatedName("ai.cc(Lfp;ZB)V")
    public void method534(class174 arg0, boolean arg1) {
        this.field579 = new LinkedList();
        int var3 = arg0.method2861();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3030();
            class213 var6 = new class213(arg0.method2987());
            boolean var7 = arg0.method2843() == 1;
            if (arg1 || !var7) {
                this.field579.add(new class26(var5, var6));
            }
        }
    }
}
