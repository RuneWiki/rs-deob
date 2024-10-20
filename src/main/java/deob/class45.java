package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ah")
public class class45 extends class33 {

    @ObfuscatedName("ah.u")
    public HashSet field601;

    @ObfuscatedName("ah.t")
    public HashSet field600;

    @ObfuscatedName("ah.a")
    public List field599;

    @ObfuscatedName("ah.bk(Lfz;Lfz;Lfz;IZI)V")
    public void method547(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method245(arg0, arg3);
        int var6 = arg2.method3178();
        this.field601 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method156(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field601.add(var8);
        }
        int var10 = arg2.method3178();
        this.field600 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method557(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field600.add(var12);
        }
        this.method553(arg1, arg4);
    }

    @ObfuscatedName("ah.bh(Lfz;ZB)V")
    public void method553(class174 arg0, boolean arg1) {
        this.field599 = new LinkedList();
        int var3 = arg0.method3178();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3015();
            class213 var6 = new class213(arg0.method3131());
            boolean var7 = arg0.method2971() == 1;
            if (arg1 || !var7) {
                this.field599.add(new class26(var5, var6));
            }
        }
    }
}
