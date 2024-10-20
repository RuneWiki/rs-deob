package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("av")
public class class45 extends class33 {

    @ObfuscatedName("av.s")
    public HashSet field542;

    @ObfuscatedName("av.n")
    public HashSet field543;

    @ObfuscatedName("av.y")
    public List field545;

    @ObfuscatedName("av.ba(Lgh;Lgh;Lgh;IZB)V")
    public void method540(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method280(arg0, arg3);
        int var6 = arg2.method3194();
        this.field542 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method150(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field542.add(var8);
        }
        int var10 = arg2.method3194();
        this.field543 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method552(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field543.add(var12);
        }
        this.method541(arg1, arg4);
    }

    @ObfuscatedName("av.bu(Lgh;ZI)V")
    public void method541(class185 arg0, boolean arg1) {
        this.field545 = new LinkedList();
        int var3 = arg0.method3194();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3073();
            class224 var6 = new class224(arg0.method2967());
            boolean var7 = arg0.method2962() == 1;
            if (arg1 || !var7) {
                this.field545.add(new class26(var5, var6));
            }
        }
    }
}
