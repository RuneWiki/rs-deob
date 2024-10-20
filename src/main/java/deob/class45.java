package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public class class45 extends class33 {

    @ObfuscatedName("ay.d")
    public HashSet field539;

    @ObfuscatedName("ay.v")
    public HashSet field536;

    @ObfuscatedName("ay.s")
    public List field535;

    @ObfuscatedName("ay.bs(Lgn;Lgn;Lgn;IZI)V")
    public void method569(class194 arg0, class194 arg1, class194 arg2, int arg3, boolean arg4) {
        this.method268(arg0, arg3);
        int var6 = arg2.method3249();
        this.field539 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method164(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field539.add(var8);
        }
        int var10 = arg2.method3249();
        this.field536 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method586(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field536.add(var12);
        }
        this.method570(arg1, arg4);
    }

    @ObfuscatedName("ay.bv(Lgn;ZI)V")
    public void method570(class194 arg0, boolean arg1) {
        this.field535 = new LinkedList();
        int var3 = arg0.method3249();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3432();
            class233 var6 = new class233(arg0.method3261());
            boolean var7 = arg0.method3247() == 1;
            if (arg1 || !var7) {
                this.field535.add(new class26(var5, var6));
            }
        }
    }
}
