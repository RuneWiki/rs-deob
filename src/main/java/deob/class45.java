package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public class class45 extends class33 {

    @ObfuscatedName("an.n")
    public HashSet field586;

    @ObfuscatedName("an.a")
    public HashSet field587;

    @ObfuscatedName("an.g")
    public List field588;

    @ObfuscatedName("an.bh(Lfr;Lfr;Lfr;IZI)V")
    public void method549(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method253(arg0, arg3);
        int var6 = arg2.method2824();
        this.field586 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method168(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field586.add(var8);
        }
        int var10 = arg2.method2824();
        this.field587 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method554(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field587.add(var12);
        }
        this.method552(arg1, arg4);
    }

    @ObfuscatedName("an.bj(Lfr;ZB)V")
    public void method552(class174 arg0, boolean arg1) {
        this.field588 = new LinkedList();
        int var3 = arg0.method2824();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2825();
            class213 var6 = new class213(arg0.method2803());
            boolean var7 = arg0.method2810() == 1;
            if (arg1 || !var7) {
                this.field588.add(new class26(var5, var6));
            }
        }
    }
}
