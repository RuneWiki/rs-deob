package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("av")
public class class45 extends class33 {

    @ObfuscatedName("av.l")
    public HashSet field555;

    @ObfuscatedName("av.f")
    public HashSet field552;

    @ObfuscatedName("av.q")
    public List field554;

    @ObfuscatedName("av.be(Lgy;Lgy;Lgy;IZI)V")
    public void method533(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method257(arg0, arg3);
        int var6 = arg2.method3241();
        this.field555 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method159(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field555.add(var8);
        }
        int var10 = arg2.method3241();
        this.field552 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method550(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field552.add(var12);
        }
        this.method534(arg1, arg4);
    }

    @ObfuscatedName("av.bb(Lgy;ZI)V")
    public void method534(class185 arg0, boolean arg1) {
        this.field554 = new LinkedList();
        int var3 = arg0.method3241();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3446();
            class224 var6 = new class224(arg0.method3292());
            boolean var7 = arg0.method3239() == 1;
            if (arg1 || !var7) {
                this.field554.add(new class26(var5, var6));
            }
        }
    }
}
