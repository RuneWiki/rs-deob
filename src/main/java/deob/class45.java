package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aa")
public class class45 extends class33 {

    @ObfuscatedName("aa.o")
    public HashSet field547;

    @ObfuscatedName("aa.p")
    public HashSet field548;

    @ObfuscatedName("aa.u")
    public List field551;

    @ObfuscatedName("aa.cu(Lfw;Lfw;Lfw;IZB)V")
    public void method548(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method284(arg0, arg3);
        int var6 = arg2.method2916();
        this.field547 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method144(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field547.add(var8);
        }
        int var10 = arg2.method2916();
        this.field548 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method555(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field548.add(var12);
        }
        this.method549(arg1, arg4);
    }

    @ObfuscatedName("aa.cg(Lfw;ZI)V")
    public void method549(class174 arg0, boolean arg1) {
        this.field551 = new LinkedList();
        int var3 = arg0.method2916();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2929();
            class213 var6 = new class213(arg0.method2935());
            boolean var7 = arg0.method2921() == 1;
            if (arg1 || !var7) {
                this.field551.add(new class26(var5, var6));
            }
        }
    }
}
