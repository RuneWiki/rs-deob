package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ah")
public class class46 extends class33 {

    @ObfuscatedName("ah.t")
    public HashSet field575;

    @ObfuscatedName("ah.i")
    public HashSet field576;

    @ObfuscatedName("ah.u")
    public List field577;

    @ObfuscatedName("ah.bk(Lgy;Lgy;Lgy;IZI)V")
    public void method552(class195 arg0, class195 arg1, class195 arg2, int arg3, boolean arg4) {
        this.method265(arg0, arg3);
        int var6 = arg2.method3269();
        this.field575 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method155(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field575.add(var8);
        }
        int var10 = arg2.method3269();
        this.field576 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class47 var12 = new class47();
            try {
                var12.method561(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field576.add(var12);
        }
        this.method551(arg1, arg4);
    }

    @ObfuscatedName("ah.bo(Lgy;ZS)V")
    public void method551(class195 arg0, boolean arg1) {
        this.field577 = new LinkedList();
        int var3 = arg0.method3269();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3295();
            class239 var6 = new class239(arg0.method3264());
            boolean var7 = arg0.method3330() == 1;
            if (arg1 || !var7) {
                this.field577.add(new class26(var5, var6));
            }
        }
    }
}
