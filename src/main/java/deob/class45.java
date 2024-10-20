package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aq")
public class class45 extends class33 {

    @ObfuscatedName("aq.q")
    public HashSet field538;

    @ObfuscatedName("aq.v")
    public HashSet field539;

    @ObfuscatedName("aq.n")
    public List field540;

    @ObfuscatedName("aq.ba(Lgj;Lgj;Lgj;IZB)V")
    public void method550(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method313(arg0, arg3);
        int var6 = arg2.method3124();
        this.field538 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method164(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field538.add(var8);
        }
        int var10 = arg2.method3124();
        this.field539 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method559(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field539.add(var12);
        }
        this.method554(arg1, arg4);
    }

    @ObfuscatedName("aq.bx(Lgj;ZI)V")
    public void method554(class185 arg0, boolean arg1) {
        this.field540 = new LinkedList();
        int var3 = arg0.method3124();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3132();
            class224 var6 = new class224(arg0.method3127());
            boolean var7 = arg0.method3197() == 1;
            if (arg1 || !var7) {
                this.field540.add(new class26(var5, var6));
            }
        }
    }
}
