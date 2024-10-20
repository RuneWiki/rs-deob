package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("af")
public class class45 extends class33 {

    @ObfuscatedName("af.a")
    public HashSet field540;

    @ObfuscatedName("af.q")
    public HashSet field536;

    @ObfuscatedName("af.j")
    public List field535;

    @ObfuscatedName("af.bo(Lfs;Lfs;Lfs;IZI)V")
    public void method526(class181 arg0, class181 arg1, class181 arg2, int arg3, boolean arg4) {
        this.method242(arg0, arg3);
        int var6 = arg2.method3081();
        this.field540 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method146(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field540.add(var8);
        }
        int var10 = arg2.method3081();
        this.field536 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method537(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field536.add(var12);
        }
        this.method533(arg1, arg4);
    }

    @ObfuscatedName("af.bg(Lfs;ZI)V")
    public void method533(class181 arg0, boolean arg1) {
        this.field535 = new LinkedList();
        int var3 = arg0.method3081();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2960();
            class220 var6 = new class220(arg0.method2996());
            boolean var7 = arg0.method2945() == 1;
            if (arg1 || !var7) {
                this.field535.add(new class26(var5, var6));
            }
        }
    }
}
