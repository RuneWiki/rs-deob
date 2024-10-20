package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("af")
public class class45 extends class33 {

    @ObfuscatedName("af.x")
    public HashSet field577;

    @ObfuscatedName("af.a")
    public HashSet field575;

    @ObfuscatedName("af.y")
    public List field576;

    @ObfuscatedName("af.bq(Lfl;Lfl;Lfl;IZI)V")
    public void method540(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method256(arg0, arg3);
        int var6 = arg2.method3065();
        this.field577 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method165(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field577.add(var8);
        }
        int var10 = arg2.method3065();
        this.field575 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method553(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field575.add(var12);
        }
        this.method538(arg1, arg4);
    }

    @ObfuscatedName("af.ba(Lfl;ZS)V")
    public void method538(class174 arg0, boolean arg1) {
        this.field576 = new LinkedList();
        int var3 = arg0.method3065();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3100();
            class213 var6 = new class213(arg0.method3058());
            boolean var7 = arg0.method2925() == 1;
            if (arg1 || !var7) {
                this.field576.add(new class26(var5, var6));
            }
        }
    }
}
